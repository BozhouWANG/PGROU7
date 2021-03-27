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
@Table(name = "sei_cifre_fellowship")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SeiCifreFellowship.findAll", query = "SELECT s FROM SeiCifreFellowship s"),
    @NamedQuery(name = "SeiCifreFellowship.findByIdActivity", query = "SELECT s FROM SeiCifreFellowship s WHERE s.idActivity = :idActivity"),
    @NamedQuery(name = "SeiCifreFellowship.findByContractStartDate", query = "SELECT s FROM SeiCifreFellowship s WHERE s.contractStartDate = :contractStartDate"),
    @NamedQuery(name = "SeiCifreFellowship.findByNameFellow", query = "SELECT s FROM SeiCifreFellowship s WHERE s.nameFellow = :nameFellow"),
    @NamedQuery(name = "SeiCifreFellowship.findByNameCompanyInvolved", query = "SELECT s FROM SeiCifreFellowship s WHERE s.nameCompanyInvolved = :nameCompanyInvolved"),
    @NamedQuery(name = "SeiCifreFellowship.findByTitleThesis", query = "SELECT s FROM SeiCifreFellowship s WHERE s.titleThesis = :titleThesis"),
    @NamedQuery(name = "SeiCifreFellowship.findByContractEndDate", query = "SELECT s FROM SeiCifreFellowship s WHERE s.contractEndDate = :contractEndDate"),
    @NamedQuery(name = "SeiCifreFellowship.findByContractAmount", query = "SELECT s FROM SeiCifreFellowship s WHERE s.contractAmount = :contractAmount"),
    @NamedQuery(name = "SeiCifreFellowship.findByAssociatedPubliRef", query = "SELECT s FROM SeiCifreFellowship s WHERE s.associatedPubliRef = :associatedPubliRef")})
public class SeiCifreFellowship implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_activity")
    private Integer idActivity;
    @Basic(optional = false)
    @NotNull
    @Column(name = "contract_start_date")
    @Temporal(TemporalType.DATE)
    private Date contractStartDate;
    @Size(max = 2147483647)
    @Column(name = "name_fellow")
    private String nameFellow;
    @Size(max = 2147483647)
    @Column(name = "name_company_involved")
    private String nameCompanyInvolved;
    @Size(max = 2147483647)
    @Column(name = "title_thesis")
    private String titleThesis;
    @Column(name = "contract_end_date")
    @Temporal(TemporalType.DATE)
    private Date contractEndDate;
    @Column(name = "contract_amount")
    private Integer contractAmount;
    @Size(max = 2147483647)
    @Column(name = "associated_publi_ref")
    private String associatedPubliRef;

    public SeiCifreFellowship() {
    }

    public SeiCifreFellowship(Integer idActivity) {
        this.idActivity = idActivity;
    }

    public SeiCifreFellowship(Integer idActivity, Date contractStartDate) {
        this.idActivity = idActivity;
        this.contractStartDate = contractStartDate;
    }

    public Integer getIdActivity() {
        return idActivity;
    }

    public void setIdActivity(Integer idActivity) {
        this.idActivity = idActivity;
    }

    public Date getContractStartDate() {
        return contractStartDate;
    }

    public void setContractStartDate(Date contractStartDate) {
        this.contractStartDate = contractStartDate;
    }

    public String getNameFellow() {
        return nameFellow;
    }

    public void setNameFellow(String nameFellow) {
        this.nameFellow = nameFellow;
    }

    public String getNameCompanyInvolved() {
        return nameCompanyInvolved;
    }

    public void setNameCompanyInvolved(String nameCompanyInvolved) {
        this.nameCompanyInvolved = nameCompanyInvolved;
    }

    public String getTitleThesis() {
        return titleThesis;
    }

    public void setTitleThesis(String titleThesis) {
        this.titleThesis = titleThesis;
    }

    public Date getContractEndDate() {
        return contractEndDate;
    }

    public void setContractEndDate(Date contractEndDate) {
        this.contractEndDate = contractEndDate;
    }

    public Integer getContractAmount() {
        return contractAmount;
    }

    public void setContractAmount(Integer contractAmount) {
        this.contractAmount = contractAmount;
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
        if (!(object instanceof SeiCifreFellowship)) {
            return false;
        }
        SeiCifreFellowship other = (SeiCifreFellowship) object;
        if ((this.idActivity == null && other.idActivity != null) || (this.idActivity != null && !this.idActivity.equals(other.idActivity))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.centrale.pgrou.items.SeiCifreFellowship[ idActivity=" + idActivity + " ]";
    }
    
}
