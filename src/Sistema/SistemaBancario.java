
import javax.swing.JOptionPane;

public class SistemaBancarioRA {

	public static void main(String[] args) {

		JOptionPane.showConfirmDialog(null, "Bem vindo ao Sistema Banc�rio RA - Deseja continuar?");

		Integer opcao;
		double investimento = 0; // antonio
		final float redimentoPoupaca = 0.002f; // antonio
		double totalInvestimento = 0; // antonio
		final float rendimentoAplicacaoFundo = 0.002f;
		double fundo = 0;
		String nome, cpf, dataNasc, genero;
		String senha = "0000";
		double saldo = 400, saque = 0;
		int menu = 0;
		int contRedimenPoupa = 0;
		int contRedimenAplic = 0;
		opcao = 0;
		do {
			while (opcao != 10) {
				opcao = Integer.parseInt(JOptionPane.showInputDialog("1- Criar conta\r\n" + "2- Saque\r\n"
						+ "3- Dep�sito\r\n" + "4- Transfer�ncia\r\n" + "5- Aplicar na poupan�a\r\n"
						+ "6- Aplicar no fundo\r\n" + "7- Simula��o\r\n" + "8- Verificar Saldo\r\n"
						+ "9- Hist�rico de transa��es\r\n" + "10-Sair\n\n Digite a op��o desejada: "));
				if (opcao > 10 && opcao < 1) {
					JOptionPane.showMessageDialog(null, "Opera��o inv�lida, tente novamente.");
				}

				if (opcao == 1) {
					JOptionPane.showMessageDialog(null, "Criando sua conta conta...");
					nome = JOptionPane.showInputDialog("Digite seu nome: ");
					cpf = JOptionPane.showInputDialog("Digite seu CPF: ");
					dataNasc = JOptionPane.showInputDialog("Digite sua data de nascimento: (dd/mm/aaaa)");
					genero = JOptionPane.showInputDialog("Digite seu sexo:");
					senha = JOptionPane.showInputDialog("Digite sua senha: ");

					JOptionPane.showMessageDialog(null,
							"Seus dados:\nNome: " + nome + "\nCPF: " + cpf + "\nData de nascimento: " + dataNasc
									+ "\nSexo: " + genero + "\n\nSaldo da conta: " + saldo + " reais.");
				} else if (opcao == 2) {
					String s = "0";
					JOptionPane.showMessageDialog(null, "Op��o saque selecionada...");
					s = JOptionPane.showInputDialog("Digite sua senha:");
					while (!s.equalsIgnoreCase(senha)) {
						s = JOptionPane.showInputDialog("Senha incorreta. Digite sua senha novamente:");
					}

					saque = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor que deseja sacar:"));
					while (saque > saldo || saque <= 0) {
						saque = Double.parseDouble(
								JOptionPane.showInputDialog("Valor inv�lido, digite um valor acima de 0:"));
					}
					if (s.equalsIgnoreCase(senha)) {
						while (saque > saldo || saque <= 0) {
							saque = Double.parseDouble(JOptionPane.showInputDialog("Saldo indisponivel!!"));
						}
						if (saque <= saldo) {
							JOptionPane.showMessageDialog(null, "Foram sacados R$ " + saque + " reais");
						} else if (saque > saldo) {
							JOptionPane.showMessageDialog(null, "Imposs�vel sacar, saldo indispon�vel");
						} else {
							JOptionPane.showMessageDialog(null, "Error inesperado em saque!!");
						}
					}
					saldo = saldo - saque;

				}

				else if (opcao == 3) {
					double deposito;
					JOptionPane.showMessageDialog(null, "Op��o de dep�sito selecionada...");
					deposito = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor que deseja depositar:"));
					while (deposito <= 0) {
						deposito = Double.parseDouble(JOptionPane
								.showInputDialog("Error DEPOSITO(valor inferior ouu igual � 0). Tente novamente:"));
					}
					saldo += deposito;
					JOptionPane.showMessageDialog(null, "Saldo realizado com sucesso!");

				} else if (opcao == 4) {
					JOptionPane.showMessageDialog(null, "Transfer�ncia");

				} else if (opcao == 5) {
					String s = "0";
					JOptionPane.showMessageDialog(null, "Op��o de investimento selecionada...");
					s = JOptionPane.showInputDialog("Digite sua senha:");
					while (!s.equalsIgnoreCase(senha)) {
						s = JOptionPane.showInputDialog("Senha incorreta. Digite sua senha novamente:");
					}
					if (saldo > 0) {
						investimento = Double
								.parseDouble(JOptionPane.showInputDialog("Qual o valor do investimento? "));
						while (investimento > saldo) {
							investimento = Double.parseDouble(JOptionPane
									.showInputDialog("Valor de investimento maior que saldo! Tente novamente."));
						}
						while (investimento <= 0 || investimento > saldo) {
							investimento = Double.parseDouble(
									JOptionPane.showInputDialog("Valor de investimento inv�lido! Tente novamente."));
						}
						saldo = saldo - investimento;
						totalInvestimento = (investimento * redimentoPoupaca);
						JOptionPane.showMessageDialog(null,
								"Valor do investimento: " + investimento + ", rendimento di�rio: " + totalInvestimento);
					} else {
						JOptionPane.showMessageDialog(null, "Saldo indisponivel!!");
					}

				} else if (opcao == 6) {
					String s = "0";
					JOptionPane.showMessageDialog(null, "Op��o de Aplicar no fundo selecionada...");

					double valorAplicar = Double
							.parseDouble(JOptionPane.showInputDialog("Digite o valor que voc� deseja aplicar:"));
					while (valorAplicar > saldo || valorAplicar < 0) {
						valorAplicar = Double.parseDouble(
								JOptionPane.showInputDialog("Valor indispon�vel na conta, digite um valor v�lido:"));
					}
					if (valorAplicar < saldo) {
						s = JOptionPane.showInputDialog("Digite sua senha:");
						while (!s.equalsIgnoreCase(senha)) {
							s = JOptionPane.showInputDialog("Senha incorreta. Digite sua senha novamente:");
						}
						if (s.equalsIgnoreCase(senha)) {
							fundo = fundo + valorAplicar;
							saldo = saldo - valorAplicar;
						}
					}
					JOptionPane.showMessageDialog(null, "Opera��o realizada com sucesso! Seu rendimento ser� de "
							+ rendimentoAplicacaoFundo + " di�rio.");

				} else if (opcao == 7) {
					float operaFinancia = 0;
					final float taxaImovel = 0.02f;
					final float taxaAutomo = 0.04f;
					float valorFina = 0f;
					int quantParcelas = 0;
					float juros = 0f;
					while (operaFinancia  <1 || operaFinancia  > 2) {
						operaFinancia = Float.parseFloat(JOptionPane.showInputDialog(
								"Digite 1 - Financiamento Im�vel \nDigite 2 - Financiamento Ve�culo"));
					}
					

					
					while (valorFina < 1) {
						valorFina = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do finasciamento: "));
					}
					while (quantParcelas < 1) {
						quantParcelas = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de parcelas: "));
					}

					if (operaFinancia == 1) {
						juros = (taxaImovel * valorFina);
						JOptionPane.showMessageDialog(null, "Valor do finasciamento do imovel: R$ " + valorFina
								+ "reais.\n" + "Valor do juros em "+quantParcelas+" de R$ "+valorFina/quantParcelas+"reais.\n"  + juros + " Ao m�s! "+"\n" + "Valor total: R$ " + juros+valorFina+" reais.");
					} else if (operaFinancia  == 2) {
						juros = (taxaAutomo * valorFina);
						JOptionPane.showMessageDialog(null, "Valor do finasciamento do carro: R$ " + valorFina
								+ " reais.\n" + "Valor do juros em "+quantParcelas+" de R$ "+valorFina/quantParcelas+" reais.\n"  + juros + " Ao m�s! "+"\n" + "Valor total: R$ " + juros+valorFina+" reais.");
					} else {
						JOptionPane.showMessageDialog(null, "Error no finasciamento!!!");
					}
					System.out.println("Op: " + operaFinancia);

					System.out.println(saldo);

					contRedimenPoupa++;
					

				} else if (opcao == 8) {
					JOptionPane.showMessageDialog(null, "Verificar saldo");

				} else if (opcao == 9) {
					JOptionPane.showMessageDialog(null, "Hist�rico de transa��es");

				} else if (opcao == 10) {
					menu = 10;
					JOptionPane.showMessageDialog(null, "Sair");
					return;

				} else {
					JOptionPane.showMessageDialog(null, "Opera��o inv�lida, tente novamente!");
				}
				System.out.println("Aqui " + -saldo);
				contRedimenAplic++;
				contRedimenPoupa++;
				if (contRedimenAplic > 2 && contRedimenAplic % 3 == 0) {
					saldo = ((rendimentoAplicacaoFundo * saldo) + ((redimentoPoupaca * saldo) + saldo));
					System.out.println(saldo);
				}
				/* Apagar depois */
				System.out.println("Aqui " + -saldo);
				System.out.println(contRedimenAplic);
				System.out.println(contRedimenPoupa);
				System.out.println(saldo);

			}
		} while (menu != 11);
	}

}