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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "team")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Team.findAll", query = "SELECT t FROM Team t"),
    @NamedQuery(name = "Team.findByIdTeam", query = "SELECT t FROM Team t WHERE t.idTeam = :idTeam"),
    @NamedQuery(name = "Team.findByNomEquipe", query = "SELECT t FROM Team t WHERE t.nomEquipe = :nomEquipe"),
    @NamedQuery(name = "Team.findByCreationDate", query = "SELECT t FROM Team t WHERE t.creationDate = :creationDate"),
    @NamedQuery(name = "Team.findByEndDate", query = "SELECT t FROM Team t WHERE t.endDate = :endDate"),
    @NamedQuery(name = "Team.findByIdOrcidResearcher", query = "SELECT t FROM Team t WHERE t.idOrcidResearcher = :idOrcidResearcher"),
    @NamedQuery(name = "Team.findByDateLastReport", query = "SELECT t FROM Team t WHERE t.dateLastReport = :dateLastReport")})
public class Team implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_team")
    private Integer idTeam;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "nom_equipe")
    private String nomEquipe;
    @Basic(optional = false)
    @NotNull
    @Column(name = "creation_date")
    @Temporal(TemporalType.DATE)
    private Date creationDate;
    @Column(name = "end_date")
    @Temporal(TemporalType.DATE)
    private Date endDate;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "id_orcid_researcher")
    private String idOrcidResearcher;
    @Basic(optional = false)
    @NotNull
    @Column(name = "date_last_report")
    @Temporal(TemporalType.DATE)
    private Date dateLastReport;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTeam")
    private Collection<Activity> activityCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTeam")
    private Collection<BelongsTeam> belongsTeamCollection;
    @JoinColumn(name = "id_referent", referencedColumnName = "id_referent")
    @ManyToOne(optional = false)
    private Referent idReferent;

    public Team() {
    }

    public Team(Integer idTeam) {
        this.idTeam = idTeam;
    }

    public Team(Integer idTeam, String nomEquipe, Date creationDate, String idOrcidResearcher, Date dateLastReport) {
        this.idTeam = idTeam;
        this.nomEquipe = nomEquipe;
        this.creationDate = creationDate;
        this.idOrcidResearcher = idOrcidResearcher;
        this.dateLastReport = dateLastReport;
    }

    public Integer getIdTeam() {
        return idTeam;
    }

    public void setIdTeam(Integer idTeam) {
        this.idTeam = idTeam;
    }

    public String getNomEquipe() {
        return nomEquipe;
    }

    public void setNomEquipe(String nomEquipe) {
        this.nomEquipe = nomEquipe;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getIdOrcidResearcher() {
        return idOrcidResearcher;
    }

    public void setIdOrcidResearcher(String idOrcidResearcher) {
        this.idOrcidResearcher = idOrcidResearcher;
    }

    public Date getDateLastReport() {
        return dateLastReport;
    }

    public void setDateLastReport(Date dateLastReport) {
        this.dateLastReport = dateLastReport;
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

    public Referent getIdReferent() {
        return idReferent;
    }

    public void setIdReferent(Referent idReferent) {
        this.idReferent = idReferent;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTeam != null ? idTeam.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Team)) {
            return false;
        }
        Team other = (Team) object;
        if ((this.idTeam == null && other.idTeam != null) || (this.idTeam != null && !this.idTeam.equals(other.idTeam))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.centrale.pgrou.items.Team[ idTeam=" + idTeam + " ]";
    }
    
}
