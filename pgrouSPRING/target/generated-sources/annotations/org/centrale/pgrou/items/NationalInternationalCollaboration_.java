package org.centrale.pgrou.items;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.centrale.pgrou.items.ChoiceTypeCollab;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-03-31T09:11:06")
@StaticMetamodel(NationalInternationalCollaboration.class)
public class NationalInternationalCollaboration_ { 

    public static volatile SingularAttribute<NationalInternationalCollaboration, String> mailPartners;
    public static volatile SingularAttribute<NationalInternationalCollaboration, String> partnerEntity;
    public static volatile SingularAttribute<NationalInternationalCollaboration, ChoiceTypeCollab> idType;
    public static volatile SingularAttribute<NationalInternationalCollaboration, Integer> numberResultingPublications;
    public static volatile SingularAttribute<NationalInternationalCollaboration, Date> dateProjectStart;
    public static volatile SingularAttribute<NationalInternationalCollaboration, Boolean> strategicRecurringCollab;
    public static volatile SingularAttribute<NationalInternationalCollaboration, String> refJointPublication;
    public static volatile SingularAttribute<NationalInternationalCollaboration, String> piPartners;
    public static volatile SingularAttribute<NationalInternationalCollaboration, String> projetcTitle;
    public static volatile SingularAttribute<NationalInternationalCollaboration, Boolean> umr1064Coordinated;
    public static volatile SingularAttribute<NationalInternationalCollaboration, Integer> idActivity;
    public static volatile SingularAttribute<NationalInternationalCollaboration, Boolean> activeProject;
    public static volatile SingularAttribute<NationalInternationalCollaboration, String> associatedFunding;
    public static volatile SingularAttribute<NationalInternationalCollaboration, Boolean> agreementSigned;
    public static volatile SingularAttribute<NationalInternationalCollaboration, String> countryStateCity;

}