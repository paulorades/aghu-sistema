package br.gov.mec.aghu.model;

// Generated 09/11/2010 09:24:40 by Hibernate Tools 3.2.5.Beta

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;


import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.dominio.DominioMcoType;
import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * VAbsMovimentosComponentesId generated by hbm2java
 */
@Embeddable

public class VAbsMovimentoComponenteId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1123634556111969291L;
	private Integer seq;
	private DominioMcoType mcoType;
	private Integer serMatricula;
	private Short serVinCodigo;
	private Date criadoEm;
	private Date dthrMovimento;
	private Boolean indEstorno;
	private Integer mcoSeq;
	private Integer ecoBolNumero;
	private Short ecoBolBsaCodigo;
	private Date ecoBolData;
	private String ecoCsaCodigo;
	private Short ecoSeqp;
	private Short sequencia;
	private Boolean indEstorno2;

	public VAbsMovimentoComponenteId() {
		
	}

	public VAbsMovimentoComponenteId(Integer seq, DominioMcoType mcoType,
			Integer serMatricula, Short serVinCodigo, Date criadoEm,
			Date dthrMovimento, Boolean indEstorno, Integer mcoSeq,
			Integer ecoBolNumero, Short ecoBolBsaCodigo, Date ecoBolData,
			String ecoCsaCodigo, Short ecoSeqp, Short sequencia,
			Boolean indEstorno2) {
		this.seq = seq;
		this.mcoType = mcoType;
		this.serMatricula = serMatricula;
		this.serVinCodigo = serVinCodigo;
		this.criadoEm = criadoEm;
		this.dthrMovimento = dthrMovimento;
		this.indEstorno = indEstorno;
		this.mcoSeq = mcoSeq;
		this.ecoBolNumero = ecoBolNumero;
		this.ecoBolBsaCodigo = ecoBolBsaCodigo;
		this.ecoBolData = ecoBolData;
		this.ecoCsaCodigo = ecoCsaCodigo;
		this.ecoSeqp = ecoSeqp;
		this.sequencia = sequencia;
		this.indEstorno2 = indEstorno2;
	}

	@SuppressWarnings({"PMD.ExcessiveParameterList"})
	public VAbsMovimentoComponenteId(Integer seq, DominioMcoType mcoType,
			Integer serMatricula, Short serVinCodigo, Date criadoEm,
			Date dthrMovimento, Boolean indEstorno, Short indCodigo,
			Short bsaCodigo, Integer pacCodigo, Short unfSeq, Byte mreSeq,
			String observacao, Integer mcoSeq, Integer ecoBolNumero,
			Short ecoBolBsaCodigo, Date ecoBolData, String ecoCsaCodigo,
			Short ecoSeqp, Short sequencia, Boolean indEstorno2,
			Integer serMatricula2, Short serVinCodigo2, String provaCruzada,
			Byte qtdeUnidades, Short qtdeMl, String indFiltrado,
			String indIrradiado, String indLavado, String indAferese,
			Date dthrInicio, Integer serMatriculaDthrInicio,
			Short serVinCodigoDthrInicio, Date dthrFim,
			Integer serMatriculaDthrFim, Short serVinCodigoDthrFim,
			Integer aitIshSheAtdSeq, Integer aitIshSheSeq,
			Short aitIshSequencia, Short aitSequencia, Long nroPool) {
		this.seq = seq;
		this.mcoType = mcoType;
		this.serMatricula = serMatricula;
		this.serVinCodigo = serVinCodigo;
		this.criadoEm = criadoEm;
		this.dthrMovimento = dthrMovimento;
		this.indEstorno = indEstorno;
		this.mcoSeq = mcoSeq;
		this.ecoBolNumero = ecoBolNumero;
		this.ecoBolBsaCodigo = ecoBolBsaCodigo;
		this.ecoBolData = ecoBolData;
		this.ecoCsaCodigo = ecoCsaCodigo;
		this.ecoSeqp = ecoSeqp;
		this.sequencia = sequencia;
		this.indEstorno2 = indEstorno2;
	}

	@Column(name = "SEQ", nullable = false, precision = 6, scale = 0)
	public Integer getSeq() {
		return this.seq;
	}

	public void setSeq(Integer seq) {
		this.seq = seq;
	}

	@Column(name = "MCO_TYPE", nullable = false, length = 10)
	@Enumerated(EnumType.STRING)
	public DominioMcoType getMcoType() {
		return this.mcoType;
	}

	public void setMcoType(DominioMcoType mcoType) {
		this.mcoType = mcoType;
	}

	@Column(name = "SER_MATRICULA", nullable = false, precision = 7, scale = 0)
	public Integer getSerMatricula() {
		return this.serMatricula;
	}

	public void setSerMatricula(Integer serMatricula) {
		this.serMatricula = serMatricula;
	}

	@Column(name = "SER_VIN_CODIGO", nullable = false, precision = 3, scale = 0)
	public Short getSerVinCodigo() {
		return this.serVinCodigo;
	}

	public void setSerVinCodigo(Short serVinCodigo) {
		this.serVinCodigo = serVinCodigo;
	}

	@Column(name = "CRIADO_EM", nullable = false, length = 7)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Column(name = "DTHR_MOVIMENTO", nullable = false, length = 7)
	public Date getDthrMovimento() {
		return this.dthrMovimento;
	}

	public void setDthrMovimento(Date dthrMovimento) {
		this.dthrMovimento = dthrMovimento;
	}

	@Column(name = "IND_ESTORNO", nullable = false, length = 1)
	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getIndEstorno() {
		return this.indEstorno;
	}

	public void setIndEstorno(Boolean indEstorno) {
		this.indEstorno = indEstorno;
	}


	@Column(name = "MCO_SEQ", nullable = false, precision = 6, scale = 0)
	public Integer getMcoSeq() {
		return this.mcoSeq;
	}

	public void setMcoSeq(Integer mcoSeq) {
		this.mcoSeq = mcoSeq;
	}

	@Column(name = "ECO_BOL_NUMERO", nullable = false, precision = 7, scale = 0)
	public Integer getEcoBolNumero() {
		return this.ecoBolNumero;
	}

	public void setEcoBolNumero(Integer ecoBolNumero) {
		this.ecoBolNumero = ecoBolNumero;
	}

	@Column(name = "ECO_BOL_BSA_CODIGO", nullable = false, precision = 3, scale = 0)
	public Short getEcoBolBsaCodigo() {
		return this.ecoBolBsaCodigo;
	}

	public void setEcoBolBsaCodigo(Short ecoBolBsaCodigo) {
		this.ecoBolBsaCodigo = ecoBolBsaCodigo;
	}

	@Column(name = "ECO_BOL_DATA", nullable = false, length = 7)
	public Date getEcoBolData() {
		return this.ecoBolData;
	}

	public void setEcoBolData(Date ecoBolData) {
		this.ecoBolData = ecoBolData;
	}

	@Column(name = "ECO_CSA_CODIGO", nullable = false, length = 2)
	@Length(max = 2)
	public String getEcoCsaCodigo() {
		return this.ecoCsaCodigo;
	}

	public void setEcoCsaCodigo(String ecoCsaCodigo) {
		this.ecoCsaCodigo = ecoCsaCodigo;
	}

	@Column(name = "ECO_SEQP", nullable = false, precision = 3, scale = 0)
	public Short getEcoSeqp() {
		return this.ecoSeqp;
	}

	public void setEcoSeqp(Short ecoSeqp) {
		this.ecoSeqp = ecoSeqp;
	}

	@Column(name = "SEQUENCIA", nullable = false, precision = 3, scale = 0)
	public Short getSequencia() {
		return this.sequencia;
	}

	public void setSequencia(Short sequencia) {
		this.sequencia = sequencia;
	}

	@Column(name = "IND_ESTORNO2", nullable = false, length = 1)
	@Length(max = 1)
	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getIndEstorno2() {
		return this.indEstorno2;
	}

	public void setIndEstorno2(Boolean indEstorno2) {
		this.indEstorno2 = indEstorno2;
	}
	

	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		HashCodeBuilder umHashCodeBuilder = new HashCodeBuilder();
		umHashCodeBuilder.append(this.getSeq());
		umHashCodeBuilder.append(this.getCriadoEm());
		umHashCodeBuilder.append(this.getSerMatricula());
		umHashCodeBuilder.append(this.getSerVinCodigo());
		umHashCodeBuilder.append(this.getIndEstorno());
		umHashCodeBuilder.append(this.getSequencia());
		umHashCodeBuilder.append(this.getDthrMovimento());
		umHashCodeBuilder.append(this.getMcoType());
		umHashCodeBuilder.append(this.getMcoSeq());
		umHashCodeBuilder.append(this.getEcoBolNumero());
		umHashCodeBuilder.append(this.getEcoBolBsaCodigo());
		umHashCodeBuilder.append(this.getEcoBolData());
		umHashCodeBuilder.append(this.getEcoCsaCodigo());
		umHashCodeBuilder.append(this.getEcoSeqp());
		umHashCodeBuilder.append(this.getIndEstorno2());
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
		if (!(obj instanceof VAbsMovimentoComponenteId)) {
			return false;
		}
		VAbsMovimentoComponenteId other = (VAbsMovimentoComponenteId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getSeq(), other.getSeq());
		umEqualsBuilder.append(this.getCriadoEm(), other.getCriadoEm());
		umEqualsBuilder.append(this.getSerMatricula(), other.getSerMatricula());
		umEqualsBuilder.append(this.getSerVinCodigo(), other.getSerVinCodigo());
		umEqualsBuilder.append(this.getIndEstorno(), other.getIndEstorno());
		umEqualsBuilder.append(this.getSequencia(), other.getSequencia());
		umEqualsBuilder.append(this.getDthrMovimento(), other.getDthrMovimento());
		umEqualsBuilder.append(this.getMcoType(), other.getMcoType());
		umEqualsBuilder.append(this.getMcoSeq(), other.getMcoSeq());
		umEqualsBuilder.append(this.getEcoBolNumero(), other.getEcoBolNumero());
		umEqualsBuilder.append(this.getEcoBolBsaCodigo(), other.getEcoBolBsaCodigo());
		umEqualsBuilder.append(this.getEcoBolData(), other.getEcoBolData());
		umEqualsBuilder.append(this.getEcoCsaCodigo(), other.getEcoCsaCodigo());
		umEqualsBuilder.append(this.getEcoSeqp(), other.getEcoSeqp());
		umEqualsBuilder.append(this.getIndEstorno2(), other.getIndEstorno2());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}
