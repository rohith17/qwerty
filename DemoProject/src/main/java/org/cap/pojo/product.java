package org.cap.pojo;

public class product {

	private int productId;
	private String productName;
	private Category category_Id;
	private int quantity;
	private double price;
	public product(int productId, String productName, Category category_Id, int quantity, double price) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.category_Id = category_Id;
		this.quantity = quantity;
		this.price = price;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Category getCategory_Id() {
		return category_Id;
	}
	public void setCategory_Id(Category category_Id) {
		this.category_Id = category_Id;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "product [productId=" + productId + ", productName=" + productName + ", category_Id=" + category_Id
				+ ", quantity=" + quantity + ", price=" + price + "]";
	}
	
	
	
}
