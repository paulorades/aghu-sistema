package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.dominio.DominioSituacaoAelExameAp;
import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * AelOcorrenciaExameAp generated by hbm2java
 */
@Entity
@Table(name = "AEL_OCORRENCIA_EXAME_APS", schema = "AGH")
public class AelOcorrenciaExameAp extends BaseEntityId<AelOcorrenciaExameApId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5095044480171839354L;
	private AelOcorrenciaExameApId id;
	private Integer version;
	private AelExameAp aelExameAp;
	private RapServidores rapServidores;
	private Date criadoEm;
	private DominioSituacaoAelExameAp situacao;
	private String descricao;

	public AelOcorrenciaExameAp() {
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "luxSeq", column = @Column(name = "LUX_SEQ", nullable = false)),
			@AttributeOverride(name = "seqp", column = @Column(name = "SEQP", nullable = false)) })
	public AelOcorrenciaExameApId getId() {
		return this.id;
	}

	public void setId(AelOcorrenciaExameApId id) {
		this.id = id;
	}

	@Version
	@Column(name = "VERSION", nullable = false)
	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "LUX_SEQ", nullable = false, insertable = false, updatable = false)
	public AelExameAp getAelExameAp() {
		return this.aelExameAp;
	}

	public void setAelExameAp(AelExameAp aelExameAp) {
		this.aelExameAp = aelExameAp;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA", nullable = false),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO", nullable = false) })
	public RapServidores getRapServidores() {
		return this.rapServidores;
	}

	public void setRapServidores(RapServidores rapServidores) {
		this.rapServidores = rapServidores;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", nullable = false, length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Column(name = "SITUACAO", nullable = false, length = 1)
	@Enumerated(EnumType.STRING)
	public DominioSituacaoAelExameAp getSituacao() {
		return this.situacao;
	}

	public void setSituacao(DominioSituacaoAelExameAp situacao) {
		this.situacao = situacao;
	}

	@Column(name = "DESCRICAO", length = 2000)
	@Length(max = 2000)
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public enum Fields {

		ID("id"),
		LUX_SEQ("id.luxSeq"),
		SEQP("id.seqp"),
		VERSION("version"),
		AEL_EXAME_APS("aelExameAp"),
		RAP_SERVIDORES("rapServidores"),
		CRIADO_EM("criadoEm"),
		SITUACAO("situacao"),
		DESCRICAO("descricao");

		private String fields;

		private Fields(String fields) {
			this.fields = fields;
		}

		@Override
		public String toString() {
			return this.fields;
		}

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
		if (!(obj instanceof AelOcorrenciaExameAp)) {
			return false;
		}
		AelOcorrenciaExameAp other = (AelOcorrenciaExameAp) obj;
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