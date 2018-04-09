package Testy;

public class Fyzika extends Kvíz{

public int boduj() {

	 int body = getbody();
	     
	            if (getodpoved().compareTo(getkluc()[getcisotazka()])==0){
	                body++;}
	            else {body--;}
	            
	 				return body;
	 }	
	
}
