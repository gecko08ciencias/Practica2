/** Practica 2 Patrones C
*@author Sergio Itan Jasso Jimenez
*@version 1.0
*@numero de cuenta 324316348
*@Since  29/09/2026
*/
import java.util.Scanner;
public class patronesC{
public static void main( String[] arg  ){
 Scanner scan = new Scanner (System.in);
 System.out.println("Creador de patrones");
 System.out.println("Digita un numero entero");
  int n = scan.nextInt();

    for (int  i=1; i< n; i++){
       for(int j=1; j<= n-i; j++){
         System.out.print(" ");
          }
          for (int j=1; j<=(2*i-1 ); j++){
           System.out.print("*");
           }
            System.out.println();


          }
     for (int  i=n; i>= 1; i--){
       for(int j=1; j<= n-i; j++){
         System.out.print(" ");
          }
          for (int j=1; j<=(2*i-1); j++){
           System.out.print("*");
           }
            System.out.println();
        }


 }

}

