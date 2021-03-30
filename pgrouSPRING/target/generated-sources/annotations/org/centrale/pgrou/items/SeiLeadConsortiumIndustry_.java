package org.centrale.pgrou.items;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.centrale.pgrou.items.TypeConsortium;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-03-30T09:20:04")
@StaticMetamodel(SeiLeadConsortiumIndustry.class)
public class SeiLeadConsortiumIndustry_ { 

    public static volatile SingularAttribute<SeiLeadConsortiumIndustry, String> titleProject;
    public static volatile SingularAttribute<SeiLeadConsortiumIndustry, String> privatePartyInvolved;
    public static volatile SingularAttribute<SeiLeadConsortiumIndustry, String> associatedPubliRef;
    public static volatile SingularAttribute<SeiLeadConsortiumIndustry, TypeConsortium> idType;
    public static volatile SingularAttribute<SeiLeadConsortiumIndustry, String> nameConsortium;
    public static volatile SingularAttribute<SeiLeadConsortiumIndustry, Date> consortiumEndDate;
    public static volatile SingularAttribute<SeiLeadConsortiumIndustry, Date> consortiumStartDate;
    public static volatile SingularAttribute<SeiLeadConsortiumIndustry, Integer> idActivity;

}