package mytest;

public class AuthUserService {
    public boolean validate(AuthUser authUser)
    {
        if(authUser.getUsername().equalsIgnoreCase(authUser.getPassword()))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
