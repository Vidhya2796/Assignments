package com.vidhyac.test;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import com.vidhyac.streams.Fruit;
import com.vidhyac.streams.News;
import com.vidhyac.streams.Trader;
import com.vidhyac.streams.Transaction;

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
		
		List<News> newsList=Arrays.asList(
				
				new News(100, "Sudha", "Ganesh", "good"),
				new News(101, "Janu", "Gayu", "excellent"),
				new News(102, "Priya", "Ram", "satisfactory"),
				new News(100, "Sudha", "Ganesh", "fantastic"),
				new News(100, "Anu", "Ganesh", "mindblowing"),
				new News(103, "Kala", "Abi", "excellent"),
				new News(104, "Janu", "Kavi", "not bad"),
				new News(100, "Sudha", "Ganesh", "excellent"),
				new News(102, "Priya", "Ram", "not bad"),
				new News(104, "Janu", "Kavi", "good"),
				new News(100, "Sudha", "Ganesh", "best"),
				new News(104, "Janu", "Kavi", "good"),
				new News(104, "Janu", "Ganesh", "excellent")
				
				);
		
		List<Trader> traderList=Arrays.asList(
				new Trader("Preethi", "Indore"),
				new Trader("Vidhya", "Pune"),
				new Trader("Priya", "Mumbai"),
				new Trader("Sudha", "Indore"),
				new Trader("Juhi", "Pune"),
				new Trader("Ganesh", "Indore"),
				new Trader("Vicky", "Delhi"),
				new Trader("Ram", "Pune"),
				new Trader("Vidhya", "Delhi")
				);
		
		List<Transaction> transList=Arrays.asList(
				new Transaction(new Trader("Preethi", "Indore"), 2011, 6000),
				new Transaction(new Trader("Vidhya", "Pune"), 2011, 5000),
				new Transaction(new Trader("Priya", "Mumbai"), 2018, 4500),
				new Transaction(new Trader("Sudha", "Indore"), 2017, 10000),
				new Transaction(new Trader("Juhi", "Pune"), 2011, 7000),
				new Transaction(new Trader("Ganesh", "Indore"), 2017, 15000),
				new Transaction(new Trader("Vicky", "Delhi"), 2016, 12000),
				new Transaction(new Trader("Ram", "Pune"), 2011, 17000),
				new Transaction(new Trader("Vidhya", "Delhi"), 2011, 21000)
				);
		
		
		
		//QUES 1:Display the fruit names of low calories fruits i.e. calories < 100 sorted in descending order of calories.
		//ORIG ANS OF QUES 2 fruitList.stream().filter(cal -> cal.getCalories() < 100).sorted().forEach(y->System.out.println(y.getName()+" "+y.getCalories()));
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
		//ORIG ANS OF QUES 2 fruitList.stream().sorted((a,b)->a.getColor().compareTo(b.getColor())).forEach(op->System.out.println(op.getName()+"  "+op.getColor()));
			
		//QUES 3:
		System.out.println();
		//ORIG ANS OF QUES 3 fruitList.stream().filter(color -> color.getColor().equalsIgnoreCase("red")).forEach(op->System.out.println(op.getName()+"  "+op.getColor()+" "+op.getCalories()));
				
		//fruitList1.stream().filter(cal ->cal.getCalories()).forEach(op->System.out.println(op.getName()+"  "+op.getColor()));
		
		//fruitList.stream().filter(color -> color.getColor()==color).forEach(op->System.out.println(op.getName()+"  "+op.getColor()));
		
		
		System.out.println("************QUES 1***********");
		fruitList.stream()
				.filter(cal -> cal.getCalories()<100)
				.sorted((f1,f2)->(f1.getCalories() < f2.getCalories())?1 : (f1.getCalories() > f2.getCalories())?-1 :0)
				.forEach(pr->System.out.println(pr.getName()+" "+pr.getCalories()));
		System.out.println();
		System.out.println("************QUES 2***********");
		fruitList.stream()
				.sorted((a,b)->a.getColor()
				.compareTo(b.getColor()))
				.forEach(op->System.out.println(op.getName()+"  "+op.getColor()));
		System.out.println();
		System.out.println("************QUES 3***********");
		fruitList.stream()
				.filter(clr -> clr.getColor().equalsIgnoreCase("red"))
				.sorted((f1,f2)->(f1.getPrice() > f2.getPrice())?1 : (f1.getPrice() < f2.getPrice())?-1 :0)
				.forEach(op->System.out.println(op.getName()+"  "+op.getPrice()));
		System.out.println();
		
		System.out.println("************QUES 4***********");
		List<Integer> newsIdList=newsList.stream()
				.map(a->a.getNewsId())
				.collect(Collectors.toList());
		//System.out.println(newsIdList);
		Map<Integer, Long> newsIdMap =
				newsIdList.stream().collect(
                        Collectors.groupingBy(
                                Function.identity(), Collectors.counting()
                        )
                );

        System.out.println(newsIdMap);
		long max=0;
		int key=0;
		for(Map.Entry<Integer, Long> entry :newsIdMap.entrySet()){
			if(entry.getValue()>max){
				max=entry.getValue();
				key=entry.getKey();
			}
		}
		System.out.println("MAx comments got by the news Id '"+key+"' and its count is '"+max+"'");
		
		System.out.println();
		
		System.out.println("************QUES 6***********");
		//Find out which user has posted maximum comments.//commentByUser
		List<String> commentByUserList=newsList.stream()
				.map(a->a.getCommentByUser())
				.collect(Collectors.toList());
		//System.out.println(commentByUserList);
		Map<String, Long> commentByUserMap =
				commentByUserList.stream().collect(
                        Collectors.groupingBy(
                                Function.identity(), Collectors.counting()
                        )
                );
		System.out.println(commentByUserMap);
		System.out.println("************QUES 7***********");
		 					
		
		long max1=0;
		String key1="";
		for(Map.Entry<String, Long> entry1 :commentByUserMap.entrySet()){
			if(entry1.getValue()>max){
				max1=entry1.getValue();
				key1=entry1.getKey();
			}
		}
		System.out.println("MAx comments got by the user '"+key1+"' and his/her count is '"+max1+"'");
		
		//Find all transactions in the year 2011 and sort them by value (small to high).
		//Trader trader;int year; int value
		System.out.println("************QUES 8***********");
		transList.stream().filter(yr->yr.getYear()==2011).sorted((x,y)-> x.getValue()> y.getValue()?1:x.getValue() < y.getValue()?-1:0).forEach(pr->System.out.println(pr.getTrader()+" "+pr.getYear()+" "+pr.getValue()));
		
		//What are all the unique cities where the traders work?
		System.out.println("************QUES 9***********");
		System.out.println(traderList.stream().map(c->c.getCity()).collect(Collectors.toSet()));
				//.distinct().collect(Collectors.toList()));
		//.forEach(pr->System.out.println(pr.getName()+" "+pr.getCity()));
		//Find all traders from Pune and sort them by name.
		System.out.println("************QUES 10***********");
		traderList.stream().filter(cty->cty.getCity().equalsIgnoreCase("pune"))
							.sorted((t1,t2)->t1.getName().compareTo(t2.getName()))
							.forEach(pr->System.out.println(pr.getName()+" "+pr.getCity()));
		//Return a string of all traders’ names sorted alphabetically.
		System.out.println("************QUES 11***********");
		List<String> traderNames=	traderList.stream().map(str->str.getName())
							.sorted((str1,str2)->str1.compareTo(str2)).distinct().collect(Collectors.toList());
		//System.out.println(traderNames);
		String allNames="";
		for(String name:traderNames){
			
			allNames=allNames+name;
		}
		System.out.println(allNames);		
		//Are any traders based in Indore?
		System.out.println("************QUES 12***********");
		traderList.stream().filter(t->t.getCity().equalsIgnoreCase("indore")).forEach(pr->System.out.println(pr.getName()+" "+pr.getCity()));
		
		//Print all transactions’ values from the traders living in Delhi.
		System.out.println("************QUES 13***********");
		transList.stream().filter(c->c.getTrader().getCity().equalsIgnoreCase("delhi")).forEach(pr->System.out.println(pr.getTrader().getName()+" "+pr.getValue()+" "+pr.getTrader().getCity()));
		
		//What’s the highest value of all the transactions?
		System.out.println("************QUES 14***********");
		System.out.println(transList.stream().map(h->h.getValue()).reduce(Math::max));
		//Find the transaction with the smallest value
		System.out.println("************QUES 15***********");
		System.out.println(transList.stream().map(h->h.getValue()).reduce(Math::min));
	}
	

	
}	
	
