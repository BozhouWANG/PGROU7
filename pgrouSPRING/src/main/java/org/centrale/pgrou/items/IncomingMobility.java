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
@Table(name = "incoming_mobility")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "IncomingMobility.findAll", query = "SELECT i FROM IncomingMobility i"),
    @NamedQuery(name = "IncomingMobility.findByIdActivity", query = "SELECT i FROM IncomingMobility i WHERE i.idActivity = :idActivity"),
    @NamedQuery(name = "IncomingMobility.findByNameSeniorScientist", query = "SELECT i FROM IncomingMobility i WHERE i.nameSeniorScientist = :nameSeniorScientist"),
    @NamedQuery(name = "IncomingMobility.findByArrivalDate", query = "SELECT i FROM IncomingMobility i WHERE i.arrivalDate = :arrivalDate"),
    @NamedQuery(name = "IncomingMobility.findByDepartureDate", query = "SELECT i FROM IncomingMobility i WHERE i.departureDate = :departureDate"),
    @NamedQuery(name = "IncomingMobility.findByDuration", query = "SELECT i FROM IncomingMobility i WHERE i.duration = :duration"),
    @NamedQuery(name = "IncomingMobility.findByNationality", query = "SELECT i FROM IncomingMobility i WHERE i.nationality = :nationality"),
    @NamedQuery(name = "IncomingMobility.findByOriginalLabName", query = "SELECT i FROM IncomingMobility i WHERE i.originalLabName = :originalLabName"),
    @NamedQuery(name = "IncomingMobility.findByOriginaLabLocation", query = "SELECT i FROM IncomingMobility i WHERE i.originaLabLocation = :originaLabLocation"),
    @NamedQuery(name = "IncomingMobility.findByPiPartner", query = "SELECT i FROM IncomingMobility i WHERE i.piPartner = :piPartner"),
    @NamedQuery(name = "IncomingMobility.findByProjectTitle", query = "SELECT i FROM IncomingMobility i WHERE i.projectTitle = :projectTitle"),
    @NamedQuery(name = "IncomingMobility.findByAssociatedFunding", query = "SELECT i FROM IncomingMobility i WHERE i.associatedFunding = :associatedFunding"),
    @NamedQuery(name = "IncomingMobility.findByPublicationReference", query = "SELECT i FROM IncomingMobility i WHERE i.publicationReference = :publicationReference"),
    @NamedQuery(name = "IncomingMobility.findByStrategicRecurringCollab", query = "SELECT i FROM IncomingMobility i WHERE i.strategicRecurringCollab = :strategicRecurringCollab"),
    @NamedQuery(name = "IncomingMobility.findByActiveProject", query = "SELECT i FROM IncomingMobility i WHERE i.activeProject = :activeProject"),
    @NamedQuery(name = "IncomingMobility.findByUmr1064Coordinated", query = "SELECT i FROM IncomingMobility i WHERE i.umr1064Coordinated = :umr1064Coordinated"),
    @NamedQuery(name = "IncomingMobility.findByAgreementSigned", query = "SELECT i FROM IncomingMobility i WHERE i.agreementSigned = :agreementSigned")})
public class IncomingMobility implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_activity")
    private Integer idActivity;
    @Size(max = 2147483647)
    @Column(name = "name_senior_scientist")
    private String nameSeniorScientist;
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
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "nationality")
    private String nationality;
    @Size(max = 2147483647)
    @Column(name = "original_lab_name")
    private String originalLabName;
    @Size(max = 2147483647)
    @Column(name = "origina_lab_location")
    private String originaLabLocation;
    @Size(max = 2147483647)
    @Column(name = "pi_partner")
    private String piPartner;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "project_title")
    private String projectTitle;
    @Size(max = 2147483647)
    @Column(name = "associated_funding")
    private String associatedFunding;
    @Size(max = 2147483647)
    @Column(name = "publication_reference")
    private String publicationReference;
    @Basic(optional = false)
    @NotNull
    @Column(name = "strategic_recurring_collab")
    private boolean strategicRecurringCollab;
    @Basic(optional = false)
    @NotNull
    @Column(name = "active_project")
    private boolean activeProject;
    @Basic(optional = false)
    @NotNull
    @Column(name = "umr1064_coordinated")
    private boolean umr1064Coordinated;
    @Basic(optional = false)
    @NotNull
    @Column(name = "agreement_signed")
    private boolean agreementSigned;

    public IncomingMobility() {
    }

    public IncomingMobility(Integer idActivity) {
        this.idActivity = idActivity;
    }

    public IncomingMobility(Integer idActivity, Date arrivalDate, String nationality, String projectTitle, boolean strategicRecurringCollab, boolean activeProject, boolean umr1064Coordinated, boolean agreementSigned) {
        this.idActivity = idActivity;
        this.arrivalDate = arrivalDate;
        this.nationality = nationality;
        this.projectTitle = projectTitle;
        this.strategicRecurringCollab = strategicRecurringCollab;
        this.activeProject = activeProject;
        this.umr1064Coordinated = umr1064Coordinated;
        this.agreementSigned = agreementSigned;
    }

    public Integer getIdActivity() {
        return idActivity;
    }

    public void setIdActivity(Integer idActivity) {
        this.idActivity = idActivity;
    }

    public String getNameSeniorScientist() {
        return nameSeniorScientist;
    }

    public void setNameSeniorScientist(String nameSeniorScientist) {
        this.nameSeniorScientist = nameSeniorScientist;
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

    public String getOriginalLabName() {
        return originalLabName;
    }

    public void setOriginalLabName(String originalLabName) {
        this.originalLabName = originalLabName;
    }

    public String getOriginaLabLocation() {
        return originaLabLocation;
    }

    public void setOriginaLabLocation(String originaLabLocation) {
        this.originaLabLocation = originaLabLocation;
    }

    public String getPiPartner() {
        return piPartner;
    }

    public void setPiPartner(String piPartner) {
        this.piPartner = piPartner;
    }

    public String getProjectTitle() {
        return projectTitle;
    }

    public void setProjectTitle(String projectTitle) {
        this.projectTitle = projectTitle;
    }

    public String getAssociatedFunding() {
        return associatedFunding;
    }

    public void setAssociatedFunding(String associatedFunding) {
        this.associatedFunding = associatedFunding;
    }

    public String getPublicationReference() {
        return publicationReference;
    }

    public void setPublicationReference(String publicationReference) {
        this.publicationReference = publicationReference;
    }

    public boolean getStrategicRecurringCollab() {
        return strategicRecurringCollab;
    }

    public void setStrategicRecurringCollab(boolean strategicRecurringCollab) {
        this.strategicRecurringCollab = strategicRecurringCollab;
    }

    public boolean getActiveProject() {
        return activeProject;
    }

    public void setActiveProject(boolean activeProject) {
        this.activeProject = activeProject;
    }

    public boolean getUmr1064Coordinated() {
        return umr1064Coordinated;
    }

    public void setUmr1064Coordinated(boolean umr1064Coordinated) {
        this.umr1064Coordinated = umr1064Coordinated;
    }

    public boolean getAgreementSigned() {
        return agreementSigned;
    }

    public void setAgreementSigned(boolean agreementSigned) {
        this.agreementSigned = agreementSigned;
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
        if (!(object instanceof IncomingMobility)) {
            return false;
        }
        IncomingMobility other = (IncomingMobility) object;
        if ((this.idActivity == null && other.idActivity != null) || (this.idActivity != null && !this.idActivity.equals(other.idActivity))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.centrale.pgrou.items.IncomingMobility[ idActivity=" + idActivity + " ]";
    }
    
}
