package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;


import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * TblOrgmPcer generated by hbm2java
 */
@Entity
@Table(name = "TBL_ORGM_PCER", schema = "AGH")
public class TblOrgmPcer extends BaseEntityId<TblOrgmPcerId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -165054253820937628L;
	private TblOrgmPcerId id;

	public TblOrgmPcer() {
	}

	public TblOrgmPcer(TblOrgmPcerId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "codOrgmPcer", column = @Column(name = "COD_ORGM_PCER", nullable = false)),
			@AttributeOverride(name = "ultSeqPcer", column = @Column(name = "ULT_SEQ_PCER")),
			@AttributeOverride(name = "descOrgmPcer", column = @Column(name = "DESC_ORGM_PCER", length = 45)),
			@AttributeOverride(name = "version", column = @Column(name = "VERSION", nullable = false)) })
	public TblOrgmPcerId getId() {
		return this.id;
	}

	public void setId(TblOrgmPcerId id) {
		this.id = id;
	}

	public enum Fields {

		ID("id");

		private String fields;

		private Fields(String fields) {
			this.fields = fields;
		}

		@Override
		public String toString() {
			return this.fields;
		}

	}

}