package Sistema;

import javax.swing.JOptionPane;

public class SistemaBancario {

	public static void main(String[] args) {
		/*Desenvolver um algoritmo que
defina um menu para o sistema
banc�rio, seguindo o padr�o:
1- Criar conta;
2- Saque;
3- Dep�sito;
4- Transfer�ncia;
5- Aplicar na poupan�a;
6- Aplicar no fundo;
7- Simula��o;
8- Verificar Saldo;
9- Hist�rico de transa��es;
10-Sair.
Postar o projeto compactado no
Moodle.*/
		
		
		JOptionPane.showConfirmDialog(null, "Bem vindo ao Sistema Banc�rio RA - Deseja continuar?");
		
		
		int opcao;
		
		opcao=Integer.parseInt(JOptionPane.showInputDialog(
				"1- Criar conta\r\n" + 
				"2- Saque\r\n" + 
				"3- Dep�sito\r\n" + 
				"4- Transfer�ncia\r\n" + 
				"5- Aplicar na poupan�a\r\n" + 
				"6- Aplicar no fundo\r\n" + 
				"7- Simula��o\r\n" + 
				"8- Verificar Saldo\r\n" + 
				"9- Hist�rico de transa��es\r\n" + 
				"10-Sair\n\n Digite a op��o desejada: "));
		
		if(opcao==1) {
			JOptionPane.showMessageDialog(null,"Criar conta");
		}else if(opcao==2) {
			JOptionPane.showMessageDialog(null,"Saque");
			
		}else if(opcao==3) {
			JOptionPane.showMessageDialog(null,"Dep�sito");
		
		}else if(opcao==4) {
			JOptionPane.showMessageDialog(null,"Transfer�ncia");
			
		}else if(opcao==5) {
			JOptionPane.showMessageDialog(null,"Aplicar na poupan�a");
			
		}else if(opcao==6) {
			JOptionPane.showMessageDialog(null,"Aplicar no fundo");
			
		}else if(opcao==7) {
			JOptionPane.showMessageDialog(null,"Simula��o");
			
		}else if(opcao==8) {
			JOptionPane.showMessageDialog(null,"Verificar saldo");
			
		}else if(opcao==9) {
			JOptionPane.showMessageDialog(null,"Hist�rico de transa��es");
		
		}else if(opcao==10) {
			JOptionPane.showMessageDialog(null,"Sair");
		return;
		
		}else {
			JOptionPane.showMessageDialog(null,"Opera��o inv�lida, tente novamente!");
		}
		
	}

}
