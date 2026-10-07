/** Practica 2 Calculadora
*@author Sergio Itan Jasso Jimenez
*@version 1.0
*@numero de cuenta 324316348
*@Since  29/09/2026
*/
import java.util.Scanner; 
public class calculadoradivi{ 
 public static void main (String[] args){
    Scanner scan = new Scanner (System.in);
    System.out.println("Calculadora Binaria de 8 bits");
    System.out.println("1. Suma");
    System.out.println("2. Resta");
    System.out.println("3. Multiplicacion");
    System.out.println("4. Division");
    System.out.println("Digita una opccion valida:");
	int resp = scan.nextInt();
        //Division
        if(resp == 4){
          boolean negativoX = false;
          boolean negativoY = false;
          System.out.println("Digita el primer numero");
          int x = scan.nextInt();


	  while (x < -128 || x > 127) {
              System.out.println("El numero debe de estar entre -128 y 127");
              System.out.println("Digita el primer numero otra vez:");
              x = scan.nextInt();
          }
 
          if(x <= -1){ negativoX = true; x = x*-1;}
          System.out.println("Digita el segundo numero");
          int y = scan.nextInt();

	  while (y < -128 || y > 127 || y == 0) {
              if (y == 0) {
                  System.out.println("Error: No se puede dividir entre cero.");
              } else {
                  System.out.println("El numero debe de estar entre -128 y 127");
              }
              System.out.println("Digita el segundo numero otra vez:");
              y = scan.nextInt();
          }

          if(y <= -1){ negativoY = true; y = y*-1;}
          
          //Decimos que totalw es igual a "y" para que no se pierda el valor original
          int totalw =y;
	  // guardamos copias de los valores de x y y
  	  int copiaX=x;
	  int copiaY=y;
          //Declaracion 8 bits para primer numero
          int x1,x2,x3,x4,x5,x6,x7,x8;
          //Declaracion 8 bits para segundo numero
          int y1,y2,y3,y4,y5,y6,y7,y8;
          int z1,z2,z3,z4,z5,z6,z7,z8;
          //Inicializacion en 0
          x1=x2=x3=x4=x5=x6=x7=x8=0;
          y1=y2=y3=y4=y5=y6=y7=y8=0;
          z1=z2=z3=z4=z5=z6=z7=z8=0;

            for(int i = 8;i >= 1;i--){
              int resX = x%2;
              x = x/2;

              int resY = y%2;
              y = y/2;

              switch (i) {
                case 1: x1 = resX; y1 = resY; break;
                case 2: x2 = resX; y2 = resY; break;
                case 3: x3 = resX; y3 = resY; break;
                case 4: x4 = resX; y4 = resY; break;
                case 5: x5 = resX; y5 = resY; break;
                case 6: x6 = resX; y6 = resY; break;
                case 7: x7 = resX; y7 = resY; break;
                case 8: x8 = resX; y8 = resY; break;
              }
            }


	//Division de binario por restas sucesivas
        //w es el numero de veces que va a restar "x" a "y"  para ver cuantas veces cabe "y" en "x"
            int w=0;

 	//  Mientras el Dividendo sea mayor o igual al Divisor, seguimos restando
          while (copiaX >= copiaY) {
              copiaX = copiaX - copiaY; // Le restamos el divisor al dividendo en decimal
              w++;         // Sumamos 1 al contador de veces que cupo
            }
	// Convertimos el valor acumulado en w  a tus variables binarias Z
          int copiaw = w;
          for(int i = 8; i >= 1; i--){
              int resZ = copiaw  % 2;
              copiaw = copiaw / 2;
              switch (i) {
                  case 1: z1 = resZ; break;
                  case 2: z2 = resZ; break;
                  case 3: z3 = resZ; break;
                  case 4: z4 = resZ; break;
                  case 5: z5 = resZ; break;
                  case 6: z6 = resZ; break;
                  case 7: z7 = resZ; break;
                  case 8: z8 = resZ; break;
              }
         }
		if(negativoX !=  negativoY){
                  if(z1 == 0) {z1 = 1;} else {z1 = 0;}
		  if(z2 == 0) {z2 = 1;} else {z2 = 0;}
		  if(z3 == 0) {z3 = 1;} else {z3 = 0;}
                  if(z4 == 0) {z4 = 1;} else {z4 = 0;}
		  if(z5 == 0) {z5 = 1;} else {z5 = 0;}
                  if(z6 == 0) {z6 = 1;} else {z6 = 0;}
		  if(z7 == 0) {z7 = 1;} else {z7 = 0;}
		  if(z8 == 0) {z8 = 1;} else {z8 = 0;}
		 
		   int acarreoz = 1;
		  for (int i = 8; i >= 1 && acarreoz == 1; i--) {
			 switch (i) {
     			   case 8: if (z8 == 0) { z8 = 1; acarreoz = 0; } else { z8 = 0; } break;
     			   case 7: if (z7 == 0) { z7 = 1; acarreoz = 0; } else { z7 = 0; } break;
     			   case 6: if (z6 == 0) { z6 = 1; acarreoz = 0; } else { z6 = 0; } break;
     			   case 5: if (z5 == 0) { z5 = 1; acarreoz = 0; } else { z5 = 0; } break;
     			   case 4: if (z4 == 0) { z4 = 1; acarreoz = 0; } else { z4 = 0; } break;
     			   case 3: if (z3 == 0) { z3 = 1; acarreoz = 0; } else { z3 = 0; } break;
     			   case 2: if (z2 == 0) { z2 = 1; acarreoz = 0; } else { z2 = 0; } break;
     			   case 1: if (z1 == 0) { z1 = 1; acarreoz = 0; } else { z1 = 0; } break;

	   }
         }
        }

        System.out.println("Numero 1: " +x1+x2+x3+x4+x5+x6+x7+x8);
        System.out.println("Numero 2: " +y1+y2+y3+y4+y5+y6+y7+y8);
        System.out.println("Resultado:");
        System.out.println("" + z1+z2+z3+z4+z5+z6+z7+z8);

          }
    }
 }
