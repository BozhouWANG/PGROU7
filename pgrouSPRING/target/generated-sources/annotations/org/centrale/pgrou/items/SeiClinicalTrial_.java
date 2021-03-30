package org.centrale.pgrou.items;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-03-30T09:20:04")
@StaticMetamodel(SeiClinicalTrial.class)
public class SeiClinicalTrial_ { 

    public static volatile SingularAttribute<SeiClinicalTrial, String> titleClinicalTrial;
    public static volatile SingularAttribute<SeiClinicalTrial, String> registrationNb;
    public static volatile SingularAttribute<SeiClinicalTrial, String> funding;
    public static volatile SingularAttribute<SeiClinicalTrial, Integer> includedPatientsNb;
    public static volatile SingularAttribute<SeiClinicalTrial, Date> endDate;
    public static volatile SingularAttribute<SeiClinicalTrial, String> sponsorName;
    public static volatile SingularAttribute<SeiClinicalTrial, Boolean> coordinatorPartner;
    public static volatile SingularAttribute<SeiClinicalTrial, Integer> idActivity;
    public static volatile SingularAttribute<SeiClinicalTrial, Integer> fundingAmount;
    public static volatile SingularAttribute<SeiClinicalTrial, Date> startDate;

}