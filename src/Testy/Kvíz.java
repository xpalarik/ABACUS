package Testy;

public abstract class Kvíz{

	    String[] kluc = {"b","a"};
	    String[] otazky = {"bla bla bla \n a/b","ble ble ble \n a/b"};
	    String odpoved = "";
	    
	        int correct = 0;
	        int incorrect = 0;
	        String answer = "";

	        for (int cisotazka = 0; cisotazka < 20; cisotazka++){
	            System.out.println(otazky[cisotazka]);
	            odpoved = System.console().readLine();

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
