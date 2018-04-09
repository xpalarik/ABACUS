package Testy;

public class Matematika extends Kvíz {
 super.boduj() {
		 
		 int spravne = 0;
		 int intkluc = 0;
		 int intodpoved = 0;
		 int tolerancia = 0;
		 
		 intkluc = parseInt(kluc[cisotazka]);
		 intodpoved = parseInt(odpoved);
		 tolerancia = intodpoved-intkluc;
	     
	            if (intodpoved == intkluc || tolerancia > 0.99 || tolerancia < 0.99){
	                spravne++;}
	            else {spravne--;}
	            
	 				return spravne;
	 }

private int parseInt(String string) {
	// TODO Auto-generated method stub
	return 0;
}	
}
