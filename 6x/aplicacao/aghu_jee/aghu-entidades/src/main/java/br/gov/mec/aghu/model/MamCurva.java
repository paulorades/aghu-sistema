package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Version;


import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * MamCurva generated by hbm2java
 */
@Entity
@Table(name = "MAM_CURVAS", schema = "AGH")
public class MamCurva extends BaseEntityId<MamCurvaId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3296764234190513504L;
	private MamCurvaId id;
	private Integer version;
	private Double men2dp;
	private Double men1dp;
	private Double media;
	private Double mai1dp;
	private Double mai2dp;
	private Double men4dp;
	private Double men3dp;
	private Double mai4dp;
	private Double mai3dp;

	public MamCurva() {
	}

	public MamCurva(MamCurvaId id, Double men2dp, Double men1dp, Double media, Double mai1dp, Double mai2dp, Double men4dp,
			Double men3dp, Double mai4dp, Double mai3dp) {
		this.id = id;
		this.men2dp = men2dp;
		this.men1dp = men1dp;
		this.media = media;
		this.mai1dp = mai1dp;
		this.mai2dp = mai2dp;
		this.men4dp = men4dp;
		this.men3dp = men3dp;
		this.mai4dp = mai4dp;
		this.mai3dp = mai3dp;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "categoria", column = @Column(name = "CATEGORIA", nullable = false, length = 1)),
			@AttributeOverride(name = "tipo", column = @Column(name = "TIPO", nullable = false, length = 3)),
			@AttributeOverride(name = "sexo", column = @Column(name = "SEXO", nullable = false, length = 1)),
			@AttributeOverride(name = "idade", column = @Column(name = "IDADE", nullable = false, precision = 17, scale = 17)) })
	public MamCurvaId getId() {
		return this.id;
	}

	public void setId(MamCurvaId id) {
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

	@Column(name = "MEN2DP", nullable = false, precision = 17, scale = 17)
	public Double getMen2dp() {
		return this.men2dp;
	}

	public void setMen2dp(Double men2dp) {
		this.men2dp = men2dp;
	}

	@Column(name = "MEN1DP", nullable = false, precision = 17, scale = 17)
	public Double getMen1dp() {
		return this.men1dp;
	}

	public void setMen1dp(Double men1dp) {
		this.men1dp = men1dp;
	}

	@Column(name = "MEDIA", nullable = false, precision = 17, scale = 17)
	public Double getMedia() {
		return this.media;
	}

	public void setMedia(Double media) {
		this.media = media;
	}

	@Column(name = "MAI1DP", nullable = false, precision = 17, scale = 17)
	public Double getMai1dp() {
		return this.mai1dp;
	}

	public void setMai1dp(Double mai1dp) {
		this.mai1dp = mai1dp;
	}

	@Column(name = "MAI2DP", nullable = false, precision = 17, scale = 17)
	public Double getMai2dp() {
		return this.mai2dp;
	}

	public void setMai2dp(Double mai2dp) {
		this.mai2dp = mai2dp;
	}

	@Column(name = "MEN4DP", nullable = false, precision = 17, scale = 17)
	public Double getMen4dp() {
		return this.men4dp;
	}

	public void setMen4dp(Double men4dp) {
		this.men4dp = men4dp;
	}

	@Column(name = "MEN3DP", nullable = false, precision = 17, scale = 17)
	public Double getMen3dp() {
		return this.men3dp;
	}

	public void setMen3dp(Double men3dp) {
		this.men3dp = men3dp;
	}

	@Column(name = "MAI4DP", nullable = false, precision = 17, scale = 17)
	public Double getMai4dp() {
		return this.mai4dp;
	}

	public void setMai4dp(Double mai4dp) {
		this.mai4dp = mai4dp;
	}

	@Column(name = "MAI3DP", nullable = false, precision = 17, scale = 17)
	public Double getMai3dp() {
		return this.mai3dp;
	}

	public void setMai3dp(Double mai3dp) {
		this.mai3dp = mai3dp;
	}

	public enum Fields {

		ID("id"),
		VERSION("version"),
		MEN2DP("men2dp"),
		MEN1DP("men1dp"),
		MEDIA("media"),
		MAI1DP("mai1dp"),
		MAI2DP("mai2dp"),
		MEN4DP("men4dp"),
		MEN3DP("men3dp"),
		MAI4DP("mai4dp"),
		MAI3DP("mai3dp");

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
		if (!(obj instanceof MamCurva)) {
			return false;
		}
		MamCurva other = (MamCurva) obj;
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