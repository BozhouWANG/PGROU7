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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author macar
 */
@Entity
@Table(name = "supervisor")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Supervisor.findAll", query = "SELECT s FROM Supervisor s"),
    @NamedQuery(name = "Supervisor.findByIdSupervisor", query = "SELECT s FROM Supervisor s WHERE s.idSupervisor = :idSupervisor")})
public class Supervisor implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_supervisor")
    private Integer idSupervisor;
    @JoinColumn(name = "id_doc_student", referencedColumnName = "id_doc_student")
    @ManyToOne(optional = false)
    private DoctoralStudent idDocStudent;
    @JoinColumn(name = "id_orcid_researcher", referencedColumnName = "id_orcid_researcher")
    @ManyToOne(optional = false)
    private Researcher idOrcidResearcher;

    public Supervisor() {
    }

    public Supervisor(Integer idSupervisor) {
        this.idSupervisor = idSupervisor;
    }

    public Integer getIdSupervisor() {
        return idSupervisor;
    }

    public void setIdSupervisor(Integer idSupervisor) {
        this.idSupervisor = idSupervisor;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSupervisor != null ? idSupervisor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Supervisor)) {
            return false;
        }
        Supervisor other = (Supervisor) object;
        if ((this.idSupervisor == null && other.idSupervisor != null) || (this.idSupervisor != null && !this.idSupervisor.equals(other.idSupervisor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.centrale.pgrou.items.Supervisor[ idSupervisor=" + idSupervisor + " ]";
    }
    
}
