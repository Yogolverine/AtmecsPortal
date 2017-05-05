package util;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.Product;

public class ProductsWithinRange {
	public static List<Product> getProducts(ArrayList<Product> productArrayList, double lowerLimit, double upperLimit){
		Predicate<Product> predicate = (i)->i.getProductPrice()>=lowerLimit && i.getProductPrice()<=upperLimit;
		List<Product> filteredList = productArrayList.stream().filter(predicate).collect(Collectors.toList());
		return filteredList;
	}
}
