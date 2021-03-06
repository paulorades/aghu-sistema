package br.gov.mec.aghu.model;

// Generated 15/03/2011 13:46:58 by Hibernate Tools 3.2.5.Beta

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Version;


import br.gov.mec.aghu.dominio.DominioPrioridadeCid;
import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * FatEspecialidadeTratamentos generated by hbm2java
 */
@Entity
@Table(name = "AAC_CID_ATENDIMENTOS", schema = "AGH")
public class AacCidAtendimentos extends BaseEntityId<AacCidAtendimentosId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7315250956249012578L;
	
	private AacCidAtendimentosId id;
	private DominioPrioridadeCid indPriodridade;
	private Integer version;
	private AghAtendimentos aghAtendimentos;
	private AghCid aghCid;

	public AacCidAtendimentos() {
	}

	public AacCidAtendimentos(AacCidAtendimentosId id, DominioPrioridadeCid indPriodridade) {
		this.id = id;
		this.indPriodridade = indPriodridade;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "atdSeq", column = @Column(name = "ATD_SEQ", nullable = false, precision = 9, scale = 0)),
			@AttributeOverride(name = "cidSeq", column = @Column(name = "CID_SEQ", nullable = false, precision = 5, scale = 0)) })
	public AacCidAtendimentosId getId() {
		return this.id;
	}

	public void setId(AacCidAtendimentosId id) {
		this.id = id;
	}

	public void setAghAtendimentos(AghAtendimentos aghAtendimentos) {
		this.aghAtendimentos = aghAtendimentos;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ATD_SEQ", nullable = false, insertable = false, updatable = false)
	public AghAtendimentos getAghAtendimentos() {
		return aghAtendimentos;
	}

	public enum Fields {
		IND_PRIODRIDADE("indPriodridade"), AGH_ATENDIMENTOS("aghAtendimentos");

		private String fields;

		private Fields(String fields) {
			this.fields = fields;
		}

		@Override
		public String toString() {
			return this.fields;
		}
	}

	@Version
	@Column(name = "VERSION", nullable = false)
	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public void setIndPriodridade(DominioPrioridadeCid indPriodridade) {
		this.indPriodridade = indPriodridade;
	}

	@Column(name = "IND_PRIORIDADE", nullable = false, length = 1)
	@Enumerated(EnumType.STRING)
	public DominioPrioridadeCid getIndPriodridade() {
		return indPriodridade;
	}

	public void setAghCid(AghCid aghCid) {
		this.aghCid = aghCid;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CID_SEQ", nullable = false, insertable = false, updatable = false)
	public AghCid getAghCid() {
		return aghCid;
	}

	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof AacCidAtendimentos)) {
			return false;
		}
		AacCidAtendimentos other = (AacCidAtendimentos) obj;
		if (getId() == null) {
			if (other.getId() != null) {
				return false;
			}
		} else if (!getId().equals(other.getId())) {
			return false;
		}
		return true;
	}
	// ##### GeradorEqualsHashCodeMain #####

}
