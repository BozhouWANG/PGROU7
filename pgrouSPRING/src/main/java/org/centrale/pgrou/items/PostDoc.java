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
@Table(name = "post_doc")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PostDoc.findAll", query = "SELECT p FROM PostDoc p"),
    @NamedQuery(name = "PostDoc.findByIdActivity", query = "SELECT p FROM PostDoc p WHERE p.idActivity = :idActivity"),
    @NamedQuery(name = "PostDoc.findByNamePostDoc", query = "SELECT p FROM PostDoc p WHERE p.namePostDoc = :namePostDoc"),
    @NamedQuery(name = "PostDoc.findByNameSupervisor", query = "SELECT p FROM PostDoc p WHERE p.nameSupervisor = :nameSupervisor"),
    @NamedQuery(name = "PostDoc.findByArrivalDate", query = "SELECT p FROM PostDoc p WHERE p.arrivalDate = :arrivalDate"),
    @NamedQuery(name = "PostDoc.findByDepartureDate", query = "SELECT p FROM PostDoc p WHERE p.departureDate = :departureDate"),
    @NamedQuery(name = "PostDoc.findByDuration", query = "SELECT p FROM PostDoc p WHERE p.duration = :duration"),
    @NamedQuery(name = "PostDoc.findByNationality", query = "SELECT p FROM PostDoc p WHERE p.nationality = :nationality"),
    @NamedQuery(name = "PostDoc.findByOriginalLab", query = "SELECT p FROM PostDoc p WHERE p.originalLab = :originalLab"),
    @NamedQuery(name = "PostDoc.findByAssociatedFunding", query = "SELECT p FROM PostDoc p WHERE p.associatedFunding = :associatedFunding"),
    @NamedQuery(name = "PostDoc.findByAssociatedPubliRef", query = "SELECT p FROM PostDoc p WHERE p.associatedPubliRef = :associatedPubliRef")})
public class PostDoc implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_activity")
    private Integer idActivity;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "name_post_doc")
    private String namePostDoc;
    @Size(max = 2147483647)
    @Column(name = "name_supervisor")
    private String nameSupervisor;
    @Basic(optional = false)
    @NotNull
    @Column(name = "arrival_date")
    @Temporal(TemporalType.DATE)
    private Date arrivalDate;
    @Column(name = "departure_date")
    @Temporal(TemporalType.DATE)
    private Date departureDate;
    @Column(name = "duration")
    private Integer duration;
    @Size(max = 2147483647)
    @Column(name = "nationality")
    private String nationality;
    @Size(max = 2147483647)
    @Column(name = "original_lab")
    private String originalLab;
    @Size(max = 2147483647)
    @Column(name = "associated_funding")
    private String associatedFunding;
    @Size(max = 2147483647)
    @Column(name = "associated_publi_ref")
    private String associatedPubliRef;

    public PostDoc() {
    }

    public PostDoc(Integer idActivity) {
        this.idActivity = idActivity;
    }

    public PostDoc(Integer idActivity, String namePostDoc, Date arrivalDate) {
        this.idActivity = idActivity;
        this.namePostDoc = namePostDoc;
        this.arrivalDate = arrivalDate;
    }

    public Integer getIdActivity() {
        return idActivity;
    }

    public void setIdActivity(Integer idActivity) {
        this.idActivity = idActivity;
    }

    public String getNamePostDoc() {
        return namePostDoc;
    }

    public void setNamePostDoc(String namePostDoc) {
        this.namePostDoc = namePostDoc;
    }

    public String getNameSupervisor() {
        return nameSupervisor;
    }

    public void setNameSupervisor(String nameSupervisor) {
        this.nameSupervisor = nameSupervisor;
    }

    public Date getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(Date arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public Date getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(Date departureDate) {
        this.departureDate = departureDate;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getOriginalLab() {
        return originalLab;
    }

    public void setOriginalLab(String originalLab) {
        this.originalLab = originalLab;
    }

    public String getAssociatedFunding() {
        return associatedFunding;
    }

    public void setAssociatedFunding(String associatedFunding) {
        this.associatedFunding = associatedFunding;
    }

    public String getAssociatedPubliRef() {
        return associatedPubliRef;
    }

    public void setAssociatedPubliRef(String associatedPubliRef) {
        this.associatedPubliRef = associatedPubliRef;
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
        if (!(object instanceof PostDoc)) {
            return false;
        }
        PostDoc other = (PostDoc) object;
        if ((this.idActivity == null && other.idActivity != null) || (this.idActivity != null && !this.idActivity.equals(other.idActivity))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.centrale.pgrou.items.PostDoc[ idActivity=" + idActivity + " ]";
    }
    
}
