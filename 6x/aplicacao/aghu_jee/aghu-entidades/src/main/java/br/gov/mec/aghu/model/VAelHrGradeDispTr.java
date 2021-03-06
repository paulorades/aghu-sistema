package br.gov.mec.aghu.model;

// Generated 29/05/2012 10:59:30 by Hibernate Tools 3.4.0.CR1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.Immutable;

import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * VAelHrGradeDispTr generated by hbm2java
 */
@Entity
@Table(name = "V_AEL_HR_GRADE_DISP_TR_AGHU", schema = "AGH")
@Immutable
public class VAelHrGradeDispTr extends BaseEntityId<VAelHrGradeDispTrId> implements java.io.Serializable {

	private static final long serialVersionUID = -4249463540002765312L;
	private VAelHrGradeDispTrId id;

	public VAelHrGradeDispTr() {
	}

	public VAelHrGradeDispTr(VAelHrGradeDispTrId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "dthrAgenda", column = @Column(name = "DTHR_AGENDA", length = 7)),
			@AttributeOverride(name = "dtAgenda", column = @Column(name = "DT_AGENDA", length = 7)),
			@AttributeOverride(name = "hrAgenda", column = @Column(name = "HR_AGENDA", length = 5)),
			@AttributeOverride(name = "sit", column = @Column(name = "SIT", length = 1)),
			@AttributeOverride(name = "tipo", column = @Column(name = "TIPO", precision = 3, scale = 0)),
			@AttributeOverride(name = "indHrExtra", column = @Column(name = "IND_HR_EXTRA", length = 1)),
			@AttributeOverride(name = "unfGrade", column = @Column(name = "UNF_GRADE", precision = 4, scale = 0)),
			@AttributeOverride(name = "seqGrade", column = @Column(name = "SEQ_GRADE", precision = 7, scale = 0)),
			@AttributeOverride(name = "grupoExame", column = @Column(name = "GRUPO_EXAME", precision = 22, scale = 0)),
			@AttributeOverride(name = "siglaExame", column = @Column(name = "SIGLA_EXAME", length = 5)),
			@AttributeOverride(name = "matExame", column = @Column(name = "MAT_EXAME", precision = 5, scale = 0)),
			@AttributeOverride(name = "unfExame", column = @Column(name = "UNF_EXAME", precision = 4, scale = 0)),
			@AttributeOverride(name = "descrGrupoEx", column = @Column(name = "DESCR_GRUPO_EX", length = 60)),
			@AttributeOverride(name = "numSala", column = @Column(name = "NUM_SALA", length = 10)),
			@AttributeOverride(name = "nomeFunc", column = @Column(name = "NOME_FUNC", length = 4000)) })
			
	public VAelHrGradeDispTrId getId() {
		return this.id;
	}

	public void setId(VAelHrGradeDispTrId id) {
		this.id = id;
	}
	
	public enum Fields {
		UNF_GRADE("id.unfGrade")
		,SEQ_GRADE("id.seqGrade")
		,DTHR_AGENDA("id.dthrAgenda");
		
		private String fields;

		private Fields(String fields) {
			this.fields = fields;
		}

		@Override
		public String toString() {
			return fields;
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
		if (!(obj instanceof VAelHrGradeDispTr)) {
			return false;
		}
		VAelHrGradeDispTr other = (VAelHrGradeDispTr) obj;
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
