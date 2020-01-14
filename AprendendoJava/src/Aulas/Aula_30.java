/*
length é igual ao len do python
java.uti.Arrays.fill() é um metodo que permite fazwe com que tosos os elementos
da lista sejam mudados para um número que especificarmos dentro do metodo.
 */
package Aulas;

public class Aula_30 {
    public static void main(String[]args){
        
        int i = 6;
        int[] x = new int[i];
        int[] k = {1,2,3,5,642,341};
        
        java.util.Arrays.fill(x,2,5,50);
        
        for(int j = 0; j < x.length;++j){
            System.out.println(x[j]);
            System.out.println(k[j]);
        }
    }
}
