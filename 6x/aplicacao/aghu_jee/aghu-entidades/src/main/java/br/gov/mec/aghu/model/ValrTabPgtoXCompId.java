package br.gov.mec.aghu.model;

// Generated 05/05/2010 10:37:30 by Hibernate Tools 3.2.5.Beta

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Embeddable;


import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * ValrTabPgtoXCompId generated by hbm2java
 */
@Embeddable
public class ValrTabPgtoXCompId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9208166271442099706L;
	private Short tptabCod;
	private Long tabpagCod;
	private Short cppgtoNro;
	private BigDecimal qtdeCsh;
	private BigDecimal qtdeChMat;
	private BigDecimal qtdeCshProf;

	public ValrTabPgtoXCompId() {
	}

	public ValrTabPgtoXCompId(Short tptabCod, Long tabpagCod, Short cppgtoNro,
			BigDecimal qtdeCsh) {
		this.tptabCod = tptabCod;
		this.tabpagCod = tabpagCod;
		this.cppgtoNro = cppgtoNro;
		this.qtdeCsh = qtdeCsh;
	}

	public ValrTabPgtoXCompId(Short tptabCod, Long tabpagCod, Short cppgtoNro,
			BigDecimal qtdeCsh, BigDecimal qtdeChMat, BigDecimal qtdeCshProf) {
		this.tptabCod = tptabCod;
		this.tabpagCod = tabpagCod;
		this.cppgtoNro = cppgtoNro;
		this.qtdeCsh = qtdeCsh;
		this.qtdeChMat = qtdeChMat;
		this.qtdeCshProf = qtdeCshProf;
	}

	@Column(name = "TPTAB_COD", nullable = false, precision = 3, scale = 0)
	public Short getTptabCod() {
		return this.tptabCod;
	}

	public void setTptabCod(Short tptabCod) {
		this.tptabCod = tptabCod;
	}

	@Column(name = "TABPAG_COD", nullable = false, precision = 10, scale = 0)
	public Long getTabpagCod() {
		return this.tabpagCod;
	}

	public void setTabpagCod(Long tabpagCod) {
		this.tabpagCod = tabpagCod;
	}

	@Column(name = "CPPGTO_NRO", nullable = false, precision = 3, scale = 0)
	public Short getCppgtoNro() {
		return this.cppgtoNro;
	}

	public void setCppgtoNro(Short cppgtoNro) {
		this.cppgtoNro = cppgtoNro;
	}

	@Column(name = "QTDE_CSH", nullable = false, precision = 22, scale = 12)
	public BigDecimal getQtdeCsh() {
		return this.qtdeCsh;
	}

	public void setQtdeCsh(BigDecimal qtdeCsh) {
		this.qtdeCsh = qtdeCsh;
	}

	@Column(name = "QTDE_CH_MAT", precision = 22, scale = 12)
	public BigDecimal getQtdeChMat() {
		return this.qtdeChMat;
	}

	public void setQtdeChMat(BigDecimal qtdeChMat) {
		this.qtdeChMat = qtdeChMat;
	}

	@Column(name = "QTDE_CSH_PROF", precision = 22, scale = 12)
	public BigDecimal getQtdeCshProf() {
		return this.qtdeCshProf;
	}

	public void setQtdeCshProf(BigDecimal qtdeCshProf) {
		this.qtdeCshProf = qtdeCshProf;
	}
	

	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		HashCodeBuilder umHashCodeBuilder = new HashCodeBuilder();
		umHashCodeBuilder.append(this.getQtdeCsh());
		umHashCodeBuilder.append(this.getQtdeCshProf());
		umHashCodeBuilder.append(this.getQtdeChMat());
		umHashCodeBuilder.append(this.getTabpagCod());
		umHashCodeBuilder.append(this.getTptabCod());
		umHashCodeBuilder.append(this.getCppgtoNro());
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
		if (!(obj instanceof ValrTabPgtoXCompId)) {
			return false;
		}
		ValrTabPgtoXCompId other = (ValrTabPgtoXCompId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getQtdeCsh(), other.getQtdeCsh());
		umEqualsBuilder.append(this.getQtdeCshProf(), other.getQtdeCshProf());
		umEqualsBuilder.append(this.getQtdeChMat(), other.getQtdeChMat());
		umEqualsBuilder.append(this.getTabpagCod(), other.getTabpagCod());
		umEqualsBuilder.append(this.getTptabCod(), other.getTptabCod());
		umEqualsBuilder.append(this.getCppgtoNro(), other.getCppgtoNro());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}