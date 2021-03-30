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
@Table(name = "tool_product_biocollection")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ToolProductBiocollection.findAll", query = "SELECT t FROM ToolProductBiocollection t"),
    @NamedQuery(name = "ToolProductBiocollection.findByIdActivity", query = "SELECT t FROM ToolProductBiocollection t WHERE t.idActivity = :idActivity"),
    @NamedQuery(name = "ToolProductBiocollection.findByNameBiocollection", query = "SELECT t FROM ToolProductBiocollection t WHERE t.nameBiocollection = :nameBiocollection"),
    @NamedQuery(name = "ToolProductBiocollection.findByCreationDate", query = "SELECT t FROM ToolProductBiocollection t WHERE t.creationDate = :creationDate"),
    @NamedQuery(name = "ToolProductBiocollection.findByDescription", query = "SELECT t FROM ToolProductBiocollection t WHERE t.description = :description")})
public class ToolProductBiocollection implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_activity")
    private Integer idActivity;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "name_biocollection")
    private String nameBiocollection;
    @Basic(optional = false)
    @NotNull
    @Column(name = "creation_date")
    @Temporal(TemporalType.DATE)
    private Date creationDate;
    @Size(max = 2147483647)
    @Column(name = "description")
    private String description;

    public ToolProductBiocollection() {
    }

    public ToolProductBiocollection(Integer idActivity) {
        this.idActivity = idActivity;
    }

    public ToolProductBiocollection(Integer idActivity, String nameBiocollection, Date creationDate) {
        this.idActivity = idActivity;
        this.nameBiocollection = nameBiocollection;
        this.creationDate = creationDate;
    }

    public Integer getIdActivity() {
        return idActivity;
    }

    public void setIdActivity(Integer idActivity) {
        this.idActivity = idActivity;
    }

    public String getNameBiocollection() {
        return nameBiocollection;
    }

    public void setNameBiocollection(String nameBiocollection) {
        this.nameBiocollection = nameBiocollection;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
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
        if (!(object instanceof ToolProductBiocollection)) {
            return false;
        }
        ToolProductBiocollection other = (ToolProductBiocollection) object;
        if ((this.idActivity == null && other.idActivity != null) || (this.idActivity != null && !this.idActivity.equals(other.idActivity))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.centrale.pgrou.items.ToolProductBiocollection[ idActivity=" + idActivity + " ]";
    }
    
}
