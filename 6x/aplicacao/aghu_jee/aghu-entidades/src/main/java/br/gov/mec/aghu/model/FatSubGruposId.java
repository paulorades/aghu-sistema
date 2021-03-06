package br.gov.mec.aghu.model;

// Generated 15/03/2011 13:46:58 by Hibernate Tools 3.2.5.Beta

import javax.persistence.Column;
import javax.persistence.Embeddable;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * FatSubGruposId generated by hbm2java
 */
@Embeddable

public class FatSubGruposId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8190232400305490339L;
	private Short grpSeq;
	private Byte subGrupo;

	public FatSubGruposId() {
	}

	public FatSubGruposId(Short grpSeq, Byte subGrupo) {
		this.grpSeq = grpSeq;
		this.subGrupo = subGrupo;
	}

	@Column(name = "GRP_SEQ", nullable = false, precision = 3, scale = 0)
	public Short getGrpSeq() {
		return this.grpSeq;
	}

	public void setGrpSeq(Short grpSeq) {
		this.grpSeq = grpSeq;
	}

	@Column(name = "SUB_GRUPO", nullable = false, precision = 2, scale = 0)
	public Byte getSubGrupo() {
		return this.subGrupo;
	}

	public void setSubGrupo(Byte subGrupo) {
		this.subGrupo = subGrupo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((grpSeq == null) ? 0 : grpSeq.hashCode());
		result = prime * result
				+ ((subGrupo == null) ? 0 : subGrupo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj){
			return true;
		}
		if (obj == null){
			return false;
		}
		if (getClass() != obj.getClass()){
			return false;
		}
		FatSubGruposId other = (FatSubGruposId) obj;
		if (grpSeq == null) {
			if (other.grpSeq != null){
				return false;
			}
		} else if (!grpSeq.equals(other.grpSeq)){
			return false;
		}
		if (subGrupo == null) {
			if (other.subGrupo != null){
				return false;
			}
		} else if (!subGrupo.equals(other.subGrupo)){
			return false;
		}
		return true;
	}

	
}
