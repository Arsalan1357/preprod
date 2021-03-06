package api.servlet;

import org.apache.log4j.Logger;
import service.catalog.CatalogFilterService;
import service.product.ProductService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

import static constants.Constants.*;

/**
 * @author Arsalan
 */
@WebServlet("/catalog_servlet")
public class CatalogServlet extends HttpServlet {

    private static final Logger log = Logger.getLogger(CatalogServlet.class);
    private ProductService productService;
    private CatalogFilterService catalogFilterService;

    @Override
    public void init() throws ServletException {
        productService = (ProductService) getServletContext().getAttribute(LAPTOP_SERVICE);
        catalogFilterService = (CatalogFilterService) getServletContext().getAttribute(CATALOG_FILTER_SERVICE);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Map<String, Object> criteria = catalogFilterService.createCriteria(request);
        if (criteria != null) {
            prepareResponse(request, criteria);
        }
        RequestDispatcher dispatcher = request.getRequestDispatcher(PRODUCTS_JSP);
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

    private void prepareResponse(HttpServletRequest request, Map<String, Object> criteria) {
        request.setAttribute(LAPTOP_LIST, productService.getByCriteria(criteria));
        request.setAttribute(PRODUCER_LIST, productService.getAllProducers());
        request.setAttribute(CATEGORY_LIST, productService.getAllCategories());
        request.setAttribute(COUNT_OF_LAPTOPS, productService.getCountOfLaptops());
        request.setAttribute(COUNT_OF_PAGES, getCountOfPages(productService.getCountOfLaptops(), (int) criteria.get(LIMIT)));
        request.setAttribute(SHOW_COUNT, criteria.get(LIMIT));
        request.setAttribute(CURRENT_PAGE, criteria.get(PAGE));
    }

    private int getCountOfPages(double countOfLaptops, double showCount) {
        return (int) Math.ceil(countOfLaptops / showCount);
    }
}
