package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

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
import javax.persistence.Version;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * RapMedidaExtrato generated by hbm2java
 */
@Entity
@Table(name = "RAP_MEDIDAS_EXTRATO", schema = "AGH")
public class RapMedidaExtrato extends BaseEntityId<RapMedidaExtratoId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3428798766982062320L;
	private RapMedidaExtratoId id;
	private Integer version;
	private RapItemAvaliacaoServ rapItemAvaliacaoServ;
	private RapServidores rapServidores;
	private RapForma rapForma;
	private Date prazo;
	private String situacao;
	private Date dtFinalizacao;
	private String observacao;
	private String descricao;

	public RapMedidaExtrato() {
	}

	public RapMedidaExtrato(RapMedidaExtratoId id, RapItemAvaliacaoServ rapItemAvaliacaoServ, RapServidores rapServidores,
			String descricao) {
		this.id = id;
		this.rapItemAvaliacaoServ = rapItemAvaliacaoServ;
		this.rapServidores = rapServidores;
		this.descricao = descricao;
	}

	public RapMedidaExtrato(RapMedidaExtratoId id, RapItemAvaliacaoServ rapItemAvaliacaoServ, RapServidores rapServidores,
			RapForma rapForma, Date prazo, String situacao, Date dtFinalizacao, String observacao, String descricao) {
		this.id = id;
		this.rapItemAvaliacaoServ = rapItemAvaliacaoServ;
		this.rapServidores = rapServidores;
		this.rapForma = rapForma;
		this.prazo = prazo;
		this.situacao = situacao;
		this.dtFinalizacao = dtFinalizacao;
		this.observacao = observacao;
		this.descricao = descricao;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "iasAvsSeq", column = @Column(name = "IAS_AVS_SEQ", nullable = false)),
			@AttributeOverride(name = "iasSeqp", column = @Column(name = "IAS_SEQP", nullable = false)),
			@AttributeOverride(name = "seqp", column = @Column(name = "SEQP", nullable = false)),
			@AttributeOverride(name = "data", column = @Column(name = "DATA", nullable = false, length = 29)),
			@AttributeOverride(name = "serMatricula", column = @Column(name = "SER_MATRICULA", nullable = false)),
			@AttributeOverride(name = "serVinCodigo", column = @Column(name = "SER_VIN_CODIGO", nullable = false)) })
	public RapMedidaExtratoId getId() {
		return this.id;
	}

	public void setId(RapMedidaExtratoId id) {
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
	@JoinColumns({
			@JoinColumn(name = "IAS_AVS_SEQ", referencedColumnName = "AVS_SEQ", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "IAS_SEQP", referencedColumnName = "SEQP", nullable = false, insertable = false, updatable = false) })
	public RapItemAvaliacaoServ getRapItemAvaliacaoServ() {
		return this.rapItemAvaliacaoServ;
	}

	public void setRapItemAvaliacaoServ(RapItemAvaliacaoServ rapItemAvaliacaoServ) {
		this.rapItemAvaliacaoServ = rapItemAvaliacaoServ;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO", nullable = false, insertable = false, updatable = false) })
	public RapServidores getRapServidores() {
		return this.rapServidores;
	}

	public void setRapServidores(RapServidores rapServidores) {
		this.rapServidores = rapServidores;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "FRM_SEQ")
	public RapForma getRapForma() {
		return this.rapForma;
	}

	public void setRapForma(RapForma rapForma) {
		this.rapForma = rapForma;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "PRAZO", length = 29)
	public Date getPrazo() {
		return this.prazo;
	}

	public void setPrazo(Date prazo) {
		this.prazo = prazo;
	}

	@Column(name = "SITUACAO", length = 2)
	@Length(max = 2)
	public String getSituacao() {
		return this.situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_FINALIZACAO", length = 29)
	public Date getDtFinalizacao() {
		return this.dtFinalizacao;
	}

	public void setDtFinalizacao(Date dtFinalizacao) {
		this.dtFinalizacao = dtFinalizacao;
	}

	@Column(name = "OBSERVACAO", length = 240)
	@Length(max = 240)
	public String getObservacao() {
		return this.observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	@Column(name = "DESCRICAO", nullable = false, length = 200)
	@Length(max = 200)
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public enum Fields {

		ID("id"),
		VERSION("version"),
		RAP_ITENS_AVALIACAO_SERV("rapItemAvaliacaoServ"),
		RAP_SERVIDORES("rapServidores"),
		RAP_FORMAS("rapForma"),
		PRAZO("prazo"),
		SITUACAO("situacao"),
		DT_FINALIZACAO("dtFinalizacao"),
		OBSERVACAO("observacao"),
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
		if (!(obj instanceof RapMedidaExtrato)) {
			return false;
		}
		RapMedidaExtrato other = (RapMedidaExtrato) obj;
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