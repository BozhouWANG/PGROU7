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
@Table(name = "training_thesis_publication")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TrainingThesisPublication.findAll", query = "SELECT t FROM TrainingThesisPublication t"),
    @NamedQuery(name = "TrainingThesisPublication.findByIdActivity", query = "SELECT t FROM TrainingThesisPublication t WHERE t.idActivity = :idActivity"),
    @NamedQuery(name = "TrainingThesisPublication.findByNameStudent", query = "SELECT t FROM TrainingThesisPublication t WHERE t.nameStudent = :nameStudent"),
    @NamedQuery(name = "TrainingThesisPublication.findBySurnameStudent", query = "SELECT t FROM TrainingThesisPublication t WHERE t.surnameStudent = :surnameStudent"),
    @NamedQuery(name = "TrainingThesisPublication.findByNationality", query = "SELECT t FROM TrainingThesisPublication t WHERE t.nationality = :nationality"),
    @NamedQuery(name = "TrainingThesisPublication.findByStartDate", query = "SELECT t FROM TrainingThesisPublication t WHERE t.startDate = :startDate"),
    @NamedQuery(name = "TrainingThesisPublication.findByDefenseDate", query = "SELECT t FROM TrainingThesisPublication t WHERE t.defenseDate = :defenseDate"),
    @NamedQuery(name = "TrainingThesisPublication.findByDurationThesis", query = "SELECT t FROM TrainingThesisPublication t WHERE t.durationThesis = :durationThesis"),
    @NamedQuery(name = "TrainingThesisPublication.findByNameDirector", query = "SELECT t FROM TrainingThesisPublication t WHERE t.nameDirector = :nameDirector"),
    @NamedQuery(name = "TrainingThesisPublication.findByAssociatedFunding", query = "SELECT t FROM TrainingThesisPublication t WHERE t.associatedFunding = :associatedFunding"),
    @NamedQuery(name = "TrainingThesisPublication.findByNbOriginalArticles", query = "SELECT t FROM TrainingThesisPublication t WHERE t.nbOriginalArticles = :nbOriginalArticles"),
    @NamedQuery(name = "TrainingThesisPublication.findByNbOriginalArticles12Position", query = "SELECT t FROM TrainingThesisPublication t WHERE t.nbOriginalArticles12Position = :nbOriginalArticles12Position"),
    @NamedQuery(name = "TrainingThesisPublication.findByRefPublications", query = "SELECT t FROM TrainingThesisPublication t WHERE t.refPublications = :refPublications"),
    @NamedQuery(name = "TrainingThesisPublication.findByBecomingStudent", query = "SELECT t FROM TrainingThesisPublication t WHERE t.becomingStudent = :becomingStudent")})
public class TrainingThesisPublication implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_activity")
    private Integer idActivity;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "name_student")
    private String nameStudent;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "surname_student")
    private String surnameStudent;
    @Size(max = 2147483647)
    @Column(name = "nationality")
    private String nationality;
    @Basic(optional = false)
    @NotNull
    @Column(name = "start_date")
    @Temporal(TemporalType.DATE)
    private Date startDate;
    @Column(name = "defense_date")
    @Temporal(TemporalType.DATE)
    private Date defenseDate;
    @Column(name = "duration_thesis")
    private Integer durationThesis;
    @Size(max = 2147483647)
    @Column(name = "name_director")
    private String nameDirector;
    @Size(max = 2147483647)
    @Column(name = "associated_funding")
    private String associatedFunding;
    @Column(name = "nb_original_articles")
    private Integer nbOriginalArticles;
    @Column(name = "nb_original_articles_1_2_position")
    private Integer nbOriginalArticles12Position;
    @Size(max = 2147483647)
    @Column(name = "ref_publications")
    private String refPublications;
    @Size(max = 2147483647)
    @Column(name = "becoming_student")
    private String becomingStudent;
    @JoinColumn(name = "id_background", referencedColumnName = "id_background")
    @ManyToOne(optional = false)
    private BackgroundStudent idBackground;
    @JoinColumn(name = "id_status_thesis", referencedColumnName = "id_status_thesis")
    @ManyToOne(optional = false)
    private StatusThesis idStatusThesis;

    public TrainingThesisPublication() {
    }

    public TrainingThesisPublication(Integer idActivity) {
        this.idActivity = idActivity;
    }

    public TrainingThesisPublication(Integer idActivity, String nameStudent, String surnameStudent, Date startDate) {
        this.idActivity = idActivity;
        this.nameStudent = nameStudent;
        this.surnameStudent = surnameStudent;
        this.startDate = startDate;
    }

    public Integer getIdActivity() {
        return idActivity;
    }

    public void setIdActivity(Integer idActivity) {
        this.idActivity = idActivity;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public String getSurnameStudent() {
        return surnameStudent;
    }

    public void setSurnameStudent(String surnameStudent) {
        this.surnameStudent = surnameStudent;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getDefenseDate() {
        return defenseDate;
    }

    public void setDefenseDate(Date defenseDate) {
        this.defenseDate = defenseDate;
    }

    public Integer getDurationThesis() {
        return durationThesis;
    }

    public void setDurationThesis(Integer durationThesis) {
        this.durationThesis = durationThesis;
    }

    public String getNameDirector() {
        return nameDirector;
    }

    public void setNameDirector(String nameDirector) {
        this.nameDirector = nameDirector;
    }

    public String getAssociatedFunding() {
        return associatedFunding;
    }

    public void setAssociatedFunding(String associatedFunding) {
        this.associatedFunding = associatedFunding;
    }

    public Integer getNbOriginalArticles() {
        return nbOriginalArticles;
    }

    public void setNbOriginalArticles(Integer nbOriginalArticles) {
        this.nbOriginalArticles = nbOriginalArticles;
    }

    public Integer getNbOriginalArticles12Position() {
        return nbOriginalArticles12Position;
    }

    public void setNbOriginalArticles12Position(Integer nbOriginalArticles12Position) {
        this.nbOriginalArticles12Position = nbOriginalArticles12Position;
    }

    public String getRefPublications() {
        return refPublications;
    }

    public void setRefPublications(String refPublications) {
        this.refPublications = refPublications;
    }

    public String getBecomingStudent() {
        return becomingStudent;
    }

    public void setBecomingStudent(String becomingStudent) {
        this.becomingStudent = becomingStudent;
    }

    public BackgroundStudent getIdBackground() {
        return idBackground;
    }

    public void setIdBackground(BackgroundStudent idBackground) {
        this.idBackground = idBackground;
    }

    public StatusThesis getIdStatusThesis() {
        return idStatusThesis;
    }

    public void setIdStatusThesis(StatusThesis idStatusThesis) {
        this.idStatusThesis = idStatusThesis;
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
        if (!(object instanceof TrainingThesisPublication)) {
            return false;
        }
        TrainingThesisPublication other = (TrainingThesisPublication) object;
        if ((this.idActivity == null && other.idActivity != null) || (this.idActivity != null && !this.idActivity.equals(other.idActivity))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.centrale.pgrou.items.TrainingThesisPublication[ idActivity=" + idActivity + " ]";
    }
    
}
