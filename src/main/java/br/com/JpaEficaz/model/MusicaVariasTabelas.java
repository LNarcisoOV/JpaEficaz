package br.com.JpaEficaz.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SecondaryTable;
import javax.persistence.SecondaryTables;
import javax.persistence.Table;

@Entity
@Table(name = "TB_MUSICA")
@SecondaryTables({ 
		@SecondaryTable(name = "MUSICA_2372", pkJoinColumns = { 
				@PrimaryKeyJoinColumn(name = "MUSICA_ID") 
		}),
		@SecondaryTable(name = "INTERNATIONAL_MUSIC", pkJoinColumns = { 
				@PrimaryKeyJoinColumn(name = "MUSICA_ID") }) 
		})
public class MusicaVariasTabelas {
	@Id
	@OneToOne
	@JoinColumn(name = "codigo_id")
	private CodigoUnico codigoUnico;

	@Id
	@OneToOne
	@JoinColumn(name = "pessoa_id")
	private Pessoa autor;

	@Basic(optional = false)
	@Column(table = "TB_MUSICA", 
			name = "NM_MUSICA", 
			length = 100, 
			unique = true, 
			nullable = false, 
			columnDefinition = "VARCHAR(45)", 
			insertable = true, 
			updatable = true, 
			precision = 2, 
			scale = 2)
	private String nome;
	
	@Column(table = "MUSICA_2372", 
			name = "NM_MUSICA", 
			length = 100, 
			unique = true, 
			nullable = false, 
			columnDefinition = "VARCHAR(45)", 
			insertable = true, 
			updatable = true, 
			precision = 2, 
			scale = 2)
	private String nome2;


	@ManyToOne
	private Album album;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the codigoUnico
	 */
	public CodigoUnico getCodigoUnico() {
		return codigoUnico;
	}

	/**
	 * @param codigoUnico the codigoUnico to set
	 */
	public void setCodigoUnico(CodigoUnico codigoUnico) {
		this.codigoUnico = codigoUnico;
	}

	/**
	 * @return the autor
	 */
	public Pessoa getAutor() {
		return autor;
	}

	/**
	 * @param autor the autor to set
	 */
	public void setAutor(Pessoa autor) {
		this.autor = autor;
	}

	/**
	 * @return the nome2
	 */
	public String getNome2() {
		return nome2;
	}

	/**
	 * @param nome2 the nome2 to set
	 */
	public void setNome2(String nome2) {
		this.nome2 = nome2;
	}

	/**
	 * @return the album
	 */
	public Album getAlbum() {
		return album;
	}

	/**
	 * @param album the album to set
	 */
	public void setAlbum(Album album) {
		this.album = album;
	}
	
	
}
