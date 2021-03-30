/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.centrale.pgrou.items;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author macar
 */
@Entity
@Table(name = "invited_oral_communication")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "InvitedOralCommunication.findAll", query = "SELECT i FROM InvitedOralCommunication i"),
    @NamedQuery(name = "InvitedOralCommunication.findByIdActivity", query = "SELECT i FROM InvitedOralCommunication i WHERE i.idActivity = :idActivity"),
    @NamedQuery(name = "InvitedOralCommunication.findByDateCommunication", query = "SELECT i FROM InvitedOralCommunication i WHERE i.dateCommunication = :dateCommunication"),
    @NamedQuery(name = "InvitedOralCommunication.findByTitle", query = "SELECT i FROM InvitedOralCommunication i WHERE i.title = :title"),
    @NamedQuery(name = "InvitedOralCommunication.findByNameMeeting", query = "SELECT i FROM InvitedOralCommunication i WHERE i.nameMeeting = :nameMeeting"),
    @NamedQuery(name = "InvitedOralCommunication.findByDateMeeting", query = "SELECT i FROM InvitedOralCommunication i WHERE i.dateMeeting = :dateMeeting"),
    @NamedQuery(name = "InvitedOralCommunication.findByLocation", query = "SELECT i FROM InvitedOralCommunication i WHERE i.location = :location")})
public class InvitedOralCommunication implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_activity")
    private Integer idActivity;
    @Basic(optional = false)
    @NotNull
    @Column(name = "date_communication")
    @Temporal(TemporalType.DATE)
    private Date dateCommunication;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "title")
    private String title;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "name_meeting")
    private String nameMeeting;
    @Column(name = "date_meeting")
    @Temporal(TemporalType.DATE)
    private Date dateMeeting;
    @Size(max = 2147483647)
    @Column(name = "location")
    private String location;
    @JoinColumn(name = "id_type_meeting", referencedColumnName = "id_type_meeting")
    @ManyToOne(optional = false)
    private TypeInvitedOralCom idTypeMeeting;

    public InvitedOralCommunication() {
    }

    public InvitedOralCommunication(Integer idActivity) {
        this.idActivity = idActivity;
    }

    public InvitedOralCommunication(Integer idActivity, Date dateCommunication, String title, String nameMeeting) {
        this.idActivity = idActivity;
        this.dateCommunication = dateCommunication;
        this.title = title;
        this.nameMeeting = nameMeeting;
    }

    public Integer getIdActivity() {
        return idActivity;
    }

    public void setIdActivity(Integer idActivity) {
        this.idActivity = idActivity;
    }

    public Date getDateCommunication() {
        return dateCommunication;
    }

    public void setDateCommunication(Date dateCommunication) {
        this.dateCommunication = dateCommunication;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNameMeeting() {
        return nameMeeting;
    }

    public void setNameMeeting(String nameMeeting) {
        this.nameMeeting = nameMeeting;
    }

    public Date getDateMeeting() {
        return dateMeeting;
    }

    public void setDateMeeting(Date dateMeeting) {
        this.dateMeeting = dateMeeting;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public TypeInvitedOralCom getIdTypeMeeting() {
        return idTypeMeeting;
    }

    public void setIdTypeMeeting(TypeInvitedOralCom idTypeMeeting) {
        this.idTypeMeeting = idTypeMeeting;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idActivity != null ? idActivity.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InvitedOralCommunication)) {
            return false;
        }
        InvitedOralCommunication other = (InvitedOralCommunication) object;
        if ((this.idActivity == null && other.idActivity != null) || (this.idActivity != null && !this.idActivity.equals(other.idActivity))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.centrale.pgrou.items.InvitedOralCommunication[ idActivity=" + idActivity + " ]";
    }
    
}
