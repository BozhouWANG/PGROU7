package org.centrale.pgrou.items;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.centrale.pgrou.items.TypeResarchContract;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-03-29T22:17:13")
@StaticMetamodel(ResearchContractFundedPublicCharitableInst.class)
public class ResearchContractFundedPublicCharitableInst_ { 

    public static volatile SingularAttribute<ResearchContractFundedPublicCharitableInst, TypeResarchContract> idType;
    public static volatile SingularAttribute<ResearchContractFundedPublicCharitableInst, Date> dateContractAward;
    public static volatile SingularAttribute<ResearchContractFundedPublicCharitableInst, Integer> startYear;
    public static volatile SingularAttribute<ResearchContractFundedPublicCharitableInst, Integer> idActivity;
    public static volatile SingularAttribute<ResearchContractFundedPublicCharitableInst, Integer> endYear;
    public static volatile SingularAttribute<ResearchContractFundedPublicCharitableInst, Integer> grantAmount;
    public static volatile SingularAttribute<ResearchContractFundedPublicCharitableInst, String> fundingIntitution;
    public static volatile SingularAttribute<ResearchContractFundedPublicCharitableInst, String> projectTitle;

}