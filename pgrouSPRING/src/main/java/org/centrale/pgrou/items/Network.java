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
@Table(name = "network")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Network.findAll", query = "SELECT n FROM Network n"),
    @NamedQuery(name = "Network.findByIdActivity", query = "SELECT n FROM Network n WHERE n.idActivity = :idActivity"),
    @NamedQuery(name = "Network.findByStartDate", query = "SELECT n FROM Network n WHERE n.startDate = :startDate"),
    @NamedQuery(name = "Network.findByNameNetwork", query = "SELECT n FROM Network n WHERE n.nameNetwork = :nameNetwork"),
    @NamedQuery(name = "Network.findByActiveNetwork", query = "SELECT n FROM Network n WHERE n.activeNetwork = :activeNetwork"),
    @NamedQuery(name = "Network.findByAssociatedFunding", query = "SELECT n FROM Network n WHERE n.associatedFunding = :associatedFunding"),
    @NamedQuery(name = "Network.findByNbResultingPublications", query = "SELECT n FROM Network n WHERE n.nbResultingPublications = :nbResultingPublications"),
    @NamedQuery(name = "Network.findByRefResultingPublications", query = "SELECT n FROM Network n WHERE n.refResultingPublications = :refResultingPublications"),
    @NamedQuery(name = "Network.findByUmr1064Coordinated", query = "SELECT n FROM Network n WHERE n.umr1064Coordinated = :umr1064Coordinated"),
    @NamedQuery(name = "Network.findByAgreementSigned", query = "SELECT n FROM Network n WHERE n.agreementSigned = :agreementSigned")})
public class Network implements Serializable {

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
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "name_network")
    private String nameNetwork;
    @Basic(optional = false)
    @NotNull
    @Column(name = "active_network")
    private boolean activeNetwork;
    @Size(max = 2147483647)
    @Column(name = "associated_funding")
    private String associatedFunding;
    @Column(name = "nb_resulting_publications")
    private Integer nbResultingPublications;
    @Size(max = 2147483647)
    @Column(name = "ref_resulting_publications")
    private String refResultingPublications;
    @Basic(optional = false)
    @NotNull
    @Column(name = "umr1064_coordinated")
    private boolean umr1064Coordinated;
    @Basic(optional = false)
    @NotNull
    @Column(name = "agreement_signed")
    private boolean agreementSigned;

    public Network() {
    }

    public Network(Integer idActivity) {
        this.idActivity = idActivity;
    }

    public Network(Integer idActivity, Date startDate, String nameNetwork, boolean activeNetwork, boolean umr1064Coordinated, boolean agreementSigned) {
        this.idActivity = idActivity;
        this.startDate = startDate;
        this.nameNetwork = nameNetwork;
        this.activeNetwork = activeNetwork;
        this.umr1064Coordinated = umr1064Coordinated;
        this.agreementSigned = agreementSigned;
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

    public String getNameNetwork() {
        return nameNetwork;
    }

    public void setNameNetwork(String nameNetwork) {
        this.nameNetwork = nameNetwork;
    }

    public boolean getActiveNetwork() {
        return activeNetwork;
    }

    public void setActiveNetwork(boolean activeNetwork) {
        this.activeNetwork = activeNetwork;
    }

    public String getAssociatedFunding() {
        return associatedFunding;
    }

    public void setAssociatedFunding(String associatedFunding) {
        this.associatedFunding = associatedFunding;
    }

    public Integer getNbResultingPublications() {
        return nbResultingPublications;
    }

    public void setNbResultingPublications(Integer nbResultingPublications) {
        this.nbResultingPublications = nbResultingPublications;
    }

    public String getRefResultingPublications() {
        return refResultingPublications;
    }

    public void setRefResultingPublications(String refResultingPublications) {
        this.refResultingPublications = refResultingPublications;
    }

    public boolean getUmr1064Coordinated() {
        return umr1064Coordinated;
    }

    public void setUmr1064Coordinated(boolean umr1064Coordinated) {
        this.umr1064Coordinated = umr1064Coordinated;
    }

    public boolean getAgreementSigned() {
        return agreementSigned;
    }

    public void setAgreementSigned(boolean agreementSigned) {
        this.agreementSigned = agreementSigned;
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
        if (!(object instanceof Network)) {
            return false;
        }
        Network other = (Network) object;
        if ((this.idActivity == null && other.idActivity != null) || (this.idActivity != null && !this.idActivity.equals(other.idActivity))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.centrale.pgrou.items.Network[ idActivity=" + idActivity + " ]";
    }
    
}
