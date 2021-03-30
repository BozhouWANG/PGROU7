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
@Table(name = "role_pi_thesis")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RolePiThesis.findAll", query = "SELECT r FROM RolePiThesis r"),
    @NamedQuery(name = "RolePiThesis.findByIdRolePiThesis", query = "SELECT r FROM RolePiThesis r WHERE r.idRolePiThesis = :idRolePiThesis"),
    @NamedQuery(name = "RolePiThesis.findByNameChoice", query = "SELECT r FROM RolePiThesis r WHERE r.nameChoice = :nameChoice")})
public class RolePiThesis implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_role_pi_thesis")
    private Integer idRolePiThesis;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "name_choice")
    private String nameChoice;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idRolePiThesis")
    private Collection<ProjectEvaluationThesis> projectEvaluationThesisCollection;

    public RolePiThesis() {
    }

    public RolePiThesis(Integer idRolePiThesis) {
        this.idRolePiThesis = idRolePiThesis;
    }

    public RolePiThesis(Integer idRolePiThesis, String nameChoice) {
        this.idRolePiThesis = idRolePiThesis;
        this.nameChoice = nameChoice;
    }

    public Integer getIdRolePiThesis() {
        return idRolePiThesis;
    }

    public void setIdRolePiThesis(Integer idRolePiThesis) {
        this.idRolePiThesis = idRolePiThesis;
    }

    public String getNameChoice() {
        return nameChoice;
    }

    public void setNameChoice(String nameChoice) {
        this.nameChoice = nameChoice;
    }

    @XmlTransient
    public Collection<ProjectEvaluationThesis> getProjectEvaluationThesisCollection() {
        return projectEvaluationThesisCollection;
    }

    public void setProjectEvaluationThesisCollection(Collection<ProjectEvaluationThesis> projectEvaluationThesisCollection) {
        this.projectEvaluationThesisCollection = projectEvaluationThesisCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRolePiThesis != null ? idRolePiThesis.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RolePiThesis)) {
            return false;
        }
        RolePiThesis other = (RolePiThesis) object;
        if ((this.idRolePiThesis == null && other.idRolePiThesis != null) || (this.idRolePiThesis != null && !this.idRolePiThesis.equals(other.idRolePiThesis))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.centrale.pgrou.items.RolePiThesis[ idRolePiThesis=" + idRolePiThesis + " ]";
    }
    
}
