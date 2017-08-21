import com.ssm.dmo.User;
import com.ssm.service.UserService;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by sgl on 17/8/17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:spring/spring-test.xml"})
public class UserTest {
    private Logger logger = Logger.getLogger(UserTest.class);
    @Autowired
    private UserService userService;


    @Test
    public void getUser(){
        User user=userService.getUserById(1);
        logger.info(user.getId());
        System.out.println("id=="+user.getId());
    }

}
