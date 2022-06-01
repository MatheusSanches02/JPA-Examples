package br.com.fiap.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "tb_cliente")
public class Cliente {
	
	@Id
	@SequenceGenerator(name = "cliente", sequenceName = "sq_tb_cliente", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cliente")
	@Column(name = "cd_cliente")
	private Integer codigo;
	
	@Column(name = "nm_cliente", nullable = false, length = 50)
	private String nome;
	
	@ManyToMany(mappedBy = "clientes")
	private List<Estabelecimento> estabelecimentos = new ArrayList<Estabelecimento>();

	public Cliente() {
		super();
	}

	public Cliente(String nome, List<Estabelecimento> estabelecimentos) {
		super();
		this.nome = nome;
		this.estabelecimentos = estabelecimentos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Estabelecimento> getEstabelecimentos() {
		return estabelecimentos;
	}

	public void setEstabelecimentos(List<Estabelecimento> estabelecimentos) {
		this.estabelecimentos = estabelecimentos;
	}

	public Integer getCodigo() {
		return codigo;
	}
}
