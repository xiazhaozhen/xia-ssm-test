
import com.ssm.dmo.User;
import com.ssm.service.UserService;
import com.ssm.unit.redis.RedisPoolManager;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by sgl on 17/8/17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:spring/spring-test.xml"})
public class UserTest {
    private Logger logger = LoggerFactory.getLogger(UserTest.class);
    @Autowired
    private UserService userService;


    @Test
    public void getUser(){
        User user=userService.getUserById(1);
        logger.info(user.getId()+"133333333344444444");
        System.out.println("id=="+user.getId());
    }

    @Test
    public void TestRedis(){
        RedisPoolManager redisPoolManager=new RedisPoolManager();
        redisPoolManager.setCacheWithSec("name","aaa",1000);
        System.out.println("=========redis========");
        System.out.println(redisPoolManager.getCache("name"));
    }

}
