package br.com.JpaEficaz.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Pessoa {
	@Id
	private int id;
	private String nome;
	private String nomeArtistico;
	// getters e setters
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	/**
	 * @return the nomeArtistico
	 */
	public String getNomeArtistico() {
		return nomeArtistico;
	}
	/**
	 * @param nomeArtistico the nomeArtistico to set
	 */
	public void setNomeArtistico(String nomeArtistico) {
		this.nomeArtistico = nomeArtistico;
	}
	
	
}
