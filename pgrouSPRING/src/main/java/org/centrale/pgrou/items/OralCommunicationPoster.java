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
@Table(name = "oral_communication_poster")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OralCommunicationPoster.findAll", query = "SELECT o FROM OralCommunicationPoster o"),
    @NamedQuery(name = "OralCommunicationPoster.findByIdActivity", query = "SELECT o FROM OralCommunicationPoster o WHERE o.idActivity = :idActivity"),
    @NamedQuery(name = "OralCommunicationPoster.findByYear", query = "SELECT o FROM OralCommunicationPoster o WHERE o.year = :year"),
    @NamedQuery(name = "OralCommunicationPoster.findByTitleoralComPoster", query = "SELECT o FROM OralCommunicationPoster o WHERE o.titleoralComPoster = :titleoralComPoster"),
    @NamedQuery(name = "OralCommunicationPoster.findByAuthors", query = "SELECT o FROM OralCommunicationPoster o WHERE o.authors = :authors"),
    @NamedQuery(name = "OralCommunicationPoster.findByMeetingName", query = "SELECT o FROM OralCommunicationPoster o WHERE o.meetingName = :meetingName"),
    @NamedQuery(name = "OralCommunicationPoster.findByDate", query = "SELECT o FROM OralCommunicationPoster o WHERE o.date = :date"),
    @NamedQuery(name = "OralCommunicationPoster.findByLocation", query = "SELECT o FROM OralCommunicationPoster o WHERE o.location = :location")})
public class OralCommunicationPoster implements Serializable {

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
    @Column(name = "titleoral_com_poster")
    private String titleoralComPoster;
    @Size(max = 2147483647)
    @Column(name = "authors")
    private String authors;
    @Size(max = 2147483647)
    @Column(name = "meeting_name")
    private String meetingName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "date")
    @Temporal(TemporalType.DATE)
    private Date date;
    @Size(max = 2147483647)
    @Column(name = "location")
    private String location;
    @JoinColumn(name = "id_choice_meeting", referencedColumnName = "id_choice_meeting")
    @ManyToOne(optional = false)
    private TypeMeeting idChoiceMeeting;
    @JoinColumn(name = "id_type_com", referencedColumnName = "id_type_com")
    @ManyToOne(optional = false)
    private TypeOralComPoster idTypeCom;

    public OralCommunicationPoster() {
    }

    public OralCommunicationPoster(Integer idActivity) {
        this.idActivity = idActivity;
    }

    public OralCommunicationPoster(Integer idActivity, int year, String titleoralComPoster, Date date) {
        this.idActivity = idActivity;
        this.year = year;
        this.titleoralComPoster = titleoralComPoster;
        this.date = date;
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

    public String getTitleoralComPoster() {
        return titleoralComPoster;
    }

    public void setTitleoralComPoster(String titleoralComPoster) {
        this.titleoralComPoster = titleoralComPoster;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public String getMeetingName() {
        return meetingName;
    }

    public void setMeetingName(String meetingName) {
        this.meetingName = meetingName;
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

    public TypeMeeting getIdChoiceMeeting() {
        return idChoiceMeeting;
    }

    public void setIdChoiceMeeting(TypeMeeting idChoiceMeeting) {
        this.idChoiceMeeting = idChoiceMeeting;
    }

    public TypeOralComPoster getIdTypeCom() {
        return idTypeCom;
    }

    public void setIdTypeCom(TypeOralComPoster idTypeCom) {
        this.idTypeCom = idTypeCom;
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
        if (!(object instanceof OralCommunicationPoster)) {
            return false;
        }
        OralCommunicationPoster other = (OralCommunicationPoster) object;
        if ((this.idActivity == null && other.idActivity != null) || (this.idActivity != null && !this.idActivity.equals(other.idActivity))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.centrale.pgrou.items.OralCommunicationPoster[ idActivity=" + idActivity + " ]";
    }
    
}
