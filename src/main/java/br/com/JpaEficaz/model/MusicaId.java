package br.com.JpaEficaz.model;

import java.io.Serializable;

import javax.persistence.Embeddable;


@Embeddable
public class MusicaId implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int duracaoSegundos;
	private String nome;

	public MusicaId() {
	}

	public MusicaId(int duracaoSegundos, String nome) {
		super();
		this.duracaoSegundos = duracaoSegundos;
		this.nome = nome;
	}

	/**
	 * @return the duracaoSegundos
	 */
	public int getDuracaoSegundos() {
		return duracaoSegundos;
	}

	/**
	 * @param duracaoSegundos
	 *            the duracaoSegundos to set
	 */
	public void setDuracaoSegundos(int duracaoSegundos) {
		this.duracaoSegundos = duracaoSegundos;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome
	 *            the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + duracaoSegundos;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MusicaId other = (MusicaId) obj;
		if (duracaoSegundos != other.duracaoSegundos)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

}