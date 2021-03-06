package br.gov.mec.aghu.model;

// Generated 03/02/2011 17:20:07 by Hibernate Tools 3.2.5.Beta

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;


import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * VMpmMdtosId generated by hbm2java
 */
@Embeddable
public class VMpmMdtosId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7550404587050796444L;
	private Integer mdbSeq;
	private Integer seq;
	private Short tpFrequencia;
	private String viaAdministracao;
	private Short tpVelocid;
	private String indSeNecessario;
	private Short frequencia;
	private Date hrInicioAdm;
	private BigDecimal gotejo;
	private Byte qtdeCorrer;
	private String observacao;
	private Integer matCodigo;
	private Integer seqItem;
	private Integer fdsDose;
	private BigDecimal dose;

	public VMpmMdtosId() {
	}

	public VMpmMdtosId(Integer mdbSeq, Integer seq, Short tpFrequencia,
			String viaAdministracao, String indSeNecessario, Integer matCodigo,
			Integer seqItem, Integer fdsDose, BigDecimal dose) {
		this.mdbSeq = mdbSeq;
		this.seq = seq;
		this.tpFrequencia = tpFrequencia;
		this.viaAdministracao = viaAdministracao;
		this.indSeNecessario = indSeNecessario;
		this.matCodigo = matCodigo;
		this.seqItem = seqItem;
		this.fdsDose = fdsDose;
		this.dose = dose;
	}

	public VMpmMdtosId(Integer mdbSeq, Integer seq, Short tpFrequencia,
			String viaAdministracao, Short tpVelocid, String indSeNecessario,
			Short frequencia, Date hrInicioAdm, BigDecimal gotejo,
			Byte qtdeCorrer, String observacao, Integer matCodigo, Integer seqItem,
			Integer fdsDose, BigDecimal dose) {
		this.mdbSeq = mdbSeq;
		this.seq = seq;
		this.tpFrequencia = tpFrequencia;
		this.viaAdministracao = viaAdministracao;
		this.tpVelocid = tpVelocid;
		this.indSeNecessario = indSeNecessario;
		this.frequencia = frequencia;
		this.hrInicioAdm = hrInicioAdm;
		this.gotejo = gotejo;
		this.qtdeCorrer = qtdeCorrer;
		this.observacao = observacao;
		this.matCodigo = matCodigo;
		this.seqItem = seqItem;
		this.fdsDose = fdsDose;
		this.dose = dose;
	}

	@Column(name = "MDB_SEQ", nullable = false, precision = 5, scale = 0)
	public Integer getMdbSeq() {
		return this.mdbSeq;
	}

	public void setMdbSeq(Integer mdbSeq) {
		this.mdbSeq = mdbSeq;
	}

	@Column(name = "SEQ", nullable = false, precision = 8, scale = 0)
	public Integer getSeq() {
		return this.seq;
	}

	public void setSeq(Integer seq) {
		this.seq = seq;
	}

	@Column(name = "TP_FREQUENCIA", nullable = false, precision = 4, scale = 0)
	public Short getTpFrequencia() {
		return this.tpFrequencia;
	}

	public void setTpFrequencia(Short tpFrequencia) {
		this.tpFrequencia = tpFrequencia;
	}

	@Column(name = "VIA_ADMINISTRACAO", nullable = false, length = 2)
	@Length(max = 2)
	public String getViaAdministracao() {
		return this.viaAdministracao;
	}

	public void setViaAdministracao(String viaAdministracao) {
		this.viaAdministracao = viaAdministracao;
	}

	@Column(name = "TP_VELOCID", precision = 3, scale = 0)
	public Short getTpVelocid() {
		return this.tpVelocid;
	}

	public void setTpVelocid(Short tpVelocid) {
		this.tpVelocid = tpVelocid;
	}

	@Column(name = "IND_SE_NECESSARIO", nullable = false, length = 1)
	@Length(max = 1)
	public String getIndSeNecessario() {
		return this.indSeNecessario;
	}

	public void setIndSeNecessario(String indSeNecessario) {
		this.indSeNecessario = indSeNecessario;
	}

	@Column(name = "FREQUENCIA", precision = 3, scale = 0)
	public Short getFrequencia() {
		return this.frequencia;
	}

	public void setFrequencia(Short frequencia) {
		this.frequencia = frequencia;
	}

	@Column(name = "HR_INICIO_ADM", length = 7)
	public Date getHrInicioAdm() {
		return this.hrInicioAdm;
	}

	public void setHrInicioAdm(Date hrInicioAdm) {
		this.hrInicioAdm = hrInicioAdm;
	}

	@Column(name = "GOTEJO", precision = 5)
	public BigDecimal getGotejo() {
		return this.gotejo;
	}

	public void setGotejo(BigDecimal gotejo) {
		this.gotejo = gotejo;
	}

	@Column(name = "QTDE_CORRER", precision = 2, scale = 0)
	public Byte getQtdeCorrer() {
		return this.qtdeCorrer;
	}

	public void setQtdeCorrer(Byte qtdeCorrer) {
		this.qtdeCorrer = qtdeCorrer;
	}

	@Column(name = "OBSERVACAO", length = 240)
	@Length(max = 240)
	public String getObservacao() {
		return this.observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	@Column(name = "MAT_CODIGO", nullable = false, precision = 6, scale = 0)
	public Integer getMatCodigo() {
		return this.matCodigo;
	}

	public void setMatCodigo(Integer matCodigo) {
		this.matCodigo = matCodigo;
	}

	@Column(name = "SEQ_ITEM", nullable = false, precision = 5, scale = 0)
	public Integer getSeqItem() {
		return this.seqItem;
	}

	public void setSeqItem(Integer seqItem) {
		this.seqItem = seqItem;
	}

	@Column(name = "FDS_DOSE", nullable = false, precision = 6, scale = 0)
	public Integer getFdsDose() {
		return this.fdsDose;
	}

	public void setFdsDose(Integer fdsDose) {
		this.fdsDose = fdsDose;
	}

	@Column(name = "DOSE", nullable = false, precision = 14, scale = 4)
	public BigDecimal getDose() {
		return this.dose;
	}

	public void setDose(BigDecimal dose) {
		this.dose = dose;
	}
	

	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		HashCodeBuilder umHashCodeBuilder = new HashCodeBuilder();
		umHashCodeBuilder.append(this.getSeq());
		umHashCodeBuilder.append(this.getObservacao());
		umHashCodeBuilder.append(this.getViaAdministracao());
		umHashCodeBuilder.append(this.getMatCodigo());
		umHashCodeBuilder.append(this.getDose());
		umHashCodeBuilder.append(this.getFrequencia());
		umHashCodeBuilder.append(this.getMdbSeq());
		umHashCodeBuilder.append(this.getTpFrequencia());
		umHashCodeBuilder.append(this.getTpVelocid());
		umHashCodeBuilder.append(this.getIndSeNecessario());
		umHashCodeBuilder.append(this.getHrInicioAdm());
		umHashCodeBuilder.append(this.getGotejo());
		umHashCodeBuilder.append(this.getQtdeCorrer());
		umHashCodeBuilder.append(this.getSeqItem());
		umHashCodeBuilder.append(this.getFdsDose());
		return umHashCodeBuilder.toHashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof VMpmMdtosId)) {
			return false;
		}
		VMpmMdtosId other = (VMpmMdtosId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getSeq(), other.getSeq());
		umEqualsBuilder.append(this.getObservacao(), other.getObservacao());
		umEqualsBuilder.append(this.getViaAdministracao(), other.getViaAdministracao());
		umEqualsBuilder.append(this.getMatCodigo(), other.getMatCodigo());
		umEqualsBuilder.append(this.getDose(), other.getDose());
		umEqualsBuilder.append(this.getFrequencia(), other.getFrequencia());
		umEqualsBuilder.append(this.getMdbSeq(), other.getMdbSeq());
		umEqualsBuilder.append(this.getTpFrequencia(), other.getTpFrequencia());
		umEqualsBuilder.append(this.getTpVelocid(), other.getTpVelocid());
		umEqualsBuilder.append(this.getIndSeNecessario(), other.getIndSeNecessario());
		umEqualsBuilder.append(this.getHrInicioAdm(), other.getHrInicioAdm());
		umEqualsBuilder.append(this.getGotejo(), other.getGotejo());
		umEqualsBuilder.append(this.getQtdeCorrer(), other.getQtdeCorrer());
		umEqualsBuilder.append(this.getSeqItem(), other.getSeqItem());
		umEqualsBuilder.append(this.getFdsDose(), other.getFdsDose());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}
