package db.query;

/**
 * @author Arsalan
 */
public class LaptopQueries {
    public static final String GET_ALL_LAPTOPS = "SELECT * FROM `laptops`";
    public static final String GET_ALL_PRODUCERS = "SELECT * FROM producer";
    public static final String GET_ALL_CATEGORIES = "SELECT * FROM category";
    public static final String GET_LAPTOP_BY_ID = "SELECT * FROM `laptops` WHERE `laptops`.id = ?";
}
