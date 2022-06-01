package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "tb_contrato_aluguel")
public class ContratoAluguel {
	
	@Id
	@SequenceGenerator(name = "contrato", sequenceName = "sq_tb_contrato_aluguel", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "contrato")
	@Column(name = "cd_contrato_aluguel")
	private Integer codigo;
	
	@Column(name = "vl_aluguel")
	private Double valor;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "dt_vencimento_aluguel")
	private Calendar dataVencimento;
	
	@OneToOne
	@JoinColumn(name = "cd_estabelecimento")
	private Estabelecimento estabelecimento;

	public ContratoAluguel() {
		super();
	}

	public ContratoAluguel(Double valor, Calendar dataVencimento, Estabelecimento estabelecimento) {
		super();
		this.valor = valor;
		this.dataVencimento = dataVencimento;
		this.estabelecimento = estabelecimento;
	}
	
	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Calendar getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(Calendar dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public Estabelecimento getEstabelecimento() {
		return estabelecimento;
	}

	public void setEstabelecimento(Estabelecimento estabelecimento) {
		this.estabelecimento = estabelecimento;
	}
}
