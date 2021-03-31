package org.centrale.pgrou.items;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-03-31T09:11:06")
@StaticMetamodel(InvitedSeminar.class)
public class InvitedSeminar_ { 

    public static volatile SingularAttribute<InvitedSeminar, Date> date;
    public static volatile SingularAttribute<InvitedSeminar, String> titleSeminar;
    public static volatile SingularAttribute<InvitedSeminar, String> invitedBy;
    public static volatile SingularAttribute<InvitedSeminar, String> location;
    public static volatile SingularAttribute<InvitedSeminar, Integer> idActivity;

}