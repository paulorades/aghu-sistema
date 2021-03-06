package br.gov.mec.aghu.model;

// Generated 07/05/2010 14:10:01 by Hibernate Tools 3.2.5.Beta

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * AinEscalasProfissionalIntId generated by hbm2java
 */
@Embeddable

public class AinEscalasProfissionalIntId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7878547184124756385L;

	private Short pecCnvCodigo;

	private Date dtInicio;

	// Matricula do Profissional da Escala
	private Integer pecPreSerMatricula;

	// Vinculo do Profissional da Escala
	private Short pecPreSerVinCodigo;

	private Short pecPreEspSeq;

	public AinEscalasProfissionalIntId() {
	}

	public AinEscalasProfissionalIntId(Short pecCnvCodigo, Date dtInicio,
			Integer pecPreSerMatricula, Short pecPreSerVinCodigo,
			Short pecPreEspSeq) {
		this.pecCnvCodigo = pecCnvCodigo;
		this.dtInicio = dtInicio;
		this.pecPreSerMatricula = pecPreSerMatricula;
		this.pecPreSerVinCodigo = pecPreSerVinCodigo;
		this.pecPreEspSeq = pecPreEspSeq;
	}

	@Column(name = "PEC_CNV_CODIGO", nullable = false, precision = 3, scale = 0)
	public Short getPecCnvCodigo() {
		return this.pecCnvCodigo;
	}

	public void setPecCnvCodigo(Short pecCnvCodigo) {
		this.pecCnvCodigo = pecCnvCodigo;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_INICIO", nullable = false, length = 7)
	public Date getDtInicio() {
		return this.dtInicio;
	}

	public void setDtInicio(Date dtInicio) {
		this.dtInicio = dtInicio;
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(this.pecCnvCodigo).append(
				this.dtInicio).append(this.pecPreEspSeq).append(
				this.pecPreSerMatricula).append(this.pecPreSerVinCodigo)
				.toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (!(other instanceof AinEscalasProfissionalIntId)) {
			return false;
		}
		AinEscalasProfissionalIntId castOther = (AinEscalasProfissionalIntId) other;
		return new EqualsBuilder().append(this.pecCnvCodigo,
				castOther.getPecCnvCodigo()).append(this.dtInicio,
				castOther.getDtInicio()).append(this.pecPreEspSeq,
				castOther.getPecPreEspSeq()).append(this.pecPreSerMatricula,
				castOther.getPecPreSerMatricula()).append(
				this.pecPreSerVinCodigo, castOther.getPecPreSerVinCodigo())
				.isEquals();
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("pecCnvCodigo",
				this.pecCnvCodigo).append("dtInicio", this.dtInicio).append(
				"pecPreEspSeq", this.pecPreEspSeq).append("pecPreSerMatricula",
				this.pecPreSerMatricula).append("pecPreSerVinCodigo",
				this.pecPreSerVinCodigo).toString();
	}

	@Column(name = "PEC_PRE_SER_MATRICULA", precision = 7, scale = 0, insertable = false, updatable = false)
	public Integer getPecPreSerMatricula() {
		return pecPreSerMatricula;
	}

	public void setPecPreSerMatricula(Integer pecPreSerMatricula) {
		this.pecPreSerMatricula = pecPreSerMatricula;
	}

	@Column(name = "PEC_PRE_SER_VIN_CODIGO", precision = 3, scale = 0, insertable = false, updatable = false)
	public Short getPecPreSerVinCodigo() {
		return pecPreSerVinCodigo;
	}

	public void setPecPreSerVinCodigo(Short pecPreSerVinCodigo) {
		this.pecPreSerVinCodigo = pecPreSerVinCodigo;
	}

	@Column(name = "PEC_PRE_ESP_SEQ", precision = 7, scale = 0, insertable = false, updatable = false)
	public Short getPecPreEspSeq() {
		return pecPreEspSeq;
	}

	public void setPecPreEspSeq(Short pecPreEspSeq) {
		this.pecPreEspSeq = pecPreEspSeq;
	}

}
