package org.centrale.pgrou.items;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.centrale.pgrou.items.ChoiceScientificExpertise;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-03-30T10:42:10")
@StaticMetamodel(ScientificExpertise.class)
public class ScientificExpertise_ { 

    public static volatile SingularAttribute<ScientificExpertise, ChoiceScientificExpertise> idType;
    public static volatile SingularAttribute<ScientificExpertise, Date> endDate;
    public static volatile SingularAttribute<ScientificExpertise, String> description;
    public static volatile SingularAttribute<ScientificExpertise, Integer> idActivity;
    public static volatile SingularAttribute<ScientificExpertise, Date> startDate;

}