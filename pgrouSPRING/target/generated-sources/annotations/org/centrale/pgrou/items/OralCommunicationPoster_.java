package org.centrale.pgrou.items;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.centrale.pgrou.items.TypeMeeting;
import org.centrale.pgrou.items.TypeOralComPoster;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-03-31T09:11:06")
@StaticMetamodel(OralCommunicationPoster.class)
public class OralCommunicationPoster_ { 

    public static volatile SingularAttribute<OralCommunicationPoster, Date> date;
    public static volatile SingularAttribute<OralCommunicationPoster, String> meetingName;
    public static volatile SingularAttribute<OralCommunicationPoster, TypeMeeting> idChoiceMeeting;
    public static volatile SingularAttribute<OralCommunicationPoster, Integer> year;
    public static volatile SingularAttribute<OralCommunicationPoster, String> location;
    public static volatile SingularAttribute<OralCommunicationPoster, TypeOralComPoster> idTypeCom;
    public static volatile SingularAttribute<OralCommunicationPoster, Integer> idActivity;
    public static volatile SingularAttribute<OralCommunicationPoster, String> titleoralComPoster;
    public static volatile SingularAttribute<OralCommunicationPoster, String> authors;

}