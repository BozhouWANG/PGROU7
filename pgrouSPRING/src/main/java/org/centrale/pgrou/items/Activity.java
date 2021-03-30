/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.centrale.pgrou.items;

import java.io.Serializable;
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
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author macar
 */
@Entity
@Table(name = "activity")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Activity.findAll", query = "SELECT a FROM Activity a"),
    @NamedQuery(name = "Activity.findByIdAuto", query = "SELECT a FROM Activity a WHERE a.idAuto = :idAuto"),
    @NamedQuery(name = "Activity.findByIdActivity", query = "SELECT a FROM Activity a WHERE a.idActivity = :idActivity")})
public class Activity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_auto")
    private Integer idAuto;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_activity")
    private int idActivity;
    @JoinColumn(name = "id_doc_student", referencedColumnName = "id_doc_student")
    @ManyToOne
    private DoctoralStudent idDocStudent;
    @JoinColumn(name = "id_orcid_researcher", referencedColumnName = "id_orcid_researcher")
    @ManyToOne
    private Researcher idOrcidResearcher;
    @JoinColumn(name = "id_team", referencedColumnName = "id_team")
    @ManyToOne(optional = false)
    private Team idTeam;
    @JoinColumn(name = "id_type", referencedColumnName = "id_type")
    @ManyToOne(optional = false)
    private TypeActivity idType;

    public Activity() {
    }

    public Activity(Integer idAuto) {
        this.idAuto = idAuto;
    }

    public Activity(Integer idAuto, int idActivity) {
        this.idAuto = idAuto;
        this.idActivity = idActivity;
    }

    public Integer getIdAuto() {
        return idAuto;
    }

    public void setIdAuto(Integer idAuto) {
        this.idAuto = idAuto;
    }

    public int getIdActivity() {
        return idActivity;
    }

    public void setIdActivity(int idActivity) {
        this.idActivity = idActivity;
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

    public TypeActivity getIdType() {
        return idType;
    }

    public void setIdType(TypeActivity idType) {
        this.idType = idType;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAuto != null ? idAuto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Activity)) {
            return false;
        }
        Activity other = (Activity) object;
        if ((this.idAuto == null && other.idAuto != null) || (this.idAuto != null && !this.idAuto.equals(other.idAuto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.centrale.pgrou.items.Activity[ idAuto=" + idAuto + " ]";
    }
    
}
