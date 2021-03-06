package br.gov.mec.aghu.model;

// Generated 18/03/2011 10:47:15 by Hibernate Tools 3.2.5.Beta

import javax.persistence.Column;
import javax.persistence.Embeddable;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * AelGrupoExamePriorizasId generated by hbm2java
 */
@Embeddable
public class AelGrupoExamePriorizaId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3154334365248977416L;
	private Integer grxGrmSeq;
	private String grxEmaExaSigla;
	private Integer grxEmaManSeq;
	private String emaExaSigla;
	private Integer emaManSeq;

	public AelGrupoExamePriorizaId() {
	}

	public AelGrupoExamePriorizaId(Integer grxGrmSeq, String grxEmaExaSigla,
			Integer grxEmaManSeq, String emaExaSigla, Integer emaManSeq) {
		this.grxGrmSeq = grxGrmSeq;
		this.grxEmaExaSigla = grxEmaExaSigla;
		this.grxEmaManSeq = grxEmaManSeq;
		this.emaExaSigla = emaExaSigla;
		this.emaManSeq = emaManSeq;
	}

	@Column(name = "GRX_GRM_SEQ", nullable = false)
	public Integer getGrxGrmSeq() {
		return this.grxGrmSeq;
	}

	public void setGrxGrmSeq(Integer grxGrmSeq) {
		this.grxGrmSeq = grxGrmSeq;
	}

	@Column(name = "GRX_EMA_EXA_SIGLA", nullable = false, length = 5)
	@Length(max = 5)
	public String getGrxEmaExaSigla() {
		return this.grxEmaExaSigla;
	}

	public void setGrxEmaExaSigla(String grxEmaExaSigla) {
		this.grxEmaExaSigla = grxEmaExaSigla;
	}

	@Column(name = "GRX_EMA_MAN_SEQ", nullable = false)
	public Integer getGrxEmaManSeq() {
		return this.grxEmaManSeq;
	}

	public void setGrxEmaManSeq(Integer grxEmaManSeq) {
		this.grxEmaManSeq = grxEmaManSeq;
	}

	@Column(name = "EMA_EXA_SIGLA", nullable = false, length = 5)
	@Length(max = 5)
	public String getEmaExaSigla() {
		return this.emaExaSigla;
	}

	public void setEmaExaSigla(String emaExaSigla) {
		this.emaExaSigla = emaExaSigla;
	}

	@Column(name = "EMA_MAN_SEQ", nullable = false)
	public Integer getEmaManSeq() {
		return this.emaManSeq;
	}

	public void setEmaManSeq(Integer emaManSeq) {
		this.emaManSeq = emaManSeq;
	}

	@Override
	public boolean equals(Object other) {
		if ((this == other)) {
			return true;
		}
		if ((other == null)) {
			return false;
		}
		if (!(other instanceof AelGrupoExamePriorizaId)) {
			return false;
		}
		AelGrupoExamePriorizaId castOther = (AelGrupoExamePriorizaId) other;

		return (this.getGrxGrmSeq() == castOther.getGrxGrmSeq())
				&& ((this.getGrxEmaExaSigla() == castOther.getGrxEmaExaSigla()) || (this
						.getGrxEmaExaSigla() != null
						&& castOther.getGrxEmaExaSigla() != null && this
						.getGrxEmaExaSigla().equals(
								castOther.getGrxEmaExaSigla())))
				&& (this.getGrxEmaManSeq() == castOther.getGrxEmaManSeq())
				&& ((this.getEmaExaSigla() == castOther.getEmaExaSigla()) || (this
						.getEmaExaSigla() != null
						&& castOther.getEmaExaSigla() != null && this
						.getEmaExaSigla().equals(castOther.getEmaExaSigla())))
				&& (this.getEmaManSeq() == castOther.getEmaManSeq());
	}

	@Override
	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getGrxGrmSeq();
		result = 37
				* result
				+ (getGrxEmaExaSigla() == null ? 0 : this.getGrxEmaExaSigla()
						.hashCode());
		result = 37 * result + this.getGrxEmaManSeq();
		result = 37
				* result
				+ (getEmaExaSigla() == null ? 0 : this.getEmaExaSigla()
						.hashCode());
		result = 37 * result + this.getEmaManSeq();
		return result;
	}

}
