import java.util.*;
class Main {
  	public static Scanner input = new Scanner(System.in);
	
	public static void doctorRating(Doctor [] doc) {
		for (int i = 0; i < doc.length; i++) {
			System.out.println("please enter "+ doc[i].getName() + "'s rate");
			int rate = input.nextInt();
			double sum = 0; int count = 0;
			while(rate != -1) {
				sum = sum + rate;
				count++;
				System.out.println("please enter "+ doc[i].getName() + "'s rate");
				rate = input.nextInt();
			}
			doc[i].setRate(sum/count);
		}
	}
  
  public static void main(String[] args) {
    		Doctor a = new Doctor ("reut", "eyes", 0); 
    		Doctor b = new Doctor ("Yuval", "nose", 0); 
    		Doctor [] doc = {a, b};
    		doctorRating(doc);
    		for (int i = 0; i < doc.length; i++) {
    			System.out.println(doc[i].getRate());
  }
}
