package testCases;

import Logic.CommonLogic;
import baseTest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ScenariosTest extends BaseTest {

    CommonLogic addPayment;
    CommonLogic giftCardBalance;
    CommonLogic electronicsTvSearch;
    CommonLogic addNewAddress;
    CommonLogic currencyChange;

    private String CardType;
    private String GiftCardBalance;
    private String FullName;
    private String Currency;

    @Test(priority = 1, enabled = true, description = "[Login][Add Payment] - Verify Adding A New Payment To Profile")
    public void AddNewPayment() {

        addPayment = new CommonLogic(driver);

        // login
        addPayment.login();

        // open my account.
        addPayment.openMyAccount();

        //From Payments section, select Your Payments.
        addPayment.openPaymentScreen();

        //Tap on Wallet and add a credit or debit card as the payment method.
        CardType = addPayment.addCard();

        // Asserting on Added "Card Type" is Correct == [Visa].
        Assert.assertEquals(CardType, "Visa");

    }

    @Test(priority = 2, enabled = true, description = "[Gift Card Balance] - Verify Gift Card Balance")
    public void CheckGiftCardBalance() {

        giftCardBalance = new CommonLogic(driver);

        // Click on "Burger Menu", Then Click in "My Account", Then Scroll Down Until "Manage gift card balance" Displayed
        giftCardBalance.openMyAccount();

        // Click on "Gift Card Balance" Button, Then Getting The Balance Value
        GiftCardBalance = giftCardBalance.giftCardBalance();

        // Asserting That [Gift Card Balance is "$0.00"]
        Assert.assertEquals(GiftCardBalance, "$0.00");

    }

    @Test(priority = 3, enabled = true, description = "[Smart TV Result] - Verify Filtering with Smart-TV in Electronics Search Results")
    public void ElectronicsTvSearch() {

        electronicsTvSearch = new CommonLogic(driver);

        // Search for "TV & Video" Sub-Category.
        electronicsTvSearch.electronicsTvSearch();

        // Filter With "Smart TV", Then Get the Result Counter;
        electronicsTvSearch.smartTvFilter();

        // Getting "Smart TV Filter Result Numbers" Counter
        electronicsTvSearch.smartTvFilterResultNumbers();

        //todo [Need to Apply 2nd Filter like [Year Model] for Less Result Counter To Compare with Result Elements]

    }

    @Test(priority = 4, enabled = true, description = "[Add New Address] - Verify Adding New Address Works Fine")
    public void AddNewAddress() {

        addNewAddress = new CommonLogic(driver);

        // Proceed ot "Add New Address" Screen.
        addNewAddress.addNewAddress();

        // Fill Address screen Content.
        addNewAddress.addNewAddressScreen();

        // Getting the Full Name
        FullName = addNewAddress.fullNameAfterAddingAddress();

        // Asserting on Added Full Name is Correct.
        Assert.assertEquals(FullName, "Mohamed Ramadan");

    }

    @Test(priority = 5, enabled = true, description = "[Currency Change] - Verify Currency Change Works Fine")
    public void CurrencyChange() {

        currencyChange = new CommonLogic(driver);

        // Change Currency to AED
        currencyChange.changeCurrency();

        // Getting Deal of The Day Currency
        Currency = currencyChange.dealOfTheDayCurrency();

        // Getting The Currency of "Deal of The Day" And Display here.
        System.out.println("Deal of The Day Currency is: " + Currency);
    }
}
