package br.gov.mec.aghu.model;

// Generated 16/05/2011 15:16:13 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;
import javax.persistence.Version;


import br.gov.mec.aghu.dominio.DominioOrigemAtendimento;
import br.gov.mec.aghu.core.persistence.BaseEntitySeq;

/**
 * AelControleNumeroUnicos generated by hbm2java
 */

@Entity
@SequenceGenerator(name="aelCruSq1", sequenceName="AGH.AEL_CRU_SQ1", allocationSize = 1)
@Table(name = "AEL_CONTROLE_NUMERO_UNICOS", schema = "AGH", uniqueConstraints = @UniqueConstraint(columnNames = {
		"dt_numero_unico", "origem" }))
public class AelControleNumeroUnico extends BaseEntitySeq<Integer> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3221780284141448128L;
	private Integer seq;
	private Integer version;
	private Date dtNumeroUnico;
	private DominioOrigemAtendimento origem;
	private Integer ultNumeroUnico;

	public AelControleNumeroUnico() {
	}

	public AelControleNumeroUnico(Integer seq, Date dtNumeroUnico, DominioOrigemAtendimento origem) {
		this.seq = seq;
		this.dtNumeroUnico = dtNumeroUnico;
		this.origem = origem;
	}

	public AelControleNumeroUnico(Integer seq, Date dtNumeroUnico, DominioOrigemAtendimento origem,
			Integer ultNumeroUnico) {
		this.seq = seq;
		this.dtNumeroUnico = dtNumeroUnico;
		this.origem = origem;
		this.ultNumeroUnico = ultNumeroUnico;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "aelCruSq1")
	@Column(name = "SEQ", unique = true, nullable = false)
	public Integer getSeq() {
		return this.seq;
	}

	public void setSeq(Integer seq) {
		this.seq = seq;
	}

	@Version
	@Column(name = "VERSION", nullable = false)
	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_NUMERO_UNICO", nullable = false, length = 29)
	public Date getDtNumeroUnico() {
		return this.dtNumeroUnico;
	}

	public void setDtNumeroUnico(Date dtNumeroUnico) {
		this.dtNumeroUnico = dtNumeroUnico;
	}

	@Column(name = "ORIGEM", nullable = false, length = 1)
	@Enumerated(EnumType.STRING)
	public DominioOrigemAtendimento getOrigem() {
		return this.origem;
	}

	public void setOrigem(DominioOrigemAtendimento origem) {
		this.origem = origem;
	}

	@Column(name = "ULT_NUMERO_UNICO", precision = 17, scale = 17)
	public Integer getUltNumeroUnico() {
		return this.ultNumeroUnico;
	}

	public void setUltNumeroUnico(Integer ultNumeroUnico) {
		this.ultNumeroUnico = ultNumeroUnico;
	}
	
	public enum Fields {
		SEQ("seq"),
		DATA_NUMERO_UNICO("dtNumeroUnico"),
		ORIGEM("origem"),
		ULT_NUMERO_UNICO("ultNumeroUnico");

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
		result = prime * result + ((getSeq() == null) ? 0 : getSeq().hashCode());
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
		if (!(obj instanceof AelControleNumeroUnico)) {
			return false;
		}
		AelControleNumeroUnico other = (AelControleNumeroUnico) obj;
		if (getSeq() == null) {
			if (other.getSeq() != null) {
				return false;
			}
		} else if (!getSeq().equals(other.getSeq())) {
			return false;
		}
		return true;
	}
	// ##### GeradorEqualsHashCodeMain #####

}