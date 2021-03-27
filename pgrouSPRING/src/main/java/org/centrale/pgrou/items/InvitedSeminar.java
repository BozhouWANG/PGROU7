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
@Table(name = "invited_seminar")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "InvitedSeminar.findAll", query = "SELECT i FROM InvitedSeminar i"),
    @NamedQuery(name = "InvitedSeminar.findByIdActivity", query = "SELECT i FROM InvitedSeminar i WHERE i.idActivity = :idActivity"),
    @NamedQuery(name = "InvitedSeminar.findByDate", query = "SELECT i FROM InvitedSeminar i WHERE i.date = :date"),
    @NamedQuery(name = "InvitedSeminar.findByTitleSeminar", query = "SELECT i FROM InvitedSeminar i WHERE i.titleSeminar = :titleSeminar"),
    @NamedQuery(name = "InvitedSeminar.findByLocation", query = "SELECT i FROM InvitedSeminar i WHERE i.location = :location"),
    @NamedQuery(name = "InvitedSeminar.findByInvitedBy", query = "SELECT i FROM InvitedSeminar i WHERE i.invitedBy = :invitedBy")})
public class InvitedSeminar implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_activity")
    private Integer idActivity;
    @Basic(optional = false)
    @NotNull
    @Column(name = "date")
    @Temporal(TemporalType.DATE)
    private Date date;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "title_seminar")
    private String titleSeminar;
    @Size(max = 2147483647)
    @Column(name = "location")
    private String location;
    @Size(max = 2147483647)
    @Column(name = "invited_by")
    private String invitedBy;

    public InvitedSeminar() {
    }

    public InvitedSeminar(Integer idActivity) {
        this.idActivity = idActivity;
    }

    public InvitedSeminar(Integer idActivity, Date date, String titleSeminar) {
        this.idActivity = idActivity;
        this.date = date;
        this.titleSeminar = titleSeminar;
    }

    public Integer getIdActivity() {
        return idActivity;
    }

    public void setIdActivity(Integer idActivity) {
        this.idActivity = idActivity;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTitleSeminar() {
        return titleSeminar;
    }

    public void setTitleSeminar(String titleSeminar) {
        this.titleSeminar = titleSeminar;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getInvitedBy() {
        return invitedBy;
    }

    public void setInvitedBy(String invitedBy) {
        this.invitedBy = invitedBy;
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
        if (!(object instanceof InvitedSeminar)) {
            return false;
        }
        InvitedSeminar other = (InvitedSeminar) object;
        if ((this.idActivity == null && other.idActivity != null) || (this.idActivity != null && !this.idActivity.equals(other.idActivity))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.centrale.pgrou.items.InvitedSeminar[ idActivity=" + idActivity + " ]";
    }
    
}
