package br.com.JpaEficaz.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class CodigoUnico {
	
	@Id
	private int id;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateRegistro;
	
	private String condigoUnicoHash;
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
	 * @return the dateRegistro
	 */
	public Date getDateRegistro() {
		return dateRegistro;
	}
	/**
	 * @param dateRegistro the dateRegistro to set
	 */
	public void setDateRegistro(Date dateRegistro) {
		this.dateRegistro = dateRegistro;
	}
	/**
	 * @return the condigoUnicoHash
	 */
	public String getCondigoUnicoHash() {
		return condigoUnicoHash;
	}
	/**
	 * @param condigoUnicoHash the condigoUnicoHash to set
	 */
	public void setCondigoUnicoHash(String condigoUnicoHash) {
		this.condigoUnicoHash = condigoUnicoHash;
	}
}
