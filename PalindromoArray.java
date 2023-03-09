package entrega_22defebrero;
import java.util.Scanner;
public class PalindromoArray {
	public boolean esPalindromo(String palabra) 
	
{		 
		int i = 0;
		int j = palabra.length() - 1;
		for (i = 0; i < (palabra.length() / 2); i++) {
			if (palabra.charAt(i) != palabra.charAt(j)) {
				System.out.println("La palabra no es PALINDROMA");
				return true;
			}
			j--;
		}
		System.out.println("La palabra si es PALINDROMA");
		System.out.println("EL CICLO DIO " + i + " VUELTAS");
		return false;
	}
	
	public static void main(String[] args) 
	{
		
		{
	         Scanner entrada=new Scanner(System.in); 
			 
			 String palabra;
			 
			 char [] arreglo;
			 
			 PalindromoArray arreglo1 =new PalindromoArray();
			 Scanner scan = new Scanner (System.in);
			 
			 System.out.println("INGRESA UNA PALABRA Y TE INDICAREMOS SI ES PALINDORMA O NO");
			 String palabra1 = scan.nextLine();
			 arreglo1.esPalindromo(palabra1.toUpperCase());
		}
	}
	
}