import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


@RunWith(Suite.class)
@SuiteClasses({ AbstractAccountTest2.class, BankTest2.class,
		CheckingAccountTest2.class, CreditCardTest2.class, CustomerTest2.class,
		DebitCardTest2.class, SavingsAccountTest2.class })
public class AllTests2 {

}
