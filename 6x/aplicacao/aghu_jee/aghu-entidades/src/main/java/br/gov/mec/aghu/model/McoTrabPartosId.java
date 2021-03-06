package br.gov.mec.aghu.model;

// Generated 26/02/2010 17:37:25 by Hibernate Tools 3.2.5.Beta

import javax.persistence.Column;
import javax.persistence.Embeddable;


import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * McoTrabPartosId generated by hbm2java
 */
@Embeddable
public class McoTrabPartosId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6400976785952153537L;
	private Integer gsoPacCodigo;
	private Short gsoSeqp;

	public McoTrabPartosId() {
	}

	public McoTrabPartosId(Integer gsoPacCodigo, Short gsoSeqp) {
		this.gsoPacCodigo = gsoPacCodigo;
		this.gsoSeqp = gsoSeqp;
	}

	@Column(name = "GSO_PAC_CODIGO", nullable = false, precision = 8, scale = 0)
	public Integer getGsoPacCodigo() {
		return this.gsoPacCodigo;
	}

	public void setGsoPacCodigo(Integer gsoPacCodigo) {
		this.gsoPacCodigo = gsoPacCodigo;
	}

	@Column(name = "GSO_SEQP", nullable = false, precision = 3, scale = 0)
	public Short getGsoSeqp() {
		return this.gsoSeqp;
	}

	public void setGsoSeqp(Short gsoSeqp) {
		this.gsoSeqp = gsoSeqp;
	}

	@Override
	public boolean equals(Object other) {
		if ((this == other)) {
			return true;
		}
		if ((other == null)) {
			return false;
		}
		if (!(other instanceof McoTrabPartosId)) {
			return false;
		}
		McoTrabPartosId castOther = (McoTrabPartosId) other;

		return ((getGsoPacCodigo() == castOther.getGsoPacCodigo())
				|| (getGsoPacCodigo() != null && getGsoPacCodigo().equals(castOther.getGsoPacCodigo())))
			&& ((getGsoSeqp() == castOther.getGsoSeqp())
				|| (getGsoSeqp() != null && getGsoSeqp().equals(castOther.getGsoSeqp())));
	}

	@Override
	public int hashCode() {
		int result = 17;

		result = 37 * result + (getGsoPacCodigo() == null ? 0 : getGsoPacCodigo().hashCode());
		result = 37 * result + (getGsoSeqp() == null ? 0 : getGsoSeqp().hashCode());
		
		return result;
	}

}
