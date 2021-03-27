package org.centrale.pgrou.items;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.centrale.pgrou.items.BackgroundStudent;
import org.centrale.pgrou.items.StatusThesis;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-03-27T11:28:52")
@StaticMetamodel(TrainingThesisPublication.class)
public class TrainingThesisPublication_ { 

    public static volatile SingularAttribute<TrainingThesisPublication, Integer> nbOriginalArticles12Position;
    public static volatile SingularAttribute<TrainingThesisPublication, String> surnameStudent;
    public static volatile SingularAttribute<TrainingThesisPublication, Date> defenseDate;
    public static volatile SingularAttribute<TrainingThesisPublication, Integer> idActivity;
    public static volatile SingularAttribute<TrainingThesisPublication, Integer> nbOriginalArticles;
    public static volatile SingularAttribute<TrainingThesisPublication, Integer> durationThesis;
    public static volatile SingularAttribute<TrainingThesisPublication, String> nameDirector;
    public static volatile SingularAttribute<TrainingThesisPublication, String> nationality;
    public static volatile SingularAttribute<TrainingThesisPublication, String> associatedFunding;
    public static volatile SingularAttribute<TrainingThesisPublication, String> refPublications;
    public static volatile SingularAttribute<TrainingThesisPublication, BackgroundStudent> idBackground;
    public static volatile SingularAttribute<TrainingThesisPublication, StatusThesis> idStatusThesis;
    public static volatile SingularAttribute<TrainingThesisPublication, String> nameStudent;
    public static volatile SingularAttribute<TrainingThesisPublication, Date> startDate;
    public static volatile SingularAttribute<TrainingThesisPublication, String> becomingStudent;

}