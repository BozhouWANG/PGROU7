package org.centrale.pgrou.items;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.centrale.pgrou.items.Activity;
import org.centrale.pgrou.items.BelongsTeam;
import org.centrale.pgrou.items.Referent;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-03-28T18:00:41")
@StaticMetamodel(Team.class)
public class Team_ { 

    public static volatile SingularAttribute<Team, Date> dateLastReport;
    public static volatile SingularAttribute<Team, String> idOrcidResearcher;
    public static volatile SingularAttribute<Team, Date> endDate;
    public static volatile SingularAttribute<Team, Referent> idReferent;
    public static volatile CollectionAttribute<Team, BelongsTeam> belongsTeamCollection;
    public static volatile CollectionAttribute<Team, Activity> activityCollection;
    public static volatile SingularAttribute<Team, Date> creationDate;
    public static volatile SingularAttribute<Team, Integer> idTeam;
    public static volatile SingularAttribute<Team, String> nomEquipe;

}