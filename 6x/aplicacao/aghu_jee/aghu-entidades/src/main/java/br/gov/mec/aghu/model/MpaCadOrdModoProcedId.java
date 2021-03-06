package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * MpaCadOrdModoProcedId generated by hbm2java
 */
@Embeddable
public class MpaCadOrdModoProcedId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4000979896720001559L;
	private Integer copSeq;
	private Short seqp;

	public MpaCadOrdModoProcedId() {
	}

	public MpaCadOrdModoProcedId(Integer copSeq, Short seqp) {
		this.copSeq = copSeq;
		this.seqp = seqp;
	}

	@Column(name = "COP_SEQ", nullable = false)
	public Integer getCopSeq() {
		return this.copSeq;
	}

	public void setCopSeq(Integer copSeq) {
		this.copSeq = copSeq;
	}

	@Column(name = "SEQP", nullable = false)
	public Short getSeqp() {
		return this.seqp;
	}

	public void setSeqp(Short seqp) {
		this.seqp = seqp;
	}


	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		HashCodeBuilder umHashCodeBuilder = new HashCodeBuilder();
		umHashCodeBuilder.append(this.getSeqp());
		umHashCodeBuilder.append(this.getCopSeq());
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
		if (!(obj instanceof MpaCadOrdModoProcedId)) {
			return false;
		}
		MpaCadOrdModoProcedId other = (MpaCadOrdModoProcedId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getSeqp(), other.getSeqp());
		umEqualsBuilder.append(this.getCopSeq(), other.getCopSeq());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}
