package br.gov.mec.aghu.model;

// Generated 15/03/2011 17:02:17 by Hibernate Tools 3.2.5.Beta

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.Immutable;

import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * VAelSolicPac generated by hbm2java
 */
@Entity
@Table(name = "V_AEL_EXAMES_LIBERADOS", schema = "AGH")
@Immutable
public class VAelExamesLiberados extends BaseEntityId<VAelExamesLiberadosId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7875744497801863719L;
	private VAelExamesLiberadosId id;
	private String situacaoCodigoDescricao;
	private Date dthrEventoExtratoItem;
	private Date dthrSolicCriadoEm;
	private Integer qtdeNotaAdicional;
	private String descricaoMaterialAnalise;
	private Integer seqMaterialAnalise;
	private String descricaoUsual;
	private Integer codigoDocumento;
	private String codigoImagem;
	private String unfDescricao;
	private Integer unfSeq;

	private Integer pacCodigo;


	public VAelExamesLiberados() {
	}

	public VAelExamesLiberados(VAelExamesLiberadosId id) {
		this.id = id;
	}

	
	
	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "seqP", column = @Column(name = "SEQP")),
			@AttributeOverride(name = "soeSeq", column = @Column(name = "SOE_SEQ"))})
	public VAelExamesLiberadosId getId() {
		return this.id;
	}

	public void setId(VAelExamesLiberadosId id) {
		this.id = id;
	}
	
	
	@Column(name = "SITUACAO_CODIGO_DESCRICAO" , length = 45, nullable=true)
	public String getSituacaoCodigoDescricao() {
		return situacaoCodigoDescricao;
	}
	
	public void setSituacaoCodigoDescricao(String situacaoCodigoDescricao) {
		this.situacaoCodigoDescricao = situacaoCodigoDescricao;
	}
	
	@Column(name = "DTHR_EVENTO_EXTRATO_ITEM")
	public Date getDthrEventoExtratoItem() {
		return dthrEventoExtratoItem;
	}
	
	public void setDthrEventoExtratoItem(Date dthrEventoExtratoItem) {
		this.dthrEventoExtratoItem = dthrEventoExtratoItem;
	}
	
	@Column(name = "DTHR_SOLIC_CRIADO_EM")
	public Date getDthrSolicCriadoEm() {
		return dthrSolicCriadoEm;
	}
	public void setDthrSolicCriadoEm(Date dthrSolicCriadoEm) {
		this.dthrSolicCriadoEm = dthrSolicCriadoEm;
	}
	
	@Column(name = "QTDE_NOTA_ADICIONAL")
	public Integer getQtdeNotaAdicional() {
		return qtdeNotaAdicional;
	}
	
	public void setQtdeNotaAdicional(Integer qtdeNotaAdicional) {
		this.qtdeNotaAdicional = qtdeNotaAdicional;
	}
	
	@Column(name = "DESCRICAO_MAT_ANALISE" , length =60)
	public String getDescricaoMaterialAnalise() {
		return descricaoMaterialAnalise;
	}
	public void setDescricaoMaterialAnalise(String descricaoMaterialAnalise) {
		this.descricaoMaterialAnalise = descricaoMaterialAnalise;
	}
	
	@Column(name = "SEQ_MAT_ANALISE")
	public Integer getSeqMaterialAnalise() {
		return seqMaterialAnalise;
	}
	
	public void setSeqMaterialAnalise(Integer seqMaterialAnalise) {
		this.seqMaterialAnalise = seqMaterialAnalise;
	}
	
	@Column(name = "DESCRICAO_USUAL" , length = 100)
	public String getDescricaoUsual() {
		return descricaoUsual;
	}
	public void setDescricaoUsual(String descricaoUsual) {
		this.descricaoUsual = descricaoUsual;
	}
	
	
	@Column(name = "CODIGO_DOCUMENTO")
	public Integer getCodigoDocumento() {
		return codigoDocumento;
	}
	public void setCodigoDocumento(Integer codigoDocumento) {
		this.codigoDocumento = codigoDocumento;
	}
	
	@Column(name = "CODIGO_IMAGEM" , length = 50)
	public String getCodigoImagem() {
		return codigoImagem;
	}
	public void setCodigoImagem(String codigoImagem) {
		this.codigoImagem = codigoImagem;
	}
	
	@Column(name = "UNF_DESCRICAO" , length = 60)
	public String getUnfDescricao() {
		return unfDescricao;
	}
	public void setUnfDescricao(String unfDescricao) {
		this.unfDescricao = unfDescricao;
	}
	
	@Column(name = "UNF_SEQ")
	public Integer getUnfSeq() {
		return unfSeq;
	}
	public void setUnfSeq(Integer unfSeq) {
		this.unfSeq = unfSeq;
	}
	
	@Column(name = "PAC_CODIGO")
	public Integer getPacCodigo() {
		return pacCodigo;
	}

	public void setPacCodigo(Integer pacCodigo) {
		this.pacCodigo = pacCodigo;
	}


	

	public enum Fields {
		UNF_SEQ("unfSeq"),
		PAC_CODIGO("pacCodigo");

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
		if (!(obj instanceof VAelExamesLiberados)) {
			return false;
		}
		VAelExamesLiberados other = (VAelExamesLiberados) obj;
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