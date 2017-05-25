package br.gov.mec.aghu.model;

// Generated 04/02/2011 15:58:31 by Hibernate Tools 3.2.5.Beta

import java.math.BigDecimal;
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

import br.gov.mec.aghu.dominio.DominioSituacao;
import br.gov.mec.aghu.dominio.DominioTipoNutricaoParenteral;
import br.gov.mec.aghu.core.model.BaseJournal;

/**
 * FatProcedHospInternosJn generated by hbm2java
 */

@Entity
@SequenceGenerator(name = "FAT_PHI_jn_seq", sequenceName = "AGH.FAT_PHI_jn_seq", allocationSize = 1)
@Table(name = "FAT_PROCED_HOSP_INTERNOS_JN", schema = "AGH")
@Immutable
public class FatProcedHospInternosJn extends BaseJournal {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4635165857174884442L;
	//private Long seqJn;
	//private String jnUser;
	//private Date jnDateTime;
	//private String jnOperation;
	private Integer seq;
	private String descricao;
	private String orientacoesFaturamento;
	private DominioSituacao indSituacao;
	private Integer matCodigo;
	private Integer pciSeq;
	private Short pedSeq;
	private String csaCodigo;
	private String pheCodigo;
	private Integer serMatricula;
	private Short serVinCodigo;
	private Date criadoEm;
	private String emaExaSigla;
	private Integer emaManSeq;
	private Boolean componenteIrradiado;
	private DominioTipoNutricaoParenteral tipoNutrParenteral;
	private Boolean indOrigemPresc;
	private String tipoOperConversao;
	private BigDecimal fatorConversao;
	private Integer phiSeq;

	public FatProcedHospInternosJn() {
		super();
	}

	public FatProcedHospInternosJn(Long seqJn, String jnUser, Date jnDateTime,
			String jnOperation, Integer seq) {
		//this.seqJn = seqJn;
		//this.jnUser = jnUser;
		//this.jnDateTime = jnDateTime;
		//this.jnOperation = jnOperation;
		this.seq = seq;
	}

	public FatProcedHospInternosJn(Long seqJn, String jnUser, Date jnDateTime,
			String jnOperation, Integer seq, String descricao,
			String orientacoesFaturamento, DominioSituacao indSituacao,
			Integer matCodigo, Integer pciSeq, Short pedSeq, String csaCodigo,
			String pheCodigo, Integer serMatricula, Short serVinCodigo,
			Date criadoEm, String emaExaSigla, Integer emaManSeq,
			Boolean componenteIrradiado, DominioTipoNutricaoParenteral tipoNutrParenteral,
			Boolean indOrigemPresc, String tipoOperConversao,
			BigDecimal fatorConversao, Integer phiSeq) {
		//this.seqJn = seqJn;
		//this.jnUser = jnUser;
		//this.jnDateTime = jnDateTime;
		//this.jnOperation = jnOperation;
		this.seq = seq;
		this.descricao = descricao;
		this.orientacoesFaturamento = orientacoesFaturamento;
		this.indSituacao = indSituacao;
		this.matCodigo = matCodigo;
		this.pciSeq = pciSeq;
		this.pedSeq = pedSeq;
		this.csaCodigo = csaCodigo;
		this.pheCodigo = pheCodigo;
		this.serMatricula = serMatricula;
		this.serVinCodigo = serVinCodigo;
		this.criadoEm = criadoEm;
		this.emaExaSigla = emaExaSigla;
		this.emaManSeq = emaManSeq;
		this.componenteIrradiado = componenteIrradiado;
		this.tipoNutrParenteral = tipoNutrParenteral;
		this.indOrigemPresc = indOrigemPresc;
		this.tipoOperConversao = tipoOperConversao;
		this.fatorConversao = fatorConversao;
		this.phiSeq = phiSeq;
	}
	
	public void doSetPropriedades(Integer seq, String descricao,
			String orientacoesFaturamento, DominioSituacao indSituacao,
			Integer matCodigo, Integer pciSeq, Short pedSeq, String csaCodigo,
			String pheCodigo, Integer serMatricula, Short serVinCodigo,
			Date criadoEm, String emaExaSigla, Integer emaManSeq,
			Boolean componenteIrradiado, DominioTipoNutricaoParenteral tipoNutrParenteral,
			Boolean indOrigemPresc, String tipoOperConversao,
			BigDecimal fatorConversao, Integer phiSeq) {
		//this.jnUser = jnUser;
		//this.jnDateTime = jnDateTime;
		//this.jnOperation = jnOperation;
		this.seq = seq;
		this.descricao = descricao;
		this.orientacoesFaturamento = orientacoesFaturamento;
		this.indSituacao = indSituacao;
		this.matCodigo = matCodigo;
		this.pciSeq = pciSeq;
		this.pedSeq = pedSeq;
		this.csaCodigo = csaCodigo;
		this.pheCodigo = pheCodigo;
		this.serMatricula = serMatricula;
		this.serVinCodigo = serVinCodigo;
		this.criadoEm = criadoEm;
		this.emaExaSigla = emaExaSigla;
		this.emaManSeq = emaManSeq;
		this.componenteIrradiado = componenteIrradiado;
		this.tipoNutrParenteral = tipoNutrParenteral;
		this.indOrigemPresc = indOrigemPresc;
		this.tipoOperConversao = tipoOperConversao;
		this.fatorConversao = fatorConversao;
		this.phiSeq = phiSeq;
	}
	
	@Id
	@Column(name = "SEQ_JN", unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "FAT_PHI_jn_seq")
	@Override
	public Integer getSeqJn() {
		return super.getSeqJn();
	}
	
	/*
	@Id
	@Column(name = "SEQ_JN", unique = true, nullable = false)
	public Long getSeqJn() {
		return this.seqJn;
	}

	public void setSeqJn(Long seqJn) {
		this.seqJn = seqJn;
	}

	@Column(name = "JN_USER", nullable = false, length = 30)
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
	public String getJnOperation() {
		return this.jnOperation;
	}

	public void setJnOperation(String jnOperation) {
		this.jnOperation = jnOperation;
	}
	*/

	@Column(name = "SEQ", nullable = false)
	public Integer getSeq() {
		return this.seq;
	}

	public void setSeq(Integer seq) {
		this.seq = seq;
	}

	@Column(name = "DESCRICAO", length = 200)
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Column(name = "ORIENTACOES_FATURAMENTO", length = 2000)
	public String getOrientacoesFaturamento() {
		return this.orientacoesFaturamento;
	}

	public void setOrientacoesFaturamento(String orientacoesFaturamento) {
		this.orientacoesFaturamento = orientacoesFaturamento;
	}

	@Column(name = "IND_SITUACAO", nullable = false, length=1)
	@Enumerated(EnumType.STRING)
	public DominioSituacao getIndSituacao() {
		return this.indSituacao;
	}

	public void setIndSituacao(DominioSituacao indSituacao) {
		this.indSituacao = indSituacao;
	}

	@Column(name = "MAT_CODIGO")
	public Integer getMatCodigo() {
		return this.matCodigo;
	}

	public void setMatCodigo(Integer matCodigo) {
		this.matCodigo = matCodigo;
	}

	@Column(name = "PCI_SEQ")
	public Integer getPciSeq() {
		return this.pciSeq;
	}

	public void setPciSeq(Integer pciSeq) {
		this.pciSeq = pciSeq;
	}

	@Column(name = "PED_SEQ")
	public Short getPedSeq() {
		return this.pedSeq;
	}

	public void setPedSeq(Short pedSeq) {
		this.pedSeq = pedSeq;
	}

	@Column(name = "CSA_CODIGO", length = 2)
	public String getCsaCodigo() {
		return this.csaCodigo;
	}

	public void setCsaCodigo(String csaCodigo) {
		this.csaCodigo = csaCodigo;
	}

	@Column(name = "PHE_CODIGO", length = 2)
	public String getPheCodigo() {
		return this.pheCodigo;
	}

	public void setPheCodigo(String pheCodigo) {
		this.pheCodigo = pheCodigo;
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

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Column(name = "EMA_EXA_SIGLA", length = 5)
	public String getEmaExaSigla() {
		return this.emaExaSigla;
	}

	public void setEmaExaSigla(String emaExaSigla) {
		this.emaExaSigla = emaExaSigla;
	}

	@Column(name = "EMA_MAN_SEQ")
	public Integer getEmaManSeq() {
		return this.emaManSeq;
	}

	public void setEmaManSeq(Integer emaManSeq) {
		this.emaManSeq = emaManSeq;
	}

	@Column(name = "COMPONENTE_IRRADIADO", length = 1)
	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getComponenteIrradiado() {
		return this.componenteIrradiado;
	}

	public void setComponenteIrradiado(Boolean componenteIrradiado) {
		this.componenteIrradiado = componenteIrradiado;
	}

	@Column(name = "TIPO_NUTR_PARENTERAL", length = 1)
	@Enumerated(EnumType.STRING)
	public DominioTipoNutricaoParenteral getTipoNutrParenteral() {
		return this.tipoNutrParenteral;
	}

	public void setTipoNutrParenteral(DominioTipoNutricaoParenteral tipoNutrParenteral) {
		this.tipoNutrParenteral = tipoNutrParenteral;
	}

	@Column(name = "IND_ORIGEM_PRESC")
	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getIndOrigemPresc() {
		return this.indOrigemPresc;
	}

	public void setIndOrigemPresc(Boolean indOrigemPresc) {
		this.indOrigemPresc = indOrigemPresc;
	}

	@Column(name = "TIPO_OPER_CONVERSAO", length = 1)
	public String getTipoOperConversao() {
		return this.tipoOperConversao;
	}

	public void setTipoOperConversao(String tipoOperConversao) {
		this.tipoOperConversao = tipoOperConversao;
	}

	@Column(name = "FATOR_CONVERSAO", precision = 17, scale = 17)
	public BigDecimal getFatorConversao() {
		return this.fatorConversao;
	}

	public void setFatorConversao(BigDecimal fatorConversao) {
		this.fatorConversao = fatorConversao;
	}

	@Column(name = "PHI_SEQ")
	public Integer getPhiSeq() {
		return this.phiSeq;
	}

	public void setPhiSeq(Integer phiSeq) {
		this.phiSeq = phiSeq;
	}

	public enum Fields {

		/*SEQ_JN("seqJn"),
		JN_USER("jnUser"),
		JN_DATE_TIME("jnDateTime"),
		JN_OPERATION("jnOperation"),*/
		SEQ("seq"),
		DESCRICAO("descricao"),
		ORIENTACOES_FATURAMENTO("orientacoesFaturamento"),
		IND_SITUACAO("indSituacao"),
		MAT_CODIGO("matCodigo"),
		PCI_SEQ("pciSeq"),
		PED_SEQ("pedSeq"),
		CSA_CODIGO("csaCodigo"),
		PHE_CODIGO("pheCodigo"),
		SER_MATRICULA("serMatricula"),
		SER_VIN_CODIGO("serVinCodigo"),
		CRIADO_EM("criadoEm"),
		EMA_EXA_SIGLA("emaExaSigla"),
		EMA_MAN_SEQ("emaManSeq"),
		COMPONENTE_IRRADIADO("componenteIrradiado"),
		TIPO_NUTR_PARENTERAL("tipoNutrParenteral"),
		IND_ORIGEM_PRESC("indOrigemPresc"),
		TIPO_OPER_CONVERSAO("tipoOperConversao"),
		FATOR_CONVERSAO("fatorConversao"),
		PHI_SEQ("phiSeq");

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