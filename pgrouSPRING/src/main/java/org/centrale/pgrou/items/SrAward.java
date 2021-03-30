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
@Table(name = "sr_award")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SrAward.findAll", query = "SELECT s FROM SrAward s"),
    @NamedQuery(name = "SrAward.findByIdActivity", query = "SELECT s FROM SrAward s WHERE s.idActivity = :idActivity"),
    @NamedQuery(name = "SrAward.findByAwardDate", query = "SELECT s FROM SrAward s WHERE s.awardDate = :awardDate"),
    @NamedQuery(name = "SrAward.findByAwardeeName", query = "SELECT s FROM SrAward s WHERE s.awardeeName = :awardeeName"),
    @NamedQuery(name = "SrAward.findByDescription", query = "SELECT s FROM SrAward s WHERE s.description = :description")})
public class SrAward implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_activity")
    private Integer idActivity;
    @Basic(optional = false)
    @NotNull
    @Column(name = "award_date")
    @Temporal(TemporalType.DATE)
    private Date awardDate;
    @Size(max = 2147483647)
    @Column(name = "awardee_name")
    private String awardeeName;
    @Size(max = 2147483647)
    @Column(name = "description")
    private String description;

    public SrAward() {
    }

    public SrAward(Integer idActivity) {
        this.idActivity = idActivity;
    }

    public SrAward(Integer idActivity, Date awardDate) {
        this.idActivity = idActivity;
        this.awardDate = awardDate;
    }

    public Integer getIdActivity() {
        return idActivity;
    }

    public void setIdActivity(Integer idActivity) {
        this.idActivity = idActivity;
    }

    public Date getAwardDate() {
        return awardDate;
    }

    public void setAwardDate(Date awardDate) {
        this.awardDate = awardDate;
    }

    public String getAwardeeName() {
        return awardeeName;
    }

    public void setAwardeeName(String awardeeName) {
        this.awardeeName = awardeeName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
        if (!(object instanceof SrAward)) {
            return false;
        }
        SrAward other = (SrAward) object;
        if ((this.idActivity == null && other.idActivity != null) || (this.idActivity != null && !this.idActivity.equals(other.idActivity))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.centrale.pgrou.items.SrAward[ idActivity=" + idActivity + " ]";
    }
    
}
