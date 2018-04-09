package Testy;

public class Matematika extends Kvíz {
public int boduj() { 
	
	
	
	
		 int intkluc = 0;
		 int intodpoved = 0;
		 int tolerancia = 0;
		 int body = getbody();
		 
		 intkluc = parseInt(getkluc()[getcisotazka()]);
		 intodpoved = parseInt(getodpoved());
		 tolerancia = intodpoved-intkluc;
	     
	            if (intodpoved == intkluc || tolerancia > 0.99 || tolerancia < 0.99){
	                body++;}
	            else {body--;}
	            
	 				return body;
	 }

private int parseInt(String string) {
	return 0;
}	
}
