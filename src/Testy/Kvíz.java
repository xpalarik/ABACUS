package Testy;

public class Kvíz{

	
	public String[] kluc;
	public String[] otazky;
	public String odpoved;
	public int body;
	public int cisotazka;
	
	public Kvíz(String[] k, String[] ot, String od){
		
	this.kluc = k;
	this.otazky = ot;
	this.odpoved = od;
		
	            
	 public static int boduj() {
		 
		 int spravne = 0;
	     
	            if (odpoved.compareTo(kluc[cisotazka])==0)
	                spravne++;
	           
	 				return spravne;
	 }
	        
	 for (cisotazka = 0; cisotazka < 20; cisotazka++){
         System.out.println(otazky[cisotazka]);
         }

	        if (body > 14){
	            System.out.println("Test bol uspesny");
	        } else {
	           System.out.println("Nespravil si test");
	        }
	        System.out.println("Mas " + body + " spravnych odpovedi.");



	}

}