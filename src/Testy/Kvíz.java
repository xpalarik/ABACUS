package Testy;

public abstract class Kvíz{

	
	private String[] kluc;
	private String[] otazky;
	private String odpoved;
	private int body = 0;
	private int cisotazka = 0;

	public String[] getkluc() {
			return kluc;}
	public String[] getotazky() {
			return otazky;}
	public String getodpoved() {
	return odpoved;}
	public int getbody() {
	return body;}
	public int getcisotazka() {
	return cisotazka;}
	

	public Kvíz(){}	
	            
	 public int boduj() {
	     
	            if (odpoved.compareTo(kluc[cisotazka])==0)
	                body++;
	           
	 				return body;
	 					}
	        
	 
	 public int vyhodnot() {
	 for (cisotazka = 0; cisotazka < 20; cisotazka++){
         System.out.println(otazky[cisotazka]);
         body = boduj();
         }

	        if (body > 14){
	            System.out.println("Test bol uspesny");
	        } else {
	           System.out.println("Nespravil si test");
	        }
	        System.out.println("Mas " + body + " spravnych odpovedi.");
	 					
	 return body;
	 }


	}

