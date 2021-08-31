package financialcontrol;

import financialcontrol.Movimentacao;
import financialcontrol.Dataformatada;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class Principal {
//	Menu de ações
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); 
		int opcao=2147483647;
		String opcao1;
		
		List <Movimentacao> movimento = new ArrayList<>();
		Movimentacao movimentacao = new Movimentacao();
		Date data = new Date();
		
		System.out.println("\n[1] Adicionar Movimentação Financeira");
		System.out.println("[2] Alterar Movimentação Financeira");
		System.out.println("[3] Remover Movimentação Financeira");
		System.out.println("[4] Listar Movimentação Financeira");
		System.out.println("[0] Sair");
		opcao = in.nextInt();
		
		if(opcao == 1) 
		    System.out.print("Valor da movimentação: ");
		    movimentacao.setValorDaMovimentacao(in.nextDouble());
		    System.out.print("Observação: ");
		    movimentacao.setObservacaoDaMovimentacao(in.next());
		    movimentacao.setTipoDeMovimentacao("Entrada");
		    movimentacao.setDataDaMovimentacao(data);
		    movimento.add(movimentacao);
		    
			for(int i=0; i<movimento.size(); i++ ){
				System.out.printf("\nTipo: "+movimento.get(i).getTipoDeMovimentacao()+
						"    Observação: "+movimento.get(i).getObservacaoDaMovimentacao()+
						"    Valor: "+movimento.get(i).getValorDaMovimentacao()+
						"    Data: "+movimento.get(i).getDataDaMovimentacao());
		}
	}
}
