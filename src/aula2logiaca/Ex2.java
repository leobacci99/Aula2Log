package aula2logiaca;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        String id;
        String senha;
        
        System.out.print("Id: ");
        id = leitor.nextLine();
        
        System.out.print("Senha: ");
        senha = leitor.nextLine();
        
        id = id.trim();
        
              
        boolean autorizado = (id == "Guilherme"  && senha == "0f5") || 
                (id == "Jair" && senha == "0706" ) ;
          /*
                         OU
        boolean autorizado = id.equals("Guilherme")  && senha.equals("0f5") || 
                id.equals("Jair") && senha.equals("0706");
        */
        if (autorizado) {
            System.out.println("Usuario Autorizado");
            
        }else {
            System.out.println("Usuario não Autorizado");
            
            
        }
        
    }
}
