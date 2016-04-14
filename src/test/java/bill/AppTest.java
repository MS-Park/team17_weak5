package bill;
import static org.junit.Assert.*;
import org.junit.Test;

public class AppTest {
	private Makebill bill;
	
	@Test
	public void nullbill() {
		bill = new Makebill("sdf",0,0);
		assertTrue(bill.totalBill()==0);
	}
	@Test
	public void goldBillNoaddNooveruse1() {
		bill = new Makebill("Gold",1,2);
		assertEquals(bill.totalBill(),49.95,0.01);
	}
	@Test
	public void goldBillNoaddNooveruse2() {
		bill = new Makebill("gold",1,2);
		assertEquals(bill.totalBill(),49.95,0.01);
	}
	@Test
	public void goldBillNoaddoveruse1() {
		bill = new Makebill("Gold",1,3800);
		assertEquals(bill.totalBill(),1309.95,0.01);
	}
	@Test
	public void goldBillNoaddoveruse2() {
		bill = new Makebill("gold",1,3800);
		assertEquals(bill.totalBill(),1309.95,0.01);
	}
	@Test
	public void goldBilladdNooveruse1() {
		bill = new Makebill("Gold",3,2);
		assertEquals(bill.totalBill(),78.95,0.01);
	}
	@Test
	public void goldBilladdNooveruse2() {
		bill = new Makebill("gold",3,2);
		assertEquals(bill.totalBill(),78.95,0.01);
	}
	@Test
	public void goldBilladdoveruse1() {
		bill = new Makebill("Gold",3,3800);
		assertEquals(bill.totalBill(),1338.95,0.01);
	}
	@Test
	public void goldBilladdoveruse2() {
		bill = new Makebill("gold",3,3800);
		assertEquals(bill.totalBill(),1338.95,0.01);
	}
	@Test
	public void goldBillFaddNooveruse1() {
		bill = new Makebill("Gold",4,456);
		assertEquals(bill.totalBill(),83.95,0.01);
	}
	@Test
	public void goldBillFaddNooveruse2() {
		bill = new Makebill("gold",4,456);
		assertEquals(bill.totalBill(),83.95,0.01);
	}
	@Test
	public void goldBillFaddoveruse1() {
		bill = new Makebill("Gold",4,2000);
		assertEquals(bill.totalBill(),533.95,0.01);
	}
	@Test
	public void goldBillFaddoveruse2() {
		bill = new Makebill("gold",4,2000);
		assertEquals(bill.totalBill(),533.95,0.01);
	}
}
