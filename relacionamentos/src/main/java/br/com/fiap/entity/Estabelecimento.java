package br.com.fiap.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "tb_estabelecimento")
public class Estabelecimento {
	
	@Id
	@SequenceGenerator(name = "estabelecimento", sequenceName = "sq_tb_estabelecimento", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "estabelecimento")
	@Column(name = "cd_estabeleicmento")
	private Integer codigo;
	
	@Column(name = "nm_estabelecimento", length = 50)
	private String nome;
	
	@OneToOne(mappedBy = "estabelecimento",cascade = CascadeType.PERSIST)
	private ContratoAluguel contrato;
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "cd_tipo_estabelecimento")
	private TipoEstabelecimento tipo;
	
	@ManyToMany(cascade = CascadeType.PERSIST)
	@JoinTable(name = "estabelecimentos_clientes",
			   joinColumns = @JoinColumn(name = "cd_estabelecimento"),
			   inverseJoinColumns = @JoinColumn(name = "cd_cliente"))
	private List<Cliente> clientes = new ArrayList<Cliente>();

	public Estabelecimento() {
		super();
	}

	public Estabelecimento(String nome, ContratoAluguel contrato, TipoEstabelecimento tipo, List<Cliente> clientes) {
		super();
		this.nome = nome;
		this.contrato = contrato;
		this.tipo = tipo;
		this.clientes = clientes;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public ContratoAluguel getContrato() {
		return contrato;
	}

	public void setContrato(ContratoAluguel contrato) {
		this.contrato = contrato;
	}

	public TipoEstabelecimento getTipo() {
		return tipo;
	}

	public void setTipo(TipoEstabelecimento tipo) {
		this.tipo = tipo;
	}

	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}
}
