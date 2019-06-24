import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Repository
public class UserDao {
    private List<User>userList;

    public List<User>getUserList(){
        userList=new ArrayList<User>(Arrays.asList(new User("admin","admin"),new User("notadmin","notadmin")));
        return userList;
    }
}
