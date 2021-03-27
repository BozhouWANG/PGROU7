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
@Table(name = "sei_clinical_trial")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SeiClinicalTrial.findAll", query = "SELECT s FROM SeiClinicalTrial s"),
    @NamedQuery(name = "SeiClinicalTrial.findByIdActivity", query = "SELECT s FROM SeiClinicalTrial s WHERE s.idActivity = :idActivity"),
    @NamedQuery(name = "SeiClinicalTrial.findByStartDate", query = "SELECT s FROM SeiClinicalTrial s WHERE s.startDate = :startDate"),
    @NamedQuery(name = "SeiClinicalTrial.findByCoordinatorPartner", query = "SELECT s FROM SeiClinicalTrial s WHERE s.coordinatorPartner = :coordinatorPartner"),
    @NamedQuery(name = "SeiClinicalTrial.findByTitleClinicalTrial", query = "SELECT s FROM SeiClinicalTrial s WHERE s.titleClinicalTrial = :titleClinicalTrial"),
    @NamedQuery(name = "SeiClinicalTrial.findByEndDate", query = "SELECT s FROM SeiClinicalTrial s WHERE s.endDate = :endDate"),
    @NamedQuery(name = "SeiClinicalTrial.findByRegistrationNb", query = "SELECT s FROM SeiClinicalTrial s WHERE s.registrationNb = :registrationNb"),
    @NamedQuery(name = "SeiClinicalTrial.findBySponsorName", query = "SELECT s FROM SeiClinicalTrial s WHERE s.sponsorName = :sponsorName"),
    @NamedQuery(name = "SeiClinicalTrial.findByIncludedPatientsNb", query = "SELECT s FROM SeiClinicalTrial s WHERE s.includedPatientsNb = :includedPatientsNb"),
    @NamedQuery(name = "SeiClinicalTrial.findByFunding", query = "SELECT s FROM SeiClinicalTrial s WHERE s.funding = :funding"),
    @NamedQuery(name = "SeiClinicalTrial.findByFundingAmount", query = "SELECT s FROM SeiClinicalTrial s WHERE s.fundingAmount = :fundingAmount")})
public class SeiClinicalTrial implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_activity")
    private Integer idActivity;
    @Basic(optional = false)
    @NotNull
    @Column(name = "start_date")
    @Temporal(TemporalType.DATE)
    private Date startDate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "coordinator_partner")
    private boolean coordinatorPartner;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "title_clinical_trial")
    private String titleClinicalTrial;
    @Column(name = "end_date")
    @Temporal(TemporalType.DATE)
    private Date endDate;
    @Size(max = 2147483647)
    @Column(name = "registration_nb")
    private String registrationNb;
    @Size(max = 2147483647)
    @Column(name = "sponsor_name")
    private String sponsorName;
    @Column(name = "included_patients_nb")
    private Integer includedPatientsNb;
    @Size(max = 2147483647)
    @Column(name = "funding")
    private String funding;
    @Column(name = "funding_amount")
    private Integer fundingAmount;

    public SeiClinicalTrial() {
    }

    public SeiClinicalTrial(Integer idActivity) {
        this.idActivity = idActivity;
    }

    public SeiClinicalTrial(Integer idActivity, Date startDate, boolean coordinatorPartner, String titleClinicalTrial) {
        this.idActivity = idActivity;
        this.startDate = startDate;
        this.coordinatorPartner = coordinatorPartner;
        this.titleClinicalTrial = titleClinicalTrial;
    }

    public Integer getIdActivity() {
        return idActivity;
    }

    public void setIdActivity(Integer idActivity) {
        this.idActivity = idActivity;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public boolean getCoordinatorPartner() {
        return coordinatorPartner;
    }

    public void setCoordinatorPartner(boolean coordinatorPartner) {
        this.coordinatorPartner = coordinatorPartner;
    }

    public String getTitleClinicalTrial() {
        return titleClinicalTrial;
    }

    public void setTitleClinicalTrial(String titleClinicalTrial) {
        this.titleClinicalTrial = titleClinicalTrial;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getRegistrationNb() {
        return registrationNb;
    }

    public void setRegistrationNb(String registrationNb) {
        this.registrationNb = registrationNb;
    }

    public String getSponsorName() {
        return sponsorName;
    }

    public void setSponsorName(String sponsorName) {
        this.sponsorName = sponsorName;
    }

    public Integer getIncludedPatientsNb() {
        return includedPatientsNb;
    }

    public void setIncludedPatientsNb(Integer includedPatientsNb) {
        this.includedPatientsNb = includedPatientsNb;
    }

    public String getFunding() {
        return funding;
    }

    public void setFunding(String funding) {
        this.funding = funding;
    }

    public Integer getFundingAmount() {
        return fundingAmount;
    }

    public void setFundingAmount(Integer fundingAmount) {
        this.fundingAmount = fundingAmount;
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
        if (!(object instanceof SeiClinicalTrial)) {
            return false;
        }
        SeiClinicalTrial other = (SeiClinicalTrial) object;
        if ((this.idActivity == null && other.idActivity != null) || (this.idActivity != null && !this.idActivity.equals(other.idActivity))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.centrale.pgrou.items.SeiClinicalTrial[ idActivity=" + idActivity + " ]";
    }
    
}
