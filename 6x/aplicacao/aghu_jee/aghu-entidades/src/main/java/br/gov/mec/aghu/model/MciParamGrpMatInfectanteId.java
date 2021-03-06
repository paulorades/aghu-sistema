package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * MciParamGrpMatInfectanteId generated by hbm2java
 */
@Embeddable
public class MciParamGrpMatInfectanteId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6301405467237694943L;
	private Integer pruSeq;
	private Short gmiSeq;

	public MciParamGrpMatInfectanteId() {
	}

	public MciParamGrpMatInfectanteId(Integer pruSeq, Short gmiSeq) {
		this.pruSeq = pruSeq;
		this.gmiSeq = gmiSeq;
	}

	@Column(name = "PRU_SEQ", nullable = false)
	public Integer getPruSeq() {
		return this.pruSeq;
	}

	public void setPruSeq(Integer pruSeq) {
		this.pruSeq = pruSeq;
	}

	@Column(name = "GMI_SEQ", nullable = false)
	public Short getGmiSeq() {
		return this.gmiSeq;
	}

	public void setGmiSeq(Short gmiSeq) {
		this.gmiSeq = gmiSeq;
	}


	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		HashCodeBuilder umHashCodeBuilder = new HashCodeBuilder();
		umHashCodeBuilder.append(this.getPruSeq());
		umHashCodeBuilder.append(this.getGmiSeq());
		return umHashCodeBuilder.toHashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof MciParamGrpMatInfectanteId)) {
			return false;
		}
		MciParamGrpMatInfectanteId other = (MciParamGrpMatInfectanteId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getPruSeq(), other.getPruSeq());
		umEqualsBuilder.append(this.getGmiSeq(), other.getGmiSeq());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}
