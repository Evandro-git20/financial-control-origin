package financialcontrol;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Principal {
//	Menu de ações
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		

		List <Movimentacao> movimento = new ArrayList<>();
		Movimentacao movimentacao = new Movimentacao();
		Date data = new Date();
		
		int opcao=2147483647;
		do {
			System.out.println("\n[1] Adicionar Movimentação Financeira");
			System.out.println("[2] Alterar Movimentação Financeira");
			System.out.println("[3] Remover Movimentação Financeira");
			System.out.println("[4] Listar Movimentação Financeira");
			System.out.println("[0] Sair");
			opcao = in.nextInt();
	
			if(opcao == 1) {
			    System.out.print("Valor da movimentação: ");
			    movimentacao.setValorDaMovimentacao(in.nextDouble());
			    System.out.print("Observação: ");
			    movimentacao.setObservacaoDaMovimentacao(in.next());
			    movimentacao.setTipoDeMovimentacao("Entrada");
			    movimentacao.setDataDaMovimentacao(data);
			    movimento.add(movimentacao);
	
				
				System.out.print("\nTipo: "+movimentacao.getTipoDeMovimentacao()+
						"    Observação: "+movimentacao.getObservacaoDaMovimentacao()+
						"    Valor: "+movimentacao.getValorDaMovimentacao()+
						"    Data: "+movimentacao.getDataDaMovimentacao());
					
			
				System.out.print("\n\nNova movimentação: ");
			    movimentacao.setValorDaMovimentacao(in.nextDouble());
			    System.out.print("Observação: ");
			    movimentacao.setObservacaoDaMovimentacao(in.next());
			    movimentacao.setTipoDeMovimentacao("Entrada");
			    movimentacao.setDataDaMovimentacao(data);
			    movimento.add(movimentacao);
	
				
				System.out.print("\nTipo: "+movimentacao.getTipoDeMovimentacao()+
						"    Observação: "+movimentacao.getObservacaoDaMovimentacao()+
						"    Valor: "+movimentacao.getValorDaMovimentacao()+
						"    Data: "+movimentacao.getDataDaMovimentacao());
			}
			
		}while(opcao>1);
	}
}
