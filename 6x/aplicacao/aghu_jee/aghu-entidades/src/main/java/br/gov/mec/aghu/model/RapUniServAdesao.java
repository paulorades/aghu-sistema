package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * RapUniServAdesao generated by hbm2java
 */
@Entity
@Table(name = "RAP_UNI_SERV_ADESOES", schema = "AGH")
public class RapUniServAdesao extends BaseEntityId<RapUniServAdesaoId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2280211367400509668L;
	private RapUniServAdesaoId id;
	private Integer version;
	private RapServidores rapServidoresByRapSadSerFk3;
	private RapServidores rapServidoresByRapSadSerFk1;
	private RapServidores rapServidoresByRapSadSerFk2;
	private RapUniMotivoDesligamento rapUniMotivoDesligamento;
	private Date dtInicio;
	private Date dtFim;
	private String observacao;
	private Date criadoEm;
	private Date alteradoEm;
	private Integer nroTermo;
	private Set<RapUniServSubsidio> rapUniServSubsidioes = new HashSet<RapUniServSubsidio>(0);
	private Set<RapUniConsulta> rapUniConsultaes = new HashSet<RapUniConsulta>(0);
	private Set<RapUniValor> rapUniValor = new HashSet<RapUniValor>(0);
	private Set<RapUniServDependente> rapUniServDependentees = new HashSet<RapUniServDependente>(0);
	private Set<RapUniServOdonto> rapUniServOdontoes = new HashSet<RapUniServOdonto>(0);
	private Set<RapUniServCarencia> rapUniServCarenciaes = new HashSet<RapUniServCarencia>(0);
	private Set<RapUniServSos> rapUniServSoses = new HashSet<RapUniServSos>(0);
	private Set<RapUniServPlano> rapUniServPlanoes = new HashSet<RapUniServPlano>(0);

	public RapUniServAdesao() {
	}

	public RapUniServAdesao(RapUniServAdesaoId id, RapServidores rapServidoresByRapSadSerFk1,
			RapServidores rapServidoresByRapSadSerFk2, Date dtInicio, Date criadoEm) {
		this.id = id;
		this.rapServidoresByRapSadSerFk1 = rapServidoresByRapSadSerFk1;
		this.rapServidoresByRapSadSerFk2 = rapServidoresByRapSadSerFk2;
		this.dtInicio = dtInicio;
		this.criadoEm = criadoEm;
	}

	public RapUniServAdesao(RapUniServAdesaoId id, RapServidores rapServidoresByRapSadSerFk3,
			RapServidores rapServidoresByRapSadSerFk1, RapServidores rapServidoresByRapSadSerFk2,
			RapUniMotivoDesligamento rapUniMotivoDesligamento, Date dtInicio, Date dtFim, String observacao, Date criadoEm,
			Date alteradoEm, Integer nroTermo, Set<RapUniServSubsidio> rapUniServSubsidioes, Set<RapUniConsulta> rapUniConsultaes,
			Set<RapUniValor> rapUniValor, Set<RapUniServDependente> rapUniServDependentees,
			Set<RapUniServOdonto> rapUniServOdontoes, Set<RapUniServCarencia> rapUniServCarenciaes,
			Set<RapUniServSos> rapUniServSoses, Set<RapUniServPlano> rapUniServPlanoes) {
		this.id = id;
		this.rapServidoresByRapSadSerFk3 = rapServidoresByRapSadSerFk3;
		this.rapServidoresByRapSadSerFk1 = rapServidoresByRapSadSerFk1;
		this.rapServidoresByRapSadSerFk2 = rapServidoresByRapSadSerFk2;
		this.rapUniMotivoDesligamento = rapUniMotivoDesligamento;
		this.dtInicio = dtInicio;
		this.dtFim = dtFim;
		this.observacao = observacao;
		this.criadoEm = criadoEm;
		this.alteradoEm = alteradoEm;
		this.nroTermo = nroTermo;
		this.rapUniServSubsidioes = rapUniServSubsidioes;
		this.rapUniConsultaes = rapUniConsultaes;
		this.rapUniValor = rapUniValor;
		this.rapUniServDependentees = rapUniServDependentees;
		this.rapUniServOdontoes = rapUniServOdontoes;
		this.rapUniServCarenciaes = rapUniServCarenciaes;
		this.rapUniServSoses = rapUniServSoses;
		this.rapUniServPlanoes = rapUniServPlanoes;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "serMatricula", column = @Column(name = "SER_MATRICULA", nullable = false)),
			@AttributeOverride(name = "serVinCodigo", column = @Column(name = "SER_VIN_CODIGO", nullable = false)),
			@AttributeOverride(name = "seqp", column = @Column(name = "SEQP", nullable = false)) })
	public RapUniServAdesaoId getId() {
		return this.id;
	}

	public void setId(RapUniServAdesaoId id) {
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
	@JoinColumns({ @JoinColumn(name = "SER_MATRICULA_ALTERADO", referencedColumnName = "MATRICULA"),
			@JoinColumn(name = "SER_VIN_CODIGO_ALTERADO", referencedColumnName = "VIN_CODIGO") })
	public RapServidores getRapServidoresByRapSadSerFk3() {
		return this.rapServidoresByRapSadSerFk3;
	}

	public void setRapServidoresByRapSadSerFk3(RapServidores rapServidoresByRapSadSerFk3) {
		this.rapServidoresByRapSadSerFk3 = rapServidoresByRapSadSerFk3;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO", nullable = false, insertable = false, updatable = false) })
	public RapServidores getRapServidoresByRapSadSerFk1() {
		return this.rapServidoresByRapSadSerFk1;
	}

	public void setRapServidoresByRapSadSerFk1(RapServidores rapServidoresByRapSadSerFk1) {
		this.rapServidoresByRapSadSerFk1 = rapServidoresByRapSadSerFk1;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "SER_MATRICULA_CRIADO", referencedColumnName = "MATRICULA", nullable = false),
			@JoinColumn(name = "SER_VIN_CODIGO_CRIADO", referencedColumnName = "VIN_CODIGO", nullable = false) })
	public RapServidores getRapServidoresByRapSadSerFk2() {
		return this.rapServidoresByRapSadSerFk2;
	}

	public void setRapServidoresByRapSadSerFk2(RapServidores rapServidoresByRapSadSerFk2) {
		this.rapServidoresByRapSadSerFk2 = rapServidoresByRapSadSerFk2;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MDE_CODIGO")
	public RapUniMotivoDesligamento getRapUniMotivoDesligamento() {
		return this.rapUniMotivoDesligamento;
	}

	public void setRapUniMotivoDesligamento(RapUniMotivoDesligamento rapUniMotivoDesligamento) {
		this.rapUniMotivoDesligamento = rapUniMotivoDesligamento;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_INICIO", nullable = false, length = 29)
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

	@Column(name = "OBSERVACAO", length = 240)
	@Length(max = 240)
	public String getObservacao() {
		return this.observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", nullable = false, length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ALTERADO_EM", length = 29)
	public Date getAlteradoEm() {
		return this.alteradoEm;
	}

	public void setAlteradoEm(Date alteradoEm) {
		this.alteradoEm = alteradoEm;
	}

	@Column(name = "NRO_TERMO")
	public Integer getNroTermo() {
		return this.nroTermo;
	}

	public void setNroTermo(Integer nroTermo) {
		this.nroTermo = nroTermo;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "rapUniServAdesao")
	public Set<RapUniServSubsidio> getRapUniServSubsidioes() {
		return this.rapUniServSubsidioes;
	}

	public void setRapUniServSubsidioes(Set<RapUniServSubsidio> rapUniServSubsidioes) {
		this.rapUniServSubsidioes = rapUniServSubsidioes;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "rapUniServAdesao")
	public Set<RapUniConsulta> getRapUniConsultaes() {
		return this.rapUniConsultaes;
	}

	public void setRapUniConsultaes(Set<RapUniConsulta> rapUniConsultaes) {
		this.rapUniConsultaes = rapUniConsultaes;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "rapUniServAdesao")
	public Set<RapUniValor> getRapUniValor() {
		return this.rapUniValor;
	}

	public void setRapUniValor(Set<RapUniValor> rapUniValor) {
		this.rapUniValor = rapUniValor;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "rapUniServAdesao")
	public Set<RapUniServDependente> getRapUniServDependentees() {
		return this.rapUniServDependentees;
	}

	public void setRapUniServDependentees(Set<RapUniServDependente> rapUniServDependentees) {
		this.rapUniServDependentees = rapUniServDependentees;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "rapUniServAdesao")
	public Set<RapUniServOdonto> getRapUniServOdontoes() {
		return this.rapUniServOdontoes;
	}

	public void setRapUniServOdontoes(Set<RapUniServOdonto> rapUniServOdontoes) {
		this.rapUniServOdontoes = rapUniServOdontoes;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "rapUniServAdesao")
	public Set<RapUniServCarencia> getRapUniServCarenciaes() {
		return this.rapUniServCarenciaes;
	}

	public void setRapUniServCarenciaes(Set<RapUniServCarencia> rapUniServCarenciaes) {
		this.rapUniServCarenciaes = rapUniServCarenciaes;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "rapUniServAdesao")
	public Set<RapUniServSos> getRapUniServSoses() {
		return this.rapUniServSoses;
	}

	public void setRapUniServSoses(Set<RapUniServSos> rapUniServSoses) {
		this.rapUniServSoses = rapUniServSoses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "rapUniServAdesao")
	public Set<RapUniServPlano> getRapUniServPlanoes() {
		return this.rapUniServPlanoes;
	}

	public void setRapUniServPlanoes(Set<RapUniServPlano> rapUniServPlanoes) {
		this.rapUniServPlanoes = rapUniServPlanoes;
	}

	public enum Fields {

		ID("id"),
		VERSION("version"),
		RAP_SERVIDORES_BY_RAP_SAD_SER_FK3("rapServidoresByRapSadSerFk3"),
		RAP_SERVIDORES_BY_RAP_SAD_SER_FK1("rapServidoresByRapSadSerFk1"),
		RAP_SERVIDORES_BY_RAP_SAD_SER_FK2("rapServidoresByRapSadSerFk2"),
		RAP_UNI_MOTIVO_DESLIGAMENTOS("rapUniMotivoDesligamento"),
		DT_INICIO("dtInicio"),
		DT_FIM("dtFim"),
		OBSERVACAO("observacao"),
		CRIADO_EM("criadoEm"),
		ALTERADO_EM("alteradoEm"),
		NRO_TERMO("nroTermo"),
		RAP_UNI_SERV_SUBSIDIOES("rapUniServSubsidioes"),
		RAP_UNI_CONSULTAES("rapUniConsultaes"),
		RAP_UNI_VALORES("rapUniValor"),
		RAP_UNI_SERV_DEPENDENTEES("rapUniServDependentees"),
		RAP_UNI_SERV_ODONTOES("rapUniServOdontoes"),
		RAP_UNI_SERV_CARENCIAES("rapUniServCarenciaes"),
		RAP_UNI_SERV_SOSES("rapUniServSoses"),
		RAP_UNI_SERV_PLANOES("rapUniServPlanoes");

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
		if (!(obj instanceof RapUniServAdesao)) {
			return false;
		}
		RapUniServAdesao other = (RapUniServAdesao) obj;
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