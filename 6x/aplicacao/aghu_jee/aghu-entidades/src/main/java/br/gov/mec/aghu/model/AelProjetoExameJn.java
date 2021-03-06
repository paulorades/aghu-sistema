package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


import org.hibernate.annotations.Immutable;
import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.model.BaseJournal;

/**
 * AelProjetoExameJn generated by hbm2java
 */
@Entity
@Table(name = "AEL_PROJETO_EXAMES_JN", schema = "AGH")
@Immutable
public class AelProjetoExameJn extends BaseJournal {

/**
	 * 
	 */
	private static final long serialVersionUID = -7625586920788221678L;
	/* ATUALIZADOR JOURNALS - PROPERTIES	private Long seqJn;
	private String jnUser;
	private Date jnDateTime;
	private String jnOperation;*/
	private Integer pjqSeq;
	private String emaExaSigla;
	private Integer emaManSeq;
	private Date criadoEm;
	private Short qtdePermitido;
	private Integer serMatricula;
	private Short serVinCodigo;
	private Date dtInicio;
	private Date dtFim;
	private String indSituacao;
	private Double valor;
	private String numero;
	private Short qtdeSolicitado;

	public AelProjetoExameJn() {
	}

	public AelProjetoExameJn(Long seqJn, String jnUser, Date jnDateTime, String jnOperation, Integer pjqSeq, String emaExaSigla,
			Integer emaManSeq) {
	/* ATUALIZADOR JOURNALS - contrutor	this.seqJn = seqJn;
		this.jnUser = jnUser;
		this.jnDateTime = jnDateTime;
		this.jnOperation = jnOperation;*/
		this.pjqSeq = pjqSeq;
		this.emaExaSigla = emaExaSigla;
		this.emaManSeq = emaManSeq;
	}

	public AelProjetoExameJn(Long seqJn, String jnUser, Date jnDateTime, String jnOperation, Integer pjqSeq, String emaExaSigla,
			Integer emaManSeq, Date criadoEm, Short qtdePermitido, Integer serMatricula, Short serVinCodigo, Date dtInicio, Date dtFim,
			String indSituacao, Double valor, String numero, Short qtdeSolicitado) {
	/* ATUALIZADOR JOURNALS - contrutor	this.seqJn = seqJn;
		this.jnUser = jnUser;
		this.jnDateTime = jnDateTime;
		this.jnOperation = jnOperation;*/
		this.pjqSeq = pjqSeq;
		this.emaExaSigla = emaExaSigla;
		this.emaManSeq = emaManSeq;
		this.criadoEm = criadoEm;
		this.qtdePermitido = qtdePermitido;
		this.serMatricula = serMatricula;
		this.serVinCodigo = serVinCodigo;
		this.dtInicio = dtInicio;
		this.dtFim = dtFim;
		this.indSituacao = indSituacao;
		this.valor = valor;
		this.numero = numero;
		this.qtdeSolicitado = qtdeSolicitado;
	}

	// ATUALIZADOR JOURNALS - ID
	@Id
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

	@Column(name = "PJQ_SEQ", nullable = false)
	public Integer getPjqSeq() {
		return this.pjqSeq;
	}

	public void setPjqSeq(Integer pjqSeq) {
		this.pjqSeq = pjqSeq;
	}

	@Column(name = "EMA_EXA_SIGLA", nullable = false, length = 5)
	@Length(max = 5)
	public String getEmaExaSigla() {
		return this.emaExaSigla;
	}

	public void setEmaExaSigla(String emaExaSigla) {
		this.emaExaSigla = emaExaSigla;
	}

	@Column(name = "EMA_MAN_SEQ", nullable = false)
	public Integer getEmaManSeq() {
		return this.emaManSeq;
	}

	public void setEmaManSeq(Integer emaManSeq) {
		this.emaManSeq = emaManSeq;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Column(name = "QTDE_PERMITIDO")
	public Short getQtdePermitido() {
		return this.qtdePermitido;
	}

	public void setQtdePermitido(Short qtdePermitido) {
		this.qtdePermitido = qtdePermitido;
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
	@Column(name = "DT_INICIO", length = 29)
	public Date getDtInicio() {
		return this.dtInicio;
	}

	public void setDtInicio(Date dtInicio) {
		this.dtInicio = dtInicio;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_FIM", length = 29)
	public Date getDtFim() {
		return this.dtFim;
	}

	public void setDtFim(Date dtFim) {
		this.dtFim = dtFim;
	}

	@Column(name = "IND_SITUACAO", length = 1)
	@Length(max = 1)
	public String getIndSituacao() {
		return this.indSituacao;
	}

	public void setIndSituacao(String indSituacao) {
		this.indSituacao = indSituacao;
	}

	@Column(name = "VALOR", precision = 17, scale = 17)
	public Double getValor() {
		return this.valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	@Column(name = "NUMERO", length = 20)
	@Length(max = 20)
	public String getNumero() {
		return this.numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	@Column(name = "QTDE_SOLICITADO")
	public Short getQtdeSolicitado() {
		return this.qtdeSolicitado;
	}

	public void setQtdeSolicitado(Short qtdeSolicitado) {
		this.qtdeSolicitado = qtdeSolicitado;
	}

	public enum Fields {

	/* ATUALIZADOR JOURNALS - Fields	SEQ_JN("seqJn"),
		JN_USER("jnUser"),
		JN_DATE_TIME("jnDateTime"),
		JN_OPERATION("jnOperation"),*/
		PJQ_SEQ("pjqSeq"),
		EMA_EXA_SIGLA("emaExaSigla"),
		EMA_MAN_SEQ("emaManSeq"),
		CRIADO_EM("criadoEm"),
		QTDE_PERMITIDO("qtdePermitido"),
		SER_MATRICULA("serMatricula"),
		SER_VIN_CODIGO("serVinCodigo"),
		DT_INICIO("dtInicio"),
		DT_FIM("dtFim"),
		IND_SITUACAO("indSituacao"),
		VALOR("valor"),
		NUMERO("numero"),
		QTDE_SOLICITADO("qtdeSolicitado");

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
