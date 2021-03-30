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
@Table(name = "sei_industrial_r_d_contract")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SeiIndustrialRDContract.findAll", query = "SELECT s FROM SeiIndustrialRDContract s"),
    @NamedQuery(name = "SeiIndustrialRDContract.findByIdActivity", query = "SELECT s FROM SeiIndustrialRDContract s WHERE s.idActivity = :idActivity"),
    @NamedQuery(name = "SeiIndustrialRDContract.findByStartDate", query = "SELECT s FROM SeiIndustrialRDContract s WHERE s.startDate = :startDate"),
    @NamedQuery(name = "SeiIndustrialRDContract.findByNameCompanyInvolved", query = "SELECT s FROM SeiIndustrialRDContract s WHERE s.nameCompanyInvolved = :nameCompanyInvolved"),
    @NamedQuery(name = "SeiIndustrialRDContract.findByProjectTitle", query = "SELECT s FROM SeiIndustrialRDContract s WHERE s.projectTitle = :projectTitle"),
    @NamedQuery(name = "SeiIndustrialRDContract.findByAgreementAmount", query = "SELECT s FROM SeiIndustrialRDContract s WHERE s.agreementAmount = :agreementAmount"),
    @NamedQuery(name = "SeiIndustrialRDContract.findByEndDate", query = "SELECT s FROM SeiIndustrialRDContract s WHERE s.endDate = :endDate"),
    @NamedQuery(name = "SeiIndustrialRDContract.findByAssociatedPubliRef", query = "SELECT s FROM SeiIndustrialRDContract s WHERE s.associatedPubliRef = :associatedPubliRef")})
public class SeiIndustrialRDContract implements Serializable {

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
    @Size(max = 2147483647)
    @Column(name = "name_company_involved")
    private String nameCompanyInvolved;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "project_title")
    private String projectTitle;
    @Column(name = "agreement_amount")
    private Integer agreementAmount;
    @Column(name = "end_date")
    @Temporal(TemporalType.DATE)
    private Date endDate;
    @Size(max = 2147483647)
    @Column(name = "associated_publi_ref")
    private String associatedPubliRef;

    public SeiIndustrialRDContract() {
    }

    public SeiIndustrialRDContract(Integer idActivity) {
        this.idActivity = idActivity;
    }

    public SeiIndustrialRDContract(Integer idActivity, Date startDate, String projectTitle) {
        this.idActivity = idActivity;
        this.startDate = startDate;
        this.projectTitle = projectTitle;
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

    public String getNameCompanyInvolved() {
        return nameCompanyInvolved;
    }

    public void setNameCompanyInvolved(String nameCompanyInvolved) {
        this.nameCompanyInvolved = nameCompanyInvolved;
    }

    public String getProjectTitle() {
        return projectTitle;
    }

    public void setProjectTitle(String projectTitle) {
        this.projectTitle = projectTitle;
    }

    public Integer getAgreementAmount() {
        return agreementAmount;
    }

    public void setAgreementAmount(Integer agreementAmount) {
        this.agreementAmount = agreementAmount;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
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
        if (!(object instanceof SeiIndustrialRDContract)) {
            return false;
        }
        SeiIndustrialRDContract other = (SeiIndustrialRDContract) object;
        if ((this.idActivity == null && other.idActivity != null) || (this.idActivity != null && !this.idActivity.equals(other.idActivity))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.centrale.pgrou.items.SeiIndustrialRDContract[ idActivity=" + idActivity + " ]";
    }
    
}
