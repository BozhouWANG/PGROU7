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
@Table(name = "patent_licence_invention_disclosure")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PatentLicenceInventionDisclosure.findAll", query = "SELECT p FROM PatentLicenceInventionDisclosure p"),
    @NamedQuery(name = "PatentLicenceInventionDisclosure.findByIdActivity", query = "SELECT p FROM PatentLicenceInventionDisclosure p WHERE p.idActivity = :idActivity"),
    @NamedQuery(name = "PatentLicenceInventionDisclosure.findByRegistrationDate", query = "SELECT p FROM PatentLicenceInventionDisclosure p WHERE p.registrationDate = :registrationDate"),
    @NamedQuery(name = "PatentLicenceInventionDisclosure.findByFilingDate", query = "SELECT p FROM PatentLicenceInventionDisclosure p WHERE p.filingDate = :filingDate"),
    @NamedQuery(name = "PatentLicenceInventionDisclosure.findByAcceptationDate", query = "SELECT p FROM PatentLicenceInventionDisclosure p WHERE p.acceptationDate = :acceptationDate"),
    @NamedQuery(name = "PatentLicenceInventionDisclosure.findByLicensingDate", query = "SELECT p FROM PatentLicenceInventionDisclosure p WHERE p.licensingDate = :licensingDate"),
    @NamedQuery(name = "PatentLicenceInventionDisclosure.findByTitle", query = "SELECT p FROM PatentLicenceInventionDisclosure p WHERE p.title = :title"),
    @NamedQuery(name = "PatentLicenceInventionDisclosure.findByInventors", query = "SELECT p FROM PatentLicenceInventionDisclosure p WHERE p.inventors = :inventors"),
    @NamedQuery(name = "PatentLicenceInventionDisclosure.findByCoOwners", query = "SELECT p FROM PatentLicenceInventionDisclosure p WHERE p.coOwners = :coOwners"),
    @NamedQuery(name = "PatentLicenceInventionDisclosure.findByPriorityNumber", query = "SELECT p FROM PatentLicenceInventionDisclosure p WHERE p.priorityNumber = :priorityNumber"),
    @NamedQuery(name = "PatentLicenceInventionDisclosure.findByPriorityDate", query = "SELECT p FROM PatentLicenceInventionDisclosure p WHERE p.priorityDate = :priorityDate"),
    @NamedQuery(name = "PatentLicenceInventionDisclosure.findByPublicationNumber", query = "SELECT p FROM PatentLicenceInventionDisclosure p WHERE p.publicationNumber = :publicationNumber"),
    @NamedQuery(name = "PatentLicenceInventionDisclosure.findByPublicationDate", query = "SELECT p FROM PatentLicenceInventionDisclosure p WHERE p.publicationDate = :publicationDate"),
    @NamedQuery(name = "PatentLicenceInventionDisclosure.findByPctExtensionObtained", query = "SELECT p FROM PatentLicenceInventionDisclosure p WHERE p.pctExtensionObtained = :pctExtensionObtained"),
    @NamedQuery(name = "PatentLicenceInventionDisclosure.findByPublicationNumberPctExtension", query = "SELECT p FROM PatentLicenceInventionDisclosure p WHERE p.publicationNumberPctExtension = :publicationNumberPctExtension"),
    @NamedQuery(name = "PatentLicenceInventionDisclosure.findByPublicationDatePctExtension", query = "SELECT p FROM PatentLicenceInventionDisclosure p WHERE p.publicationDatePctExtension = :publicationDatePctExtension"),
    @NamedQuery(name = "PatentLicenceInventionDisclosure.findByInternationalExtension", query = "SELECT p FROM PatentLicenceInventionDisclosure p WHERE p.internationalExtension = :internationalExtension"),
    @NamedQuery(name = "PatentLicenceInventionDisclosure.findByPublicationNumberInternationalExtension", query = "SELECT p FROM PatentLicenceInventionDisclosure p WHERE p.publicationNumberInternationalExtension = :publicationNumberInternationalExtension"),
    @NamedQuery(name = "PatentLicenceInventionDisclosure.findByPublicationDateInternationalExtension", query = "SELECT p FROM PatentLicenceInventionDisclosure p WHERE p.publicationDateInternationalExtension = :publicationDateInternationalExtension"),
    @NamedQuery(name = "PatentLicenceInventionDisclosure.findByRefTransferContract", query = "SELECT p FROM PatentLicenceInventionDisclosure p WHERE p.refTransferContract = :refTransferContract"),
    @NamedQuery(name = "PatentLicenceInventionDisclosure.findByNameCompanyInvolved", query = "SELECT p FROM PatentLicenceInventionDisclosure p WHERE p.nameCompanyInvolved = :nameCompanyInvolved"),
    @NamedQuery(name = "PatentLicenceInventionDisclosure.findByStatus", query = "SELECT p FROM PatentLicenceInventionDisclosure p WHERE p.status = :status"),
    @NamedQuery(name = "PatentLicenceInventionDisclosure.findByInpiLink", query = "SELECT p FROM PatentLicenceInventionDisclosure p WHERE p.inpiLink = :inpiLink")})
public class PatentLicenceInventionDisclosure implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_activity")
    private Integer idActivity;
    @Column(name = "registration_date")
    @Temporal(TemporalType.DATE)
    private Date registrationDate;
    @Column(name = "filing_date")
    @Temporal(TemporalType.DATE)
    private Date filingDate;
    @Column(name = "acceptation_date")
    @Temporal(TemporalType.DATE)
    private Date acceptationDate;
    @Column(name = "licensing_date")
    @Temporal(TemporalType.DATE)
    private Date licensingDate;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "title")
    private String title;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "inventors")
    private String inventors;
    @Size(max = 2147483647)
    @Column(name = "co_owners")
    private String coOwners;
    @Basic(optional = false)
    @NotNull
    @Column(name = "priority_number")
    private float priorityNumber;
    @Basic(optional = false)
    @NotNull
    @Column(name = "priority_date")
    @Temporal(TemporalType.DATE)
    private Date priorityDate;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "publication_number")
    private String publicationNumber;
    @Column(name = "publication_date")
    @Temporal(TemporalType.DATE)
    private Date publicationDate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pct_extension_obtained")
    private boolean pctExtensionObtained;
    @Size(max = 2147483647)
    @Column(name = "publication_number_pct_extension")
    private String publicationNumberPctExtension;
    @Column(name = "publication_date_pct_extension")
    @Temporal(TemporalType.DATE)
    private Date publicationDatePctExtension;
    @Basic(optional = false)
    @NotNull
    @Column(name = "international_extension")
    private boolean internationalExtension;
    @Size(max = 2147483647)
    @Column(name = "publication_number_international_extension")
    private String publicationNumberInternationalExtension;
    @Column(name = "publication_date_international_extension")
    @Temporal(TemporalType.DATE)
    private Date publicationDateInternationalExtension;
    @Size(max = 2147483647)
    @Column(name = "ref_transfer_contract")
    private String refTransferContract;
    @Size(max = 2147483647)
    @Column(name = "name_company_involved")
    private String nameCompanyInvolved;
    @Basic(optional = false)
    @NotNull
    @Column(name = "status")
    private boolean status;
    @Size(max = 2147483647)
    @Column(name = "inpi_link")
    private String inpiLink;
    @JoinColumn(name = "id_type", referencedColumnName = "id_type")
    @ManyToOne(optional = false)
    private TypePatent idType;

    public PatentLicenceInventionDisclosure() {
    }

    public PatentLicenceInventionDisclosure(Integer idActivity) {
        this.idActivity = idActivity;
    }

    public PatentLicenceInventionDisclosure(Integer idActivity, String title, String inventors, float priorityNumber, Date priorityDate, String publicationNumber, boolean pctExtensionObtained, boolean internationalExtension, boolean status) {
        this.idActivity = idActivity;
        this.title = title;
        this.inventors = inventors;
        this.priorityNumber = priorityNumber;
        this.priorityDate = priorityDate;
        this.publicationNumber = publicationNumber;
        this.pctExtensionObtained = pctExtensionObtained;
        this.internationalExtension = internationalExtension;
        this.status = status;
    }

    public Integer getIdActivity() {
        return idActivity;
    }

    public void setIdActivity(Integer idActivity) {
        this.idActivity = idActivity;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public Date getFilingDate() {
        return filingDate;
    }

    public void setFilingDate(Date filingDate) {
        this.filingDate = filingDate;
    }

    public Date getAcceptationDate() {
        return acceptationDate;
    }

    public void setAcceptationDate(Date acceptationDate) {
        this.acceptationDate = acceptationDate;
    }

    public Date getLicensingDate() {
        return licensingDate;
    }

    public void setLicensingDate(Date licensingDate) {
        this.licensingDate = licensingDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getInventors() {
        return inventors;
    }

    public void setInventors(String inventors) {
        this.inventors = inventors;
    }

    public String getCoOwners() {
        return coOwners;
    }

    public void setCoOwners(String coOwners) {
        this.coOwners = coOwners;
    }

    public float getPriorityNumber() {
        return priorityNumber;
    }

    public void setPriorityNumber(float priorityNumber) {
        this.priorityNumber = priorityNumber;
    }

    public Date getPriorityDate() {
        return priorityDate;
    }

    public void setPriorityDate(Date priorityDate) {
        this.priorityDate = priorityDate;
    }

    public String getPublicationNumber() {
        return publicationNumber;
    }

    public void setPublicationNumber(String publicationNumber) {
        this.publicationNumber = publicationNumber;
    }

    public Date getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(Date publicationDate) {
        this.publicationDate = publicationDate;
    }

    public boolean getPctExtensionObtained() {
        return pctExtensionObtained;
    }

    public void setPctExtensionObtained(boolean pctExtensionObtained) {
        this.pctExtensionObtained = pctExtensionObtained;
    }

    public String getPublicationNumberPctExtension() {
        return publicationNumberPctExtension;
    }

    public void setPublicationNumberPctExtension(String publicationNumberPctExtension) {
        this.publicationNumberPctExtension = publicationNumberPctExtension;
    }

    public Date getPublicationDatePctExtension() {
        return publicationDatePctExtension;
    }

    public void setPublicationDatePctExtension(Date publicationDatePctExtension) {
        this.publicationDatePctExtension = publicationDatePctExtension;
    }

    public boolean getInternationalExtension() {
        return internationalExtension;
    }

    public void setInternationalExtension(boolean internationalExtension) {
        this.internationalExtension = internationalExtension;
    }

    public String getPublicationNumberInternationalExtension() {
        return publicationNumberInternationalExtension;
    }

    public void setPublicationNumberInternationalExtension(String publicationNumberInternationalExtension) {
        this.publicationNumberInternationalExtension = publicationNumberInternationalExtension;
    }

    public Date getPublicationDateInternationalExtension() {
        return publicationDateInternationalExtension;
    }

    public void setPublicationDateInternationalExtension(Date publicationDateInternationalExtension) {
        this.publicationDateInternationalExtension = publicationDateInternationalExtension;
    }

    public String getRefTransferContract() {
        return refTransferContract;
    }

    public void setRefTransferContract(String refTransferContract) {
        this.refTransferContract = refTransferContract;
    }

    public String getNameCompanyInvolved() {
        return nameCompanyInvolved;
    }

    public void setNameCompanyInvolved(String nameCompanyInvolved) {
        this.nameCompanyInvolved = nameCompanyInvolved;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getInpiLink() {
        return inpiLink;
    }

    public void setInpiLink(String inpiLink) {
        this.inpiLink = inpiLink;
    }

    public TypePatent getIdType() {
        return idType;
    }

    public void setIdType(TypePatent idType) {
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
        if (!(object instanceof PatentLicenceInventionDisclosure)) {
            return false;
        }
        PatentLicenceInventionDisclosure other = (PatentLicenceInventionDisclosure) object;
        if ((this.idActivity == null && other.idActivity != null) || (this.idActivity != null && !this.idActivity.equals(other.idActivity))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.centrale.pgrou.items.PatentLicenceInventionDisclosure[ idActivity=" + idActivity + " ]";
    }
    
}
