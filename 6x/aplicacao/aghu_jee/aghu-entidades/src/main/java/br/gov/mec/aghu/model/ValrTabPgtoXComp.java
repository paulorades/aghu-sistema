package br.gov.mec.aghu.model;

// Generated 05/05/2010 10:37:30 by Hibernate Tools 3.2.5.Beta

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
import javax.persistence.UniqueConstraint;


import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * ValrTabPgtoXComp generated by hbm2java
 */
@Entity
@Table(name = "VALR_TAB_PGTO_X_COMP", schema = "CONV", uniqueConstraints = @UniqueConstraint(columnNames = {
		"TPTAB_COD", "TABPAG_COD", "CPPGTO_NRO" }))
public class ValrTabPgtoXComp extends BaseEntityId<ValrTabPgtoXCompId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3527048520003759383L;
	private ValrTabPgtoXCompId id;
	private TabPgto tabPgto;
	private CompTabPgto compTabPgto;

	public ValrTabPgtoXComp() {
	}

	public ValrTabPgtoXComp(ValrTabPgtoXCompId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "tptabCod", column = @Column(name = "TPTAB_COD", nullable = false, precision = 3, scale = 0)),
			@AttributeOverride(name = "tabpagCod", column = @Column(name = "TABPAG_COD", nullable = false, precision = 10, scale = 0)),
			@AttributeOverride(name = "cppgtoNro", column = @Column(name = "CPPGTO_NRO", nullable = false, precision = 3, scale = 0)),
			@AttributeOverride(name = "qtdeCsh", column = @Column(name = "QTDE_CSH", nullable = false, precision = 22, scale = 12)),
			@AttributeOverride(name = "qtdeChMat", column = @Column(name = "QTDE_CH_MAT", precision = 22, scale = 12)),
			@AttributeOverride(name = "qtdeCshProf", column = @Column(name = "QTDE_CSH_PROF", precision = 22, scale = 12)) })
	public ValrTabPgtoXCompId getId() {
		return this.id;
	}

	public void setId(ValrTabPgtoXCompId id) {
		this.id = id;
	}
	

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns( {
			@JoinColumn(name = "TABPAG_COD", referencedColumnName = "COD", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "TPTAB_COD", referencedColumnName = "TPTAB_COD", nullable = false, insertable = false, updatable = false) })
	public TabPgto getTabPgto() {
		return this.tabPgto;
	}

	public void setTabPgto(TabPgto tabPgto) {
		this.tabPgto = tabPgto;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns( {
			@JoinColumn(name = "CPPGTO_NRO", referencedColumnName = "NRO", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "TPTAB_COD", referencedColumnName = "TPTAB_COD", nullable = false, insertable = false, updatable = false) })
	public CompTabPgto getCompTabPgto() {
		return compTabPgto;
	}

	public void setCompTabPgto(CompTabPgto compTabPgto) {
		this.compTabPgto = compTabPgto;
	}
	
	
	

	public enum Fields {

		ID("id"),
		TAB_PGTO("tabPgto"),
		COMP_TAB_PGTO("compTabPgto");

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
		if (!(obj instanceof ValrTabPgtoXComp)) {
			return false;
		}
		ValrTabPgtoXComp other = (ValrTabPgtoXComp) obj;
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
