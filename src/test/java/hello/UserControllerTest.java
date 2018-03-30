package hello;
/*r*
 * rrr**r
 */

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import hello.MainController;
import hello.UserRepository;

//@RunWith(SpringRunner.class)
//@WebMvcTest(value = MainController.class, secure = false)

@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration("classpath:testContext.xml")
@ContextConfiguration("/applicationContext.xml")
public class UserControllerTest {
	
	@InjectMocks
	private MainController userController;
	
	@Autowired
	private UserRepository userRepository;
	
	@Test
	public void  addNewUserTest() {
		// @ResponseBody means the returned String is the response, not a view name
		// @RequestParam means it is a parameter from the GET or POST request
		
		User user = new User();
		user.setId(1L);
		user.setName("zoe");
		user.setEmail("zoe@test.com");
		this.userRepository.save(user);
		//this.entityManager.persist( user );
		User userTest = this.userRepository.findOne((long) 1);
		assertThat(userTest.getId()).isEqualTo(1);	
	}
	

}
