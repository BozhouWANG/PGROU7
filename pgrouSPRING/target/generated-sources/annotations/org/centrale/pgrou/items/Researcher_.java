package org.centrale.pgrou.items;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.centrale.pgrou.items.Activity;
import org.centrale.pgrou.items.BelongsTeam;
import org.centrale.pgrou.items.Emploeur;
import org.centrale.pgrou.items.Supervisor;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-03-30T16:09:57")
@StaticMetamodel(Researcher.class)
public class Researcher_ { 

    public static volatile SingularAttribute<Researcher, String> emailAddress;
    public static volatile SingularAttribute<Researcher, String> idOrcidResearcher;
    public static volatile SingularAttribute<Researcher, String> contractType;
    public static volatile SingularAttribute<Researcher, String> function;
    public static volatile CollectionAttribute<Researcher, BelongsTeam> belongsTeamCollection;
    public static volatile CollectionAttribute<Researcher, Activity> activityCollection;
    public static volatile CollectionAttribute<Researcher, Supervisor> supervisorCollection;
    public static volatile SingularAttribute<Researcher, String> nameResearcher;
    public static volatile SingularAttribute<Researcher, Emploeur> idEmployer;
    public static volatile SingularAttribute<Researcher, String> surnameResearcher;
    public static volatile SingularAttribute<Researcher, String> status;

}