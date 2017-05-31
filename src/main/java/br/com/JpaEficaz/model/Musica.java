package br.com.JpaEficaz.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "TB_MUSICA",
		catalog = "DB_MUSICA",
		schema = "MUSIC",
		uniqueConstraints={
			@UniqueConstraint(
					columnNames={"codigo", "nome"}
			),
			@UniqueConstraint(
					columnNames={"outroCampo", "outroNome"}
			)
		}
	)
public class Musica {
	
	public static final String SEQUENCE_NAME = "SEQUENCIA_MUSICA";
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,
					generator = SEQUENCE_NAME)
	private int id;
	
	@Basic(optional = false)
	@Column(name = "NM_MUSICA", 
			length = 100, 
			unique = true,
			nullable = false,
			columnDefinition = "VARCHAR(45)",
			insertable = true,
			updatable = true,
			precision = 2,
			scale = 2)
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
