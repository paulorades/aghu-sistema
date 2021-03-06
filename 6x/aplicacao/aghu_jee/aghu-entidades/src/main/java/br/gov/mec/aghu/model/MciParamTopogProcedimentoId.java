package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * MciParamTopogProcedimentoId generated by hbm2java
 */
@Embeddable
public class MciParamTopogProcedimentoId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1888229742350165773L;
	private Integer pruSeq;
	private Short topSeq;

	public MciParamTopogProcedimentoId() {
	}

	public MciParamTopogProcedimentoId(Integer pruSeq, Short topSeq) {
		this.pruSeq = pruSeq;
		this.topSeq = topSeq;
	}

	@Column(name = "PRU_SEQ", nullable = false)
	public Integer getPruSeq() {
		return this.pruSeq;
	}

	public void setPruSeq(Integer pruSeq) {
		this.pruSeq = pruSeq;
	}

	@Column(name = "TOP_SEQ", nullable = false)
	public Short getTopSeq() {
		return this.topSeq;
	}

	public void setTopSeq(Short topSeq) {
		this.topSeq = topSeq;
	}


	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		HashCodeBuilder umHashCodeBuilder = new HashCodeBuilder();
		umHashCodeBuilder.append(this.getPruSeq());
		umHashCodeBuilder.append(this.getTopSeq());
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
		if (!(obj instanceof MciParamTopogProcedimentoId)) {
			return false;
		}
		MciParamTopogProcedimentoId other = (MciParamTopogProcedimentoId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getPruSeq(), other.getPruSeq());
		umEqualsBuilder.append(this.getTopSeq(), other.getTopSeq());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}
