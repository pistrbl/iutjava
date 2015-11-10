package etu.iut.test;

public class TestUAbstractApplicationLog {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception	{
		System.err.println("Run before test case.");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception
	{
		System.err.println("Run after test case.");
	}

	@Before public void setUp() throws Exception{
		System.err.println("Run before test.");
	}

	@After
	public void tearDown() throws Exception{
		System.err.println(	"Run after test.");
	}
}
