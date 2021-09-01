package src.financialcontrol;

import java.util.Date;

public class Movimentacao {
	private String tipoDeMovimentacao;
	private Date dataDaMovimentacao;
	private Double valorDaMovimentacao;
	private String observacaoDaMovimentacao;
	
	public Movimentacao(){
		
	}

	public Movimentacao(String tipoDeMovimentacao, Date dataDaMovimentacao, Double valorDaMovimentacao,
			String observacaoDaMovimentacao) {
		super();
		this.tipoDeMovimentacao = tipoDeMovimentacao;
		this.dataDaMovimentacao = dataDaMovimentacao;
		this.valorDaMovimentacao = valorDaMovimentacao;
		this.observacaoDaMovimentacao = observacaoDaMovimentacao;
	}

	public String getTipoDeMovimentacao() {
		return tipoDeMovimentacao;
	}

	public void setTipoDeMovimentacao(String tipoDeMovimentacao) {
		this.tipoDeMovimentacao = tipoDeMovimentacao;
	}

	public Date getDataDaMovimentacao() {
		return dataDaMovimentacao;
	}

	public void setDataDaMovimentacao(Date dataDaMovimentacao) {
		this.dataDaMovimentacao = dataDaMovimentacao;
	}

	public Double getValorDaMovimentacao() {
		return valorDaMovimentacao;
	}

	public void setValorDaMovimentacao(Double valorDaMovimentacao) {
		this.valorDaMovimentacao = valorDaMovimentacao;
	}

	public String getObservacaoDaMovimentacao() {
		return observacaoDaMovimentacao;
	}

	public void setObservacaoDaMovimentacao(String observacaoDaMovimentacao) {
		this.observacaoDaMovimentacao = observacaoDaMovimentacao;
	};
	
	
}
