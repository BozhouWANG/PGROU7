/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.centrale.pgrou.items;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author macar
 */
@Entity
@Table(name = "doctoral_student")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DoctoralStudent.findAll", query = "SELECT d FROM DoctoralStudent d"),
    @NamedQuery(name = "DoctoralStudent.findByIdDocStudent", query = "SELECT d FROM DoctoralStudent d WHERE d.idDocStudent = :idDocStudent"),
    @NamedQuery(name = "DoctoralStudent.findByIdOrcid", query = "SELECT d FROM DoctoralStudent d WHERE d.idOrcid = :idOrcid"),
    @NamedQuery(name = "DoctoralStudent.findBySurnameStudent", query = "SELECT d FROM DoctoralStudent d WHERE d.surnameStudent = :surnameStudent"),
    @NamedQuery(name = "DoctoralStudent.findByNameStudent", query = "SELECT d FROM DoctoralStudent d WHERE d.nameStudent = :nameStudent"),
    @NamedQuery(name = "DoctoralStudent.findByDefenseDate", query = "SELECT d FROM DoctoralStudent d WHERE d.defenseDate = :defenseDate"),
    @NamedQuery(name = "DoctoralStudent.findByDateStartThesis", query = "SELECT d FROM DoctoralStudent d WHERE d.dateStartThesis = :dateStartThesis"),
    @NamedQuery(name = "DoctoralStudent.findByFuture", query = "SELECT d FROM DoctoralStudent d WHERE d.future = :future")})
public class DoctoralStudent implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_doc_student")
    private Integer idDocStudent;
    @Size(max = 2147483647)
    @Column(name = "id_orcid")
    private String idOrcid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "surname_student")
    private String surnameStudent;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "name_student")
    private String nameStudent;
    @Column(name = "defense_date")
    @Temporal(TemporalType.DATE)
    private Date defenseDate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "date_start_thesis")
    @Temporal(TemporalType.DATE)
    private Date dateStartThesis;
    @Size(max = 2147483647)
    @Column(name = "future")
    private String future;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idDocStudent")
    private Collection<Supervisor> supervisorCollection;
    @OneToMany(mappedBy = "idDocStudent")
    private Collection<Activity> activityCollection;
    @OneToMany(mappedBy = "idDocStudent")
    private Collection<BelongsTeam> belongsTeamCollection;

    public DoctoralStudent() {
    }

    public DoctoralStudent(Integer idDocStudent) {
        this.idDocStudent = idDocStudent;
    }

    public DoctoralStudent(Integer idDocStudent, String surnameStudent, String nameStudent, Date dateStartThesis) {
        this.idDocStudent = idDocStudent;
        this.surnameStudent = surnameStudent;
        this.nameStudent = nameStudent;
        this.dateStartThesis = dateStartThesis;
    }

    public Integer getIdDocStudent() {
        return idDocStudent;
    }

    public void setIdDocStudent(Integer idDocStudent) {
        this.idDocStudent = idDocStudent;
    }

    public String getIdOrcid() {
        return idOrcid;
    }

    public void setIdOrcid(String idOrcid) {
        this.idOrcid = idOrcid;
    }

    public String getSurnameStudent() {
        return surnameStudent;
    }

    public void setSurnameStudent(String surnameStudent) {
        this.surnameStudent = surnameStudent;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public Date getDefenseDate() {
        return defenseDate;
    }

    public void setDefenseDate(Date defenseDate) {
        this.defenseDate = defenseDate;
    }

    public Date getDateStartThesis() {
        return dateStartThesis;
    }

    public void setDateStartThesis(Date dateStartThesis) {
        this.dateStartThesis = dateStartThesis;
    }

    public String getFuture() {
        return future;
    }

    public void setFuture(String future) {
        this.future = future;
    }

    @XmlTransient
    public Collection<Supervisor> getSupervisorCollection() {
        return supervisorCollection;
    }

    public void setSupervisorCollection(Collection<Supervisor> supervisorCollection) {
        this.supervisorCollection = supervisorCollection;
    }

    @XmlTransient
    public Collection<Activity> getActivityCollection() {
        return activityCollection;
    }

    public void setActivityCollection(Collection<Activity> activityCollection) {
        this.activityCollection = activityCollection;
    }

    @XmlTransient
    public Collection<BelongsTeam> getBelongsTeamCollection() {
        return belongsTeamCollection;
    }

    public void setBelongsTeamCollection(Collection<BelongsTeam> belongsTeamCollection) {
        this.belongsTeamCollection = belongsTeamCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDocStudent != null ? idDocStudent.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DoctoralStudent)) {
            return false;
        }
        DoctoralStudent other = (DoctoralStudent) object;
        if ((this.idDocStudent == null && other.idDocStudent != null) || (this.idDocStudent != null && !this.idDocStudent.equals(other.idDocStudent))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.centrale.pgrou.items.DoctoralStudent[ idDocStudent=" + idDocStudent + " ]";
    }
    
}
