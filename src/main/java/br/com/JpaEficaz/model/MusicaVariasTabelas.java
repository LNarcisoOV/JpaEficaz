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
