package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;


import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * RapTmpPessoaFisica generated by hbm2java
 */
@Entity
@Table(name = "RAP_TMP_PESSOAS_FISICAS", schema = "AGH")
public class RapTmpPessoaFisica extends BaseEntityId<RapTmpPessoaFisicaId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1497538541792710436L;
	private RapTmpPessoaFisicaId id;

	public RapTmpPessoaFisica() {
	}

	public RapTmpPessoaFisica(RapTmpPessoaFisicaId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "operacao", column = @Column(name = "OPERACAO", nullable = false, length = 3)),
			@AttributeOverride(name = "dthrOperacao", column = @Column(name = "DTHR_OPERACAO", nullable = false, length = 29)),
			@AttributeOverride(name = "lotSeq", column = @Column(name = "LOT_SEQ", length = 10)),
			@AttributeOverride(name = "codigo", column = @Column(name = "CODIGO")),
			@AttributeOverride(name = "pacProntuario", column = @Column(name = "PAC_PRONTUARIO")),
			@AttributeOverride(name = "cpf", column = @Column(name = "CPF")),
			@AttributeOverride(name = "nome", column = @Column(name = "NOME", length = 50)),
			@AttributeOverride(name = "nomeMae", column = @Column(name = "NOME_MAE", length = 45)),
			@AttributeOverride(name = "sexo", column = @Column(name = "SEXO", length = 1)),
			@AttributeOverride(name = "nomePai", column = @Column(name = "NOME_PAI", length = 45)),
			@AttributeOverride(name = "nomeUsual", column = @Column(name = "NOME_USUAL", length = 15)),
			@AttributeOverride(name = "dtNascimento", column = @Column(name = "DT_NASCIMENTO", length = 29)),
			@AttributeOverride(name = "grauInstrucao", column = @Column(name = "GRAU_INSTRUCAO")),
			@AttributeOverride(name = "estadoCivil", column = @Column(name = "ESTADO_CIVIL", length = 1)),
			@AttributeOverride(name = "bclCloLgrCodigo", column = @Column(name = "BCL_CLO_LGR_CODIGO")),
			@AttributeOverride(name = "bclCloCep", column = @Column(name = "BCL_CLO_CEP")),
			@AttributeOverride(name = "bclBaiCodigo", column = @Column(name = "BCL_BAI_CODIGO")),
			@AttributeOverride(name = "cddCodigo", column = @Column(name = "CDD_CODIGO")),
			@AttributeOverride(name = "nacCodigo", column = @Column(name = "NAC_CODIGO", precision = 17, scale = 17)),
			@AttributeOverride(name = "logradouro", column = @Column(name = "LOGRADOURO", length = 60)),
			@AttributeOverride(name = "complLogradouro", column = @Column(name = "COMPL_LOGRADOURO", length = 15)),
			@AttributeOverride(name = "nroLogradouro", column = @Column(name = "NRO_LOGRADOURO")),
			@AttributeOverride(name = "cep", column = @Column(name = "CEP")),
			@AttributeOverride(name = "bairro", column = @Column(name = "BAIRRO", length = 60)),
			@AttributeOverride(name = "ufSigla", column = @Column(name = "UF_SIGLA", length = 40)),
			@AttributeOverride(name = "cidadeNascimento", column = @Column(name = "CIDADE_NASCIMENTO", length = 40)),
			@AttributeOverride(name = "nroIdentidade", column = @Column(name = "NRO_IDENTIDADE", length = 11)),
			@AttributeOverride(name = "nroCartProfissional", column = @Column(name = "NRO_CART_PROFISSIONAL")),
			@AttributeOverride(name = "serieCartProfissional", column = @Column(name = "SERIE_CART_PROFISSIONAL")),
			@AttributeOverride(name = "pisPasep", column = @Column(name = "PIS_PASEP")),
			@AttributeOverride(name = "zonaTitEleitor", column = @Column(name = "ZONA_TIT_ELEITOR")),
			@AttributeOverride(name = "nroTitEleitor", column = @Column(name = "NRO_TIT_ELEITOR")),
			@AttributeOverride(name = "secaoTitEleitor", column = @Column(name = "SECAO_TIT_ELEITOR")),
			@AttributeOverride(name = "dddFoneResidencial", column = @Column(name = "DDD_FONE_RESIDENCIAL")),
			@AttributeOverride(name = "foneResidencial", column = @Column(name = "FONE_RESIDENCIAL")),
			@AttributeOverride(name = "ramalFoneResidencial", column = @Column(name = "RAMAL_FONE_RESIDENCIAL")),
			@AttributeOverride(name = "serMatricula", column = @Column(name = "SER_MATRICULA")),
			@AttributeOverride(name = "serVinCodigo", column = @Column(name = "SER_VIN_CODIGO")),
			@AttributeOverride(name = "version", column = @Column(name = "VERSION", nullable = false)) })
	public RapTmpPessoaFisicaId getId() {
		return this.id;
	}

	public void setId(RapTmpPessoaFisicaId id) {
		this.id = id;
	}

	public enum Fields {

		ID("id");

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