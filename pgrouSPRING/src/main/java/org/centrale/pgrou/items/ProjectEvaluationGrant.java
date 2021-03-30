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
@Table(name = "project_evaluation_grant")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProjectEvaluationGrant.findAll", query = "SELECT p FROM ProjectEvaluationGrant p"),
    @NamedQuery(name = "ProjectEvaluationGrant.findByIdActivity", query = "SELECT p FROM ProjectEvaluationGrant p WHERE p.idActivity = :idActivity"),
    @NamedQuery(name = "ProjectEvaluationGrant.findByYear", query = "SELECT p FROM ProjectEvaluationGrant p WHERE p.year = :year"),
    @NamedQuery(name = "ProjectEvaluationGrant.findByNameFunder", query = "SELECT p FROM ProjectEvaluationGrant p WHERE p.nameFunder = :nameFunder")})
public class ProjectEvaluationGrant implements Serializable {

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
    @Column(name = "name_funder")
    private String nameFunder;
    @JoinColumn(name = "id_category_grant", referencedColumnName = "id_category_grant")
    @ManyToOne(optional = false)
    private CategoryGrant idCategoryGrant;
    @JoinColumn(name = "id_role_pi_grant", referencedColumnName = "id_role_pi_grant")
    @ManyToOne(optional = false)
    private RolePiGrant idRolePiGrant;

    public ProjectEvaluationGrant() {
    }

    public ProjectEvaluationGrant(Integer idActivity) {
        this.idActivity = idActivity;
    }

    public ProjectEvaluationGrant(Integer idActivity, int year) {
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

    public String getNameFunder() {
        return nameFunder;
    }

    public void setNameFunder(String nameFunder) {
        this.nameFunder = nameFunder;
    }

    public CategoryGrant getIdCategoryGrant() {
        return idCategoryGrant;
    }

    public void setIdCategoryGrant(CategoryGrant idCategoryGrant) {
        this.idCategoryGrant = idCategoryGrant;
    }

    public RolePiGrant getIdRolePiGrant() {
        return idRolePiGrant;
    }

    public void setIdRolePiGrant(RolePiGrant idRolePiGrant) {
        this.idRolePiGrant = idRolePiGrant;
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
        if (!(object instanceof ProjectEvaluationGrant)) {
            return false;
        }
        ProjectEvaluationGrant other = (ProjectEvaluationGrant) object;
        if ((this.idActivity == null && other.idActivity != null) || (this.idActivity != null && !this.idActivity.equals(other.idActivity))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.centrale.pgrou.items.ProjectEvaluationGrant[ idActivity=" + idActivity + " ]";
    }
    
}
