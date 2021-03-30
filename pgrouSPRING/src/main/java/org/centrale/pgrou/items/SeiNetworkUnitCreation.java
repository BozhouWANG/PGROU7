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
@Table(name = "sei_network_unit_creation")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SeiNetworkUnitCreation.findAll", query = "SELECT s FROM SeiNetworkUnitCreation s"),
    @NamedQuery(name = "SeiNetworkUnitCreation.findByIdActivity", query = "SELECT s FROM SeiNetworkUnitCreation s WHERE s.idActivity = :idActivity"),
    @NamedQuery(name = "SeiNetworkUnitCreation.findByNetworkStartDate", query = "SELECT s FROM SeiNetworkUnitCreation s WHERE s.networkStartDate = :networkStartDate"),
    @NamedQuery(name = "SeiNetworkUnitCreation.findByNameNetwork", query = "SELECT s FROM SeiNetworkUnitCreation s WHERE s.nameNetwork = :nameNetwork"),
    @NamedQuery(name = "SeiNetworkUnitCreation.findByNamePartner", query = "SELECT s FROM SeiNetworkUnitCreation s WHERE s.namePartner = :namePartner"),
    @NamedQuery(name = "SeiNetworkUnitCreation.findByTitleProject", query = "SELECT s FROM SeiNetworkUnitCreation s WHERE s.titleProject = :titleProject"),
    @NamedQuery(name = "SeiNetworkUnitCreation.findByNetworkEndDate", query = "SELECT s FROM SeiNetworkUnitCreation s WHERE s.networkEndDate = :networkEndDate"),
    @NamedQuery(name = "SeiNetworkUnitCreation.findByAssociatedPubliRef", query = "SELECT s FROM SeiNetworkUnitCreation s WHERE s.associatedPubliRef = :associatedPubliRef")})
public class SeiNetworkUnitCreation implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_activity")
    private Integer idActivity;
    @Basic(optional = false)
    @NotNull
    @Column(name = "network_start_date")
    @Temporal(TemporalType.DATE)
    private Date networkStartDate;
    @Size(max = 2147483647)
    @Column(name = "name_network")
    private String nameNetwork;
    @Size(max = 2147483647)
    @Column(name = "name_partner")
    private String namePartner;
    @Size(max = 2147483647)
    @Column(name = "title_project")
    private String titleProject;
    @Column(name = "network_end_date")
    @Temporal(TemporalType.DATE)
    private Date networkEndDate;
    @Size(max = 2147483647)
    @Column(name = "associated_publi_ref")
    private String associatedPubliRef;

    public SeiNetworkUnitCreation() {
    }

    public SeiNetworkUnitCreation(Integer idActivity) {
        this.idActivity = idActivity;
    }

    public SeiNetworkUnitCreation(Integer idActivity, Date networkStartDate) {
        this.idActivity = idActivity;
        this.networkStartDate = networkStartDate;
    }

    public Integer getIdActivity() {
        return idActivity;
    }

    public void setIdActivity(Integer idActivity) {
        this.idActivity = idActivity;
    }

    public Date getNetworkStartDate() {
        return networkStartDate;
    }

    public void setNetworkStartDate(Date networkStartDate) {
        this.networkStartDate = networkStartDate;
    }

    public String getNameNetwork() {
        return nameNetwork;
    }

    public void setNameNetwork(String nameNetwork) {
        this.nameNetwork = nameNetwork;
    }

    public String getNamePartner() {
        return namePartner;
    }

    public void setNamePartner(String namePartner) {
        this.namePartner = namePartner;
    }

    public String getTitleProject() {
        return titleProject;
    }

    public void setTitleProject(String titleProject) {
        this.titleProject = titleProject;
    }

    public Date getNetworkEndDate() {
        return networkEndDate;
    }

    public void setNetworkEndDate(Date networkEndDate) {
        this.networkEndDate = networkEndDate;
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
        if (!(object instanceof SeiNetworkUnitCreation)) {
            return false;
        }
        SeiNetworkUnitCreation other = (SeiNetworkUnitCreation) object;
        if ((this.idActivity == null && other.idActivity != null) || (this.idActivity != null && !this.idActivity.equals(other.idActivity))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.centrale.pgrou.items.SeiNetworkUnitCreation[ idActivity=" + idActivity + " ]";
    }
    
}
