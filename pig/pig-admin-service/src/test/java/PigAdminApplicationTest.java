import com.github.pig.admin.PigAdminApplication;
import org.jasypt.encryption.StringEncryptor;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = PigAdminApplication.class)
public class PigAdminApplicationTest {
	@Autowired
	private StringEncryptor stringEncryptor;

	@Test
	public void testEnvironmentProperties() {
		System.out.println(stringEncryptor.encrypt("redis"));
		System.out.println(stringEncryptor.decrypt("Ho5VxMWMMIzfIEE8/WxVzA=="));
		System.out.println(stringEncryptor.decrypt("LWeejg+IhLP2UX8reO/TSJg62+IAFj1u"));
		System.out.println(stringEncryptor.encrypt("pig"));
		System.out.println(stringEncryptor.encrypt("lengleng"));
		System.out.println(stringEncryptor.encrypt("root"));
		System.out.println(stringEncryptor.encrypt("admin"));
		System.out.println(stringEncryptor.encrypt("123456"));
		System.out.println(stringEncryptor.encrypt("g0HJr2Ltrs0k6tJDY6pDI2aVMUCPSWZDTROLcFMs"));
	}

}
