/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.centrale.pgrou.items;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author macar
 */
@Entity
@Table(name = "researcher")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Researcher.findAll", query = "SELECT r FROM Researcher r"),
    @NamedQuery(name = "Researcher.findByIdOrcidResearcher", query = "SELECT r FROM Researcher r WHERE r.idOrcidResearcher = :idOrcidResearcher"),
    @NamedQuery(name = "Researcher.findBySurnameResearcher", query = "SELECT r FROM Researcher r WHERE r.surnameResearcher = :surnameResearcher"),
    @NamedQuery(name = "Researcher.findByNameResearcher", query = "SELECT r FROM Researcher r WHERE r.nameResearcher = :nameResearcher"),
    @NamedQuery(name = "Researcher.findByStatus", query = "SELECT r FROM Researcher r WHERE r.status = :status"),
    @NamedQuery(name = "Researcher.findByContractType", query = "SELECT r FROM Researcher r WHERE r.contractType = :contractType"),
    @NamedQuery(name = "Researcher.findByFunction", query = "SELECT r FROM Researcher r WHERE r.function = :function"),
    @NamedQuery(name = "Researcher.findByEmailAddress", query = "SELECT r FROM Researcher r WHERE r.emailAddress = :emailAddress")})
public class Researcher implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "id_orcid_researcher")
    private String idOrcidResearcher;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "surname_researcher")
    private String surnameResearcher;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "name_researcher")
    private String nameResearcher;
    @Size(max = 2147483647)
    @Column(name = "status")
    private String status;
    @Size(max = 2147483647)
    @Column(name = "contract_type")
    private String contractType;
    @Size(max = 2147483647)
    @Column(name = "function")
    private String function;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "email_address")
    private String emailAddress;
    @JoinColumn(name = "id_employer", referencedColumnName = "id_employer")
    @ManyToOne(optional = false)
    private Emploeur idEmployer;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idOrcidResearcher")
    private Collection<Supervisor> supervisorCollection;
    @OneToMany(mappedBy = "idOrcidResearcher")
    private Collection<Activity> activityCollection;
    @OneToMany(mappedBy = "idOrcidResearcher")
    private Collection<BelongsTeam> belongsTeamCollection;

    public Researcher() {
    }

    public Researcher(String idOrcidResearcher) {
        this.idOrcidResearcher = idOrcidResearcher;
    }

    public Researcher(String idOrcidResearcher, String surnameResearcher, String nameResearcher, String emailAddress) {
        this.idOrcidResearcher = idOrcidResearcher;
        this.surnameResearcher = surnameResearcher;
        this.nameResearcher = nameResearcher;
        this.emailAddress = emailAddress;
    }

    public String getIdOrcidResearcher() {
        return idOrcidResearcher;
    }

    public void setIdOrcidResearcher(String idOrcidResearcher) {
        this.idOrcidResearcher = idOrcidResearcher;
    }

    public String getSurnameResearcher() {
        return surnameResearcher;
    }

    public void setSurnameResearcher(String surnameResearcher) {
        this.surnameResearcher = surnameResearcher;
    }

    public String getNameResearcher() {
        return nameResearcher;
    }

    public void setNameResearcher(String nameResearcher) {
        this.nameResearcher = nameResearcher;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getContractType() {
        return contractType;
    }

    public void setContractType(String contractType) {
        this.contractType = contractType;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Emploeur getIdEmployer() {
        return idEmployer;
    }

    public void setIdEmployer(Emploeur idEmployer) {
        this.idEmployer = idEmployer;
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
        hash += (idOrcidResearcher != null ? idOrcidResearcher.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Researcher)) {
            return false;
        }
        Researcher other = (Researcher) object;
        if ((this.idOrcidResearcher == null && other.idOrcidResearcher != null) || (this.idOrcidResearcher != null && !this.idOrcidResearcher.equals(other.idOrcidResearcher))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.centrale.pgrou.items.Researcher[ idOrcidResearcher=" + idOrcidResearcher + " ]";
    }
    
}
