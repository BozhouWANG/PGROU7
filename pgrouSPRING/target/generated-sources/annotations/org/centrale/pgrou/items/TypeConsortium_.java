package org.centrale.pgrou.items;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.centrale.pgrou.items.SeiLeadConsortiumIndustry;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-03-27T11:28:52")
@StaticMetamodel(TypeConsortium.class)
public class TypeConsortium_ { 

    public static volatile SingularAttribute<TypeConsortium, Integer> idType;
    public static volatile SingularAttribute<TypeConsortium, String> nameChoice;
    public static volatile CollectionAttribute<TypeConsortium, SeiLeadConsortiumIndustry> seiLeadConsortiumIndustryCollection;

}