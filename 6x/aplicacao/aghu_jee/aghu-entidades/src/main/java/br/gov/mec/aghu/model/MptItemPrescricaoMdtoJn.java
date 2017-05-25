package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


import org.hibernate.annotations.Immutable;
import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.model.BaseJournal;

/**
 * MptItemPrescricaoMdtoJn generated by hbm2java
 */
@Entity
@SequenceGenerator(name="mptImoJnSeq", sequenceName="AGH.MPT_IMO_JN_SEQ", allocationSize = 1)
@Table(name = "MPT_ITEM_PRESCRICAO_MDTOS_JN", schema = "AGH")
@Immutable
public class MptItemPrescricaoMdtoJn extends BaseJournal {

/**
	 * 
	 */
	private static final long serialVersionUID = 7345577222000416895L;
	/* ATUALIZADOR JOURNALS - PROPERTIES	private Long seqJn;
	private String jnUser;
	private Date jnDateTime;
	private String jnOperation;*/
	private Integer pmoPteAtdSeq;
	private Integer pmoPteSeq;
	private Integer pmoSeq;
	private Short seqp;
	private Double doseParamCalculo;
	private String unidBaseParamCalculo;
	private Short percReducaoDose;
	private Date criadoEm;
	private Double dose;
	private Double doseCalculada;
	private String complementoNp;
	private Integer medMatCodigo;
	private Integer crmComSeq;
	private Short crmSeqp;
	private Integer pcsCrmComSeq;
	private Short pcsCrmSeqp;
	private Short pcsSeqp;
	private Integer fdsSeq;
	private Integer ummSeq;
	private Integer jusSeq;
	private Integer puoSeq;
	private Short fcaSeq;
	private Integer serMatricula;
	private Short serVinCodigo;
	private Integer pcrAtdSeq;
	private Short pcrSeqp;

	public MptItemPrescricaoMdtoJn() {
	}

	public MptItemPrescricaoMdtoJn(Long seqJn, String jnUser, Date jnDateTime, String jnOperation, Integer pmoPteAtdSeq, Integer pmoPteSeq,
			Integer pmoSeq, Short seqp) {
	/* ATUALIZADOR JOURNALS - contrutor	this.seqJn = seqJn;
		this.jnUser = jnUser;
		this.jnDateTime = jnDateTime;
		this.jnOperation = jnOperation;*/
		this.pmoPteAtdSeq = pmoPteAtdSeq;
		this.pmoPteSeq = pmoPteSeq;
		this.pmoSeq = pmoSeq;
		this.seqp = seqp;
	}

	@SuppressWarnings({"PMD.ExcessiveParameterList"})
	public MptItemPrescricaoMdtoJn(Long seqJn, String jnUser, Date jnDateTime, String jnOperation, Integer pmoPteAtdSeq, Integer pmoPteSeq,
			Integer pmoSeq, Short seqp, Double doseParamCalculo, String unidBaseParamCalculo, Short percReducaoDose, Date criadoEm,
			Double dose, Double doseCalculada, String complementoNp, Integer medMatCodigo, Integer crmComSeq, Short crmSeqp,
			Integer pcsCrmComSeq, Short pcsCrmSeqp, Short pcsSeqp, Integer fdsSeq, Integer ummSeq, Integer jusSeq, Integer puoSeq,
			Short fcaSeq, Integer serMatricula, Short serVinCodigo, Integer pcrAtdSeq, Short pcrSeqp) {
	/* ATUALIZADOR JOURNALS - contrutor	this.seqJn = seqJn;
		this.jnUser = jnUser;
		this.jnDateTime = jnDateTime;
		this.jnOperation = jnOperation;*/
		this.pmoPteAtdSeq = pmoPteAtdSeq;
		this.pmoPteSeq = pmoPteSeq;
		this.pmoSeq = pmoSeq;
		this.seqp = seqp;
		this.doseParamCalculo = doseParamCalculo;
		this.unidBaseParamCalculo = unidBaseParamCalculo;
		this.percReducaoDose = percReducaoDose;
		this.criadoEm = criadoEm;
		this.dose = dose;
		this.doseCalculada = doseCalculada;
		this.complementoNp = complementoNp;
		this.medMatCodigo = medMatCodigo;
		this.crmComSeq = crmComSeq;
		this.crmSeqp = crmSeqp;
		this.pcsCrmComSeq = pcsCrmComSeq;
		this.pcsCrmSeqp = pcsCrmSeqp;
		this.pcsSeqp = pcsSeqp;
		this.fdsSeq = fdsSeq;
		this.ummSeq = ummSeq;
		this.jusSeq = jusSeq;
		this.puoSeq = puoSeq;
		this.fcaSeq = fcaSeq;
		this.serMatricula = serMatricula;
		this.serVinCodigo = serVinCodigo;
		this.pcrAtdSeq = pcrAtdSeq;
		this.pcrSeqp = pcrSeqp;
	}

	// ATUALIZADOR JOURNALS - ID
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "mptImoJnSeq")
	@Column(name = "SEQ_JN", unique = true, nullable = false)
	//@GeneratedValue(strategy = GenerationType.AUTO, generator = "")
	@Override
	public Integer getSeqJn() {
		return super.getSeqJn();
	}
	// ATUALIZADOR JOURNALS - ID
	
/* ATUALIZADOR JOURNALS - Get / Set	@Id
	@Column(name = "SEQ_JN", unique = true, nullable = false)
	public Long getSeqJn() {
		return this.seqJn;
	}

	public void setSeqJn(Long seqJn) {
		this.seqJn = seqJn;
	}

	@Column(name = "JN_USER", nullable = false, length = 30)
	@Length(max = 30)
	public String getJnUser() {
		return this.jnUser;
	}

	public void setJnUser(String jnUser) {
		this.jnUser = jnUser;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "JN_DATE_TIME", nullable = false, length = 29)
	public Date getJnDateTime() {
		return this.jnDateTime;
	}

	public void setJnDateTime(Date jnDateTime) {
		this.jnDateTime = jnDateTime;
	}

	@Column(name = "JN_OPERATION", nullable = false, length = 3)
	@Length(max = 3)
	public String getJnOperation() {
		return this.jnOperation;
	}

	public void setJnOperation(String jnOperation) {
		this.jnOperation = jnOperation;
	}*/

	@Column(name = "PMO_PTE_ATD_SEQ", nullable = false)
	public Integer getPmoPteAtdSeq() {
		return this.pmoPteAtdSeq;
	}

	public void setPmoPteAtdSeq(Integer pmoPteAtdSeq) {
		this.pmoPteAtdSeq = pmoPteAtdSeq;
	}

	@Column(name = "PMO_PTE_SEQ", nullable = false)
	public Integer getPmoPteSeq() {
		return this.pmoPteSeq;
	}

	public void setPmoPteSeq(Integer pmoPteSeq) {
		this.pmoPteSeq = pmoPteSeq;
	}

	@Column(name = "PMO_SEQ", nullable = false)
	public Integer getPmoSeq() {
		return this.pmoSeq;
	}

	public void setPmoSeq(Integer pmoSeq) {
		this.pmoSeq = pmoSeq;
	}

	@Column(name = "SEQP", nullable = false)
	public Short getSeqp() {
		return this.seqp;
	}

	public void setSeqp(Short seqp) {
		this.seqp = seqp;
	}

	@Column(name = "DOSE_PARAM_CALCULO", precision = 17, scale = 17)
	public Double getDoseParamCalculo() {
		return this.doseParamCalculo;
	}

	public void setDoseParamCalculo(Double doseParamCalculo) {
		this.doseParamCalculo = doseParamCalculo;
	}

	@Column(name = "UNID_BASE_PARAM_CALCULO", length = 1)
	@Length(max = 1)
	public String getUnidBaseParamCalculo() {
		return this.unidBaseParamCalculo;
	}

	public void setUnidBaseParamCalculo(String unidBaseParamCalculo) {
		this.unidBaseParamCalculo = unidBaseParamCalculo;
	}

	@Column(name = "PERC_REDUCAO_DOSE")
	public Short getPercReducaoDose() {
		return this.percReducaoDose;
	}

	public void setPercReducaoDose(Short percReducaoDose) {
		this.percReducaoDose = percReducaoDose;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Column(name = "DOSE", precision = 17, scale = 17)
	public Double getDose() {
		return this.dose;
	}

	public void setDose(Double dose) {
		this.dose = dose;
	}

	@Column(name = "DOSE_CALCULADA", precision = 17, scale = 17)
	public Double getDoseCalculada() {
		return this.doseCalculada;
	}

	public void setDoseCalculada(Double doseCalculada) {
		this.doseCalculada = doseCalculada;
	}

	@Column(name = "COMPLEMENTO_NP", length = 120)
	@Length(max = 120)
	public String getComplementoNp() {
		return this.complementoNp;
	}

	public void setComplementoNp(String complementoNp) {
		this.complementoNp = complementoNp;
	}

	@Column(name = "MED_MAT_CODIGO")
	public Integer getMedMatCodigo() {
		return this.medMatCodigo;
	}

	public void setMedMatCodigo(Integer medMatCodigo) {
		this.medMatCodigo = medMatCodigo;
	}

	@Column(name = "CRM_COM_SEQ")
	public Integer getCrmComSeq() {
		return this.crmComSeq;
	}

	public void setCrmComSeq(Integer crmComSeq) {
		this.crmComSeq = crmComSeq;
	}

	@Column(name = "CRM_SEQP")
	public Short getCrmSeqp() {
		return this.crmSeqp;
	}

	public void setCrmSeqp(Short crmSeqp) {
		this.crmSeqp = crmSeqp;
	}

	@Column(name = "PCS_CRM_COM_SEQ")
	public Integer getPcsCrmComSeq() {
		return this.pcsCrmComSeq;
	}

	public void setPcsCrmComSeq(Integer pcsCrmComSeq) {
		this.pcsCrmComSeq = pcsCrmComSeq;
	}

	@Column(name = "PCS_CRM_SEQP")
	public Short getPcsCrmSeqp() {
		return this.pcsCrmSeqp;
	}

	public void setPcsCrmSeqp(Short pcsCrmSeqp) {
		this.pcsCrmSeqp = pcsCrmSeqp;
	}

	@Column(name = "PCS_SEQP")
	public Short getPcsSeqp() {
		return this.pcsSeqp;
	}

	public void setPcsSeqp(Short pcsSeqp) {
		this.pcsSeqp = pcsSeqp;
	}

	@Column(name = "FDS_SEQ")
	public Integer getFdsSeq() {
		return this.fdsSeq;
	}

	public void setFdsSeq(Integer fdsSeq) {
		this.fdsSeq = fdsSeq;
	}

	@Column(name = "UMM_SEQ")
	public Integer getUmmSeq() {
		return this.ummSeq;
	}

	public void setUmmSeq(Integer ummSeq) {
		this.ummSeq = ummSeq;
	}

	@Column(name = "JUS_SEQ")
	public Integer getJusSeq() {
		return this.jusSeq;
	}

	public void setJusSeq(Integer jusSeq) {
		this.jusSeq = jusSeq;
	}

	@Column(name = "PUO_SEQ")
	public Integer getPuoSeq() {
		return this.puoSeq;
	}

	public void setPuoSeq(Integer puoSeq) {
		this.puoSeq = puoSeq;
	}

	@Column(name = "FCA_SEQ")
	public Short getFcaSeq() {
		return this.fcaSeq;
	}

	public void setFcaSeq(Short fcaSeq) {
		this.fcaSeq = fcaSeq;
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

	@Column(name = "PCR_ATD_SEQ")
	public Integer getPcrAtdSeq() {
		return this.pcrAtdSeq;
	}

	public void setPcrAtdSeq(Integer pcrAtdSeq) {
		this.pcrAtdSeq = pcrAtdSeq;
	}

	@Column(name = "PCR_SEQP")
	public Short getPcrSeqp() {
		return this.pcrSeqp;
	}

	public void setPcrSeqp(Short pcrSeqp) {
		this.pcrSeqp = pcrSeqp;
	}

	public enum Fields {

	/* ATUALIZADOR JOURNALS - Fields	SEQ_JN("seqJn"),
		JN_USER("jnUser"),
		JN_DATE_TIME("jnDateTime"),
		JN_OPERATION("jnOperation"),*/
		PMO_PTE_ATD_SEQ("pmoPteAtdSeq"),
		PMO_PTE_SEQ("pmoPteSeq"),
		PMO_SEQ("pmoSeq"),
		SEQP("seqp"),
		DOSE_PARAM_CALCULO("doseParamCalculo"),
		UNID_BASE_PARAM_CALCULO("unidBaseParamCalculo"),
		PERC_REDUCAO_DOSE("percReducaoDose"),
		CRIADO_EM("criadoEm"),
		DOSE("dose"),
		DOSE_CALCULADA("doseCalculada"),
		COMPLEMENTO_NP("complementoNp"),
		MED_MAT_CODIGO("medMatCodigo"),
		CRM_COM_SEQ("crmComSeq"),
		CRM_SEQP("crmSeqp"),
		PCS_CRM_COM_SEQ("pcsCrmComSeq"),
		PCS_CRM_SEQP("pcsCrmSeqp"),
		PCS_SEQP("pcsSeqp"),
		FDS_SEQ("fdsSeq"),
		UMM_SEQ("ummSeq"),
		JUS_SEQ("jusSeq"),
		PUO_SEQ("puoSeq"),
		FCA_SEQ("fcaSeq"),
		SER_MATRICULA("serMatricula"),
		SER_VIN_CODIGO("serVinCodigo"),
		PCR_ATD_SEQ("pcrAtdSeq"),
		PCR_SEQP("pcrSeqp");

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