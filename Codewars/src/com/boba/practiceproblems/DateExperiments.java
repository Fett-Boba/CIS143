package com.boba.practiceproblems;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;



public class DateExperiments {

	public static void main(String[] args) {
		
		
//		GregorianCalendar gc1 = new GregorianCalendar();
//		GregorianCalendar gc2 = new GregorianCalendar();
//		
//		gc1.set(GregorianCalendar.DAY_OF_MONTH, 15);
//        gc1.set(GregorianCalendar.MONTH, GregorianCalendar.OCTOBER);
//        gc1.set(GregorianCalendar.YEAR, 2000);
//        System.out.println(gc1.get(GregorianCalendar.DAY_OF_YEAR));
//		
//
//		gc2.set(GregorianCalendar.DAY_OF_MONTH, 16);
//        gc2.set(GregorianCalendar.MONTH, GregorianCalendar.JANUARY);
//        gc2.set(GregorianCalendar.YEAR, 1987);
//        System.out.println(gc2.get(GregorianCalendar.DAY_OF_YEAR));
//        
//        System.out.println();
//        System.out.println( gc1.get(GregorianCalendar.DAY_OF_YEAR) - gc2.get(GregorianCalendar.DAY_OF_YEAR) );

        // ----------------------
        
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH);
        
        Date firstDate;
        Date secondDate;
		try {
			firstDate = sdf.parse("10/27/2005");
			secondDate = sdf.parse("4/6/2017");
			long difference =  (firstDate.getTime()-secondDate.getTime())/86400000;
	        System.out.println(Math.abs(difference));
		} catch (ParseException e) {
			e.printStackTrace();
		}
        

        
		
		

	}

}
