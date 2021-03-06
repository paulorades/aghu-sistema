package br.gov.mec.aghu.model;

// Generated 15/03/2011 13:46:58 by Hibernate Tools 3.2.5.Beta

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Version;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.dominio.DominioSituacao;
import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * FatFormasOrganizacao generated by hbm2java
 */
@Entity
@Table(name = "FAT_FORMAS_ORGANIZACAO", schema = "AGH")
public class FatFormaOrganizacao extends BaseEntityId<FatFormaOrganizacaoId> implements java.io.Serializable {
	private static final long serialVersionUID = 4111265912186349523L;
	
	private FatFormaOrganizacaoId id;
	private FatSubGrupo fatSubGrupo;
	private FatGrupo grupo;
	private String descricao;
	private DominioSituacao indSituacao;
	private Integer version;

	public FatFormaOrganizacao() {
	}


	public FatFormaOrganizacao(FatFormaOrganizacaoId id,
			FatSubGrupo fatSubGrupo, String descricao, DominioSituacao indSituacao) {
		this.id = id;
		this.fatSubGrupo = fatSubGrupo;
		this.descricao = descricao;
		this.indSituacao = indSituacao;
	}

	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "sgrGrpSeq", column = @Column(name = "SGR_GRP_SEQ", nullable = false, precision = 3, scale = 0)),
			@AttributeOverride(name = "sgrSubGrupo", column = @Column(name = "SGR_SUB_GRUPO", nullable = false, precision = 2, scale = 0)),
			@AttributeOverride(name = "codigo", column = @Column(name = "CODIGO", nullable = false, precision = 2, scale = 0)) })
	public FatFormaOrganizacaoId getId() {
		return this.id;
	}

	public void setId(FatFormaOrganizacaoId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns( {
			@JoinColumn(name = "SGR_GRP_SEQ", referencedColumnName = "GRP_SEQ", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "SGR_SUB_GRUPO", referencedColumnName = "SUB_GRUPO", nullable = false, insertable = false, updatable = false) })
	public FatSubGrupo getFatSubGrupo() {
		return this.fatSubGrupo;
	}

	public void setFatSubGrupo(FatSubGrupo fatSubGrupo) {
		this.fatSubGrupo = fatSubGrupo;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "SGR_GRP_SEQ", nullable = false, insertable = false, updatable = false)
	public FatGrupo getGrupo() {
		return grupo;
	}


	public void setGrupo(FatGrupo grupo) {
		this.grupo = grupo;
	}


	@Column(name = "DESCRICAO", nullable = false, length = 100)
	@Length(max = 100)
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Column(name = "IND_SITUACAO", length = 1)
	@Enumerated(EnumType.STRING)
	public DominioSituacao getIndSituacao() {
		return this.indSituacao;
	}

	public void setIndSituacao(DominioSituacao indSituacao) {
		this.indSituacao = indSituacao;
	}
	
	@Version
	@Column(name = "VERSION", nullable = false)
	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		if (getClass() != obj.getClass()) {
			return false;
		}
		FatFormaOrganizacao other = (FatFormaOrganizacao) obj;
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		return true;
	}



	public enum Fields {
		ID_SGR_GRP_SEQ("id.sgrGrpSeq"),
		ID_SGR_SUB_GRUPO("id.sgrSubGrupo"),
		ID_CODIGO("id.codigo"),
		FAT_GRUPO("grupo"),
		FAT_SUB_GRUPO("fatSubGrupo"),		
		DESCRICAO("descricao"),
		IND_SITUACAO("indSituacao");

		private String fields;

		private Fields(String fields) {
			this.fields = fields;
		}

		@Override
		public String toString() {
			return this.fields;
		}
	}

}
