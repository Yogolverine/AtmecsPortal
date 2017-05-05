package util;

import java.util.ArrayList;
import java.util.HashMap;

import com.Product;
import com.ProductComment;
import com.ProductSupplier;

public class PopulateCollection {
	public static HashMap<Integer,Product> populateProductList(){
		HashMap<Integer,Product> productList=new HashMap<>();
		productList.put(1,new Product(1, "Jeans", "Levi's", getSuppliers(), 1400,getComments()));
		productList.put(2,new Product(2, "T-shirt", "Nike", getSuppliers(), 1200, getComments()));
		productList.put(3,new Product(3, "Leather Pant", "Levi's", getSuppliers(), 4400,getComments()));
		productList.put(4,new Product(4, "Leather Jacket", "Allen Solly", getSuppliers(), 6400,getComments()));
		productList.put(5,new Product(5, "Cotton Jeans", "Spyker", getSuppliers(), 3400,getComments()));
		productList.put(6,new Product(6, "Jeans", "Buffalo", getSuppliers(), 1800,getComments()));
		productList.put(7,new Product(7, "Casual Pant", "Diesel", getSuppliers(), 1900,getComments()));
		productList.put(8,new Product(8, "Casual Shirt", "Raymond", getSuppliers(), 3900,getComments()));
		productList.put(9,new Product(9, "Shoes", "Nike", getSuppliers(), 5900,getComments()));
		productList.put(10,new Product(10, "Sandles", "Addidas", getSuppliers(), 2900,getComments()));
		return productList;
	}
	public static ArrayList<ProductSupplier> getSuppliers(){
		ArrayList<ProductSupplier> suppliers=new ArrayList<>();
		suppliers.add(new ProductSupplier("Brand Factory", "Mumbai"));
		suppliers.add(new ProductSupplier("Levi's Factory Outlet", "Pune"));
		suppliers.add(new ProductSupplier("Nike Factory Outlet", "Nagpur"));
		return suppliers;
	}
	
	public static ArrayList<ProductComment> getComments(){
		ArrayList<ProductComment> comments = new ArrayList<>();
		comments.add(new ProductComment("Excellent product", "Chinmay"));
		comments.add(new ProductComment("Good product", "Rahul"));
		comments.add(new ProductComment("Satisfied", "Aditi"));
		comments.add(new ProductComment("Could be better", "Kiku"));
		comments.add(new ProductComment("Nice quality", "Abhishek"));
		return comments;
	}
}
