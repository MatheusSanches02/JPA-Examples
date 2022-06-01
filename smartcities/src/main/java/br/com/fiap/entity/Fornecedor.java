package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "tb_fornecedor")
public class Fornecedor {

	@Id
	@Column(name = "cd_forncedor")
	@SequenceGenerator(name = "fornecedor", sequenceName = "sq_tb_fornecedor", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "fornecedor")
	private Integer codigo;
	
	@Column(name = "nm_fornecedor", nullable = false, length = 50)
	private String nome;
	
	@Column(name = "dt_cadastro")
	@CreationTimestamp
	private Calendar dataCadastro;
	
	@Column(name = "dt_atualizacao")
	@UpdateTimestamp
	private Calendar dataAtualizacao;
	
	public Fornecedor() {}

	public Fornecedor(String nome, Calendar dataCadastro, Calendar dataAtualizacao) {
		super();
		this.nome = nome;
		this.dataCadastro = dataCadastro;
		this.dataAtualizacao = dataAtualizacao;
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

	public Calendar getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Calendar dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public Calendar getDataAtualizacao() {
		return dataAtualizacao;
	}

	public void setDataAtualizacao(Calendar dataAtualizacao) {
		this.dataAtualizacao = dataAtualizacao;
	}
	
	
}
