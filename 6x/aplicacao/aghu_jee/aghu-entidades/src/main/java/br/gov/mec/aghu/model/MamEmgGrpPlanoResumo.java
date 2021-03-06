package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntitySeq;

/**
 * MamEmgGrpPlanoResumo generated by hbm2java
 */
@Entity
@SequenceGenerator(name="mamEgpSq1", sequenceName="AGH.MAM_EGP_SQ1", allocationSize = 1)
@Table(name = "MAM_EMG_GRP_PLANO_RESUMOS", schema = "AGH")
public class MamEmgGrpPlanoResumo extends BaseEntitySeq<Short> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6805841134837099837L;
	private Short seq;
	private Integer version;
	private RapServidores rapServidores;
	private String descricao;
	private Date criadoEm;
	private String indSituacao;
	private Set<MamResumoCaso> mamResumoCasoes = new HashSet<MamResumoCaso>(0);
	private Set<MamPlanoAcao> mamPlanoAcaoes = new HashSet<MamPlanoAcao>(0);
	private Set<MamEmgGrpPlanoXPerfil> mamEmgGrpPlanoXPerfiles = new HashSet<MamEmgGrpPlanoXPerfil>(0);

	public MamEmgGrpPlanoResumo() {
	}

	public MamEmgGrpPlanoResumo(Short seq, RapServidores rapServidores, String descricao, Date criadoEm, String indSituacao) {
		this.seq = seq;
		this.rapServidores = rapServidores;
		this.descricao = descricao;
		this.criadoEm = criadoEm;
		this.indSituacao = indSituacao;
	}

	public MamEmgGrpPlanoResumo(Short seq, RapServidores rapServidores, String descricao, Date criadoEm, String indSituacao,
			Set<MamResumoCaso> mamResumoCasoes, Set<MamPlanoAcao> mamPlanoAcaoes,
			Set<MamEmgGrpPlanoXPerfil> mamEmgGrpPlanoXPerfiles) {
		this.seq = seq;
		this.rapServidores = rapServidores;
		this.descricao = descricao;
		this.criadoEm = criadoEm;
		this.indSituacao = indSituacao;
		this.mamResumoCasoes = mamResumoCasoes;
		this.mamPlanoAcaoes = mamPlanoAcaoes;
		this.mamEmgGrpPlanoXPerfiles = mamEmgGrpPlanoXPerfiles;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "mamEgpSq1")
	@Column(name = "SEQ", unique = true, nullable = false)
	public Short getSeq() {
		return this.seq;
	}

	public void setSeq(Short seq) {
		this.seq = seq;
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
	@JoinColumns({ @JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA", nullable = false),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO", nullable = false) })
	public RapServidores getRapServidores() {
		return this.rapServidores;
	}

	public void setRapServidores(RapServidores rapServidores) {
		this.rapServidores = rapServidores;
	}

	@Column(name = "DESCRICAO", nullable = false, length = 100)
	@NotNull
	@Length(max = 100)
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", nullable = false, length = 29)
	@NotNull
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Column(name = "IND_SITUACAO", nullable = false, length = 1)
	@NotNull
	@Length(max = 1)
	public String getIndSituacao() {
		return this.indSituacao;
	}

	public void setIndSituacao(String indSituacao) {
		this.indSituacao = indSituacao;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "mamEmgGrpPlanoResumo")
	public Set<MamResumoCaso> getMamResumoCasoes() {
		return this.mamResumoCasoes;
	}

	public void setMamResumoCasoes(Set<MamResumoCaso> mamResumoCasoes) {
		this.mamResumoCasoes = mamResumoCasoes;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "mamEmgGrpPlanoResumo")
	public Set<MamPlanoAcao> getMamPlanoAcaoes() {
		return this.mamPlanoAcaoes;
	}

	public void setMamPlanoAcaoes(Set<MamPlanoAcao> mamPlanoAcaoes) {
		this.mamPlanoAcaoes = mamPlanoAcaoes;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "mamEmgGrpPlanoResumo")
	public Set<MamEmgGrpPlanoXPerfil> getMamEmgGrpPlanoXPerfiles() {
		return this.mamEmgGrpPlanoXPerfiles;
	}

	public void setMamEmgGrpPlanoXPerfiles(Set<MamEmgGrpPlanoXPerfil> mamEmgGrpPlanoXPerfiles) {
		this.mamEmgGrpPlanoXPerfiles = mamEmgGrpPlanoXPerfiles;
	}

	public enum Fields {

		SEQ("seq"),
		VERSION("version"),
		RAP_SERVIDORES("rapServidores"),
		DESCRICAO("descricao"),
		CRIADO_EM("criadoEm"),
		IND_SITUACAO("indSituacao"),
		MAM_RESUMO_CASOES("mamResumoCasoes"),
		MAM_PLANO_ACAOES("mamPlanoAcaoes"),
		MAM_EMG_GRP_PLANO_X_PERFILES("mamEmgGrpPlanoXPerfiles");

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
		result = prime * result + ((getSeq() == null) ? 0 : getSeq().hashCode());
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
		if (!(obj instanceof MamEmgGrpPlanoResumo)) {
			return false;
		}
		MamEmgGrpPlanoResumo other = (MamEmgGrpPlanoResumo) obj;
		if (getSeq() == null) {
			if (other.getSeq() != null) {
				return false;
			}
		} else if (!getSeq().equals(other.getSeq())) {
			return false;
		}
		return true;
	}
	// ##### GeradorEqualsHashCodeMain #####

}
