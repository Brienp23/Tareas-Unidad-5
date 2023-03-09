package entrega_22defebrero;

import java.util.Scanner;

public class Ejercicio_5_17 {

	public static void main(String[] args) {
		
		double p1 = 2.98, p2 = 4.50, p3 = 9.98, p4 = 4.49, p5 = 6.87;
		
		int NoProd = 0;
		int CantVend = 0;
		double TotalVenta = 0;
		
		Scanner input = new Scanner(System.in);
	      
	      do {
	         System.out.println("Enter the product number (1-5): ");
	         NoProd = input.nextInt();
	         
	         if (NoProd >= 1 && NoProd <= 5) {
	            System.out.print("Enter the quantity sold: ");
	            CantVend = input.nextInt();
	            
	            switch (NoProd) {
	               case 1:
	            	   TotalVenta += CantVend * p1;
	                  break;
	               case 2:
	            	   TotalVenta += CantVend * p2;
	                  break;
	               case 3:
	            	   TotalVenta += CantVend * p3;
	                  break;
	               case 4:
	            	   TotalVenta += CantVend * p4;
	                  break;
	               case 5:
	            	   TotalVenta += CantVend * p5;
	                  break;
	            }
	            
	            System.out.printf("El precio total de los productos vendidos es: $%.2f", TotalVenta);
	            
	         } else if (NoProd != 0) {
	            System.out.println("Numero de producto invalido. Intente de nuevo.");
	         }
	      } while (NoProd != 0);
	      
	 
	}
}
