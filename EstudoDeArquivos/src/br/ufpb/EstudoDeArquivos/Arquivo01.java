package br.ufpb.EstudoDeArquivos;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.swing.JOptionPane;

/*
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//FireWrite --> file = Arquivo
		
		//BufferedWrite --> writer = escrever
		
		//FileReader
		//BufferedReader   --> reader = ler
		
		//mkdir = criar o arquivo ou diretorio
		//delete = apaga o arquivo ou diretorio. Também funciona para arquivo txt
		
		//createNewFile = cria um arquivo em texto OBS: tem que esta dentro de um try e catch.
		
		//File file = new File("Novo Arquivo");		
		//file.mkdir();
		//file.delete();
		/*
		File arquivo = new File("Arquivo.txt");
			
		try{
			
			FileWriter fileWriter = new FileWriter(arquivo);
			BufferedWriter escrever = new BufferedWriter(fileWriter);
			escrever.write("Waldir Marques");
			escrever.newLine();
			escrever.write("Gilberto");
				
			escrever.close();
			fileWriter.close();
			
			FileReader ler = new FileReader(arquivo);
			BufferedReader lerEs = new BufferedReader(ler);
			String linha = lerEs.readLine();
			
			while(linha != null) {
				System.out.println(linha);
				linha = lerEs.readLine();
			}
			
		}catch(IOException e) {
			
		}
*/

public class Arquivo01 {
	public static void main(String[]args){
		
		String nome = JOptionPane.showInputDialog(null,"Informe nome: ");
		String rua = JOptionPane.showInputDialog(null,"Informe rua: ");
		String telefone = JOptionPane.showInputDialog(null,"Informe telefone: ");
		
		Pessoa p1 = new Pessoa(nome,rua,telefone);
		
		/*
		try {
			
			FileOutputStream arq = new FileOutputStream("Arquivo01.waldir");
			ObjectOutputStream obj = new ObjectOutputStream(arq);
			obj.writeObject(p1);
			obj.flush();
			JOptionPane.showMessageDialog(null,p1);
			JOptionPane.showMessageDialog(null, "Gravação realizada");
		
		}catch(IOException a){
			JOptionPane.showMessageDialog(null, "gravação não realizada");
		}
		*/
		
		
		
		try {
			JOptionPane.showMessageDialog(null,"teste linha 00");
			FileInputStream arq = new FileInputStream("Arquivo01.waldir");
			JOptionPane.showMessageDialog(null,"teste linha 01");
			ObjectInputStream obj = new ObjectInputStream(arq);
			JOptionPane.showMessageDialog(null,"teste linha 02");
			Pessoa p2 = (Pessoa)obj.readObject();
			JOptionPane.showMessageDialog(null,"teste linha 03");
			JOptionPane.showMessageDialog(null,p2);
			JOptionPane.showMessageDialog(null,"teste linha 04");
		}catch(Exception ex){
			JOptionPane.showMessageDialog(null, "gravação não realizada");
		}
		
		
	}
}
