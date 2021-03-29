package org.centrale.pgrou.items;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.centrale.pgrou.items.DoctoralStudent;
import org.centrale.pgrou.items.Researcher;
import org.centrale.pgrou.items.Team;
import org.centrale.pgrou.items.TypeActivity;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-03-29T21:59:57")
@StaticMetamodel(Activity.class)
public class Activity_ { 

    public static volatile SingularAttribute<Activity, DoctoralStudent> idDocStudent;
    public static volatile SingularAttribute<Activity, TypeActivity> idType;
    public static volatile SingularAttribute<Activity, Researcher> idOrcidResearcher;
    public static volatile SingularAttribute<Activity, Integer> idAuto;
    public static volatile SingularAttribute<Activity, Integer> idActivity;
    public static volatile SingularAttribute<Activity, Team> idTeam;

}