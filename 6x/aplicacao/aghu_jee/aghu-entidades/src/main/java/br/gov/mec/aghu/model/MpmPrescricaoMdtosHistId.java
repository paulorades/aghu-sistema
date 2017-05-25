package br.gov.mec.aghu.model;

// Generated 11/07/2012 17:28:38 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * MpmPrescricaoMdtosHistId generated by hbm2java
 */
@Embeddable
public class MpmPrescricaoMdtosHistId implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8507984268727220014L;
	private int atdSeq;
	private long seq;

	public MpmPrescricaoMdtosHistId() {
	}

	public MpmPrescricaoMdtosHistId(int atdSeq, long seq) {
		this.atdSeq = atdSeq;
		this.seq = seq;
	}

	@Column(name = "atd_seq", nullable = false)
	public int getAtdSeq() {
		return this.atdSeq;
	}

	public void setAtdSeq(int atdSeq) {
		this.atdSeq = atdSeq;
	}

	@Column(name = "seq", nullable = false)
	public long getSeq() {
		return this.seq;
	}

	public void setSeq(long seq) {
		this.seq = seq;
	}

	public boolean equals(Object other) {
		if ((this == other)){
			return true;
		}
		if ((other == null)){
			return false;
		}
		if (!(other instanceof MpmPrescricaoMdtosHistId)){
			return false;
		}
		MpmPrescricaoMdtosHistId castOther = (MpmPrescricaoMdtosHistId) other;

		return (this.getAtdSeq() == castOther.getAtdSeq())
				&& (this.getSeq() == castOther.getSeq());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getAtdSeq();
		result = 37 * result + (int) this.getSeq();
		return result;
	}

}