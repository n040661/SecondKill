import com.imooc.miaosha.MainApplication;
import com.imooc.miaosha.rabbitmq.SendTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author JohnsonZheng
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = MainApplication.class)
public class RabbitMQTest
{
    @Autowired
    private SendTest sender;

    @Test
    public void hello()
    {
        sender.send();
    }
}
