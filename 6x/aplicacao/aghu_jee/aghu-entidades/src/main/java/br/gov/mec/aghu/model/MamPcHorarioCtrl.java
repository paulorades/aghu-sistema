package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;


import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntitySeq;

/**
 * MamPcHorarioCtrl generated by hbm2java
 */
@Entity
@Table(name = "MAM_PC_HORARIO_CTRLS", schema = "AGH")
public class MamPcHorarioCtrl extends BaseEntitySeq<Long> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6910990849370530467L;
	private Long hctSeq;
	private EcpHorarioControle ecpHorarioControle;
	private MamPcIntParada mamPcIntParada;
	private Date dataHora;
	private String anotacoes;
	private Integer hrsControleSumario;
	private Set<MamPcControlePac> mamPcControlePaces = new HashSet<MamPcControlePac>(0);

	public MamPcHorarioCtrl() {
	}

	public MamPcHorarioCtrl(EcpHorarioControle ecpHorarioControle, MamPcIntParada mamPcIntParada, Date dataHora) {
		this.ecpHorarioControle = ecpHorarioControle;
		this.mamPcIntParada = mamPcIntParada;
		this.dataHora = dataHora;
	}

	public MamPcHorarioCtrl(EcpHorarioControle ecpHorarioControle, MamPcIntParada mamPcIntParada, Date dataHora,
			String anotacoes, Integer hrsControleSumario, Set<MamPcControlePac> mamPcControlePaces) {
		this.ecpHorarioControle = ecpHorarioControle;
		this.mamPcIntParada = mamPcIntParada;
		this.dataHora = dataHora;
		this.anotacoes = anotacoes;
		this.hrsControleSumario = hrsControleSumario;
		this.mamPcControlePaces = mamPcControlePaces;
	}

	@GenericGenerator(name = "generator", strategy = "foreign", parameters = @Parameter(name = "property", value = "ecpHorarioControle"))
	@Id
	@GeneratedValue(generator = "generator")
	@Column(name = "HCT_SEQ", unique = true, nullable = false)
	public Long getHctSeq() {
		return this.hctSeq;
	}

	public void setHctSeq(Long hctSeq) {
		this.hctSeq = hctSeq;
	}

	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	public EcpHorarioControle getEcpHorarioControle() {
		return this.ecpHorarioControle;
	}

	public void setEcpHorarioControle(EcpHorarioControle ecpHorarioControle) {
		this.ecpHorarioControle = ecpHorarioControle;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "PIR_ATD_SEQ", referencedColumnName = "ATD_SEQ", nullable = false),
			@JoinColumn(name = "PIR_DTHR_CRIACAO", referencedColumnName = "DTHR_CRIACAO", nullable = false) })
	public MamPcIntParada getMamPcIntParada() {
		return this.mamPcIntParada;
	}

	public void setMamPcIntParada(MamPcIntParada mamPcIntParada) {
		this.mamPcIntParada = mamPcIntParada;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DATA_HORA", nullable = false, length = 29)
	public Date getDataHora() {
		return this.dataHora;
	}

	public void setDataHora(Date dataHora) {
		this.dataHora = dataHora;
	}

	@Column(name = "ANOTACOES", length = 250)
	@Length(max = 250)
	public String getAnotacoes() {
		return this.anotacoes;
	}

	public void setAnotacoes(String anotacoes) {
		this.anotacoes = anotacoes;
	}

	@Column(name = "HRS_CONTROLE_SUMARIO")
	public Integer getHrsControleSumario() {
		return this.hrsControleSumario;
	}

	public void setHrsControleSumario(Integer hrsControleSumario) {
		this.hrsControleSumario = hrsControleSumario;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "mamPcHorarioCtrl")
	public Set<MamPcControlePac> getMamPcControlePaces() {
		return this.mamPcControlePaces;
	}

	public void setMamPcControlePaces(Set<MamPcControlePac> mamPcControlePaces) {
		this.mamPcControlePaces = mamPcControlePaces;
	}

	public enum Fields {

		HCT_SEQ("hctSeq"),
		ECP_HORARIO_CONTROLE("ecpHorarioControle"),
		MAM_PC_INT_PARADAS("mamPcIntParada"),
		DATA_HORA("dataHora"),
		ANOTACOES("anotacoes"),
		HRS_CONTROLE_SUMARIO("hrsControleSumario"),
		MAM_PC_CONTROLE_PACES("mamPcControlePaces");

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
		result = prime * result + ((getHctSeq() == null) ? 0 : getHctSeq().hashCode());
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
		if (!(obj instanceof MamPcHorarioCtrl)) {
			return false;
		}
		MamPcHorarioCtrl other = (MamPcHorarioCtrl) obj;
		if (getHctSeq() == null) {
			if (other.getHctSeq() != null) {
				return false;
			}
		} else if (!getHctSeq().equals(other.getHctSeq())) {
			return false;
		}
		return true;
	}
	// ##### GeradorEqualsHashCodeMain #####
 
 @Transient public Long getSeq(){ return this.getHctSeq();} 
 public void setSeq(Long seq){ this.setHctSeq(seq);}
}