package br.gov.mec.aghu.model;

// Generated 25/01/2012 15:45:43 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


import org.hibernate.annotations.Immutable;
import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.model.BaseJournal;

/**
 * AelCampoLaudoLwsJn generated by hbm2java
 */
@Entity
@Table(name = "AEL_CAMPO_LAUDO_LWS_JN", schema = "AGH")
@Immutable
public class AelCampoLaudoLwsJn extends BaseJournal {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2229349389051345793L;
/* ATUALIZADOR JOURNALS - PROPERTIES	private Long seqJn;
	private String jnUser;
	private Date jnDateTime;
	private String jnOperation;*/
	private Integer calSeq;
	private Short equSeq;
	private String codigo;
	private Short seqp;
	private String indFalta;


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
	@SequenceGenerator(name="ael_campo_laudo_lws_jn_seqjn_generator", sequenceName="AGH.AEL_CLL_JN_SEQ", allocationSize = 1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ael_campo_laudo_lws_jn_seqjn_generator")
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

	@Column(name = "CAL_SEQ", nullable = false)
	public Integer getCalSeq() {
		return this.calSeq;
	}

	public void setCalSeq(Integer calSeq) {
		this.calSeq = calSeq;
	}

	@Column(name = "EQU_SEQ", nullable = false)
	public Short getEquSeq() {
		return this.equSeq;
	}

	public void setEquSeq(Short equSeq) {
		this.equSeq = equSeq;
	}

	@Column(name = "CODIGO", nullable = false, length = 30)
	@Length(max = 30)
	public String getCodigo() {
		return this.codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	@Column(name = "SEQP", nullable = false)
	public Short getSeqp() {
		return this.seqp;
	}

	public void setSeqp(Short seqp) {
		this.seqp = seqp;
	}

	@Column(name = "IND_FALTA", length = 1)
	@Length(max = 1)
	public String getIndFalta() {
		return this.indFalta;
	}

	public void setIndFalta(String indFalta) {
		this.indFalta = indFalta;
	}

	public enum Fields {

	/* ATUALIZADOR JOURNALS - Fields	SEQ_JN("seqJn"),
		JN_USER("jnUser"),
		JN_DATE_TIME("jnDateTime"),
		JN_OPERATION("jnOperation"),*/
		CAL_SEQ("calSeq"),
		EQU_SEQ("equSeq"),
		CODIGO("codigo"),
		SEQP("seqp"),
		IND_FALTA("indFalta");

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