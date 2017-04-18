package demo.test;
import demo.StringDemo;
import junit.framework.TestCase;
public class StringDemoTest extends TestCase {
	private StringDemo str;
	protected void setUp(){
		str = new StringDemo();
	}
		public void testSmallString1() {
		    assertEquals("һ����ĸ��Сд",str.smallString("A"),"a");
		}
		public void testSmallString2() {
			assertEquals("һ����ĸ��Сд",str.smallString("B"),"b");
	    }
		public void testSmallString3() {
			assertEquals("һ����ĸ��Сд",str.smallString("B"),"B");
	    }
		public void testSmallString4() {
			assertEquals("һ����ĸ��Сд",str.smallString("B"),"a");
	    }
		public void testSmallString5() {
			assertEquals("һ����ĸ��Сд",str.smallString("C"),",");
	    }
		public void testSmallString6() {
			assertEquals("һ����ĸ��Сд",str.smallString("D"),"d");
	    }
		public void testSmallString7() {
			assertEquals("һ����ĸ����",str.smallString("d"),"d");
	    }
		public void testSmallString8() {
			assertEquals("һ����ĸ��Сд",str.smallString("E"),"eee");
	    }
		public void testSmallString9() {
			assertEquals("һ����ĸ��Сд",str.smallString("FF"),"f");
	    }
		public void testSmallString10() {
			assertEquals("һ����ĸ��Сд",str.smallString("G")," ");
	    }
}