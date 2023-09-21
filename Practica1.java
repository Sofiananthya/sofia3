
package sofiagl301;

import java.util.Scanner;

public class Practica1 
{
public static void main(String[] args) 
{
    
Scanner leer=new Scanner (System.in) ;
float n1,n2,res;
System.out.print("ingresa el primer numero: ");
n1=leer.nextFloat();
System.out.print("ingresa el segundo numero:"); 
n2=leer.nextFloat(); 
res=n1+n2;
System.out.print("la suma es:" + res);
    }
    

}