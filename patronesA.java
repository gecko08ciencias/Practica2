/** Practica 2 Patrones
*@author Sergio Itan Jasso Jimenez
*@version 1.0
*@numero de cuenta 324316348
*@Since  29/09/2026
*/import java.util.Scanner;
public class patronesA{
 public static void main( String[] arg  ){
 Scanner scan = new Scanner (System.in);
 System.out.println("Creador de patrones");
 System.out.println("Digita un numero entero");
  int n = scan.nextInt();
   for (int  i=1; i<= n; i++){
    for(int j=1; j<=n-i; j++){
     System.out.print(" ");
       }
      for (int j=1; j<=(2*i-1); j++){

         if ( j==1||j == (2*i-1)&& i>1){
	  System.out.print("1");
	}
            else { System.out.print("*"); 
       }
       }
       System.out.println();
      }
 }

}
