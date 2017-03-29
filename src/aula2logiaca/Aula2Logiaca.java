package aula2logiaca;

import java.util.Scanner;

public class Aula2Logiaca {
   public static void main(String[] args) {
       Scanner leitor = new Scanner(System.in);
       
       System.out.print("N: ");
       int n = Integer.parseInt(leitor.nextLine());
       
       if (n >= 1 &&  n <= 12){
        
           int r = 2 * n;
        
           System.out.println(r);
       }else {
           System.out.println("Numero invalido!");
       }
       }
   }
    

