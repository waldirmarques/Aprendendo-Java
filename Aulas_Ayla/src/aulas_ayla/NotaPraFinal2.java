package aulas_ayla;

import javax.swing.JOptionPane;

public class NotaPraFinal2 {
    public static void main(String[]args){
        double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota"));
        JOptionPane.showMessageDialog(null,"A sua nota foi " + nota1);
    }
}
