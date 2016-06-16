package org.cap.pojo;
public class Category {

	private int category_Id;
	private String category_name;
	public Category(){}
	public Category(int category_Id, String category_name) {
		super();
		this.category_Id = category_Id;
		this.category_name = category_name;
	}
	public int getCategory_Id() {
		return category_Id;
	}
	public void setCategory_Id(int category_Id) {
		this.category_Id = category_Id;
	}
	public String getCategory_name() {
		return category_name;
	}
	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}
	@Override
	public String toString() {
		return "Category [category_Id=" + category_Id + ", category_name=" + category_name + "]";
	}
	
	
	
}
