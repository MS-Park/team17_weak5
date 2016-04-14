package bill;
import static org.junit.Assert.*;
import org.junit.Test;

public class AppTest {
	private Makebill bill;

	@Test
	public void SilverBilloveruse(){
		bill = new Makebill("Silver",1,1000);
		assertTrue(bill.totalBill()==299.95);
	}
	public void SilverBillInuse(){
		bill = new Makebill("Silver",1,500);
		assertEquals(bill.totalBill(),29.95,0.000);
	}
}
