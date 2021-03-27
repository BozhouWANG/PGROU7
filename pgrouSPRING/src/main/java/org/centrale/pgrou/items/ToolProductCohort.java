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
@Table(name = "tool_product_cohort")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ToolProductCohort.findAll", query = "SELECT t FROM ToolProductCohort t"),
    @NamedQuery(name = "ToolProductCohort.findByIdActivity", query = "SELECT t FROM ToolProductCohort t WHERE t.idActivity = :idActivity"),
    @NamedQuery(name = "ToolProductCohort.findByNameCohort", query = "SELECT t FROM ToolProductCohort t WHERE t.nameCohort = :nameCohort"),
    @NamedQuery(name = "ToolProductCohort.findByCreationDate", query = "SELECT t FROM ToolProductCohort t WHERE t.creationDate = :creationDate"),
    @NamedQuery(name = "ToolProductCohort.findByInvolvedResearchersCrti", query = "SELECT t FROM ToolProductCohort t WHERE t.involvedResearchersCrti = :involvedResearchersCrti"),
    @NamedQuery(name = "ToolProductCohort.findByDescription", query = "SELECT t FROM ToolProductCohort t WHERE t.description = :description")})
public class ToolProductCohort implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_activity")
    private Integer idActivity;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "name_cohort")
    private String nameCohort;
    @Basic(optional = false)
    @NotNull
    @Column(name = "creation_date")
    @Temporal(TemporalType.DATE)
    private Date creationDate;
    @Size(max = 2147483647)
    @Column(name = "involved_researchers_crti")
    private String involvedResearchersCrti;
    @Size(max = 2147483647)
    @Column(name = "description")
    private String description;

    public ToolProductCohort() {
    }

    public ToolProductCohort(Integer idActivity) {
        this.idActivity = idActivity;
    }

    public ToolProductCohort(Integer idActivity, String nameCohort, Date creationDate) {
        this.idActivity = idActivity;
        this.nameCohort = nameCohort;
        this.creationDate = creationDate;
    }

    public Integer getIdActivity() {
        return idActivity;
    }

    public void setIdActivity(Integer idActivity) {
        this.idActivity = idActivity;
    }

    public String getNameCohort() {
        return nameCohort;
    }

    public void setNameCohort(String nameCohort) {
        this.nameCohort = nameCohort;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public String getInvolvedResearchersCrti() {
        return involvedResearchersCrti;
    }

    public void setInvolvedResearchersCrti(String involvedResearchersCrti) {
        this.involvedResearchersCrti = involvedResearchersCrti;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
        if (!(object instanceof ToolProductCohort)) {
            return false;
        }
        ToolProductCohort other = (ToolProductCohort) object;
        if ((this.idActivity == null && other.idActivity != null) || (this.idActivity != null && !this.idActivity.equals(other.idActivity))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.centrale.pgrou.items.ToolProductCohort[ idActivity=" + idActivity + " ]";
    }
    
}
