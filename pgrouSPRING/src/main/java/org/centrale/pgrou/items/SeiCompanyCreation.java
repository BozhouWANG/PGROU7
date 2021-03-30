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
@Table(name = "sei_company_creation")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SeiCompanyCreation.findAll", query = "SELECT s FROM SeiCompanyCreation s"),
    @NamedQuery(name = "SeiCompanyCreation.findByIdActivity", query = "SELECT s FROM SeiCompanyCreation s WHERE s.idActivity = :idActivity"),
    @NamedQuery(name = "SeiCompanyCreation.findByDateCreation", query = "SELECT s FROM SeiCompanyCreation s WHERE s.dateCreation = :dateCreation"),
    @NamedQuery(name = "SeiCompanyCreation.findByNameCompany", query = "SELECT s FROM SeiCompanyCreation s WHERE s.nameCompany = :nameCompany"),
    @NamedQuery(name = "SeiCompanyCreation.findByInActivity", query = "SELECT s FROM SeiCompanyCreation s WHERE s.inActivity = :inActivity")})
public class SeiCompanyCreation implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_activity")
    private Integer idActivity;
    @Basic(optional = false)
    @NotNull
    @Column(name = "date_creation")
    @Temporal(TemporalType.DATE)
    private Date dateCreation;
    @Size(max = 2147483647)
    @Column(name = "name_company")
    private String nameCompany;
    @Basic(optional = false)
    @NotNull
    @Column(name = "in_activity")
    private boolean inActivity;

    public SeiCompanyCreation() {
    }

    public SeiCompanyCreation(Integer idActivity) {
        this.idActivity = idActivity;
    }

    public SeiCompanyCreation(Integer idActivity, Date dateCreation, boolean inActivity) {
        this.idActivity = idActivity;
        this.dateCreation = dateCreation;
        this.inActivity = inActivity;
    }

    public Integer getIdActivity() {
        return idActivity;
    }

    public void setIdActivity(Integer idActivity) {
        this.idActivity = idActivity;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public String getNameCompany() {
        return nameCompany;
    }

    public void setNameCompany(String nameCompany) {
        this.nameCompany = nameCompany;
    }

    public boolean getInActivity() {
        return inActivity;
    }

    public void setInActivity(boolean inActivity) {
        this.inActivity = inActivity;
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
        if (!(object instanceof SeiCompanyCreation)) {
            return false;
        }
        SeiCompanyCreation other = (SeiCompanyCreation) object;
        if ((this.idActivity == null && other.idActivity != null) || (this.idActivity != null && !this.idActivity.equals(other.idActivity))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.centrale.pgrou.items.SeiCompanyCreation[ idActivity=" + idActivity + " ]";
    }
    
}
