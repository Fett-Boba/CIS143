package com.olympic.cis143.touche;

public class Placement2 {

	public static void main(String[] args) {

		Fencer f1 = new Fencer();
		Fencer f2 = new Fencer();
		Fencer f3 = new Fencer();
		Fencer f4 = new Fencer();
		Fencer f5 = new Fencer();
		Fencer f6 = new Fencer();
		Fencer f7 = new Fencer();
		Fencer f8 = new Fencer();
		
		f1.setVictories(8);
		f2.setVictories(3);
		f3.setVictories(5);
		f4.setVictories(7);
		f5.setVictories(0);
		f6.setVictories(8);
		f7.setVictories(4);
		f8.setVictories(2);
		
		
		int place = 1;
		boolean placeFlag = false;
		
		
		// Maybe could use a hashmap.  this is ugly.
		for (int i = 8; i >= 0; i--) {

			if (f1.getVictories() == i) {f1.setPlace(place);placeFlag = true;}   
			if (f2.getVictories() == i) {f2.setPlace(place);placeFlag = true;}
			if (f3.getVictories() == i) {f3.setPlace(place);placeFlag = true;}
			if (f4.getVictories() == i) {f4.setPlace(place);placeFlag = true;}
			if (f5.getVictories() == i) {f5.setPlace(place);placeFlag = true;}
			if (f6.getVictories() == i) {f6.setPlace(place);placeFlag = true;}
			if (f7.getVictories() == i) {f7.setPlace(place);placeFlag = true;}
			if (f8.getVictories() == i) {f8.setPlace(place);placeFlag = true;}
			
			if (placeFlag) {place = place + 1;placeFlag=false;}
			
		}
			
		System.out.println(f1.getPlace());
		System.out.println(f2.getPlace());
		System.out.println(f3.getPlace());
		System.out.println(f4.getPlace());
		System.out.println(f5.getPlace());
		System.out.println(f6.getPlace());
		System.out.println(f7.getPlace());
		System.out.println(f8.getPlace());
	
	}

}
