package br.com.fiap.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "tb_tipo_estabelecimento")
public class TipoEstabelecimento {
	
	@Id
	@SequenceGenerator(name = "tipo", sequenceName = "sq_tb_tipo_estabelecimento", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tipo")
	@Column(name = "cd_tipo_estabelecimento")
	private Integer codigo;
	
	@Column(name = "nm_tipo_estabelecimento", nullable = false, length = 50)
	private String nome;
	
	@OneToMany(mappedBy = "tipo")
	private List<Estabelecimento> estabelecimentos = new ArrayList<Estabelecimento>();

	public TipoEstabelecimento() {
		super();
	}

	public TipoEstabelecimento(String nome, List<Estabelecimento> estabelecimentos) {
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
