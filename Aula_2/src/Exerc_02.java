import javax.swing.JOptionPane;

public class Exerc_02 {
	public static void main(String[]args) {
		String HorasEntrada = JOptionPane.showInputDialog("Informe hora: ");
		int horas = Integer.parseInt(HorasEntrada);
		
		if(horas >= 5 && horas <= 12) {
			JOptionPane.showMessageDialog(null,"Bom dia");
		}else if(horas > 12 && horas <= 17) {
			JOptionPane.showMessageDialog(null,"Boa tarde");
		}else if(horas > 17 && horas <= 24) {
			JOptionPane.showMessageDialog(null,"Boa noite");			
		}else if(horas >= 1 && horas <= 4) {
			JOptionPane.showMessageDialog(null,"Boa Madrugada");
		}else {
			JOptionPane.showMessageDialog(null,"Horas invalida");
		}
	}
}
