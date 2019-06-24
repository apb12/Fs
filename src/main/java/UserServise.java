import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServise {
    @Autowired
    private UserDao userDao;

    public List<User>userList(){
    return userDao.getUserList();
    }
}
