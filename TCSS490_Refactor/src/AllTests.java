import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


@RunWith(Suite.class)
@SuiteClasses({ BankTest.class, CheckingAccountTest.class,
		CreditCardTest.class, DebitCardTest.class, SavingsAccountTest.class })
public class AllTests {

}
