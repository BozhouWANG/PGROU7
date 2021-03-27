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
@Table(name = "role_pi_grant")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RolePiGrant.findAll", query = "SELECT r FROM RolePiGrant r"),
    @NamedQuery(name = "RolePiGrant.findByIdRolePiGrant", query = "SELECT r FROM RolePiGrant r WHERE r.idRolePiGrant = :idRolePiGrant"),
    @NamedQuery(name = "RolePiGrant.findByNameChoice", query = "SELECT r FROM RolePiGrant r WHERE r.nameChoice = :nameChoice")})
public class RolePiGrant implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_role_pi_grant")
    private Integer idRolePiGrant;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "name_choice")
    private String nameChoice;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idRolePiGrant")
    private Collection<ProjectEvaluationGrant> projectEvaluationGrantCollection;

    public RolePiGrant() {
    }

    public RolePiGrant(Integer idRolePiGrant) {
        this.idRolePiGrant = idRolePiGrant;
    }

    public RolePiGrant(Integer idRolePiGrant, String nameChoice) {
        this.idRolePiGrant = idRolePiGrant;
        this.nameChoice = nameChoice;
    }

    public Integer getIdRolePiGrant() {
        return idRolePiGrant;
    }

    public void setIdRolePiGrant(Integer idRolePiGrant) {
        this.idRolePiGrant = idRolePiGrant;
    }

    public String getNameChoice() {
        return nameChoice;
    }

    public void setNameChoice(String nameChoice) {
        this.nameChoice = nameChoice;
    }

    @XmlTransient
    public Collection<ProjectEvaluationGrant> getProjectEvaluationGrantCollection() {
        return projectEvaluationGrantCollection;
    }

    public void setProjectEvaluationGrantCollection(Collection<ProjectEvaluationGrant> projectEvaluationGrantCollection) {
        this.projectEvaluationGrantCollection = projectEvaluationGrantCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRolePiGrant != null ? idRolePiGrant.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RolePiGrant)) {
            return false;
        }
        RolePiGrant other = (RolePiGrant) object;
        if ((this.idRolePiGrant == null && other.idRolePiGrant != null) || (this.idRolePiGrant != null && !this.idRolePiGrant.equals(other.idRolePiGrant))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.centrale.pgrou.items.RolePiGrant[ idRolePiGrant=" + idRolePiGrant + " ]";
    }
    
}
