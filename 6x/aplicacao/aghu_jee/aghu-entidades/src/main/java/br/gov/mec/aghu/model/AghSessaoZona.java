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
 * AghSessaoZona generated by hbm2java
 */
@Entity
@Table(name = "AGH_SESSOES_ZONAS", schema = "AGH")
public class AghSessaoZona extends BaseEntityId<AghSessaoZonaId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8990218051275921806L;
	private AghSessaoZonaId id;

	public AghSessaoZona() {
	}

	public AghSessaoZona(AghSessaoZonaId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "machine", column = @Column(name = "MACHINE", length = 30)),
			@AttributeOverride(name = "dateTime", column = @Column(name = "DATE_TIME", length = 29)),
			@AttributeOverride(name = "program", column = @Column(name = "PROGRAM", length = 40)),
			@AttributeOverride(name = "logicalReads", column = @Column(name = "LOGICAL_READS", precision = 17, scale = 17)),
			@AttributeOverride(name = "sid", column = @Column(name = "SID", precision = 17, scale = 17)),
			@AttributeOverride(name = "username", column = @Column(name = "USERNAME", length = 30)),
			@AttributeOverride(name = "logonTime", column = @Column(name = "LOGON_TIME", length = 29)),
			@AttributeOverride(name = "version", column = @Column(name = "VERSION", nullable = false)) })
	public AghSessaoZonaId getId() {
		return this.id;
	}

	public void setId(AghSessaoZonaId id) {
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
