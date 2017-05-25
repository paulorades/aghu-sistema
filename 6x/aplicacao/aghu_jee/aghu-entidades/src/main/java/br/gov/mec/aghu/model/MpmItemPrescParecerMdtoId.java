package br.gov.mec.aghu.model;

// Generated 14/09/2010 17:49:55 by Hibernate Tools 3.2.5.Beta

import javax.persistence.Column;
import javax.persistence.Embeddable;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * MpmItemPrescParecerMdtosId generated by hbm2java
 */
@Embeddable
public class MpmItemPrescParecerMdtoId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8267861596215290107L;
	private Integer imePmdAtdSeq;
	private Long imePmdSeq;
	private Integer imeMedMatCodigo;
	private Short imeSeqp;

	public MpmItemPrescParecerMdtoId() {
	}

	public MpmItemPrescParecerMdtoId(Integer imePmdAtdSeq, Long imePmdSeq,
			Integer imeMedMatCodigo, Short imeSeqp) {
		this.imePmdAtdSeq = imePmdAtdSeq;
		this.imePmdSeq = imePmdSeq;
		this.imeMedMatCodigo = imeMedMatCodigo;
		this.imeSeqp = imeSeqp;
	}

	@Column(name = "IME_PMD_ATD_SEQ", nullable = false, precision = 7, scale = 0)
	public Integer getImePmdAtdSeq() {
		return this.imePmdAtdSeq;
	}

	public void setImePmdAtdSeq(Integer imePmdAtdSeq) {
		this.imePmdAtdSeq = imePmdAtdSeq;
	}

	@Column(name = "IME_PMD_SEQ", nullable = false, precision = 8, scale = 0)
	public Long getImePmdSeq() {
		return this.imePmdSeq;
	}

	public void setImePmdSeq(Long imePmdSeq) {
		this.imePmdSeq = imePmdSeq;
	}

	@Column(name = "IME_MED_MAT_CODIGO", nullable = false, precision = 6, scale = 0)
	public Integer getImeMedMatCodigo() {
		return this.imeMedMatCodigo;
	}

	public void setImeMedMatCodigo(Integer imeMedMatCodigo) {
		this.imeMedMatCodigo = imeMedMatCodigo;
	}

	@Column(name = "IME_SEQP", nullable = false, precision = 4, scale = 0)
	public Short getImeSeqp() {
		return this.imeSeqp;
	}

	public void setImeSeqp(Short imeSeqp) {
		this.imeSeqp = imeSeqp;
	}

	@Override
	public boolean equals(Object other) {
		if ((this == other)) {
			return true;
		}
		if ((other == null)) {
			return false;
		}
		if (!(other instanceof MpmItemPrescParecerMdtoId)) {
			return false;
		}
		MpmItemPrescParecerMdtoId castOther = (MpmItemPrescParecerMdtoId) other;

		return (this.getImePmdAtdSeq().equals(castOther.getImePmdAtdSeq()))
				&& (this.getImePmdSeq().equals(castOther.getImePmdSeq()))
				&& (this.getImeMedMatCodigo().equals(castOther.getImeMedMatCodigo()))
				&& (this.getImeSeqp().equals(castOther.getImeSeqp()));
	}

	@Override
	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getImePmdAtdSeq();
		result = 37 * result + this.getImePmdSeq().intValue();
		result = 37 * result + this.getImeMedMatCodigo();
		result = 37 * result + this.getImeSeqp();
		return result;
	}

}