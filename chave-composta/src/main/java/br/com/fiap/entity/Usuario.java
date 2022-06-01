package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "tb_usuario")
public class Usuario {

	@Id
	@SequenceGenerator(name = "usuario", sequenceName = "sq_tb_usuario", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "usuario")
	@Column(name = "cd_usuario")
	private Integer id;
	
	@Column(name = "nm_usuario", length = 50, nullable = false)
	private String nome;
	
	@Column(name = "ds_senha", nullable = false)
	private String senha;
	
	@Column(name = "ds_usuario", length = 12, nullable = false)
	private String usuario;

	public Usuario() {
		super();
	}

	public Usuario(String nome, String senha, String usuario) {
		super();
		this.nome = nome;
		this.senha = senha;
		this.usuario = usuario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public Integer getId() {
		return id;
	}
}
