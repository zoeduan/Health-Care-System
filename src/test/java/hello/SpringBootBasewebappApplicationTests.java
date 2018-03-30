package hello;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

import static org.junit.Assert.assertTrue;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;
import hello.*
;//@RunWith(SpringRunner.class)
//@SpringBootTest
public class SpringBootBasewebappApplicationTests {
	@Test
	public void emptytest(){
		System.out.printf("Hello\n");
	};
	//@Test
	public void contextLoads() {
		//Collection collection = new ArrayList();
		//assertTrue(collection.isEmpty());
		ArrayList arrayList = mock(ArrayList.class);
        // program the mock object to return "hello world" when get(0) is called
        given(arrayList.get(0)).willReturn("Mock- Health Care Heroes");
 
        // this will output "hello world", since that was what the mock object was told to return
        System.out.println(arrayList.get(0));
	}

	//@Test
	public void testEmptyCollection() {
		//System.out.println("Test Case 1");

		Collection collection = new ArrayList();
		assertTrue(collection.isEmpty());
	}
	
	  public static junit.framework.Test suite() {
	        return new junit.framework.JUnit4TestAdapter(SpringBootBasewebappApplicationTests.class);
	    }
	  
	  public static void main(String args[]) {
	      org.junit.runner.JUnitCore.main("hello.SpringBootBasewebappApplicationTests");
	    }
}