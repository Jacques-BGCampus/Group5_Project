package ServerSide.BusinessLogicLayer.DataObjects.Bookings;

import java.io.Serializable;

public class UserProfile implements Serializable {
    
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
