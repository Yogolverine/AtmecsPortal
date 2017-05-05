package util;

import java.util.ArrayList;
import java.util.HashMap;

import com.Product;

public class GetMapOfProductAccordingToBrand {
	public static HashMap<String, Product> getMap(ArrayList<Product> productList){
		HashMap<String, Product> hm= new HashMap<>();
		String brandName=null;
		for(Product p : productList){
			brandName=p.getProductBrand();
			hm.put(brandName, p);	
		}
		return hm;
	}
}
