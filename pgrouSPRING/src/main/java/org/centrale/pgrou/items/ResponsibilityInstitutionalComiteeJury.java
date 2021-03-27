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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author macar
 */
@Entity
@Table(name = "responsibility_institutional_comitee_jury")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ResponsibilityInstitutionalComiteeJury.findAll", query = "SELECT r FROM ResponsibilityInstitutionalComiteeJury r"),
    @NamedQuery(name = "ResponsibilityInstitutionalComiteeJury.findByIdActivity", query = "SELECT r FROM ResponsibilityInstitutionalComiteeJury r WHERE r.idActivity = :idActivity"),
    @NamedQuery(name = "ResponsibilityInstitutionalComiteeJury.findByYear", query = "SELECT r FROM ResponsibilityInstitutionalComiteeJury r WHERE r.year = :year"),
    @NamedQuery(name = "ResponsibilityInstitutionalComiteeJury.findByNameInstitutionalComitee", query = "SELECT r FROM ResponsibilityInstitutionalComiteeJury r WHERE r.nameInstitutionalComitee = :nameInstitutionalComitee")})
public class ResponsibilityInstitutionalComiteeJury implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_activity")
    private Integer idActivity;
    @Basic(optional = false)
    @NotNull
    @Column(name = "year")
    private int year;
    @Size(max = 2147483647)
    @Column(name = "name_institutional_comitee")
    private String nameInstitutionalComitee;
    @JoinColumn(name = "id_role_pi_lab_eval", referencedColumnName = "id_role_pi_lab_eval")
    @ManyToOne(optional = false)
    private RolePiLabEval idRolePiLabEval;

    public ResponsibilityInstitutionalComiteeJury() {
    }

    public ResponsibilityInstitutionalComiteeJury(Integer idActivity) {
        this.idActivity = idActivity;
    }

    public ResponsibilityInstitutionalComiteeJury(Integer idActivity, int year) {
        this.idActivity = idActivity;
        this.year = year;
    }

    public Integer getIdActivity() {
        return idActivity;
    }

    public void setIdActivity(Integer idActivity) {
        this.idActivity = idActivity;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getNameInstitutionalComitee() {
        return nameInstitutionalComitee;
    }

    public void setNameInstitutionalComitee(String nameInstitutionalComitee) {
        this.nameInstitutionalComitee = nameInstitutionalComitee;
    }

    public RolePiLabEval getIdRolePiLabEval() {
        return idRolePiLabEval;
    }

    public void setIdRolePiLabEval(RolePiLabEval idRolePiLabEval) {
        this.idRolePiLabEval = idRolePiLabEval;
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
        if (!(object instanceof ResponsibilityInstitutionalComiteeJury)) {
            return false;
        }
        ResponsibilityInstitutionalComiteeJury other = (ResponsibilityInstitutionalComiteeJury) object;
        if ((this.idActivity == null && other.idActivity != null) || (this.idActivity != null && !this.idActivity.equals(other.idActivity))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.centrale.pgrou.items.ResponsibilityInstitutionalComiteeJury[ idActivity=" + idActivity + " ]";
    }
    
}
