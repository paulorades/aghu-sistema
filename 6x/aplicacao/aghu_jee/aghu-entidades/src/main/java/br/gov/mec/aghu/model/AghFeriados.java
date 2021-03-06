package br.gov.mec.aghu.model;

// Generated 11/11/2010 11:41:08 by Hibernate Tools 3.2.5.Beta

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

import br.gov.mec.aghu.dominio.DominioTurno;
import br.gov.mec.aghu.core.persistence.BaseEntity;

/**
 * AghFeriados generated by hbm2java
 */
@Entity
@Table(name = "AGH_FERIADOS", schema = "AGH")
public class AghFeriados implements BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 817935998442383080L;
	/**
	 * 
	 */
	
	private Date data;
	private DominioTurno turno;
	private Integer version;
	
	

	public AghFeriados() {
	}

	public AghFeriados(Date data) {
		this.data = data;
	}

	public AghFeriados(Date data, DominioTurno turno) {
		this.data = data;
		this.turno = turno;
	}

	@Id
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DATA", unique = true, nullable = false, length = 7)
	public Date getData() {
		return this.data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	@Column(name = "TURNO", length = 1)
	@Enumerated(EnumType.STRING)
	public DominioTurno getTurno() {
		return this.turno;
	}

	public void setTurno(DominioTurno turno) {
		this.turno = turno;
	}
	
	
	@Version
	@Column(name = "VERSION", nullable = false)
	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}
	
	
	public enum Fields {
		DATA("data"), TURNO("turno");

		private String fields;

		private Fields(String fields) {
			this.fields = fields;
		}

		@Override
		public String toString() {
			return this.fields;
		}
	}

	

	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getData() == null) ? 0 : getData().hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof AghFeriados)) {
			return false;
		}
		AghFeriados other = (AghFeriados) obj;
		if (getData() == null) {
			if (other.getData() != null) {
				return false;
			}
		} else if (!getData().equals(other.getData())) {
			return false;
		}
		return true;
	}
	// ##### GeradorEqualsHashCodeMain #####

}
