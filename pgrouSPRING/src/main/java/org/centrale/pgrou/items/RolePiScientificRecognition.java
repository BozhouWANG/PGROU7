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
@Table(name = "role_pi_scientific_recognition")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RolePiScientificRecognition.findAll", query = "SELECT r FROM RolePiScientificRecognition r"),
    @NamedQuery(name = "RolePiScientificRecognition.findByIdRolePi", query = "SELECT r FROM RolePiScientificRecognition r WHERE r.idRolePi = :idRolePi"),
    @NamedQuery(name = "RolePiScientificRecognition.findByNameChoice", query = "SELECT r FROM RolePiScientificRecognition r WHERE r.nameChoice = :nameChoice")})
public class RolePiScientificRecognition implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_role_pi")
    private Integer idRolePi;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "name_choice")
    private String nameChoice;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idRolePi")
    private Collection<SrResponsibilityLearnedScientificSociety> srResponsibilityLearnedScientificSocietyCollection;

    public RolePiScientificRecognition() {
    }

    public RolePiScientificRecognition(Integer idRolePi) {
        this.idRolePi = idRolePi;
    }

    public RolePiScientificRecognition(Integer idRolePi, String nameChoice) {
        this.idRolePi = idRolePi;
        this.nameChoice = nameChoice;
    }

    public Integer getIdRolePi() {
        return idRolePi;
    }

    public void setIdRolePi(Integer idRolePi) {
        this.idRolePi = idRolePi;
    }

    public String getNameChoice() {
        return nameChoice;
    }

    public void setNameChoice(String nameChoice) {
        this.nameChoice = nameChoice;
    }

    @XmlTransient
    public Collection<SrResponsibilityLearnedScientificSociety> getSrResponsibilityLearnedScientificSocietyCollection() {
        return srResponsibilityLearnedScientificSocietyCollection;
    }

    public void setSrResponsibilityLearnedScientificSocietyCollection(Collection<SrResponsibilityLearnedScientificSociety> srResponsibilityLearnedScientificSocietyCollection) {
        this.srResponsibilityLearnedScientificSocietyCollection = srResponsibilityLearnedScientificSocietyCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRolePi != null ? idRolePi.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RolePiScientificRecognition)) {
            return false;
        }
        RolePiScientificRecognition other = (RolePiScientificRecognition) object;
        if ((this.idRolePi == null && other.idRolePi != null) || (this.idRolePi != null && !this.idRolePi.equals(other.idRolePi))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.centrale.pgrou.items.RolePiScientificRecognition[ idRolePi=" + idRolePi + " ]";
    }
    
}
