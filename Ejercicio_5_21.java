package entrega_22defebrero;

public class Ejercicio_5_21 {
	
	

	public static void main(String[] args){
		int limit = 500;
	      
		System.out.println("Triples de pitagoras (lado 1, lado 2, hipotenusa):");
      for (int side1 = 1; side1 <= limit; side1++) {
    	  for (int lado2 = 1; lado2 <= limit; lado2++) {
    		  for (int hipotenusa = 1; hipotenusa <= limit; hipotenusa++) {
    			  if (side1 * side1 + lado2 * lado2 == hipotenusa * hipotenusa) {
	                  System.out.printf("(%d, %d, %d)%n", side1, lado2, hipotenusa);
    			  	}
    		  	}
    	  	}
      	}
	}
}
