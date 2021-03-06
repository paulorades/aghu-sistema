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
import javax.persistence.Version;

import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntitySeq;

/**
 * FcuContrProcessoMensal generated by hbm2java
 */
@Entity
@SequenceGenerator(name="fcuCpmSq1", sequenceName="AGH.FCU_CPM_SQ1", allocationSize = 1)
@Table(name = "FCU_CONTR_PROCESSO_MENSAIS", schema = "AGH")
public class FcuContrProcessoMensal extends BaseEntitySeq<Integer> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8240814336944485435L;
	private Integer seq;
	private Integer version;
	private String processo;
	private Date dtCompetencia;
	private String procedure;
	private Date criadoEm;

	public FcuContrProcessoMensal() {
	}

	public FcuContrProcessoMensal(Integer seq) {
		this.seq = seq;
	}

	public FcuContrProcessoMensal(Integer seq, String processo, Date dtCompetencia, String procedure, Date criadoEm) {
		this.seq = seq;
		this.processo = processo;
		this.dtCompetencia = dtCompetencia;
		this.procedure = procedure;
		this.criadoEm = criadoEm;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "fcuCpmSq1")
	@Column(name = "SEQ", unique = true, nullable = false)
	public Integer getSeq() {
		return this.seq;
	}

	public void setSeq(Integer seq) {
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

	@Column(name = "PROCESSO", length = 100)
	@Length(max = 100)
	public String getProcesso() {
		return this.processo;
	}

	public void setProcesso(String processo) {
		this.processo = processo;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_COMPETENCIA", length = 29)
	public Date getDtCompetencia() {
		return this.dtCompetencia;
	}

	public void setDtCompetencia(Date dtCompetencia) {
		this.dtCompetencia = dtCompetencia;
	}

	@Column(name = "PROCEDURE", length = 45)
	@Length(max = 45)
	public String getProcedure() {
		return this.procedure;
	}

	public void setProcedure(String procedure) {
		this.procedure = procedure;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	public enum Fields {

		SEQ("seq"),
		VERSION("version"),
		PROCESSO("processo"),
		DT_COMPETENCIA("dtCompetencia"),
		PROCEDURE("procedure"),
		CRIADO_EM("criadoEm");

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
		if (!(obj instanceof FcuContrProcessoMensal)) {
			return false;
		}
		FcuContrProcessoMensal other = (FcuContrProcessoMensal) obj;
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
