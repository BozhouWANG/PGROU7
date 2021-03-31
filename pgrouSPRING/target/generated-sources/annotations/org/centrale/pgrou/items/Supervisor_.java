package org.centrale.pgrou.items;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.centrale.pgrou.items.DoctoralStudent;
import org.centrale.pgrou.items.Researcher;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-03-31T09:11:06")
@StaticMetamodel(Supervisor.class)
public class Supervisor_ { 

    public static volatile SingularAttribute<Supervisor, DoctoralStudent> idDocStudent;
    public static volatile SingularAttribute<Supervisor, Researcher> idOrcidResearcher;
    public static volatile SingularAttribute<Supervisor, Integer> idSupervisor;

}