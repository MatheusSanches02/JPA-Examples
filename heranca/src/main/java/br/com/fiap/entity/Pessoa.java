package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "tb_pessoa")
//@Inheritance(strategy = InheritanceType.JOINED) - cria tres tabelas passando o id por herança (relacionamento 1 - 1)
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS) // cria tres tabelas que nao se realicionam, recebendo nome e id por herença
@Inheritance(strategy = InheritanceType.SINGLE_TABLE) // salva todos os dados em uma única tabela e adiciona +1 coluna com o tipo
@DiscriminatorColumn(name = "nome_tipo")
public class Pessoa {

	@Id 
	@SequenceGenerator(name = "pessoa", sequenceName = "sq_tb_pessoa", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pessoa")
	@Column(name = "cd_pessoa")
	private Integer id;
	
	@Column(name = "nm_pessoa", length = 50, nullable = false)
	private String nome;
	
	public Pessoa() {}

	public Pessoa(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getId() {
		return id;
	}
}
