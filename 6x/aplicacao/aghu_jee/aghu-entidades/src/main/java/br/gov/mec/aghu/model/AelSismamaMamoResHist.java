package br.gov.mec.aghu.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntitySeq;


@Entity
@Table(name = "AEL_SISMAMA_MAMO_RES", schema = "HIST")
public class AelSismamaMamoResHist extends BaseEntitySeq<Integer> implements java.io.Serializable {
	
	private static final long serialVersionUID = 7464111060358138809L;
	
	private Integer seq;
	private Integer version;
	private AelSismamaMamoCad aelSismamaMamoCad;
	private String resposta;
	private AelItemSolicExameHist itemSolicExameHist;
	private Date criadoEm;
	private RapServidores servidor;

	public AelSismamaMamoResHist() {
	}

	public AelSismamaMamoResHist(Integer seq, AelSismamaMamoCad aelSismamaMamoCad,
			RapServidores servidor) {
		this.seq = seq;
		this.aelSismamaMamoCad = aelSismamaMamoCad;
		this.servidor = servidor;
	}

	public AelSismamaMamoResHist(Integer seq, AelSismamaMamoCad aelSismamaMamoCad,
			String resposta, Date criadoEm,
			RapServidores servidor) {
		this.seq = seq;
		this.aelSismamaMamoCad = aelSismamaMamoCad;
		this.resposta = resposta;
		this.criadoEm = criadoEm;
		this.servidor = servidor;
	}

	@Id
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
	@JoinColumn(name = "S03_CODIGO", nullable = false)
	public AelSismamaMamoCad getAelSismamaMamoCad() {
		return this.aelSismamaMamoCad;
	}

	public void setAelSismamaMamoCad(AelSismamaMamoCad aelSismamaMamoCad) {
		this.aelSismamaMamoCad = aelSismamaMamoCad;
	}

	@Column(name = "RESPOSTA", length = 1000)
	@Length(max = 1000)
	public String getResposta() {
		return this.resposta;
	}

	public void setResposta(String resposta) {
		this.resposta = resposta;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns( {
			@JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA"),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO") })
	public RapServidores getServidor() {
		return this.servidor;
	}

	public void setServidor(RapServidores servidor) {
		this.servidor = servidor;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns( {
			@JoinColumn(name = "ISE_SOE_SEQ", referencedColumnName = "SOE_SEQ", nullable = false),
			@JoinColumn(name = "ISE_SEQP", referencedColumnName = "SEQP", nullable = false) })
	public AelItemSolicExameHist getItemSolicExameHist() {
		return itemSolicExameHist;
	}

	public void setItemSolicExameHist(
			AelItemSolicExameHist itemSolicitacaoExames) {
		this.itemSolicExameHist = itemSolicitacaoExames;
	}



	public enum Fields {

		SEQ("seq"),
		AEL_SISMAMA_MAMO_CAD("aelSismamaMamoCad"),
		RESPOSTA("resposta"),
		ISE_SOE_SEQ("itemSolicExameHist.id.soeSeq"),
		ISE_SEQP("itemSolicExameHist.id.seqp"),
		CRIADO_EM("criadoEm"),
		SER_VIN_CODIGO("servidor.id.vinCodigo"),
		SER_MATRICULA("servidor.id.matricula");

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
		if (!(obj instanceof AelSismamaMamoRes)) {
			return false;
		}
		AelSismamaMamoRes other = (AelSismamaMamoRes) obj;
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
