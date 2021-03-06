package br.com.JpaEficaz.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
@IdClass(MusicaId.class)
public class Musica {
	
	@Id
	@OneToOne
	@JoinColumn(name = "codigo_id")
	private CodigoUnico codigoUnico;
	
	@Id
	@OneToOne
	@JoinColumn(name = "pessoa_id")
	private Pessoa autor;

	@Basic(optional = false)
	@Column(name = "NM_MUSICA", length = 100, unique = true, nullable = false, columnDefinition = "VARCHAR(45)", insertable = true, updatable = true, precision = 2, scale = 2)
	private String nome;

	@ManyToOne
	private Album album;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
