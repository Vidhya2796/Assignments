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
		
		DateDifferenceProvider provider = new DateDifferenceProvider();
		MyTestRecord[] myTestRecords = new MyTestRecord[7];
		myTestRecords[0] = new MyTestRecord(new MyDate(20, 11, 2018), new MyDate(20, 11, 2018), 0);
		myTestRecords[1] = new MyTestRecord(new MyDate(20, 11, 2018), new MyDate(27, 11, 2018), 7);
		myTestRecords[2] = new MyTestRecord(new MyDate(06, 04, 2011), new MyDate(18, 05, 2011), 42);
		myTestRecords[3] = new MyTestRecord(new MyDate(06, 04, 2011), new MyDate(18, 06, 2011), 73);
		myTestRecords[4] = new MyTestRecord(new MyDate(06, 04, 2011), new MyDate(18, 12, 2011), 256);
		myTestRecords[5] = new MyTestRecord(new MyDate(06, 04, 2011), new MyDate(18, 12, 2012), 621);
		myTestRecords[6] = new MyTestRecord(new MyDate(06, 04, 2011), new MyDate(18, 12, 2013), 986);
		
		/*myTestRecords[7] = new MyTestRecord(new MyDate(06, 04, 2011), new MyDate(18, 12, 2113), 37511);
		myTestRecords[8] = new MyTestRecord(new MyDate(06, 04, 2011), new MyDate(18, 12, 2413), 147084);
		myTestRecords[9] = new MyTestRecord(new MyDate(06, 04, 2011), new MyDate(18, 12, 2813), 293181);
		myTestRecords[10] = new MyTestRecord(new MyDate(06, 01, 2011), new MyDate(06, 03, 2113), 59);
		myTestRecords[11] = new MyTestRecord(new MyDate(06, 04, 2012), new MyDate(18, 12, 2012), 60);
		myTestRecords[12] = new MyTestRecord(new MyDate(06, 02, 2012), new MyDate(06, 03, 2012), 29);
		myTestRecords[13] = new MyTestRecord(new MyDate(22, 01, 2012), new MyDate(15, 11, 2012), 298);
		myTestRecords[14] = new MyTestRecord(new MyDate(06, 02, 2012), new MyDate(06, 12, 2012), 304);*/
			
		
		for(int index=0;index < myTestRecords.length;index++)
		{	
			//int actualDifference=0;
			
			int calculatedDiff=provider.getDateDifference(myTestRecords[index].startDate, myTestRecords[index].endDate);
			if(calculatedDiff == myTestRecords[index].actualDifference){
				System.out.println("Testcase Passed");
			}
			else
				System.err.println("TestCase failed " + "Actual= "+myTestRecords[index].getActualDifference()+ "Calculated= "+calculatedDiff);
		}
		
	}
	
	
}
