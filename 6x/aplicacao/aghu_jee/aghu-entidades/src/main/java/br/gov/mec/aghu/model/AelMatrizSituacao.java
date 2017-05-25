package br.gov.mec.aghu.model;

// Generated 18/04/2011 17:13:58 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Version;


import org.apache.commons.lang3.builder.ToStringBuilder;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import br.gov.mec.aghu.core.persistence.BaseEntitySeq;

/**
 * AelMatrizSituacoes generated by hbm2java
 */

@Entity
@SequenceGenerator(name="aelMasSq1", sequenceName="AGH.AEL_MAS_SQ1", allocationSize = 1)
@Table(name = "AEL_MATRIZ_SITUACOES", schema = "AGH")
public class AelMatrizSituacao extends BaseEntitySeq<Short> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2603231735966470260L;
	private Short seq;
	private Integer version;
	private Boolean indExigeMotivoCanc;
	
	private AelSitItemSolicitacoes situacaoItemSolicitacao;
	private AelSitItemSolicitacoes situacaoItemSolicitacaoPara;
	
	private Set<AelAutorizacaoAlteracaoSituacao> autorizacaoAlteracaoSituacoes = new HashSet<AelAutorizacaoAlteracaoSituacao>(0);

	private AelSitItemSolicitacoes situacaoExame;
	
	public AelMatrizSituacao() {
	}

	public AelMatrizSituacao(Short seq, AelSitItemSolicitacoes sitCodigoPara) {
		this.seq = seq;
		this.situacaoItemSolicitacaoPara = sitCodigoPara;
	}

	public AelMatrizSituacao(Short seq, AelSitItemSolicitacoes sitCodigoPara,
			Boolean exigeMotivoCanc, AelSitItemSolicitacoes sitCodigo,
			Set<AelAutorizacaoAlteracaoSituacao> aelAutorizAlterSituacoeses) {
		this.seq = seq;
		this.situacaoItemSolicitacaoPara = sitCodigoPara;
		this.indExigeMotivoCanc = exigeMotivoCanc;
		this.situacaoItemSolicitacao = sitCodigo;
		this.autorizacaoAlteracaoSituacoes = aelAutorizAlterSituacoeses;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "aelMasSq1")
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
	@JoinColumn(name = "SIT_CODIGO_PARA", nullable = false)
	public AelSitItemSolicitacoes getSituacaoItemSolicitacaoPara() {
		return this.situacaoItemSolicitacaoPara;
	}

	public void setSituacaoItemSolicitacaoPara(AelSitItemSolicitacoes s) {
		this.situacaoItemSolicitacaoPara = s;
	}
	
	@Column(name = "IND_EXIGE_MOTIVO_CANC", length = 1)
	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getIndExigeMotivoCanc() {
		return this.indExigeMotivoCanc;
	}

	public void setIndExigeMotivoCanc(Boolean indExigeMotivoCanc) {
		this.indExigeMotivoCanc = indExigeMotivoCanc;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "SIT_CODIGO", nullable = true)
	public AelSitItemSolicitacoes getSituacaoItemSolicitacao() {
		return this.situacaoItemSolicitacao;
	}

	public void setSituacaoItemSolicitacao(AelSitItemSolicitacoes s) {
		this.situacaoItemSolicitacao = s;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "matrizSituacao")
	@Cascade(value=CascadeType.DELETE)
	public Set<AelAutorizacaoAlteracaoSituacao> getAutorizacaoAlteracaoSituacoes() {
		return this.autorizacaoAlteracaoSituacoes;
	}

	public void setAutorizacaoAlteracaoSituacoes(Set<AelAutorizacaoAlteracaoSituacao> aelAutorizAlterSituacoeses) {
		this.autorizacaoAlteracaoSituacoes = aelAutorizAlterSituacoeses;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "SIT_CODIGO_PARA", nullable = true, insertable = false, updatable = false)
	public AelSitItemSolicitacoes getSituacaoExame() {
		return situacaoExame;
	}
	
	public void setSituacaoExame(AelSitItemSolicitacoes situacaoExame) {
		this.situacaoExame = situacaoExame;
	}
	
	
	public enum Fields {
		SEQ("seq"),
		EXIGE_MOTIVO_CANC("indExigeMotivoCanc"),
		SITUACAO_ITEM_SOLICITACAO("situacaoItemSolicitacao"),
		SITUACAO_ITEM_SOLICITACAO_CODIGO("situacaoItemSolicitacao.codigo"),
		SITUACAO_ITEM_SOLICITACAO_PARA_CODIGO("situacaoItemSolicitacaoPara.codigo"),
		SITUACAO_ITEM_SOLICITACAO_PARA("situacaoItemSolicitacaoPara");

		private String fields;

		private Fields(String fields) {
			this.fields = fields;
		}

		@Override
		public String toString() {
			return this.fields;
		}
	}


	@Override
	public String toString() {
		ToStringBuilder asString = new ToStringBuilder(this);
		
		asString.append("situacaoItemSolicitacao", (this.getSituacaoItemSolicitacao() != null ? this.getSituacaoItemSolicitacao().toString() : "null"));
		asString.append("situacaoItemSolicitacaoPara", (this.getSituacaoItemSolicitacaoPara() != null ? this.getSituacaoItemSolicitacaoPara().toString() : "null"));
		
		return asString.toString();
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
		if (!(obj instanceof AelMatrizSituacao)) {
			return false;
		}
		AelMatrizSituacao other = (AelMatrizSituacao) obj;
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