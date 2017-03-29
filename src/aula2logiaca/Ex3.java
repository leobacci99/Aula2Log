package aula2logiaca;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        double n1, n2, media;
            
        
        System.out.print("Nota P1: ");
        n1 = leitor.nextDouble();
        
        System.out.print("Nota P2: ");
        n2 = leitor.nextDouble();
        
        media = (n1 + n2) / 2;
        
        if (media >= 6) {
            System.out.println("Aluno passou com media: " + media);
        } else{
             System.out.println("Necessita a terceira prova");
             System.out.print("Nota P3: ");   
             double n3 = leitor.nextDouble();
            
            if (n1 < n2) {
                n1 = n3;
            }else{
                n2 = n3;
            }    
            media = (n1 + n2) / 2;
        if (media >= 6) {
            media = 6; 
            System.out.println("Aluno passou com média: " + media);
        }else {
              System.out.println("Aluno reprovado");
        }
        }
       
    }
    
}
