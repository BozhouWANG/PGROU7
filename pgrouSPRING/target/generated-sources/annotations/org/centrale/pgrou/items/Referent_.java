package org.centrale.pgrou.items;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.centrale.pgrou.items.Team;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-03-27T11:28:52")
@StaticMetamodel(Referent.class)
public class Referent_ { 

    public static volatile SingularAttribute<Referent, String> password;
    public static volatile CollectionAttribute<Referent, Team> teamCollection;
    public static volatile SingularAttribute<Referent, Integer> idReferent;
    public static volatile SingularAttribute<Referent, String> login;

}