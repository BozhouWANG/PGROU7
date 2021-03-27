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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author macar
 */
@Entity
@Table(name = "belongs_team")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BelongsTeam.findAll", query = "SELECT b FROM BelongsTeam b"),
    @NamedQuery(name = "BelongsTeam.findByIdBelongsTeam", query = "SELECT b FROM BelongsTeam b WHERE b.idBelongsTeam = :idBelongsTeam"),
    @NamedQuery(name = "BelongsTeam.findByOnboardingDate", query = "SELECT b FROM BelongsTeam b WHERE b.onboardingDate = :onboardingDate"),
    @NamedQuery(name = "BelongsTeam.findByLeavingDate", query = "SELECT b FROM BelongsTeam b WHERE b.leavingDate = :leavingDate")})
public class BelongsTeam implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_belongs_team")
    private Integer idBelongsTeam;
    @Basic(optional = false)
    @NotNull
    @Column(name = "onboarding_date")
    @Temporal(TemporalType.DATE)
    private Date onboardingDate;
    @Column(name = "leaving_date")
    @Temporal(TemporalType.DATE)
    private Date leavingDate;
    @JoinColumn(name = "id_doc_student", referencedColumnName = "id_doc_student")
    @ManyToOne
    private DoctoralStudent idDocStudent;
    @JoinColumn(name = "id_orcid_researcher", referencedColumnName = "id_orcid_researcher")
    @ManyToOne
    private Researcher idOrcidResearcher;
    @JoinColumn(name = "id_team", referencedColumnName = "id_team")
    @ManyToOne(optional = false)
    private Team idTeam;

    public BelongsTeam() {
    }

    public BelongsTeam(Integer idBelongsTeam) {
        this.idBelongsTeam = idBelongsTeam;
    }

    public BelongsTeam(Integer idBelongsTeam, Date onboardingDate) {
        this.idBelongsTeam = idBelongsTeam;
        this.onboardingDate = onboardingDate;
    }

    public Integer getIdBelongsTeam() {
        return idBelongsTeam;
    }

    public void setIdBelongsTeam(Integer idBelongsTeam) {
        this.idBelongsTeam = idBelongsTeam;
    }

    public Date getOnboardingDate() {
        return onboardingDate;
    }

    public void setOnboardingDate(Date onboardingDate) {
        this.onboardingDate = onboardingDate;
    }

    public Date getLeavingDate() {
        return leavingDate;
    }

    public void setLeavingDate(Date leavingDate) {
        this.leavingDate = leavingDate;
    }

    public DoctoralStudent getIdDocStudent() {
        return idDocStudent;
    }

    public void setIdDocStudent(DoctoralStudent idDocStudent) {
        this.idDocStudent = idDocStudent;
    }

    public Researcher getIdOrcidResearcher() {
        return idOrcidResearcher;
    }

    public void setIdOrcidResearcher(Researcher idOrcidResearcher) {
        this.idOrcidResearcher = idOrcidResearcher;
    }

    public Team getIdTeam() {
        return idTeam;
    }

    public void setIdTeam(Team idTeam) {
        this.idTeam = idTeam;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idBelongsTeam != null ? idBelongsTeam.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BelongsTeam)) {
            return false;
        }
        BelongsTeam other = (BelongsTeam) object;
        if ((this.idBelongsTeam == null && other.idBelongsTeam != null) || (this.idBelongsTeam != null && !this.idBelongsTeam.equals(other.idBelongsTeam))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.centrale.pgrou.items.BelongsTeam[ idBelongsTeam=" + idBelongsTeam + " ]";
    }
    
}
