package Testy;

public class Kvíz{

	
	public String[] kluc;
	public String[] otazky;
	public String odpoved;
	
	public Kvíz(String[] k, String[] ot, String od){
		
	this.kluc = k;
	this.otazky = ot;
	this.odpoved = od;
		
	        int correct = 0;
	        int incorrect = 0;

	        for (int cisotazka = 0; cisotazka < 20; cisotazka++){
	            System.out.println(otazky[cisotazka]);

	            if (odpoved.compareTo(kluc[cisotazka])==0){
	                correct++;} 
	            else {incorrect++;}
	        }

	        if (correct > 14){
	            System.out.println("You passed.");
	        } else {
	           System.out.println("You failed.");
	        }
	        System.out.println("You have " + correct + " correct answers.");
	        System.out.println("You have " + incorrect + " incorrect answers.");

	}

}