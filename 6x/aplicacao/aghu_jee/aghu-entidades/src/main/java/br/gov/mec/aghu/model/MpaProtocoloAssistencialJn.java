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
 * MpaProtocoloAssistencialJn generated by hbm2java
 */
@Entity
@SequenceGenerator(name="mpaPtaJnSeq", sequenceName="AGH.MPA_PTA_JN_SEQ", allocationSize = 1)
@Table(name = "MPA_PROTOCOLO_ASSISTENCIAIS_JN", schema = "AGH")
@Immutable
public class MpaProtocoloAssistencialJn extends BaseJournal {

/**
	 * 
	 */
	private static final long serialVersionUID = 7736524681443474681L;
	/* ATUALIZADOR JOURNALS - PROPERTIES	private Long seqJn;
	private String jnUser;
	private Date jnDateTime;
	private String jnOperation;*/
	private Short seq;
	private Date criadoEm;
	private String titulo;
	private Integer serMatricula;
	private Short serVinCodigo;
	private String tipo;
	private Short espSeq;
	private String ptaSeq;
	private String abreviatura;
	private Short phiSeq;
	private String sigla;

	public MpaProtocoloAssistencialJn() {
	}

	public MpaProtocoloAssistencialJn(Long seqJn, String jnUser, Date jnDateTime, String jnOperation, Short seq) {
	/* ATUALIZADOR JOURNALS - contrutor	this.seqJn = seqJn;
		this.jnUser = jnUser;
		this.jnDateTime = jnDateTime;
		this.jnOperation = jnOperation;*/
		this.seq = seq;
	}

	public MpaProtocoloAssistencialJn(Long seqJn, String jnUser, Date jnDateTime, String jnOperation, Short seq, Date criadoEm,
			String titulo, Integer serMatricula, Short serVinCodigo, String tipo, Short espSeq, String ptaSeq, String abreviatura,
			Short phiSeq, String sigla) {
	/* ATUALIZADOR JOURNALS - contrutor	this.seqJn = seqJn;
		this.jnUser = jnUser;
		this.jnDateTime = jnDateTime;
		this.jnOperation = jnOperation;*/
		this.seq = seq;
		this.criadoEm = criadoEm;
		this.titulo = titulo;
		this.serMatricula = serMatricula;
		this.serVinCodigo = serVinCodigo;
		this.tipo = tipo;
		this.espSeq = espSeq;
		this.ptaSeq = ptaSeq;
		this.abreviatura = abreviatura;
		this.phiSeq = phiSeq;
		this.sigla = sigla;
	}

	// ATUALIZADOR JOURNALS - ID
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "mpaPtaJnSeq")
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

	@Column(name = "SEQ", nullable = false)
	public Short getSeq() {
		return this.seq;
	}

	public void setSeq(Short seq) {
		this.seq = seq;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Column(name = "TITULO", length = 120)
	@Length(max = 120)
	public String getTitulo() {
		return this.titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
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

	@Column(name = "TIPO", length = 1)
	@Length(max = 1)
	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Column(name = "ESP_SEQ")
	public Short getEspSeq() {
		return this.espSeq;
	}

	public void setEspSeq(Short espSeq) {
		this.espSeq = espSeq;
	}

	@Column(name = "PTA_SEQ", length = 240)
	@Length(max = 240)
	public String getPtaSeq() {
		return this.ptaSeq;
	}

	public void setPtaSeq(String ptaSeq) {
		this.ptaSeq = ptaSeq;
	}

	@Column(name = "ABREVIATURA", length = 240)
	@Length(max = 240)
	public String getAbreviatura() {
		return this.abreviatura;
	}

	public void setAbreviatura(String abreviatura) {
		this.abreviatura = abreviatura;
	}

	@Column(name = "PHI_SEQ")
	public Short getPhiSeq() {
		return this.phiSeq;
	}

	public void setPhiSeq(Short phiSeq) {
		this.phiSeq = phiSeq;
	}

	@Column(name = "SIGLA", length = 5)
	@Length(max = 5)
	public String getSigla() {
		return this.sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public enum Fields {

	/* ATUALIZADOR JOURNALS - Fields	SEQ_JN("seqJn"),
		JN_USER("jnUser"),
		JN_DATE_TIME("jnDateTime"),
		JN_OPERATION("jnOperation"),*/
		SEQ("seq"),
		CRIADO_EM("criadoEm"),
		TITULO("titulo"),
		SER_MATRICULA("serMatricula"),
		SER_VIN_CODIGO("serVinCodigo"),
		TIPO("tipo"),
		ESP_SEQ("espSeq"),
		PTA_SEQ("ptaSeq"),
		ABREVIATURA("abreviatura"),
		PHI_SEQ("phiSeq"),
		SIGLA("sigla");

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