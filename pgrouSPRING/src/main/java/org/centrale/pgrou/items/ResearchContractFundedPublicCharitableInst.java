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
@Table(name = "research_contract_funded_public_charitable_inst")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ResearchContractFundedPublicCharitableInst.findAll", query = "SELECT r FROM ResearchContractFundedPublicCharitableInst r"),
    @NamedQuery(name = "ResearchContractFundedPublicCharitableInst.findByIdActivity", query = "SELECT r FROM ResearchContractFundedPublicCharitableInst r WHERE r.idActivity = :idActivity"),
    @NamedQuery(name = "ResearchContractFundedPublicCharitableInst.findByDateContractAward", query = "SELECT r FROM ResearchContractFundedPublicCharitableInst r WHERE r.dateContractAward = :dateContractAward"),
    @NamedQuery(name = "ResearchContractFundedPublicCharitableInst.findByFundingIntitution", query = "SELECT r FROM ResearchContractFundedPublicCharitableInst r WHERE r.fundingIntitution = :fundingIntitution"),
    @NamedQuery(name = "ResearchContractFundedPublicCharitableInst.findByProjectTitle", query = "SELECT r FROM ResearchContractFundedPublicCharitableInst r WHERE r.projectTitle = :projectTitle"),
    @NamedQuery(name = "ResearchContractFundedPublicCharitableInst.findByStartYear", query = "SELECT r FROM ResearchContractFundedPublicCharitableInst r WHERE r.startYear = :startYear"),
    @NamedQuery(name = "ResearchContractFundedPublicCharitableInst.findByEndYear", query = "SELECT r FROM ResearchContractFundedPublicCharitableInst r WHERE r.endYear = :endYear"),
    @NamedQuery(name = "ResearchContractFundedPublicCharitableInst.findByGrantAmount", query = "SELECT r FROM ResearchContractFundedPublicCharitableInst r WHERE r.grantAmount = :grantAmount")})
public class ResearchContractFundedPublicCharitableInst implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_activity")
    private Integer idActivity;
    @Basic(optional = false)
    @NotNull
    @Column(name = "date_contract_award")
    @Temporal(TemporalType.DATE)
    private Date dateContractAward;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "funding_intitution")
    private String fundingIntitution;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "project_title")
    private String projectTitle;
    @Basic(optional = false)
    @NotNull
    @Column(name = "start_year")
    private int startYear;
    @Column(name = "end_year")
    private Integer endYear;
    @Column(name = "grant_amount")
    private Integer grantAmount;
    @JoinColumn(name = "id_type", referencedColumnName = "id_type")
    @ManyToOne(optional = false)
    private TypeResarchContract idType;

    public ResearchContractFundedPublicCharitableInst() {
    }

    public ResearchContractFundedPublicCharitableInst(Integer idActivity) {
        this.idActivity = idActivity;
    }

    public ResearchContractFundedPublicCharitableInst(Integer idActivity, Date dateContractAward, String fundingIntitution, String projectTitle, int startYear) {
        this.idActivity = idActivity;
        this.dateContractAward = dateContractAward;
        this.fundingIntitution = fundingIntitution;
        this.projectTitle = projectTitle;
        this.startYear = startYear;
    }

    public Integer getIdActivity() {
        return idActivity;
    }

    public void setIdActivity(Integer idActivity) {
        this.idActivity = idActivity;
    }

    public Date getDateContractAward() {
        return dateContractAward;
    }

    public void setDateContractAward(Date dateContractAward) {
        this.dateContractAward = dateContractAward;
    }

    public String getFundingIntitution() {
        return fundingIntitution;
    }

    public void setFundingIntitution(String fundingIntitution) {
        this.fundingIntitution = fundingIntitution;
    }

    public String getProjectTitle() {
        return projectTitle;
    }

    public void setProjectTitle(String projectTitle) {
        this.projectTitle = projectTitle;
    }

    public int getStartYear() {
        return startYear;
    }

    public void setStartYear(int startYear) {
        this.startYear = startYear;
    }

    public Integer getEndYear() {
        return endYear;
    }

    public void setEndYear(Integer endYear) {
        this.endYear = endYear;
    }

    public Integer getGrantAmount() {
        return grantAmount;
    }

    public void setGrantAmount(Integer grantAmount) {
        this.grantAmount = grantAmount;
    }

    public TypeResarchContract getIdType() {
        return idType;
    }

    public void setIdType(TypeResarchContract idType) {
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
        if (!(object instanceof ResearchContractFundedPublicCharitableInst)) {
            return false;
        }
        ResearchContractFundedPublicCharitableInst other = (ResearchContractFundedPublicCharitableInst) object;
        if ((this.idActivity == null && other.idActivity != null) || (this.idActivity != null && !this.idActivity.equals(other.idActivity))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.centrale.pgrou.items.ResearchContractFundedPublicCharitableInst[ idActivity=" + idActivity + " ]";
    }
    
}
