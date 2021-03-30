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
@Table(name = "platform")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Platform.findAll", query = "SELECT p FROM Platform p"),
    @NamedQuery(name = "Platform.findByIdActivity", query = "SELECT p FROM Platform p WHERE p.idActivity = :idActivity"),
    @NamedQuery(name = "Platform.findByCreationDate", query = "SELECT p FROM Platform p WHERE p.creationDate = :creationDate"),
    @NamedQuery(name = "Platform.findByDescription", query = "SELECT p FROM Platform p WHERE p.description = :description"),
    @NamedQuery(name = "Platform.findByManagers", query = "SELECT p FROM Platform p WHERE p.managers = :managers"),
    @NamedQuery(name = "Platform.findByAffiliation", query = "SELECT p FROM Platform p WHERE p.affiliation = :affiliation"),
    @NamedQuery(name = "Platform.findByLabellisation", query = "SELECT p FROM Platform p WHERE p.labellisation = :labellisation"),
    @NamedQuery(name = "Platform.findByOpenPrivateResearchers", query = "SELECT p FROM Platform p WHERE p.openPrivateResearchers = :openPrivateResearchers")})
public class Platform implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_activity")
    private Integer idActivity;
    @Basic(optional = false)
    @NotNull
    @Column(name = "creation_date")
    @Temporal(TemporalType.DATE)
    private Date creationDate;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "description")
    private String description;
    @Size(max = 2147483647)
    @Column(name = "managers")
    private String managers;
    @Size(max = 2147483647)
    @Column(name = "affiliation")
    private String affiliation;
    @Size(max = 2147483647)
    @Column(name = "labellisation")
    private String labellisation;
    @Basic(optional = false)
    @NotNull
    @Column(name = "open_private_researchers")
    private boolean openPrivateResearchers;

    public Platform() {
    }

    public Platform(Integer idActivity) {
        this.idActivity = idActivity;
    }

    public Platform(Integer idActivity, Date creationDate, String description, boolean openPrivateResearchers) {
        this.idActivity = idActivity;
        this.creationDate = creationDate;
        this.description = description;
        this.openPrivateResearchers = openPrivateResearchers;
    }

    public Integer getIdActivity() {
        return idActivity;
    }

    public void setIdActivity(Integer idActivity) {
        this.idActivity = idActivity;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getManagers() {
        return managers;
    }

    public void setManagers(String managers) {
        this.managers = managers;
    }

    public String getAffiliation() {
        return affiliation;
    }

    public void setAffiliation(String affiliation) {
        this.affiliation = affiliation;
    }

    public String getLabellisation() {
        return labellisation;
    }

    public void setLabellisation(String labellisation) {
        this.labellisation = labellisation;
    }

    public boolean getOpenPrivateResearchers() {
        return openPrivateResearchers;
    }

    public void setOpenPrivateResearchers(boolean openPrivateResearchers) {
        this.openPrivateResearchers = openPrivateResearchers;
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
        if (!(object instanceof Platform)) {
            return false;
        }
        Platform other = (Platform) object;
        if ((this.idActivity == null && other.idActivity != null) || (this.idActivity != null && !this.idActivity.equals(other.idActivity))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.centrale.pgrou.items.Platform[ idActivity=" + idActivity + " ]";
    }
    
}
