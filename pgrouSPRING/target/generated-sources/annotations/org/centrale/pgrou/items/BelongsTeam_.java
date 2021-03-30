package org.centrale.pgrou.items;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.centrale.pgrou.items.DoctoralStudent;
import org.centrale.pgrou.items.Researcher;
import org.centrale.pgrou.items.Team;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-03-30T09:20:04")
@StaticMetamodel(BelongsTeam.class)
public class BelongsTeam_ { 

    public static volatile SingularAttribute<BelongsTeam, DoctoralStudent> idDocStudent;
    public static volatile SingularAttribute<BelongsTeam, Researcher> idOrcidResearcher;
    public static volatile SingularAttribute<BelongsTeam, Integer> idBelongsTeam;
    public static volatile SingularAttribute<BelongsTeam, Date> onboardingDate;
    public static volatile SingularAttribute<BelongsTeam, Team> idTeam;
    public static volatile SingularAttribute<BelongsTeam, Date> leavingDate;

}