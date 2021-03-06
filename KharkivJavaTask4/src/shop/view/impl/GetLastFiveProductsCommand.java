package shop.view.impl;

import shop.services.CartService;
import shop.view.Command;
import shop.view.appl.PrintItems;

import java.text.ParseException;

/**
 * @author Arsalan
 * template for get last 5 products
 */
public class GetLastFiveProductsCommand implements Command {

    private CartService cartService;

    public GetLastFiveProductsCommand(CartService cartService) {
        this.cartService = cartService;
    }

    /**
     * gets 5 last products which were added to cart
     *
     * @throws ParseException
     */
    @Override
    public void exec() throws ParseException {
        System.out.println(line);
        System.out.println(PrintItems.printProductsInMap(cartService.getLastFiveProducts()));
    }
}
