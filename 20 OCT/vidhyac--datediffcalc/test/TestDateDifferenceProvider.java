package com.vidhyac.test;

import com.vidhyac.service.DateDifferenceProvider;
import com.vidhyac.service.supp.MyDate;
import com.vidhyac.service.supp.MyTestRecord;

public class TestDateDifferenceProvider {
	
	
	public static void main(String[] args) {
		
		//MyDate startDate=new MyDate(20, 11, 2018);
		//MyDate endDate=new MyDate(20, 11, 2018);
		
		/*int actualDifference=0;
		int calculatedDiff=DateDifferenceProvider.getDateDifference(startDate, endDate);
		if(calculatedDiff== actualDifference){
			System.out.println("Testcase Passed");
		}else{
			System.err.println("Testcase Failed");
		}*/
		
			
		MyTestRecord[] myTestRecords=new MyTestRecord[2];
		myTestRecords[0]=new MyTestRecord(new MyDate(20, 11, 2018),new MyDate(20, 11, 2018), 0);
		myTestRecords[1]=new MyTestRecord(new MyDate(20, 11, 2018),new MyDate(27, 11, 2018), 7);
		//myTestRecords[2]=new MyTestRecord(new MyDate(06, 04, 2011),new MyDate(18, 05, 2018), 42);
		
		
		for(int index=0;index < myTestRecords.length;index++)
		{	
			//int actualDifference=0;
			
			int calculatedDiff=DateDifferenceProvider.getDateDifference(myTestRecords[index].startDate, myTestRecords[index].endDate);
			if(calculatedDiff == myTestRecords[index].actualDifference){
				System.out.println("Testcase Passed");
			}
			else
				System.err.println("TestCase faied");
		}
		
	}
	
	
}
