package com.vidhyac.test;


import java.util.Arrays;

import java.util.List;
import java.util.stream.Collectors;

import com.vidhyac.streams.Fruit;

public class StreamTest {

	public static void main(String[] args) {
		List<Fruit> fruitList=Arrays.asList(
				new Fruit("Cherry", 81, 100, "Red"),
				new Fruit("Strawberry", 105, 150, "Red"),
				new Fruit("Orange", 36, 88, "Orange"),
				new Fruit("Mango", 135, 45, "Yellow"),
				new Fruit("Grapes", 67, 100, "Black"),
				new Fruit("Papaya", 120, 150, "Green"),
				new Fruit("Dates", 99, 200, "Brown"),
				new Fruit("Apple", 140, 95, "Red"),
				new Fruit("Gauva", 70, 50, "Green"),
				new Fruit("Banana", 15, 25, "Yellow")
				);
		
		//QUES 1:Display the fruit names of low calories fruits i.e. calories < 100 sorted in descending order of calories.
		fruitList.stream().filter(cal -> cal.getCalories() < 100).sorted().forEach(y->System.out.println(y.getName()+" "+y.getCalories()));
		System.out.println();
		///QUES 2:Display color wise list of fruit names.
		
		//fruitList.stream().filter(color -> color.getColor().equalsIgnoreCase("RED")).forEach(op->System.out.println(op.getName()+"  "+op.getColor()));
		
		/*for (Fruit fruit : fruitList) {
			String fruitColor[]=new String[fruitList.size()];
			for (int i = 0; i < fruitColor.length; i++) {
				
				fruitColor[i]=fruit.getColor();
			}	
			
		}*/
		//persons.stream().filter(distinctByKey(Person::getName))
	
		/*for (Fruit fruit : fruitList) {
			String fruitColor=fruit.getColor();
			
			System.out.println(fruitColor.toUpperCase());
			List< Fruit> arr=fruitList.stream().filter(color -> color.getColor()==fruitColor).distinct().collect(Collectors.toList());
			System.out.println(arr);
					//.forEach(op->System.out.println(op.getName()+"  "+op.getColor()));
			}*/
		
		
			//QUES 2:
		fruitList.stream().sorted((a,b)->a.getColor().compareTo(b.getColor())).forEach(op->System.out.println(op.getName()+"  "+op.getColor()));
			
		//QUES 3:
		System.out.println();
		fruitList.stream().filter(color -> color.getColor().equalsIgnoreCase("red")).forEach(op->System.out.println(op.getName()+"  "+op.getColor()+" "+op.getCalories()));
				
		//fruitList1.stream().filter(cal ->cal.getCalories()).forEach(op->System.out.println(op.getName()+"  "+op.getColor()));
		
		//fruitList.stream().filter(color -> color.getColor()==color).forEach(op->System.out.println(op.getName()+"  "+op.getColor()));
		
		
	}

}
