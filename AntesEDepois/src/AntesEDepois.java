import org.junit.After;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

class AntesEDepois {

	@BeforeClass
	public void before() {
		System.out.println("@Before");
	}
	
	@After
	public void after() {
		System.out.println("@After");
	}
	
	
	@Test
	void test1() {
		System.out.println("Teste 1");
	}
	
	@Test
	void test2() {
		System.out.println("Teste 2");
	}
	
	@Test
	void test3() {
		System.out.println("Teste 3");
	}

}
