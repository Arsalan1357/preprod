package shop.view.impl;

import shop.entity.product.Product;
import provider.Reader;
import shop.services.ProductService;
import shop.view.Command;
import shop.view.helpers.map.MapHelper;
import shop.view.helpers.map.MapPath;

import java.text.ParseException;

/**
 * @author Arsalan
 */
public class AddProductToListWithReflectionCommand implements Command {

    private ProductService productService;
    private MapHelper mapHelper;
    private MapPath mapPath;
    private Reader reader;

    public AddProductToListWithReflectionCommand(ProductService productService, Reader reader) {
        this.productService = productService;
        mapHelper = new MapHelper();
        mapPath = new MapPath();
        this.reader = reader;
    }

    /**
     * reads products and adds them to the list
     *
     * @throws ParseException
     */
    @Override
    public void exec() {
        String productName = readProductNameThatWillBeAdded();
        try {
            productService.addProductToList(getParametersForFields(productName));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private Product getParametersForFields(String productName) throws Exception {
        return mapHelper.getMapHelper().get(productName).readWithReflection(mapPath.getMapPath().get(productName), reader);
    }
}
