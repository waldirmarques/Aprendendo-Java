package exercícios;

import java.util.*;

public class Exerc_06{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);          
        
        int multa = 10;
        int ano = 12;
        
        System.out.println("Informe a quantidade de filmes que a locado possui; ");
        double QuantidadeDeFilmes = input.nextInt();
        System.out.println("Informe o valor cobrado por cada locação; ");
        double valorDaLocacao = input.nextDouble();
        
        double faturamentoAnual = (QuantidadeDeFilmes / 3 * ano) * valorDaLocacao;
        
        double ganhoPorMultaMes = (QuantidadeDeFilmes / 10 * ano) * (valorDaLocacao +(valorDaLocacao * multa/100));
        
        double QuantidadeDeFilmesNoFimDoAno = ((QuantidadeDeFilmes-(QuantidadeDeFilmes*2/100))+QuantidadeDeFilmes/10);
        
        System.out.println();
        System.out.println("Faturamento da locadora anualmente; "+faturamentoAnual);
        System.out.println("Ganho por multas devido atraso na entrega dos filmes; "+ganhoPorMultaMes);
        System.out.println("Quantidade de filmes repostos no fim do ano; "+QuantidadeDeFilmesNoFimDoAno);
    }
}