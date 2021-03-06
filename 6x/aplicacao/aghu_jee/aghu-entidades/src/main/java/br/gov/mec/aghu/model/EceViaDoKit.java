package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;


import br.gov.mec.aghu.core.persistence.BaseEntitySeq;

/**
 * EceViaDoKit generated by hbm2java
 */
@Entity
@SequenceGenerator(name="eceVdkSq1", sequenceName="AGH.ECE_VDK_SQ1", allocationSize = 1)
@Table(name = "ECE_VIA_DO_KITS", schema = "AGH")
public class EceViaDoKit extends BaseEntitySeq<Integer> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -967039566133055764L;
	private Integer seq;
	private Integer version;
	private RapServidores rapServidores;
	private EceKit eceKit;
	private AfaViaAdministracao afaViaAdministracao;
	private Date criadoEm;
	private Set<EceKitComponente> eceKitComponentees = new HashSet<EceKitComponente>(0);

	public EceViaDoKit() {
	}

	public EceViaDoKit(Integer seq, RapServidores rapServidores, EceKit eceKit, AfaViaAdministracao afaViaAdministracao, Date criadoEm) {
		this.seq = seq;
		this.rapServidores = rapServidores;
		this.eceKit = eceKit;
		this.afaViaAdministracao = afaViaAdministracao;
		this.criadoEm = criadoEm;
	}

	public EceViaDoKit(Integer seq, RapServidores rapServidores, EceKit eceKit, AfaViaAdministracao afaViaAdministracao,
			Date criadoEm, Set<EceKitComponente> eceKitComponentees) {
		this.seq = seq;
		this.rapServidores = rapServidores;
		this.eceKit = eceKit;
		this.afaViaAdministracao = afaViaAdministracao;
		this.criadoEm = criadoEm;
		this.eceKitComponentees = eceKitComponentees;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "eceVdkSq1")
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

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA", nullable = false),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO", nullable = false) })
	public RapServidores getRapServidores() {
		return this.rapServidores;
	}

	public void setRapServidores(RapServidores rapServidores) {
		this.rapServidores = rapServidores;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "KTS_SEQ", nullable = false)
	public EceKit getEceKit() {
		return this.eceKit;
	}

	public void setEceKit(EceKit eceKit) {
		this.eceKit = eceKit;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "VAD_SIGLA", nullable = false)
	public AfaViaAdministracao getAfaViaAdministracao() {
		return this.afaViaAdministracao;
	}

	public void setAfaViaAdministracao(AfaViaAdministracao afaViaAdministracao) {
		this.afaViaAdministracao = afaViaAdministracao;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", nullable = false, length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "eceViaDoKit")
	public Set<EceKitComponente> getEceKitComponentees() {
		return this.eceKitComponentees;
	}

	public void setEceKitComponentees(Set<EceKitComponente> eceKitComponentees) {
		this.eceKitComponentees = eceKitComponentees;
	}

	public enum Fields {

		SEQ("seq"),
		VERSION("version"),
		RAP_SERVIDORES("rapServidores"),
		ECE_KITS("eceKit"),
		AFA_VIA_ADMINISTRACAO("afaViaAdministracao"),
		AFA_VIA_ADMINISTRACAO_SIGLA("afaViaAdministracao.sigla"),
		CRIADO_EM("criadoEm"),
		ECE_KIT_COMPONENTEES("eceKitComponentees");

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
		if (!(obj instanceof EceViaDoKit)) {
			return false;
		}
		EceViaDoKit other = (EceViaDoKit) obj;
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
