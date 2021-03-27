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
@Table(name = "choice_scientific_expertise")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ChoiceScientificExpertise.findAll", query = "SELECT c FROM ChoiceScientificExpertise c"),
    @NamedQuery(name = "ChoiceScientificExpertise.findByIdType", query = "SELECT c FROM ChoiceScientificExpertise c WHERE c.idType = :idType"),
    @NamedQuery(name = "ChoiceScientificExpertise.findByNameChoice", query = "SELECT c FROM ChoiceScientificExpertise c WHERE c.nameChoice = :nameChoice")})
public class ChoiceScientificExpertise implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_type")
    private Integer idType;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "name_choice")
    private String nameChoice;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idType")
    private Collection<ScientificExpertise> scientificExpertiseCollection;

    public ChoiceScientificExpertise() {
    }

    public ChoiceScientificExpertise(Integer idType) {
        this.idType = idType;
    }

    public ChoiceScientificExpertise(Integer idType, String nameChoice) {
        this.idType = idType;
        this.nameChoice = nameChoice;
    }

    public Integer getIdType() {
        return idType;
    }

    public void setIdType(Integer idType) {
        this.idType = idType;
    }

    public String getNameChoice() {
        return nameChoice;
    }

    public void setNameChoice(String nameChoice) {
        this.nameChoice = nameChoice;
    }

    @XmlTransient
    public Collection<ScientificExpertise> getScientificExpertiseCollection() {
        return scientificExpertiseCollection;
    }

    public void setScientificExpertiseCollection(Collection<ScientificExpertise> scientificExpertiseCollection) {
        this.scientificExpertiseCollection = scientificExpertiseCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idType != null ? idType.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ChoiceScientificExpertise)) {
            return false;
        }
        ChoiceScientificExpertise other = (ChoiceScientificExpertise) object;
        if ((this.idType == null && other.idType != null) || (this.idType != null && !this.idType.equals(other.idType))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.centrale.pgrou.items.ChoiceScientificExpertise[ idType=" + idType + " ]";
    }
    
}
