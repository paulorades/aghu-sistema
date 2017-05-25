package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.dominio.DominioSimNao;
import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * MamTrgSinalVital generated by hbm2java
 */
@SuppressWarnings({"PMD.AghuUsoIndevidoDaEnumDominioSimNaoEntity"})
@Entity
@Table(name = "MAM_TRG_SINAL_VITAIS", schema = "AGH")
public class MamTrgSinalVital extends BaseEntityId<MamTrgSinalVitalId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2987341329816547571L;
	private MamTrgSinalVitalId id;
	private Integer version;
	private String complemento;
	private Date dthrInformada;
	private Date dthrConsistenciaOk;
	private String indConsistenciaOk;
	private DominioSimNao indUso;
	private Date criadoEm;
	private MamItemSinalVital mamItemSinalVital;
	private String micNome;
	private Integer serMatricula;
	private Short serVinCodigo;

	public MamTrgSinalVital() {
	}



	public MamTrgSinalVital(MamTrgSinalVitalId id, Integer version,
			String complemento, Date dthrInformada, Date dthrConsistenciaOk,
			String indConsistenciaOk, DominioSimNao indUso, Date criadoEm,
			MamItemSinalVital mamItemSinalVital, String micNome,
			Integer serMatricula, Short serVinCodigo) {
		super();
		this.id = id;
		this.version = version;
		this.complemento = complemento;
		this.dthrInformada = dthrInformada;
		this.dthrConsistenciaOk = dthrConsistenciaOk;
		this.indConsistenciaOk = indConsistenciaOk;
		this.indUso = indUso;
		this.criadoEm = criadoEm;
		this.mamItemSinalVital = mamItemSinalVital;
		this.micNome = micNome;
		this.serMatricula = serMatricula;
		this.serVinCodigo = serVinCodigo;
	}



	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "trgSeq", column = @Column(name = "TRG_SEQ", nullable = false)),
			@AttributeOverride(name = "seqp", column = @Column(name = "SEQP", nullable = false)) })
	public MamTrgSinalVitalId getId() {
		return this.id;
	}

	public void setId(MamTrgSinalVitalId id) {
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

	@Column(name = "COMPLEMENTO", length = 2000)
	@Length(max = 2000)
	public String getComplemento() {
		return this.complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DTHR_INFORMADA", nullable = false, length = 29)
	public Date getDthrInformada() {
		return this.dthrInformada;
	}

	public void setDthrInformada(Date dthrInformada) {
		this.dthrInformada = dthrInformada;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DTHR_CONSISTENCIA_OK", length = 29)
	public Date getDthrConsistenciaOk() {
		return this.dthrConsistenciaOk;
	}

	public void setDthrConsistenciaOk(Date dthrConsistenciaOk) {
		this.dthrConsistenciaOk = dthrConsistenciaOk;
	}

	@Column(name = "IND_CONSISTENCIA_OK", nullable = false, length = 1)
	@Length(max = 1)
	public String getIndConsistenciaOk() {
		return this.indConsistenciaOk;
	}

	public void setIndConsistenciaOk(String indConsistenciaOk) {
		this.indConsistenciaOk = indConsistenciaOk;
	}

	@Column(name = "IND_USO", nullable = false, length = 1)
	@Enumerated(EnumType.STRING)
	public DominioSimNao getIndUso() {
		return this.indUso;
	}

	public void setIndUso(DominioSimNao indUso) {
		this.indUso = indUso;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", nullable = false, length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@OneToOne
	@JoinColumn(name="SVI_SEQ",referencedColumnName="SEQ", nullable = false)
	public MamItemSinalVital getMamItemSinalVital() {
		return mamItemSinalVital;
	}

	public void setMamItemSinalVital(MamItemSinalVital mamItemSinalVital) {
		this.mamItemSinalVital = mamItemSinalVital;
	}
	
	@Column(name = "MIC_NOME", length = 50)
	@Length(max = 50)
	public String getMicNome() {
		return this.micNome;
	}

	public void setMicNome(String micNome) {
		this.micNome = micNome;
	}

	@Column(name = "SER_MATRICULA", nullable = false)
	public Integer getSerMatricula() {
		return this.serMatricula;
	}

	public void setSerMatricula(Integer serMatricula) {
		this.serMatricula = serMatricula;
	}

	@Column(name = "SER_VIN_CODIGO", nullable = false)
	public Short getSerVinCodigo() {
		return this.serVinCodigo;
	}

	public void setSerVinCodigo(Short serVinCodigo) {
		this.serVinCodigo = serVinCodigo;
	}

	public enum Fields {

		ID("id"),
		VERSION("version"),
		COMPLEMENTO("complemento"),
		DTHR_INFORMADA("dthrInformada"),
		DTHR_CONSISTENCIA_OK("dthrConsistenciaOk"),
		IND_CONSISTENCIA_OK("indConsistenciaOk"),
		IND_USO("indUso"),
		CRIADO_EM("criadoEm"),
		MIC_NOME("micNome"),
		SER_MATRICULA("serMatricula"),
		SER_VIN_CODIGO("serVinCodigo"),
		TRG_SEQ("id.trgSeq"),
		MAM_ITEM_SINAL_VITAL("mamItemSinalVital");

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
		if (!(obj instanceof MamTrgSinalVital)) {
			return false;
		}
		MamTrgSinalVital other = (MamTrgSinalVital) obj;
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