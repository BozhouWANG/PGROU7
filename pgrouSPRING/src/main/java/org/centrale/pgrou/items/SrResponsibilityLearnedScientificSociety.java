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
@Table(name = "sr_responsibility_learned_scientific_society")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SrResponsibilityLearnedScientificSociety.findAll", query = "SELECT s FROM SrResponsibilityLearnedScientificSociety s"),
    @NamedQuery(name = "SrResponsibilityLearnedScientificSociety.findByIdActivity", query = "SELECT s FROM SrResponsibilityLearnedScientificSociety s WHERE s.idActivity = :idActivity"),
    @NamedQuery(name = "SrResponsibilityLearnedScientificSociety.findByScientificSocietyName", query = "SELECT s FROM SrResponsibilityLearnedScientificSociety s WHERE s.scientificSocietyName = :scientificSocietyName"),
    @NamedQuery(name = "SrResponsibilityLearnedScientificSociety.findByStartDate", query = "SELECT s FROM SrResponsibilityLearnedScientificSociety s WHERE s.startDate = :startDate"),
    @NamedQuery(name = "SrResponsibilityLearnedScientificSociety.findByEndDate", query = "SELECT s FROM SrResponsibilityLearnedScientificSociety s WHERE s.endDate = :endDate")})
public class SrResponsibilityLearnedScientificSociety implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_activity")
    private Integer idActivity;
    @Size(max = 2147483647)
    @Column(name = "scientific_society_name")
    private String scientificSocietyName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "start_date")
    @Temporal(TemporalType.DATE)
    private Date startDate;
    @Column(name = "end_date")
    @Temporal(TemporalType.DATE)
    private Date endDate;
    @JoinColumn(name = "id_role_pi", referencedColumnName = "id_role_pi")
    @ManyToOne(optional = false)
    private RolePiScientificRecognition idRolePi;

    public SrResponsibilityLearnedScientificSociety() {
    }

    public SrResponsibilityLearnedScientificSociety(Integer idActivity) {
        this.idActivity = idActivity;
    }

    public SrResponsibilityLearnedScientificSociety(Integer idActivity, Date startDate) {
        this.idActivity = idActivity;
        this.startDate = startDate;
    }

    public Integer getIdActivity() {
        return idActivity;
    }

    public void setIdActivity(Integer idActivity) {
        this.idActivity = idActivity;
    }

    public String getScientificSocietyName() {
        return scientificSocietyName;
    }

    public void setScientificSocietyName(String scientificSocietyName) {
        this.scientificSocietyName = scientificSocietyName;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public RolePiScientificRecognition getIdRolePi() {
        return idRolePi;
    }

    public void setIdRolePi(RolePiScientificRecognition idRolePi) {
        this.idRolePi = idRolePi;
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
        if (!(object instanceof SrResponsibilityLearnedScientificSociety)) {
            return false;
        }
        SrResponsibilityLearnedScientificSociety other = (SrResponsibilityLearnedScientificSociety) object;
        if ((this.idActivity == null && other.idActivity != null) || (this.idActivity != null && !this.idActivity.equals(other.idActivity))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.centrale.pgrou.items.SrResponsibilityLearnedScientificSociety[ idActivity=" + idActivity + " ]";
    }
    
}
