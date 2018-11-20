package com.vidhyac.service;

import com.vidhyac.service.supp.MyDate;

public class DateDifferenceProvider {
	
	public static int getDateDifference(MyDate startDate,MyDate endDate){
		//if else..
		return endDate.getDd() - startDate.getDd();
	}
	
	private boolean sameDate(MyDate startDate,MyDate endDate){
		return endDate.getDd()== startDate.getDd();
		
	}
}
