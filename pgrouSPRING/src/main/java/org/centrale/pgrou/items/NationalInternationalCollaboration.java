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
@Table(name = "national_international_collaboration")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "NationalInternationalCollaboration.findAll", query = "SELECT n FROM NationalInternationalCollaboration n"),
    @NamedQuery(name = "NationalInternationalCollaboration.findByIdActivity", query = "SELECT n FROM NationalInternationalCollaboration n WHERE n.idActivity = :idActivity"),
    @NamedQuery(name = "NationalInternationalCollaboration.findByDateProjectStart", query = "SELECT n FROM NationalInternationalCollaboration n WHERE n.dateProjectStart = :dateProjectStart"),
    @NamedQuery(name = "NationalInternationalCollaboration.findByPartnerEntity", query = "SELECT n FROM NationalInternationalCollaboration n WHERE n.partnerEntity = :partnerEntity"),
    @NamedQuery(name = "NationalInternationalCollaboration.findByCountryStateCity", query = "SELECT n FROM NationalInternationalCollaboration n WHERE n.countryStateCity = :countryStateCity"),
    @NamedQuery(name = "NationalInternationalCollaboration.findByPiPartners", query = "SELECT n FROM NationalInternationalCollaboration n WHERE n.piPartners = :piPartners"),
    @NamedQuery(name = "NationalInternationalCollaboration.findByMailPartners", query = "SELECT n FROM NationalInternationalCollaboration n WHERE n.mailPartners = :mailPartners"),
    @NamedQuery(name = "NationalInternationalCollaboration.findByProjetcTitle", query = "SELECT n FROM NationalInternationalCollaboration n WHERE n.projetcTitle = :projetcTitle"),
    @NamedQuery(name = "NationalInternationalCollaboration.findByStrategicRecurringCollab", query = "SELECT n FROM NationalInternationalCollaboration n WHERE n.strategicRecurringCollab = :strategicRecurringCollab"),
    @NamedQuery(name = "NationalInternationalCollaboration.findByActiveProject", query = "SELECT n FROM NationalInternationalCollaboration n WHERE n.activeProject = :activeProject"),
    @NamedQuery(name = "NationalInternationalCollaboration.findByAssociatedFunding", query = "SELECT n FROM NationalInternationalCollaboration n WHERE n.associatedFunding = :associatedFunding"),
    @NamedQuery(name = "NationalInternationalCollaboration.findByNumberResultingPublications", query = "SELECT n FROM NationalInternationalCollaboration n WHERE n.numberResultingPublications = :numberResultingPublications"),
    @NamedQuery(name = "NationalInternationalCollaboration.findByRefJointPublication", query = "SELECT n FROM NationalInternationalCollaboration n WHERE n.refJointPublication = :refJointPublication"),
    @NamedQuery(name = "NationalInternationalCollaboration.findByUmr1064Coordinated", query = "SELECT n FROM NationalInternationalCollaboration n WHERE n.umr1064Coordinated = :umr1064Coordinated"),
    @NamedQuery(name = "NationalInternationalCollaboration.findByAgreementSigned", query = "SELECT n FROM NationalInternationalCollaboration n WHERE n.agreementSigned = :agreementSigned")})
public class NationalInternationalCollaboration implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_activity")
    private Integer idActivity;
    @Basic(optional = false)
    @NotNull
    @Column(name = "date_project_start")
    @Temporal(TemporalType.DATE)
    private Date dateProjectStart;
    @Size(max = 2147483647)
    @Column(name = "partner_entity")
    private String partnerEntity;
    @Size(max = 2147483647)
    @Column(name = "country_state_city")
    private String countryStateCity;
    @Size(max = 2147483647)
    @Column(name = "pi_partners")
    private String piPartners;
    @Size(max = 2147483647)
    @Column(name = "mail_partners")
    private String mailPartners;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "projetc_title")
    private String projetcTitle;
    @Basic(optional = false)
    @NotNull
    @Column(name = "strategic_recurring_collab")
    private boolean strategicRecurringCollab;
    @Basic(optional = false)
    @NotNull
    @Column(name = "active_project")
    private boolean activeProject;
    @Size(max = 2147483647)
    @Column(name = "associated_funding")
    private String associatedFunding;
    @Column(name = "number_resulting_publications")
    private Integer numberResultingPublications;
    @Size(max = 2147483647)
    @Column(name = "ref_joint_publication")
    private String refJointPublication;
    @Column(name = "umr1064_coordinated")
    private Boolean umr1064Coordinated;
    @Column(name = "agreement_signed")
    private Boolean agreementSigned;
    @JoinColumn(name = "id_type", referencedColumnName = "id_type")
    @ManyToOne(optional = false)
    private ChoiceTypeCollab idType;

    public NationalInternationalCollaboration() {
    }

    public NationalInternationalCollaboration(Integer idActivity) {
        this.idActivity = idActivity;
    }

    public NationalInternationalCollaboration(Integer idActivity, Date dateProjectStart, String projetcTitle, boolean strategicRecurringCollab, boolean activeProject) {
        this.idActivity = idActivity;
        this.dateProjectStart = dateProjectStart;
        this.projetcTitle = projetcTitle;
        this.strategicRecurringCollab = strategicRecurringCollab;
        this.activeProject = activeProject;
    }

    public Integer getIdActivity() {
        return idActivity;
    }

    public void setIdActivity(Integer idActivity) {
        this.idActivity = idActivity;
    }

    public Date getDateProjectStart() {
        return dateProjectStart;
    }

    public void setDateProjectStart(Date dateProjectStart) {
        this.dateProjectStart = dateProjectStart;
    }

    public String getPartnerEntity() {
        return partnerEntity;
    }

    public void setPartnerEntity(String partnerEntity) {
        this.partnerEntity = partnerEntity;
    }

    public String getCountryStateCity() {
        return countryStateCity;
    }

    public void setCountryStateCity(String countryStateCity) {
        this.countryStateCity = countryStateCity;
    }

    public String getPiPartners() {
        return piPartners;
    }

    public void setPiPartners(String piPartners) {
        this.piPartners = piPartners;
    }

    public String getMailPartners() {
        return mailPartners;
    }

    public void setMailPartners(String mailPartners) {
        this.mailPartners = mailPartners;
    }

    public String getProjetcTitle() {
        return projetcTitle;
    }

    public void setProjetcTitle(String projetcTitle) {
        this.projetcTitle = projetcTitle;
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

    public String getAssociatedFunding() {
        return associatedFunding;
    }

    public void setAssociatedFunding(String associatedFunding) {
        this.associatedFunding = associatedFunding;
    }

    public Integer getNumberResultingPublications() {
        return numberResultingPublications;
    }

    public void setNumberResultingPublications(Integer numberResultingPublications) {
        this.numberResultingPublications = numberResultingPublications;
    }

    public String getRefJointPublication() {
        return refJointPublication;
    }

    public void setRefJointPublication(String refJointPublication) {
        this.refJointPublication = refJointPublication;
    }

    public Boolean getUmr1064Coordinated() {
        return umr1064Coordinated;
    }

    public void setUmr1064Coordinated(Boolean umr1064Coordinated) {
        this.umr1064Coordinated = umr1064Coordinated;
    }

    public Boolean getAgreementSigned() {
        return agreementSigned;
    }

    public void setAgreementSigned(Boolean agreementSigned) {
        this.agreementSigned = agreementSigned;
    }

    public ChoiceTypeCollab getIdType() {
        return idType;
    }

    public void setIdType(ChoiceTypeCollab idType) {
        this.idType = idType;
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
        if (!(object instanceof NationalInternationalCollaboration)) {
            return false;
        }
        NationalInternationalCollaboration other = (NationalInternationalCollaboration) object;
        if ((this.idActivity == null && other.idActivity != null) || (this.idActivity != null && !this.idActivity.equals(other.idActivity))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.centrale.pgrou.items.NationalInternationalCollaboration[ idActivity=" + idActivity + " ]";
    }
    
}
