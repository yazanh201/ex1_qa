package ex1_qa.ex1_qa;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
	
	Q4 tester=new Q4();

    /**
     * Rigorous Test :-)
     */
	
	@Test
	public void Test_1() {
		String Expected_result="A";
		int a=28 , b=24;
		String mod="regular";
		String actual_res=tester.Comapre(a, b, mod);
		assertEquals(Expected_result,actual_res);
	}
	@Test
	public void Test_2() {
		String Expected_result="A";
		int a=-32 , b=-40;
		String mod="regular";
		String actual_res=tester.Comapre(a, b, mod);
		assertEquals(Expected_result,actual_res);
	}
	
	
	@Test
	public void Test_3() {
		String Expected_result="A";
		int a=2 , b=2;
		String mod="regular";
		String actual_res=tester.Comapre(a, b, mod);
		assertEquals(Expected_result,actual_res);
	}
	
	@Test
	public void Test_4() {
		String Expected_result="A";
		int a=-5 , b=10;
		String mod="negatives";
		String actual_res=tester.Comapre(a, b, mod);
		assertEquals(Expected_result,actual_res);
	}
	@Test
	public void Test_7() {
		String Expected_result="B";
		int a=-5 , b=-12;
		String mod="negatives";
		String actual_res=tester.Comapre(a, b, mod);
		assertEquals(Expected_result,actual_res);
	}
	
    @Test
    public void testInvalidCharacter() {
        String Expected_result = "error";
        int a = 5;
        Object b = "&"; 
        String mod = "negatives";  //לא משנה איזה מוד אפשר עם regular,negatives,reciprocals  תמיד נקבל שגיאה כי זה תו
        String actual_res = tester.Comapre(a, b, mod);
        assertEquals(Expected_result, actual_res);
    }
    
	@Test
	public void Test_6() {
		String Expected_result="A";
		double a=0.5 , b=10;
		String mod="reciprocals";
		String actual_res=tester.Comapre(a, b, mod);
		assertEquals(Expected_result,actual_res);
	}
	
	 @Test
	    public void testDivisionByZero() {
	        // מקרה של חלוקה באפס
	        String Expected_result = "error";
	        double a = 5, b = 0;
	        String mod = "reciprocals";
	        String actual_res = tester.Comapre(a, b, mod);
	        assertEquals(Expected_result, actual_res);
	    }
	 
		@Test
		public void Test_8() {
			String Expected_result="A";
			double a=34 , b=-0.4;
			String mod="reciprocals";
			String actual_res=tester.Comapre(a, b, mod);
			assertEquals(Expected_result,actual_res);
		}
	
	
    
}
