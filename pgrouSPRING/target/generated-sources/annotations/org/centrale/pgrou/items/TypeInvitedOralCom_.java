package org.centrale.pgrou.items;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.centrale.pgrou.items.InvitedOralCommunication;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-03-31T09:11:06")
@StaticMetamodel(TypeInvitedOralCom.class)
public class TypeInvitedOralCom_ { 

    public static volatile SingularAttribute<TypeInvitedOralCom, String> nameChoice;
    public static volatile CollectionAttribute<TypeInvitedOralCom, InvitedOralCommunication> invitedOralCommunicationCollection;
    public static volatile SingularAttribute<TypeInvitedOralCom, Integer> idTypeMeeting;

}