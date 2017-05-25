package br.gov.mec.aghu.model;

// Generated 15/04/2011 14:22:18 by Hibernate Tools 3.4.0.CR1

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


import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * MpaPopAgendas generated by hbm2java
 */

@Entity
@Table(name = "MPA_POP_AGENDAS", schema = "AGH")
public class MpaPopAgendas extends BaseEntityId<MpaPopAgendasId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6945996863090872451L;
	private MpaPopAgendasId id;
	private Integer version;
	private MpaPopVersoes mpaPopVersoes;
	private AghEspecialidades especialidade;
	private Date criadoEm;
	private RapServidores servidor;

	public MpaPopAgendas() {
	}

	public MpaPopAgendas(MpaPopAgendasId id, MpaPopVersoes mpaPopVersoes,
			AghEspecialidades espSeq, Date criadoEm, RapServidores serMatricula) {
		this.id = id;
		this.mpaPopVersoes = mpaPopVersoes;
		this.especialidade = espSeq;
		this.criadoEm = criadoEm;
		this.servidor = serMatricula;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "povVersao", column = @Column(name = "POV_VERSAO", nullable = false)),
			@AttributeOverride(name = "povPopSeq", column = @Column(name = "POV_POP_SEQ", nullable = false)),
			@AttributeOverride(name = "seqp", column = @Column(name = "SEQP", nullable = false)) })
	public MpaPopAgendasId getId() {
		return this.id;
	}

	public void setId(MpaPopAgendasId id) {
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
			@JoinColumn(name = "POV_VERSAO", referencedColumnName = "VERSAO", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "POV_POP_SEQ", referencedColumnName = "POP_SEQ", nullable = false, insertable = false, updatable = false) })
	public MpaPopVersoes getMpaPopVersoes() {
		return this.mpaPopVersoes;
	}

	public void setMpaPopVersoes(MpaPopVersoes mpaPopVersoes) {
		this.mpaPopVersoes = mpaPopVersoes;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ESP_SEQ")
	public AghEspecialidades getEspecialidade() {
		return especialidade;
	}
	
	public void setEspecialidade(AghEspecialidades especialidade) {
		this.especialidade = especialidade;
	}
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", nullable = false, length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA", nullable = false),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO", nullable = false) })	
	public RapServidores getServidor() {
		return servidor;
	}
	
	public void setServidor(RapServidores servidor) {
		this.servidor = servidor;
	}
	
	
	
	public enum Fields {
		ESPECIALIDADE("especialidade"),
		ESP_SEQ("especialidade.seq"),
		POV_POP_SEQ("id.povPopSeq"),
		MPA_POP_VERSOES("mpaPopVersoes");
		
		
		private String fields;

		private Fields(String fields) {
			this.fields = fields;
		}

		@Override
		public String toString() {
			return fields;
		}
	}
	
	@Override
	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (other == null) {
			return false;			
		}
		if (!(other instanceof MpaPopAgendas)) {
			return false;
		}
		MpaPopAgendas castOther = (MpaPopAgendas) other;

		return (this.getId() != null && this.getId().equals(castOther.getId()));
	}

	@Override
	public int hashCode() {
		int result = 17;

		result = 37 * result + (this.getId() != null ? this.getId().hashCode() : 0);
		
		return result;
	}
	
	
	
}