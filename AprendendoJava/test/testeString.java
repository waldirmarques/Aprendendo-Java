import java.util.*;

public class testeString {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        
        String nome = "Waldir marques";
        boolean correto = true;
        
        while(correto){
            System.out.println("Informe seu nome; ");
            String nomeEntrada = input.nextLine();
            boolean compara = nome.equals(nomeEntrada);
            System.out.println(compara);
            System.out.println(nomeEntrada);
            if(compara == true){
                correto = false;
            }
        
        }

    }
}
