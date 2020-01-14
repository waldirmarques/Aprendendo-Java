package Aulas;
import java.util.*;
//final; palavra reservada que faz com que uma variavel seja permanente
public class Aula_12{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        final double PI = 3.14;
        double area, resl;
        System.out.println("Informe área do circulo; ");
        area = input.nextDouble();
        resl = area * PI;
        System.out.println("Resultado da área do circulo; "+resl);
    }
}