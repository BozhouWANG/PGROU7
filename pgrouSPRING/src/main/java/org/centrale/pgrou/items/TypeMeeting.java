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
@Table(name = "type_meeting")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TypeMeeting.findAll", query = "SELECT t FROM TypeMeeting t"),
    @NamedQuery(name = "TypeMeeting.findByIdChoiceMeeting", query = "SELECT t FROM TypeMeeting t WHERE t.idChoiceMeeting = :idChoiceMeeting"),
    @NamedQuery(name = "TypeMeeting.findByNameChoice", query = "SELECT t FROM TypeMeeting t WHERE t.nameChoice = :nameChoice")})
public class TypeMeeting implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_choice_meeting")
    private Integer idChoiceMeeting;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "name_choice")
    private String nameChoice;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idChoiceMeeting")
    private Collection<OralCommunicationPoster> oralCommunicationPosterCollection;

    public TypeMeeting() {
    }

    public TypeMeeting(Integer idChoiceMeeting) {
        this.idChoiceMeeting = idChoiceMeeting;
    }

    public TypeMeeting(Integer idChoiceMeeting, String nameChoice) {
        this.idChoiceMeeting = idChoiceMeeting;
        this.nameChoice = nameChoice;
    }

    public Integer getIdChoiceMeeting() {
        return idChoiceMeeting;
    }

    public void setIdChoiceMeeting(Integer idChoiceMeeting) {
        this.idChoiceMeeting = idChoiceMeeting;
    }

    public String getNameChoice() {
        return nameChoice;
    }

    public void setNameChoice(String nameChoice) {
        this.nameChoice = nameChoice;
    }

    @XmlTransient
    public Collection<OralCommunicationPoster> getOralCommunicationPosterCollection() {
        return oralCommunicationPosterCollection;
    }

    public void setOralCommunicationPosterCollection(Collection<OralCommunicationPoster> oralCommunicationPosterCollection) {
        this.oralCommunicationPosterCollection = oralCommunicationPosterCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idChoiceMeeting != null ? idChoiceMeeting.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TypeMeeting)) {
            return false;
        }
        TypeMeeting other = (TypeMeeting) object;
        if ((this.idChoiceMeeting == null && other.idChoiceMeeting != null) || (this.idChoiceMeeting != null && !this.idChoiceMeeting.equals(other.idChoiceMeeting))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.centrale.pgrou.items.TypeMeeting[ idChoiceMeeting=" + idChoiceMeeting + " ]";
    }
    
}
