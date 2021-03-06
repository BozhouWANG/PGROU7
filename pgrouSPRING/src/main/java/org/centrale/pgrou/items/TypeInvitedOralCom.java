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
@Table(name = "type_invited_oral_com")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TypeInvitedOralCom.findAll", query = "SELECT t FROM TypeInvitedOralCom t"),
    @NamedQuery(name = "TypeInvitedOralCom.findByIdTypeMeeting", query = "SELECT t FROM TypeInvitedOralCom t WHERE t.idTypeMeeting = :idTypeMeeting"),
    @NamedQuery(name = "TypeInvitedOralCom.findByNameChoice", query = "SELECT t FROM TypeInvitedOralCom t WHERE t.nameChoice = :nameChoice")})
public class TypeInvitedOralCom implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_type_meeting")
    private Integer idTypeMeeting;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "name_choice")
    private String nameChoice;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTypeMeeting")
    private Collection<InvitedOralCommunication> invitedOralCommunicationCollection;

    public TypeInvitedOralCom() {
    }

    public TypeInvitedOralCom(Integer idTypeMeeting) {
        this.idTypeMeeting = idTypeMeeting;
    }

    public TypeInvitedOralCom(Integer idTypeMeeting, String nameChoice) {
        this.idTypeMeeting = idTypeMeeting;
        this.nameChoice = nameChoice;
    }

    public Integer getIdTypeMeeting() {
        return idTypeMeeting;
    }

    public void setIdTypeMeeting(Integer idTypeMeeting) {
        this.idTypeMeeting = idTypeMeeting;
    }

    public String getNameChoice() {
        return nameChoice;
    }

    public void setNameChoice(String nameChoice) {
        this.nameChoice = nameChoice;
    }

    @XmlTransient
    public Collection<InvitedOralCommunication> getInvitedOralCommunicationCollection() {
        return invitedOralCommunicationCollection;
    }

    public void setInvitedOralCommunicationCollection(Collection<InvitedOralCommunication> invitedOralCommunicationCollection) {
        this.invitedOralCommunicationCollection = invitedOralCommunicationCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTypeMeeting != null ? idTypeMeeting.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TypeInvitedOralCom)) {
            return false;
        }
        TypeInvitedOralCom other = (TypeInvitedOralCom) object;
        if ((this.idTypeMeeting == null && other.idTypeMeeting != null) || (this.idTypeMeeting != null && !this.idTypeMeeting.equals(other.idTypeMeeting))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.centrale.pgrou.items.TypeInvitedOralCom[ idTypeMeeting=" + idTypeMeeting + " ]";
    }
    
}
