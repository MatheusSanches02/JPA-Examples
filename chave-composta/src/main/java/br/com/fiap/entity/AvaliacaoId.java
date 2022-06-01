package br.com.fiap.entity;

import java.io.Serializable;

@SuppressWarnings("all")
public class AvaliacaoId implements Serializable{

	private Integer usuario;
	
	private Integer estabelecimento;

	public AvaliacaoId() {
		super();
	}

	public AvaliacaoId(Integer usuario, Integer estabelecimento) {
		super();
		this.usuario = usuario;
		this.estabelecimento = estabelecimento;
	}

	public Integer getUsuario() {
		return usuario;
	}

	public void setUsuario(Integer usuario) {
		this.usuario = usuario;
	}

	public Integer getEstabelecimento() {
		return estabelecimento;
	}

	public void setEstabelecimento(Integer estabelecimento) {
		this.estabelecimento = estabelecimento;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((estabelecimento == null) ? 0 : estabelecimento.hashCode());
		result = prime * result + ((usuario == null) ? 0 : usuario.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AvaliacaoId other = (AvaliacaoId) obj;
		if (estabelecimento == null) {
			if (other.estabelecimento != null)
				return false;
		} else if (!estabelecimento.equals(other.estabelecimento))
			return false;
		if (usuario == null) {
			if (other.usuario != null)
				return false;
		} else if (!usuario.equals(other.usuario))
			return false;
		return true;
	}
}
