import javax.swing.JOptionPane;

public class Forca {
	public static void main(String[]args) {
			
		String listaPalavras = JOptionPane.showInputDialog("Informe palavra para a forca: ");
		
		for(int i = 0;i<=listaPalavras.length();i++) {
			JOptionPane.showMessageDialog(null, i);
		}
		
		
		
	}
}
