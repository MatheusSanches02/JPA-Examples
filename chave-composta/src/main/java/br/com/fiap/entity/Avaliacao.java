package br.com.fiap.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@SuppressWarnings("all")
@Entity
@Table(name = "tb_avaliacao")
@IdClass(AvaliacaoId.class)
public class Avaliacao implements Serializable{
	
	@Id
	@JoinColumn(name = "cd_usuario")
	@ManyToOne(optional = false)
	private Usuario usuario;
	
	@Id
	@JoinColumn(name = "cd_estabelecimento")
	@ManyToOne(optional = false)
	private Estabelecimento estabelecimento;
	
	@Column(name = "vl_nota")
	private Integer nota;

	public Avaliacao() {
		super();
	}

	public Avaliacao(Integer nota) {
		super();
		this.nota = nota;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Estabelecimento getEstabelecimento() {
		return estabelecimento;
	}

	public void setEstabelecimento(Estabelecimento estabelecimento) {
		this.estabelecimento = estabelecimento;
	}

	public Integer getNota() {
		return nota;
	}

	public void setNota(Integer nota) {
		this.nota = nota;
	}

}
