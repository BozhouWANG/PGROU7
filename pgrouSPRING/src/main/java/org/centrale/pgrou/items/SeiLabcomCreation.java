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
@Table(name = "sei_labcom_creation")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SeiLabcomCreation.findAll", query = "SELECT s FROM SeiLabcomCreation s"),
    @NamedQuery(name = "SeiLabcomCreation.findByIdActivity", query = "SELECT s FROM SeiLabcomCreation s WHERE s.idActivity = :idActivity"),
    @NamedQuery(name = "SeiLabcomCreation.findByContractStartDate", query = "SELECT s FROM SeiLabcomCreation s WHERE s.contractStartDate = :contractStartDate"),
    @NamedQuery(name = "SeiLabcomCreation.findByNameLabcom", query = "SELECT s FROM SeiLabcomCreation s WHERE s.nameLabcom = :nameLabcom"),
    @NamedQuery(name = "SeiLabcomCreation.findByNameCompanyInvolved", query = "SELECT s FROM SeiLabcomCreation s WHERE s.nameCompanyInvolved = :nameCompanyInvolved"),
    @NamedQuery(name = "SeiLabcomCreation.findByTitleProject", query = "SELECT s FROM SeiLabcomCreation s WHERE s.titleProject = :titleProject"),
    @NamedQuery(name = "SeiLabcomCreation.findByContractEndDate", query = "SELECT s FROM SeiLabcomCreation s WHERE s.contractEndDate = :contractEndDate"),
    @NamedQuery(name = "SeiLabcomCreation.findByAssociatedPubliRef", query = "SELECT s FROM SeiLabcomCreation s WHERE s.associatedPubliRef = :associatedPubliRef")})
public class SeiLabcomCreation implements Serializable {

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
    @Column(name = "name_labcom")
    private String nameLabcom;
    @Size(max = 2147483647)
    @Column(name = "name_company_involved")
    private String nameCompanyInvolved;
    @Size(max = 2147483647)
    @Column(name = "title_project")
    private String titleProject;
    @Column(name = "contract_end_date")
    @Temporal(TemporalType.DATE)
    private Date contractEndDate;
    @Size(max = 2147483647)
    @Column(name = "associated_publi_ref")
    private String associatedPubliRef;

    public SeiLabcomCreation() {
    }

    public SeiLabcomCreation(Integer idActivity) {
        this.idActivity = idActivity;
    }

    public SeiLabcomCreation(Integer idActivity, Date contractStartDate) {
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

    public String getNameLabcom() {
        return nameLabcom;
    }

    public void setNameLabcom(String nameLabcom) {
        this.nameLabcom = nameLabcom;
    }

    public String getNameCompanyInvolved() {
        return nameCompanyInvolved;
    }

    public void setNameCompanyInvolved(String nameCompanyInvolved) {
        this.nameCompanyInvolved = nameCompanyInvolved;
    }

    public String getTitleProject() {
        return titleProject;
    }

    public void setTitleProject(String titleProject) {
        this.titleProject = titleProject;
    }

    public Date getContractEndDate() {
        return contractEndDate;
    }

    public void setContractEndDate(Date contractEndDate) {
        this.contractEndDate = contractEndDate;
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
        if (!(object instanceof SeiLabcomCreation)) {
            return false;
        }
        SeiLabcomCreation other = (SeiLabcomCreation) object;
        if ((this.idActivity == null && other.idActivity != null) || (this.idActivity != null && !this.idActivity.equals(other.idActivity))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.centrale.pgrou.items.SeiLabcomCreation[ idActivity=" + idActivity + " ]";
    }
    
}
