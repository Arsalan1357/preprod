package shop.entity.product;

import shop.entity.product.annot.ProductAnnotations;
import static shop.entity.constants.Constants.*;
import java.io.Serializable;

/**
 * @author Arsalan
 *         Entity product
 */
public abstract class Product implements Serializable {

	@ProductAnnotations.FriendlyName(ID)
	private int id;
	@ProductAnnotations.FriendlyName(NAME)
	private String name;
	@ProductAnnotations.FriendlyName(COST)
	private int cost;

	public Product() {

	}

	/**
	 * @param name product's name
	 * @param cost product's cost
	 */
	public Product(int id, String name, int cost) {
		this.id = id;
		this.name = name;
		this.cost = cost;
	}

	/**
	 * @return id product
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id product
	 */
	@ProductAnnotations.Set(ID)
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return name product
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name product
	 */
	@ProductAnnotations.Set(NAME)
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return cost product
	 */
	public int getCost() {
		return cost;
	}

	/**
	 * @param cost product
	 */
	@ProductAnnotations.Set(COST)
	public void setCost(int cost) {
		this.cost = cost;
	}

	/**
	 * @return a string representation of product
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("id: " + id + ", name:" + this.getName() + ", cost:" + this.getCost());
		return sb.toString();
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Product product = (Product) o;

		if (Double.compare(product.cost, cost) != 0) return false;
		if (id != product.id) return false;
		return name != null ? name.equals(product.name) : product.name == null;

	}


}
