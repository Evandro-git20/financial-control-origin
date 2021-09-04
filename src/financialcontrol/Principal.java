package financialcontrol;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Principal {
//	Menu de ações
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		

		List<Movimentacao> movimento = new ArrayList<>();
		Movimentacao movimentacao = new Movimentacao();
		Date data = new Date();
		
		int opcao=2147483647;
		do {
			exibirMenu();
			opcao = in.nextInt();
	
			if(opcao == 1) {
			    adicionarMovimento(in, movimento, movimentacao, data);
	
				
				imprimirMovimento(movimentacao);
					
			}
			
		}while(opcao>1);
	}

	private static void exibirMenu() {
		System.out.println("\n[1] Adicionar Movimentação Financeira");
		System.out.println("[2] Alterar Movimentação Financeira");
		System.out.println("[3] Remover Movimentação Financeira");
		System.out.println("[4] Listar Movimentação Financeira");
		System.out.println("[0] Sair");
	}

	private static void imprimirMovimento(Movimentacao movimentacao) {
		System.out.print("\nTipo: "+movimentacao.getTipoDeMovimentacao()+
				"    Observação: "+movimentacao.getObservacaoDaMovimentacao()+
				"    Valor: "+movimentacao.getValorDaMovimentacao()+
				"    Data: "+movimentacao.getDataDaMovimentacao());
	}

	private static void adicionarMovimento(Scanner in, List<Movimentacao> movimento, Movimentacao movimentacao,
			Date data) {
		System.out.print("Valor da movimentação: ");
		movimentacao.setValorDaMovimentacao(in.nextDouble());
		System.out.print("Observação: ");
		movimentacao.setObservacaoDaMovimentacao(in.next());
		movimentacao.setTipoDeMovimentacao("Entrada");
		movimentacao.setDataDaMovimentacao(data);
		movimento.add(movimentacao);
	}
}
