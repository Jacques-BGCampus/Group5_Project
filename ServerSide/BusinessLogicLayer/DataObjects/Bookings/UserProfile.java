package ServerSide.BusinessLogicLayer.DataObjects.Bookings;

import java.io.Serializable;

public class UserProfile implements Serializable {

    /**
     *  I don't know, VS code did this? Only gives a warning when I remove it not an error, but unless I clear the warning by fixing the issue
     *  all the affected class files are in yellow writing and I don't like the inconsistency x_x so I just do what they want
     */
    private static final long serialVersionUID = 1L;
    
    public enum UserType {
        USER,
        ADMIN
    }

    String emailAddress;
    String password;
    UserType userType;

    public String getEmailAddress(){
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress){
        this.emailAddress = emailAddress;
    }

}
