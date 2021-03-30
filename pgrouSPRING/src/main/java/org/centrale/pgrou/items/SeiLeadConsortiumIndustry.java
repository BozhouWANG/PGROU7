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
@Table(name = "sei_lead_consortium_industry")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SeiLeadConsortiumIndustry.findAll", query = "SELECT s FROM SeiLeadConsortiumIndustry s"),
    @NamedQuery(name = "SeiLeadConsortiumIndustry.findByIdActivity", query = "SELECT s FROM SeiLeadConsortiumIndustry s WHERE s.idActivity = :idActivity"),
    @NamedQuery(name = "SeiLeadConsortiumIndustry.findByConsortiumStartDate", query = "SELECT s FROM SeiLeadConsortiumIndustry s WHERE s.consortiumStartDate = :consortiumStartDate"),
    @NamedQuery(name = "SeiLeadConsortiumIndustry.findByNameConsortium", query = "SELECT s FROM SeiLeadConsortiumIndustry s WHERE s.nameConsortium = :nameConsortium"),
    @NamedQuery(name = "SeiLeadConsortiumIndustry.findByTitleProject", query = "SELECT s FROM SeiLeadConsortiumIndustry s WHERE s.titleProject = :titleProject"),
    @NamedQuery(name = "SeiLeadConsortiumIndustry.findByPrivatePartyInvolved", query = "SELECT s FROM SeiLeadConsortiumIndustry s WHERE s.privatePartyInvolved = :privatePartyInvolved"),
    @NamedQuery(name = "SeiLeadConsortiumIndustry.findByConsortiumEndDate", query = "SELECT s FROM SeiLeadConsortiumIndustry s WHERE s.consortiumEndDate = :consortiumEndDate"),
    @NamedQuery(name = "SeiLeadConsortiumIndustry.findByAssociatedPubliRef", query = "SELECT s FROM SeiLeadConsortiumIndustry s WHERE s.associatedPubliRef = :associatedPubliRef")})
public class SeiLeadConsortiumIndustry implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_activity")
    private Integer idActivity;
    @Basic(optional = false)
    @NotNull
    @Column(name = "consortium_start_date")
    @Temporal(TemporalType.DATE)
    private Date consortiumStartDate;
    @Size(max = 2147483647)
    @Column(name = "name_consortium")
    private String nameConsortium;
    @Size(max = 2147483647)
    @Column(name = "title_project")
    private String titleProject;
    @Size(max = 2147483647)
    @Column(name = "private_party_involved")
    private String privatePartyInvolved;
    @Column(name = "consortium_end_date")
    @Temporal(TemporalType.DATE)
    private Date consortiumEndDate;
    @Size(max = 2147483647)
    @Column(name = "associated_publi_ref")
    private String associatedPubliRef;
    @JoinColumn(name = "id_type", referencedColumnName = "id_type")
    @ManyToOne(optional = false)
    private TypeConsortium idType;

    public SeiLeadConsortiumIndustry() {
    }

    public SeiLeadConsortiumIndustry(Integer idActivity) {
        this.idActivity = idActivity;
    }

    public SeiLeadConsortiumIndustry(Integer idActivity, Date consortiumStartDate) {
        this.idActivity = idActivity;
        this.consortiumStartDate = consortiumStartDate;
    }

    public Integer getIdActivity() {
        return idActivity;
    }

    public void setIdActivity(Integer idActivity) {
        this.idActivity = idActivity;
    }

    public Date getConsortiumStartDate() {
        return consortiumStartDate;
    }

    public void setConsortiumStartDate(Date consortiumStartDate) {
        this.consortiumStartDate = consortiumStartDate;
    }

    public String getNameConsortium() {
        return nameConsortium;
    }

    public void setNameConsortium(String nameConsortium) {
        this.nameConsortium = nameConsortium;
    }

    public String getTitleProject() {
        return titleProject;
    }

    public void setTitleProject(String titleProject) {
        this.titleProject = titleProject;
    }

    public String getPrivatePartyInvolved() {
        return privatePartyInvolved;
    }

    public void setPrivatePartyInvolved(String privatePartyInvolved) {
        this.privatePartyInvolved = privatePartyInvolved;
    }

    public Date getConsortiumEndDate() {
        return consortiumEndDate;
    }

    public void setConsortiumEndDate(Date consortiumEndDate) {
        this.consortiumEndDate = consortiumEndDate;
    }

    public String getAssociatedPubliRef() {
        return associatedPubliRef;
    }

    public void setAssociatedPubliRef(String associatedPubliRef) {
        this.associatedPubliRef = associatedPubliRef;
    }

    public TypeConsortium getIdType() {
        return idType;
    }

    public void setIdType(TypeConsortium idType) {
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
        if (!(object instanceof SeiLeadConsortiumIndustry)) {
            return false;
        }
        SeiLeadConsortiumIndustry other = (SeiLeadConsortiumIndustry) object;
        if ((this.idActivity == null && other.idActivity != null) || (this.idActivity != null && !this.idActivity.equals(other.idActivity))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.centrale.pgrou.items.SeiLeadConsortiumIndustry[ idActivity=" + idActivity + " ]";
    }
    
}
