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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author macar
 */
@Entity
@Table(name = "editorial_activity")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EditorialActivity.findAll", query = "SELECT e FROM EditorialActivity e"),
    @NamedQuery(name = "EditorialActivity.findByIdActivity", query = "SELECT e FROM EditorialActivity e WHERE e.idActivity = :idActivity"),
    @NamedQuery(name = "EditorialActivity.findByStartDate", query = "SELECT e FROM EditorialActivity e WHERE e.startDate = :startDate"),
    @NamedQuery(name = "EditorialActivity.findByEndDate", query = "SELECT e FROM EditorialActivity e WHERE e.endDate = :endDate"),
    @NamedQuery(name = "EditorialActivity.findByNameJournal", query = "SELECT e FROM EditorialActivity e WHERE e.nameJournal = :nameJournal"),
    @NamedQuery(name = "EditorialActivity.findByImpactFactorJournal", query = "SELECT e FROM EditorialActivity e WHERE e.impactFactorJournal = :impactFactorJournal")})
public class EditorialActivity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_activity")
    private Integer idActivity;
    @Basic(optional = false)
    @NotNull
    @Column(name = "start_date")
    @Temporal(TemporalType.DATE)
    private Date startDate;
    @Column(name = "end_date")
    @Temporal(TemporalType.DATE)
    private Date endDate;
    @Size(max = 2147483647)
    @Column(name = "name_journal")
    private String nameJournal;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "impact_factor_journal")
    private Float impactFactorJournal;
    @JoinColumn(name = "id_function", referencedColumnName = "id_function")
    @ManyToOne(optional = false)
    private FunctionEditorialActivity idFunction;

    public EditorialActivity() {
    }

    public EditorialActivity(Integer idActivity) {
        this.idActivity = idActivity;
    }

    public EditorialActivity(Integer idActivity, Date startDate) {
        this.idActivity = idActivity;
        this.startDate = startDate;
    }

    public Integer getIdActivity() {
        return idActivity;
    }

    public void setIdActivity(Integer idActivity) {
        this.idActivity = idActivity;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getNameJournal() {
        return nameJournal;
    }

    public void setNameJournal(String nameJournal) {
        this.nameJournal = nameJournal;
    }

    public Float getImpactFactorJournal() {
        return impactFactorJournal;
    }

    public void setImpactFactorJournal(Float impactFactorJournal) {
        this.impactFactorJournal = impactFactorJournal;
    }

    public FunctionEditorialActivity getIdFunction() {
        return idFunction;
    }

    public void setIdFunction(FunctionEditorialActivity idFunction) {
        this.idFunction = idFunction;
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
        if (!(object instanceof EditorialActivity)) {
            return false;
        }
        EditorialActivity other = (EditorialActivity) object;
        if ((this.idActivity == null && other.idActivity != null) || (this.idActivity != null && !this.idActivity.equals(other.idActivity))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.centrale.pgrou.items.EditorialActivity[ idActivity=" + idActivity + " ]";
    }
    
}
