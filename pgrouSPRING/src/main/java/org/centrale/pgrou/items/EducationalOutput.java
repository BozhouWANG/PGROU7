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
@Table(name = "educational_output")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EducationalOutput.findAll", query = "SELECT e FROM EducationalOutput e"),
    @NamedQuery(name = "EducationalOutput.findByIdActivity", query = "SELECT e FROM EducationalOutput e WHERE e.idActivity = :idActivity"),
    @NamedQuery(name = "EducationalOutput.findByCompletionDate", query = "SELECT e FROM EducationalOutput e WHERE e.completionDate = :completionDate"),
    @NamedQuery(name = "EducationalOutput.findByDescription", query = "SELECT e FROM EducationalOutput e WHERE e.description = :description")})
public class EducationalOutput implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_activity")
    private Integer idActivity;
    @Basic(optional = false)
    @NotNull
    @Column(name = "completion_date")
    @Temporal(TemporalType.DATE)
    private Date completionDate;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "description")
    private String description;
    @JoinColumn(name = "id_type", referencedColumnName = "id_type")
    @ManyToOne(optional = false)
    private ChoiceEducationalOutput idType;

    public EducationalOutput() {
    }

    public EducationalOutput(Integer idActivity) {
        this.idActivity = idActivity;
    }

    public EducationalOutput(Integer idActivity, Date completionDate, String description) {
        this.idActivity = idActivity;
        this.completionDate = completionDate;
        this.description = description;
    }

    public Integer getIdActivity() {
        return idActivity;
    }

    public void setIdActivity(Integer idActivity) {
        this.idActivity = idActivity;
    }

    public Date getCompletionDate() {
        return completionDate;
    }

    public void setCompletionDate(Date completionDate) {
        this.completionDate = completionDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ChoiceEducationalOutput getIdType() {
        return idType;
    }

    public void setIdType(ChoiceEducationalOutput idType) {
        this.idType = idType;
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
        if (!(object instanceof EducationalOutput)) {
            return false;
        }
        EducationalOutput other = (EducationalOutput) object;
        if ((this.idActivity == null && other.idActivity != null) || (this.idActivity != null && !this.idActivity.equals(other.idActivity))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.centrale.pgrou.items.EducationalOutput[ idActivity=" + idActivity + " ]";
    }
    
}
