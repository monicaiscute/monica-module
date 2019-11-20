import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.io.IOException;
import java.text.ParseException;

@SpringBootTest(classes=Junit.class)
@RunWith(SpringRunner.class)
@WebAppConfiguration
@ContextConfiguration
public class Junit {
	@Autowired
	private Environment env;
	@Test
	public void test() throws ParseException, IOException {

	}
}
