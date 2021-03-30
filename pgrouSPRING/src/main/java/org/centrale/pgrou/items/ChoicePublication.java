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
@Table(name = "choice_publication")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ChoicePublication.findAll", query = "SELECT c FROM ChoicePublication c"),
    @NamedQuery(name = "ChoicePublication.findByIdChoice", query = "SELECT c FROM ChoicePublication c WHERE c.idChoice = :idChoice"),
    @NamedQuery(name = "ChoicePublication.findByNameChoice", query = "SELECT c FROM ChoicePublication c WHERE c.nameChoice = :nameChoice")})
public class ChoicePublication implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_choice")
    private Integer idChoice;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "name_choice")
    private String nameChoice;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idChoice")
    private Collection<Publication> publicationCollection;

    public ChoicePublication() {
    }

    public ChoicePublication(Integer idChoice) {
        this.idChoice = idChoice;
    }

    public ChoicePublication(Integer idChoice, String nameChoice) {
        this.idChoice = idChoice;
        this.nameChoice = nameChoice;
    }

    public Integer getIdChoice() {
        return idChoice;
    }

    public void setIdChoice(Integer idChoice) {
        this.idChoice = idChoice;
    }

    public String getNameChoice() {
        return nameChoice;
    }

    public void setNameChoice(String nameChoice) {
        this.nameChoice = nameChoice;
    }

    @XmlTransient
    public Collection<Publication> getPublicationCollection() {
        return publicationCollection;
    }

    public void setPublicationCollection(Collection<Publication> publicationCollection) {
        this.publicationCollection = publicationCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idChoice != null ? idChoice.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ChoicePublication)) {
            return false;
        }
        ChoicePublication other = (ChoicePublication) object;
        if ((this.idChoice == null && other.idChoice != null) || (this.idChoice != null && !this.idChoice.equals(other.idChoice))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.centrale.pgrou.items.ChoicePublication[ idChoice=" + idChoice + " ]";
    }
    
}
