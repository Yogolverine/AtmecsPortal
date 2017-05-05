package tester;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import com.Product;

import util.GetMapOfProductAccordingToBrand;
import util.PopulateCollection;
import util.ProductsWithinRange;

public class StartProduct {
	public static void startProduct(){
		try(Scanner sc = new Scanner(System.in)){
		HashMap<Integer,Product> productList = PopulateCollection.populateProductList();
		Set<Entry<Integer,Product>> productSet = productList.entrySet();
		ArrayList<Product> productArrayList = new ArrayList<>();
		Iterator<Entry<Integer,Product>> iter= productSet.iterator();
		while(iter.hasNext()){
			productArrayList.add(iter.next().getValue());
		}
		int choice;
		boolean toContinue=true;
		System.out.println("Please choose any of the following");
		while(toContinue){
			System.out.println("1. Display all products according to their id");
			System.out.println("2. Display all products in alphabetical order");
			System.out.println("3. Display products of particular brand");
			System.out.println("4. Display products according to their prices (in ascending order)");
			System.out.println("5. Display products within selected price range");
			System.out.println("6. Exit application");
			choice=sc.nextInt();
			switch(choice){
			case 1:
					Collections.sort(productArrayList, (o1,o2)->o1.getProductId()-o2.getProductId());
					System.out.println("Here's the list of products available:");
					for(Product p : productArrayList)
						System.out.println(p);
					break;
			case 2:
					Collections.sort(productArrayList,(o1,o2)->o1.getProductName().compareTo(o2.getProductName()));
					System.out.println("Here's the list of products available:");
				
					for(Product p : productArrayList)
						System.out.println(p);
					break;
			case 3:
					System.out.println("please enter the brand name");
					String brandName=sc.next();
					HashMap<String, Product> mapOfBrand = new HashMap<>();
					mapOfBrand = GetMapOfProductAccordingToBrand.getMap(productArrayList);
					if(mapOfBrand.containsKey(brandName)){
						Set<Entry<String,Product>> productSetAccordingToBrand = mapOfBrand.entrySet();
						ArrayList<Product> productArrayListAccordingToBrand = new ArrayList<>();
						Iterator<Entry<String,Product>> iterator= productSetAccordingToBrand.iterator();
						while(iterator.hasNext()){
							Entry<String, Product> entry = iterator.next();
							if(entry.getKey().equals(brandName))
								productArrayListAccordingToBrand.add(entry.getValue());
						}
						System.out.println("Here's the list of products of brand "+brandName);
						for(Product p : productArrayListAccordingToBrand)
							System.out.println(p);
					}
					else
						System.out.println("Sorry! We do not have any product available of this brand");
					break;
			case 4:
					Collections.sort(productArrayList, (o1,o2)->((Double)o1.getProductPrice()).compareTo((Double)o2.getProductPrice()));
					System.out.println("Here's the list of products available (sorted according to prices:");
					for(Product p : productArrayList)
						System.out.println(p);
					break;
			case 5: 
					System.out.println("Please enter lower price limit:");
					double lowerLimit = sc.nextDouble();
					System.out.println("Please enter upper price limit:");
					double upperLimit = sc.nextDouble();
					List<Product> productsWithinRange = ProductsWithinRange.getProducts(productArrayList,lowerLimit,upperLimit);
					System.out.println("Here's the list of products within given price range:");
					for(Product p : productsWithinRange)
						System.out.println(p);
					break;
			case 6:
				toContinue=false;
				break;
			}
		}
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
}
