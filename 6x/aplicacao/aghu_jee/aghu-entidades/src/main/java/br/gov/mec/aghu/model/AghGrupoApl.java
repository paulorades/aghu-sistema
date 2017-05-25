package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Version;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntitySeq;

/**
 * AghGrupoApl generated by hbm2java
 */
@Entity
@SequenceGenerator(name="aghGrlSq1", sequenceName="AGH.AGH_GRL_SQ1", allocationSize = 1)
@Table(name = "AGH_GRUPO_APLS", schema = "AGH")
public class AghGrupoApl extends BaseEntitySeq<Short> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1119050423755088090L;
	private Short seq;
	private Integer version;
	private String descricao;
	private Set<AghGrupoAplic> aghGrupoAplices = new HashSet<AghGrupoAplic>(0);
	private Set<AghMicroGrupo> aghMicroGrupoes = new HashSet<AghMicroGrupo>(0);

	public AghGrupoApl() {
	}

	public AghGrupoApl(Short seq, String descricao) {
		this.seq = seq;
		this.descricao = descricao;
	}

	public AghGrupoApl(Short seq, String descricao, Set<AghGrupoAplic> aghGrupoAplices, Set<AghMicroGrupo> aghMicroGrupoes) {
		this.seq = seq;
		this.descricao = descricao;
		this.aghGrupoAplices = aghGrupoAplices;
		this.aghMicroGrupoes = aghMicroGrupoes;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "aghGrlSq1")
	@Column(name = "SEQ", unique = true, nullable = false)
	public Short getSeq() {
		return this.seq;
	}

	public void setSeq(Short seq) {
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

	@Column(name = "DESCRICAO", nullable = false, length = 240)
	@Length(max = 240)
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "aghGrupoApl")
	public Set<AghGrupoAplic> getAghGrupoAplices() {
		return this.aghGrupoAplices;
	}

	public void setAghGrupoAplices(Set<AghGrupoAplic> aghGrupoAplices) {
		this.aghGrupoAplices = aghGrupoAplices;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "aghGrupoApl")
	public Set<AghMicroGrupo> getAghMicroGrupoes() {
		return this.aghMicroGrupoes;
	}

	public void setAghMicroGrupoes(Set<AghMicroGrupo> aghMicroGrupoes) {
		this.aghMicroGrupoes = aghMicroGrupoes;
	}

	public enum Fields {

		SEQ("seq"),
		VERSION("version"),
		DESCRICAO("descricao"),
		AGH_GRUPO_APLICES("aghGrupoAplices"),
		AGH_MICRO_GRUPOES("aghMicroGrupoes");

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
		if (!(obj instanceof AghGrupoApl)) {
			return false;
		}
		AghGrupoApl other = (AghGrupoApl) obj;
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