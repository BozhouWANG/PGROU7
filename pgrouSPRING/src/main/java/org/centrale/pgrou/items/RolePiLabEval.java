/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.centrale.pgrou.items;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author macar
 */
@Entity
@Table(name = "role_pi_lab_eval")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RolePiLabEval.findAll", query = "SELECT r FROM RolePiLabEval r"),
    @NamedQuery(name = "RolePiLabEval.findByIdRolePiLabEval", query = "SELECT r FROM RolePiLabEval r WHERE r.idRolePiLabEval = :idRolePiLabEval"),
    @NamedQuery(name = "RolePiLabEval.findByNameChoice", query = "SELECT r FROM RolePiLabEval r WHERE r.nameChoice = :nameChoice")})
public class RolePiLabEval implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_role_pi_lab_eval")
    private Integer idRolePiLabEval;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "name_choice")
    private String nameChoice;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idRolePiLabEval")
    private Collection<ResponsibilityInstitutionalComiteeJury> responsibilityInstitutionalComiteeJuryCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idRolePiLabEval")
    private Collection<LabEvaluation> labEvaluationCollection;

    public RolePiLabEval() {
    }

    public RolePiLabEval(Integer idRolePiLabEval) {
        this.idRolePiLabEval = idRolePiLabEval;
    }

    public RolePiLabEval(Integer idRolePiLabEval, String nameChoice) {
        this.idRolePiLabEval = idRolePiLabEval;
        this.nameChoice = nameChoice;
    }

    public Integer getIdRolePiLabEval() {
        return idRolePiLabEval;
    }

    public void setIdRolePiLabEval(Integer idRolePiLabEval) {
        this.idRolePiLabEval = idRolePiLabEval;
    }

    public String getNameChoice() {
        return nameChoice;
    }

    public void setNameChoice(String nameChoice) {
        this.nameChoice = nameChoice;
    }

    @XmlTransient
    public Collection<ResponsibilityInstitutionalComiteeJury> getResponsibilityInstitutionalComiteeJuryCollection() {
        return responsibilityInstitutionalComiteeJuryCollection;
    }

    public void setResponsibilityInstitutionalComiteeJuryCollection(Collection<ResponsibilityInstitutionalComiteeJury> responsibilityInstitutionalComiteeJuryCollection) {
        this.responsibilityInstitutionalComiteeJuryCollection = responsibilityInstitutionalComiteeJuryCollection;
    }

    @XmlTransient
    public Collection<LabEvaluation> getLabEvaluationCollection() {
        return labEvaluationCollection;
    }

    public void setLabEvaluationCollection(Collection<LabEvaluation> labEvaluationCollection) {
        this.labEvaluationCollection = labEvaluationCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRolePiLabEval != null ? idRolePiLabEval.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RolePiLabEval)) {
            return false;
        }
        RolePiLabEval other = (RolePiLabEval) object;
        if ((this.idRolePiLabEval == null && other.idRolePiLabEval != null) || (this.idRolePiLabEval != null && !this.idRolePiLabEval.equals(other.idRolePiLabEval))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.centrale.pgrou.items.RolePiLabEval[ idRolePiLabEval=" + idRolePiLabEval + " ]";
    }
    
}
