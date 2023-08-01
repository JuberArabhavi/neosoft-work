package com.java.src.InterviewQuestions;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/*Write a java program to segregate vegetables and fruits from a basket and tag prices as per current market value.

Basket = {"FRT", "Apple"},{"VG", "Onion"},{"VG", "Potato"},{"VG", "Chillies"},{"FRT", "Mango"},{"FRT", "Banana"}

Price/kg = {"200", "Apple"},
           {"20", "Onion"},
           {"20", "Potato"},
           {"80", "Chillies"},
           {"450", "Mango"},
           {"50", "Banana"}
           {"30", "Watermellon"},
           {"50", "Grapes"}               
		   
    Output <To be printed in below format> :
    Avaliable Fruits with price value :
    1. Apple 200/kg
    2. Mango 450/kg
    3. Banana 50/kg
    Avaliable Vegetables with price value :
    1. Onion 20/kg
    2. Potato 20/kg
    3. Chillies 80/kg */

public class HashMap {

	public static void main(String arg[]) {
		Map<String, String> basket = new java.util.HashMap<>();
		basket.put("FRT", "Apple");
		basket.put("FRT", "Banana");
		basket.put("FRT", "Watermelon");
		basket.put("FRT", "Grapes");
		basket.put("FRT", "Mango");
		basket.put("VG", "Onion");
		basket.put("VG", "Potato");
		basket.put("VG", "Chillies");

		Map<String, String> price = new java.util.HashMap<>();
		price.put("200", "Apple");
		price.put("20", "Onion");
		price.put("20", "Potato");
		price.put("80", "Chillies");
		price.put("450", "Mango");
		price.put("50", "Banana");
		price.put("30", "Watermelon");
		price.put("50", "Grapes");
		
		Set<Map.Entry<String, String>> entries = basket.entrySet();
		System.out.println("entries "+ entries);

		List<Map.Entry<String, String>> availableFruit = basket.entrySet().stream().filter(s -> s.getValue() == "FRT")
				.collect(Collectors.toList());
		System.out.println("Available Fruits "+ availableFruit);
		
		List<Map.Entry<String, String>> availableVeg = price.entrySet().stream().filter(s -> s.getValue() == "VG")
				.collect(Collectors.toList());
		int id = 0;
		for (Map.Entry<String, String> map: availableFruit) {
			id ++;
			System.out.println(id + ". "+map.getKey() + " "+price.get(map.getKey())+ "/kg");
		}
		
		int c = 0;
		for (Map.Entry<String, String> e: availableVeg) {
			c++;
			System.out.println(c +". "+e.getKey()+" "+price.get(e.getKey())+ "/kg");
		}
 	}

}
