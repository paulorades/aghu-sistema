package br.gov.mec.aghu.model;

// Generated 10/03/2011 16:40:25 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.persistence.Version;


import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * AelGrupoRecomendacaoExames generated by hbm2java<br>
 * Tabela: AEL_GRUPO_RECOMENDACAO_EXAMES
 * 
 */

@Entity
@Table(name = "AEL_GRUPO_RECOMENDACAO_EXAMES", schema = "AGH")
public class AelGrupoRecomendacaoExame extends BaseEntityId<AelGrupoRecomendacaoExameId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4516989609474238572L;
	private AelGrupoRecomendacaoExameId id;
	private Date criadoEm;
	private RapServidores servidor;
	private AelGrupoRecomendacao grupoRecomendacao;
	private AelExamesMaterialAnalise exameMaterialAnalise;
	private Integer version;
	
	public AelGrupoRecomendacaoExame() {
	}

	public AelGrupoRecomendacaoExame(AelGrupoRecomendacaoExameId id,
			Date criadoEm, RapServidores serv) {
		this.id = id;
		this.criadoEm = criadoEm;
		this.servidor = serv;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "grmSeq", column = @Column(name = "GRM_SEQ", nullable = false, precision = 5, scale = 0)),
			@AttributeOverride(name = "emaManSeq", column = @Column(name = "EMA_MAN_SEQ", nullable = false, precision = 5, scale = 0)),
			@AttributeOverride(name = "emaExaSigla", column = @Column(name = "EMA_EXA_SIGLA", nullable = false, length = 5)) })
	public AelGrupoRecomendacaoExameId getId() {
		return this.id;
	}

	public void setId(AelGrupoRecomendacaoExameId id) {
		this.id = id;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", nullable = false, length = 7)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA", nullable = false),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO", nullable = false) })
	public RapServidores getServidor() {
		return servidor;
	}
	
	public void setServidor(RapServidores servidor) {
		this.servidor = servidor;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "GRM_SEQ", nullable = false, insertable = false, updatable = false)
	public AelGrupoRecomendacao getGrupoRecomendacao() {
		return grupoRecomendacao;
	}
	
	public void setGrupoRecomendacao(AelGrupoRecomendacao gr) {
		this.grupoRecomendacao = gr;
	}
	
	
	@ManyToOne
	@JoinColumns( {
		@JoinColumn(name = "EMA_EXA_SIGLA",referencedColumnName = "EXA_SIGLA", nullable = false,insertable=false, updatable=false),
		@JoinColumn(name = "EMA_MAN_SEQ",referencedColumnName = "MAN_SEQ", nullable = false,insertable=false, updatable=false) })
	public AelExamesMaterialAnalise getExameMaterialAnalise() {
		return exameMaterialAnalise;
	}
	
	
	public void setExameMaterialAnalise(AelExamesMaterialAnalise exameMaterialAnalise) {
		this.exameMaterialAnalise = exameMaterialAnalise;
	}
	
	/**
	 * @return the version
	 *
	 */
	@Version
	@Column(name = "VERSION", nullable = false)
	public Integer getVersion() {
		return version;
	}
	
	public void setVersion(Integer version) {
		this.version = version;
	}
	
	@Transient
	public String getNomeUsualMaterial() {
		if (this.getExameMaterialAnalise() != null) {
			return this.getExameMaterialAnalise().getNomeUsualMaterial();
		} else {
			return null;
		}
	}

	
	@Override
	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (other == null) {
			return false;
		}
		if (!(other instanceof AelGrupoRecomendacaoExame)) {
			return false;
		}
		AelGrupoRecomendacaoExame castOther = (AelGrupoRecomendacaoExame) other;
		if (this.getId() == null) {
			if (castOther.getId() != null) {
				return false;
			}
		} else if (!this.getId().equals(castOther.getId())) {
			return false;
		}
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((this.getId() == null) ? 0 : this.getId().hashCode());
		return result;
	}

	public enum Fields {
		ID("id")
		, CRIADO_EM("criadoEm")
		, SERVIDOR("servidor")
		, GRUPO_RECOMENDACAO("grupoRecomendacao")
		, GRM_SEQ("id.grmSeq")
		, EMA_EXA_SIGLA("id.emaExaSigla")
		, EMA_MAN_SEQ("id.emaManSeq")
		, EXAME_MATERIAL_ANALISE("exameMaterialAnalise");

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
