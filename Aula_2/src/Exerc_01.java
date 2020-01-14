import javax.swing.JOptionPane;

public class Exerc_01 {
	public static void main(String[]args) {
		String nome = JOptionPane.showInputDialog("Qual seu nome: ");
		JOptionPane.showMessageDialog(null,"Bem vindo "+nome);
	}
}
