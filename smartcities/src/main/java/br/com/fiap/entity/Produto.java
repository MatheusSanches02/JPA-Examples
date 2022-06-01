package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Formula;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "tb_produto")
public class Produto {

	@Id
	@SequenceGenerator(name = "produto", sequenceName = "sq_tb_produto", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "produto")
	@Column(name = "cd_produto")
	private Integer codigo;
	
	@Column(name = "nm_produto", nullable = false, length = 50)
	private String nome;
	
	@Column(name = "vl_preco")
	private Double preco;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "dt_validade")
	private Calendar dataValidade;
	
	@Enumerated(EnumType.STRING)
	private Estado estado;
	
	@Column(name = "dt_cadastro")
	@CreationTimestamp
	private Calendar dataCadastro;
	
	@Column(name = "dt_moficacao")
	@UpdateTimestamp
	private Calendar dataModificacao;
	
	@Formula("vl_preco * 0.9")
	private Double precoDesconto;
	
	public Produto () {}

	public Produto(String nome, Double preco, Calendar dataValidade, Estado estado,
			Calendar dataCadastro, Calendar dataModificacao, Double precoDesconto) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.dataValidade = dataValidade;
		this.estado = estado;
		this.dataCadastro = dataCadastro;
		this.dataModificacao = dataModificacao;
		this.precoDesconto = precoDesconto;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Calendar getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(Calendar dataValidade) {
		this.dataValidade = dataValidade;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public Calendar getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Calendar dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public Calendar getDataModificacao() {
		return dataModificacao;
	}

	public void setDataModificacao(Calendar dataModificacao) {
		this.dataModificacao = dataModificacao;
	}

	public Double getPrecoDesconto() {
		return precoDesconto;
	}

	public void setPrecoDesconto(Double precoDesconto) {
		this.precoDesconto = precoDesconto;
	}
	
	
	
}