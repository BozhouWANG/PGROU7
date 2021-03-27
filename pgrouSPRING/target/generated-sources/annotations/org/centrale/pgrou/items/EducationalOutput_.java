package org.centrale.pgrou.items;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.centrale.pgrou.items.ChoiceEducationalOutput;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-03-27T11:28:52")
@StaticMetamodel(EducationalOutput.class)
public class EducationalOutput_ { 

    public static volatile SingularAttribute<EducationalOutput, ChoiceEducationalOutput> idType;
    public static volatile SingularAttribute<EducationalOutput, String> description;
    public static volatile SingularAttribute<EducationalOutput, Date> completionDate;
    public static volatile SingularAttribute<EducationalOutput, Integer> idActivity;

}