package org.centrale.pgrou.items;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.centrale.pgrou.items.TypeCongressOrganisation;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-03-30T09:20:04")
@StaticMetamodel(MeetingCongressOrg.class)
public class MeetingCongressOrg_ { 

    public static volatile SingularAttribute<MeetingCongressOrg, Date> date;
    public static volatile SingularAttribute<MeetingCongressOrg, TypeCongressOrganisation> idType;
    public static volatile SingularAttribute<MeetingCongressOrg, Integer> year;
    public static volatile SingularAttribute<MeetingCongressOrg, String> nameCongress;
    public static volatile SingularAttribute<MeetingCongressOrg, String> location;
    public static volatile SingularAttribute<MeetingCongressOrg, Integer> idActivity;

}