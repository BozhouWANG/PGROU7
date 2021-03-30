package org.centrale.pgrou.items;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.centrale.pgrou.items.TypeInvitedOralCom;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-03-30T09:20:04")
@StaticMetamodel(InvitedOralCommunication.class)
public class InvitedOralCommunication_ { 

    public static volatile SingularAttribute<InvitedOralCommunication, String> nameMeeting;
    public static volatile SingularAttribute<InvitedOralCommunication, String> location;
    public static volatile SingularAttribute<InvitedOralCommunication, Integer> idActivity;
    public static volatile SingularAttribute<InvitedOralCommunication, String> title;
    public static volatile SingularAttribute<InvitedOralCommunication, Date> dateMeeting;
    public static volatile SingularAttribute<InvitedOralCommunication, Date> dateCommunication;
    public static volatile SingularAttribute<InvitedOralCommunication, TypeInvitedOralCom> idTypeMeeting;

}