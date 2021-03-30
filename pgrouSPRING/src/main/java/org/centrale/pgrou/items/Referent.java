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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "referent")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Referent.findAll", query = "SELECT r FROM Referent r"),
    @NamedQuery(name = "Referent.findByIdReferent", query = "SELECT r FROM Referent r WHERE r.idReferent = :idReferent"),
    @NamedQuery(name = "Referent.findByLogin", query = "SELECT r FROM Referent r WHERE r.login = :login"),
    @NamedQuery(name = "Referent.findByPassword", query = "SELECT r FROM Referent r WHERE r.password = :password")})
public class Referent implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_referent")
    private Integer idReferent;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "login")
    private String login;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "password")
    private String password;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idReferent")
    private Collection<Team> teamCollection;

    public Referent() {
    }

    public Referent(Integer idReferent) {
        this.idReferent = idReferent;
    }

    public Referent(Integer idReferent, String login, String password) {
        this.idReferent = idReferent;
        this.login = login;
        this.password = password;
    }

    public Integer getIdReferent() {
        return idReferent;
    }

    public void setIdReferent(Integer idReferent) {
        this.idReferent = idReferent;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @XmlTransient
    public Collection<Team> getTeamCollection() {
        return teamCollection;
    }

    public void setTeamCollection(Collection<Team> teamCollection) {
        this.teamCollection = teamCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idReferent != null ? idReferent.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Referent)) {
            return false;
        }
        Referent other = (Referent) object;
        if ((this.idReferent == null && other.idReferent != null) || (this.idReferent != null && !this.idReferent.equals(other.idReferent))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.centrale.pgrou.items.Referent[ idReferent=" + idReferent + " ]";
    }
    
}
