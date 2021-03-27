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
@Table(name = "scientific_expertise")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ScientificExpertise.findAll", query = "SELECT s FROM ScientificExpertise s"),
    @NamedQuery(name = "ScientificExpertise.findByIdActivity", query = "SELECT s FROM ScientificExpertise s WHERE s.idActivity = :idActivity"),
    @NamedQuery(name = "ScientificExpertise.findByStartDate", query = "SELECT s FROM ScientificExpertise s WHERE s.startDate = :startDate"),
    @NamedQuery(name = "ScientificExpertise.findByDescription", query = "SELECT s FROM ScientificExpertise s WHERE s.description = :description"),
    @NamedQuery(name = "ScientificExpertise.findByEndDate", query = "SELECT s FROM ScientificExpertise s WHERE s.endDate = :endDate")})
public class ScientificExpertise implements Serializable {

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
    @Size(min = 1, max = 2147483647)
    @Column(name = "description")
    private String description;
    @Column(name = "end_date")
    @Temporal(TemporalType.DATE)
    private Date endDate;
    @JoinColumn(name = "id_type", referencedColumnName = "id_type")
    @ManyToOne(optional = false)
    private ChoiceScientificExpertise idType;

    public ScientificExpertise() {
    }

    public ScientificExpertise(Integer idActivity) {
        this.idActivity = idActivity;
    }

    public ScientificExpertise(Integer idActivity, Date startDate, String description) {
        this.idActivity = idActivity;
        this.startDate = startDate;
        this.description = description;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public ChoiceScientificExpertise getIdType() {
        return idType;
    }

    public void setIdType(ChoiceScientificExpertise idType) {
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
        if (!(object instanceof ScientificExpertise)) {
            return false;
        }
        ScientificExpertise other = (ScientificExpertise) object;
        if ((this.idActivity == null && other.idActivity != null) || (this.idActivity != null && !this.idActivity.equals(other.idActivity))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.centrale.pgrou.items.ScientificExpertise[ idActivity=" + idActivity + " ]";
    }
    
}
