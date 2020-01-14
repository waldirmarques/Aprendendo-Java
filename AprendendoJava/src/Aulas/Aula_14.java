package Aulas;
//Programa que obtem a hora atual
public class Aula_14{
    public static void main(String[]args){
        long milisigundo = System.currentTimeMillis()-10800000;
        
        long totalSegundo = milisigundo / 1000;
        long segundoAtual = totalSegundo % 60;
        
        long totalMinuto = totalSegundo / 60;
        long minutoAtual = totalMinuto % 60;
        
        long totalHora = totalMinuto / 60;
        long horaAtual = totalHora % 24;
        
        System.out.println(horaAtual+";"+minutoAtual+";"+segundoAtual);
      
        }
}