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
@Table(name = "meeting_congress_org")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MeetingCongressOrg.findAll", query = "SELECT m FROM MeetingCongressOrg m"),
    @NamedQuery(name = "MeetingCongressOrg.findByIdActivity", query = "SELECT m FROM MeetingCongressOrg m WHERE m.idActivity = :idActivity"),
    @NamedQuery(name = "MeetingCongressOrg.findByYear", query = "SELECT m FROM MeetingCongressOrg m WHERE m.year = :year"),
    @NamedQuery(name = "MeetingCongressOrg.findByNameCongress", query = "SELECT m FROM MeetingCongressOrg m WHERE m.nameCongress = :nameCongress"),
    @NamedQuery(name = "MeetingCongressOrg.findByDate", query = "SELECT m FROM MeetingCongressOrg m WHERE m.date = :date"),
    @NamedQuery(name = "MeetingCongressOrg.findByLocation", query = "SELECT m FROM MeetingCongressOrg m WHERE m.location = :location")})
public class MeetingCongressOrg implements Serializable {

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
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "name_congress")
    private String nameCongress;
    @Basic(optional = false)
    @NotNull
    @Column(name = "date")
    @Temporal(TemporalType.DATE)
    private Date date;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "location")
    private String location;
    @JoinColumn(name = "id_type", referencedColumnName = "id_type")
    @ManyToOne(optional = false)
    private TypeCongressOrganisation idType;

    public MeetingCongressOrg() {
    }

    public MeetingCongressOrg(Integer idActivity) {
        this.idActivity = idActivity;
    }

    public MeetingCongressOrg(Integer idActivity, int year, String nameCongress, Date date, String location) {
        this.idActivity = idActivity;
        this.year = year;
        this.nameCongress = nameCongress;
        this.date = date;
        this.location = location;
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

    public String getNameCongress() {
        return nameCongress;
    }

    public void setNameCongress(String nameCongress) {
        this.nameCongress = nameCongress;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public TypeCongressOrganisation getIdType() {
        return idType;
    }

    public void setIdType(TypeCongressOrganisation idType) {
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
        if (!(object instanceof MeetingCongressOrg)) {
            return false;
        }
        MeetingCongressOrg other = (MeetingCongressOrg) object;
        if ((this.idActivity == null && other.idActivity != null) || (this.idActivity != null && !this.idActivity.equals(other.idActivity))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.centrale.pgrou.items.MeetingCongressOrg[ idActivity=" + idActivity + " ]";
    }
    
}
