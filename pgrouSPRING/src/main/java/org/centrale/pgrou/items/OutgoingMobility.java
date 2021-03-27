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
@Table(name = "outgoing_mobility")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OutgoingMobility.findAll", query = "SELECT o FROM OutgoingMobility o"),
    @NamedQuery(name = "OutgoingMobility.findByIdActivity", query = "SELECT o FROM OutgoingMobility o WHERE o.idActivity = :idActivity"),
    @NamedQuery(name = "OutgoingMobility.findByNamePersonConcerned", query = "SELECT o FROM OutgoingMobility o WHERE o.namePersonConcerned = :namePersonConcerned"),
    @NamedQuery(name = "OutgoingMobility.findByArrivalDate", query = "SELECT o FROM OutgoingMobility o WHERE o.arrivalDate = :arrivalDate"),
    @NamedQuery(name = "OutgoingMobility.findByDepartureDate", query = "SELECT o FROM OutgoingMobility o WHERE o.departureDate = :departureDate"),
    @NamedQuery(name = "OutgoingMobility.findByDuration", query = "SELECT o FROM OutgoingMobility o WHERE o.duration = :duration"),
    @NamedQuery(name = "OutgoingMobility.findByHostLabName", query = "SELECT o FROM OutgoingMobility o WHERE o.hostLabName = :hostLabName"),
    @NamedQuery(name = "OutgoingMobility.findByHostLabLocation", query = "SELECT o FROM OutgoingMobility o WHERE o.hostLabLocation = :hostLabLocation"),
    @NamedQuery(name = "OutgoingMobility.findByPiPartner", query = "SELECT o FROM OutgoingMobility o WHERE o.piPartner = :piPartner"),
    @NamedQuery(name = "OutgoingMobility.findByProjectTitle", query = "SELECT o FROM OutgoingMobility o WHERE o.projectTitle = :projectTitle"),
    @NamedQuery(name = "OutgoingMobility.findByAssociatedFunding", query = "SELECT o FROM OutgoingMobility o WHERE o.associatedFunding = :associatedFunding"),
    @NamedQuery(name = "OutgoingMobility.findByNbPublications", query = "SELECT o FROM OutgoingMobility o WHERE o.nbPublications = :nbPublications"),
    @NamedQuery(name = "OutgoingMobility.findByPublicationReference", query = "SELECT o FROM OutgoingMobility o WHERE o.publicationReference = :publicationReference"),
    @NamedQuery(name = "OutgoingMobility.findByStrategicRecurringCollab", query = "SELECT o FROM OutgoingMobility o WHERE o.strategicRecurringCollab = :strategicRecurringCollab"),
    @NamedQuery(name = "OutgoingMobility.findByActiveProject", query = "SELECT o FROM OutgoingMobility o WHERE o.activeProject = :activeProject"),
    @NamedQuery(name = "OutgoingMobility.findByUmr1064Coordinated", query = "SELECT o FROM OutgoingMobility o WHERE o.umr1064Coordinated = :umr1064Coordinated"),
    @NamedQuery(name = "OutgoingMobility.findByAgreementSigned", query = "SELECT o FROM OutgoingMobility o WHERE o.agreementSigned = :agreementSigned")})
public class OutgoingMobility implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_activity")
    private Integer idActivity;
    @Size(max = 2147483647)
    @Column(name = "name_person_concerned")
    private String namePersonConcerned;
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
    @Column(name = "host_lab_name")
    private String hostLabName;
    @Size(max = 2147483647)
    @Column(name = "host_lab_location")
    private String hostLabLocation;
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
    @Column(name = "nb_publications")
    private Integer nbPublications;
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

    public OutgoingMobility() {
    }

    public OutgoingMobility(Integer idActivity) {
        this.idActivity = idActivity;
    }

    public OutgoingMobility(Integer idActivity, Date arrivalDate, String projectTitle, boolean strategicRecurringCollab, boolean activeProject, boolean umr1064Coordinated, boolean agreementSigned) {
        this.idActivity = idActivity;
        this.arrivalDate = arrivalDate;
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

    public String getNamePersonConcerned() {
        return namePersonConcerned;
    }

    public void setNamePersonConcerned(String namePersonConcerned) {
        this.namePersonConcerned = namePersonConcerned;
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

    public String getHostLabName() {
        return hostLabName;
    }

    public void setHostLabName(String hostLabName) {
        this.hostLabName = hostLabName;
    }

    public String getHostLabLocation() {
        return hostLabLocation;
    }

    public void setHostLabLocation(String hostLabLocation) {
        this.hostLabLocation = hostLabLocation;
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

    public Integer getNbPublications() {
        return nbPublications;
    }

    public void setNbPublications(Integer nbPublications) {
        this.nbPublications = nbPublications;
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
        if (!(object instanceof OutgoingMobility)) {
            return false;
        }
        OutgoingMobility other = (OutgoingMobility) object;
        if ((this.idActivity == null && other.idActivity != null) || (this.idActivity != null && !this.idActivity.equals(other.idActivity))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.centrale.pgrou.items.OutgoingMobility[ idActivity=" + idActivity + " ]";
    }
    
}
