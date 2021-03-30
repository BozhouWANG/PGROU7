package org.centrale.pgrou.items;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.centrale.pgrou.items.Activity;
import org.centrale.pgrou.items.BelongsTeam;
import org.centrale.pgrou.items.Supervisor;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-03-30T10:42:10")
@StaticMetamodel(DoctoralStudent.class)
public class DoctoralStudent_ { 

    public static volatile SingularAttribute<DoctoralStudent, String> idOrcid;
    public static volatile SingularAttribute<DoctoralStudent, Integer> idDocStudent;
    public static volatile SingularAttribute<DoctoralStudent, String> future;
    public static volatile SingularAttribute<DoctoralStudent, String> surnameStudent;
    public static volatile SingularAttribute<DoctoralStudent, Date> dateStartThesis;
    public static volatile CollectionAttribute<DoctoralStudent, BelongsTeam> belongsTeamCollection;
    public static volatile SingularAttribute<DoctoralStudent, String> nameStudent;
    public static volatile SingularAttribute<DoctoralStudent, Date> defenseDate;
    public static volatile CollectionAttribute<DoctoralStudent, Activity> activityCollection;
    public static volatile CollectionAttribute<DoctoralStudent, Supervisor> supervisorCollection;

}