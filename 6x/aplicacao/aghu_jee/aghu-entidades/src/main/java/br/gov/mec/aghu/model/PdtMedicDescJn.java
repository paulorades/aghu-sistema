package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


import org.hibernate.annotations.Immutable;
import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.dominio.DominioProcedimentoTerapeuticoOperatorio;
import br.gov.mec.aghu.core.model.BaseJournal;

/**
 * PdtMedicDescJn generated by hbm2java
 */
@Entity
@Table(name = "PDT_MEDIC_DESCS_JN", schema = "AGH")
@SequenceGenerator(name = "pdtDmdJnSeq", sequenceName = "AGH.PDT_DMD_JN_SEQ", allocationSize = 1)
@Immutable
public class PdtMedicDescJn extends BaseJournal {

	private static final long serialVersionUID = -8096483807320512391L;

	private Integer ddtSeq;
	private Integer seqp;
	private DominioProcedimentoTerapeuticoOperatorio preTrans;
	private Integer medMatCodigo;
	private Date criadoEm;
	private Integer serMatricula;
	private Short serVinCodigo;
	private Integer dose;
	private String unidade;

	public PdtMedicDescJn() {
	}

	public PdtMedicDescJn(Long seqJn, String jnUser, Date jnDateTime, String jnOperation, Integer ddtSeq, Integer seqp) {
		this.ddtSeq = ddtSeq;
		this.seqp = seqp;
	}

	public PdtMedicDescJn(Long seqJn, String jnUser, Date jnDateTime, String jnOperation, Integer ddtSeq, Integer seqp, DominioProcedimentoTerapeuticoOperatorio preTrans,
			Integer medMatCodigo, Date criadoEm, Integer serMatricula, Short serVinCodigo, Integer dose, String unidade) {
		this.ddtSeq = ddtSeq;
		this.seqp = seqp;
		this.preTrans = preTrans;
		this.medMatCodigo = medMatCodigo;
		this.criadoEm = criadoEm;
		this.serMatricula = serMatricula;
		this.serVinCodigo = serVinCodigo;
		this.dose = dose;
		this.unidade = unidade;
	}

	@Id
	@Column(name = "SEQ_JN", unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "pdtDmdJnSeq")
	@Override
	public Integer getSeqJn() {
		return super.getSeqJn();
	}

	@Column(name = "DDT_SEQ", nullable = false)
	public Integer getDdtSeq() {
		return this.ddtSeq;
	}

	public void setDdtSeq(Integer ddtSeq) {
		this.ddtSeq = ddtSeq;
	}

	@Column(name = "SEQP", nullable = false)
	public Integer getSeqp() {
		return this.seqp;
	}

	public void setSeqp(Integer seqp) {
		this.seqp = seqp;
	}

	@Column(name = "PRE_TRANS", length = 3)
	@Enumerated(EnumType.STRING)
	public DominioProcedimentoTerapeuticoOperatorio getPreTrans() {
		return this.preTrans;
	}

	public void setPreTrans(DominioProcedimentoTerapeuticoOperatorio preTrans) {
		this.preTrans = preTrans;
	}

	@Column(name = "MED_MAT_CODIGO")
	public Integer getMedMatCodigo() {
		return this.medMatCodigo;
	}

	public void setMedMatCodigo(Integer medMatCodigo) {
		this.medMatCodigo = medMatCodigo;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Column(name = "SER_MATRICULA")
	public Integer getSerMatricula() {
		return this.serMatricula;
	}

	public void setSerMatricula(Integer serMatricula) {
		this.serMatricula = serMatricula;
	}

	@Column(name = "SER_VIN_CODIGO")
	public Short getSerVinCodigo() {
		return this.serVinCodigo;
	}

	public void setSerVinCodigo(Short serVinCodigo) {
		this.serVinCodigo = serVinCodigo;
	}

	@Column(name = "DOSE")
	public Integer getDose() {
		return this.dose;
	}

	public void setDose(Integer dose) {
		this.dose = dose;
	}

	@Column(name = "UNIDADE", length = 5)
	@Length(max = 5)
	public String getUnidade() {
		return this.unidade;
	}

	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}

	public enum Fields {
		DDT_SEQ("ddtSeq"),
		SEQP("seqp"),
		PRE_TRANS("preTrans"),
		MED_MAT_CODIGO("medMatCodigo"),
		CRIADO_EM("criadoEm"),
		SER_MATRICULA("serMatricula"),
		SER_VIN_CODIGO("serVinCodigo"),
		DOSE("dose"),
		UNIDADE("unidade");

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