package Logic;

import basePage.BasePage;
import io.appium.java_client.AppiumDriver;
import pageLocators.AllCommonLocatorsPO.CommonLocatorsPO;

public class CommonLogic extends BasePage {

    CommonLocatorsPO loginPO;

    public CommonLogic(AppiumDriver driver) {

        super(driver);
        loginPO = new CommonLocatorsPO(driver);
    }

    public void login() {

        // Waiting for "Sign In" Button to be Visible, Then Click.
        waitForVisibility(loginPO.getSignInButton(), 30).click();

        // Waiting for "Continue" Button to be Visible, To Avoid Fail While "[Loading State]".
        waitForVisibility(loginPO.getContinueButton(), 30);

        // Waiting for "Email" Field to be Visible, then Set Content, Then Click Continue Button
        waitForVisibility(loginPO.getEmailField(), 30).sendKeys("ram102ver@gmail.com");
        loginPO.getContinueButton().click();

        // Waiting for "Pass Word" Field to be Visible, then Set Content, Then Click Submit Button
        waitForVisibility(loginPO.getPasswordField(), 30).sendKeys("Tradeling2022");
        loginPO.getSignInSubmitButton().click();

    }

    public void openMyAccount() {

        // Waiting for "Burger Menu" Button in Main Home Screen to be Visible, Then Click.
        waitForVisibility(loginPO.getBurgerMenuButton(), 30).click();

        // Waiting for "Your Account" Button in [Burger Menu] List to be Visible, Then Click.
        waitForVisibility(loginPO.getYourAccountButton(), 30).click();

        // Scroll From-Down-To-Up, For [Your Payment Section] To Be Displayed
        for (int i = 0; i < 3; i++) {
            scrollFromDownToUp();
        }

    }

    public void openPaymentScreen() {

        // Waiting for "Your Payment" Button in [Burger Menu] List to be Visible, Then Click.
        waitForVisibility(loginPO.getYourPaymentButton(), 30).click();

        // Waiting for "Add Payment Method" Button To to be Visible, Then Click
        waitForVisibility(loginPO.getAddPaymentMethodButton(), 30).click();

        // Waiting for "Add Credit Card" Button To to be Visible, Then Click
        waitForVisibility(loginPO.getAddCreditCardButton(), 30).click();

        // Waiting for "Name On Card" Field to be Visible, then Set Content.
        waitForVisibility(loginPO.getNameOnCardField().get(0), 30).sendKeys("Mohamed Ramadan");

        // Waiting for "Card Numbers" Field to be Visible, then Set Content.
        waitForVisibility(loginPO.getNameOnCardField().get(1), 30).sendKeys("4572680002300423");

        // Waiting for "Card Expiry" Button to be Visible, then Click.
        waitForVisibility(loginPO.getCardExpiryButton(), 30).click();

        // Waiting for "Card Expiry Date" Button Selected to be Visible, then Click.
        waitForVisibility(loginPO.getCardExpirySelectedDate(), 30).click();

        // Click on "Add Your Card" - [Even no need for Waiting for Visibility as no API Calls BUT is very good to have]
        waitForVisibility(loginPO.getAddYourCardButton(), 30).click();

    }

    public String addCard() {

        // Click on "Burger Menu" Button, Then Click on "Your Account" Button
        waitForVisibility(loginPO.getBurgerMenuButton(), 30).click();
        waitForVisibility(loginPO.getYourAccountButton(), 30).click();

        // Scroll From-Down-To-Up, For [Your Payment Section] To Be Displayed
        for (int i = 0; i < 3; i++) {
            scrollFromDownToUp();
        }

        // Waiting for "Your Payment" Button in [Burger Menu] List to be Visible, Then Click.
        waitForVisibility(loginPO.getYourPaymentButton(), 30).click();

        // Getting "Card Type" Text
        String CardType = waitForVisibility(loginPO.getCardTypeText(), 30).getText();

        return CardType;

    }

    public String giftCardBalance() {

        // Waiting for "Manage gift card balance" Button in [Burger Menu] List to be Visible, Then Click.
        waitForVisibility(loginPO.getManageGiftCardBalanceButton(), 30).click();

        // Waiting for "Manage gift card balance" Button in [Burger Menu] List to be Visible, Then Click.
        String GiftCardBalance = waitForVisibility(loginPO.getGiftCardBalanceText(), 30).getText();

        return GiftCardBalance;

    }

    public void electronicsTvSearch() {

        // Waiting for "Burger Menu" Button in Main Home Screen to be Visible, Then Click.
        waitForVisibility(loginPO.getBurgerMenuButton(), 30).click();

        // Waiting for "Amazon" Home Button to be Visible, Then Click. [To Avoid A/B] Test.
        waitForVisibility(loginPO.getBurgerMenuHomeButton(), 30).click();

        // Waiting for "Burger Menu" Button in Main Home Screen to be Visible, Then Click.
        waitForVisibility(loginPO.getBurgerMenuButton(), 30);

        // Waiting for "Delivery To" Text to be Visible.
        waitForVisibility(loginPO.getDeliveryToText(), 30);

        // Waiting for "Burger Menu" Button in Main Home Screen to be Visible, Then Click.
        waitForVisibility(loginPO.getBurgerMenuButton(), 30).click();

        // Waiting for "Shop By Department" Button in [Burger Menu] List to be Visible, Then Click.
        waitForVisibility(loginPO.getShopByDepartmentButton(), 30).click();

        // Waiting for "Electronics" Button displayed in "Shop by Department" List, Then Click.
        waitForVisibility(loginPO.getElectronicsButton(), 30).click();

        // Waiting for "Shop By Category" Text To Be Visible, Then Scroll For [TV & Video] Visibility.
        waitForVisibility(loginPO.getShopByCategoryText(), 30);
        scrollFromDownToUp();

        // Waiting for "TV & Video" Section displayed in "Shop by Category" Screen, Then Click.
        waitForVisibility(loginPO.getTvAndVideoButton(), 30).click();

    }

    public void smartTvFilter() {

        // Waiting for "Delivery To" Text to be Visible, To Avoid Loading State.
        waitForVisibility(loginPO.getDeliveryToText(), 30);

        // Waiting for "TV Quick Filter" Button To be Visible, Then Click.
        waitForVisibility(loginPO.getTvFilterButton(), 30).click();

        // Waiting for "Smart TV Filter" Button To be Visible, Then Click.
        waitForVisibility(loginPO.getSmartTvFilterButton(), 30).click();

        // Waiting for "Delivery To" Text to be Visible, To Avoid Loading State.
        waitForVisibility(loginPO.getDeliveryToText(), 30);

        // Waiting for "TV Quick Filter" Button To be Visible, Then Click.
        waitForVisibility(loginPO.getTvFilterButton(), 30).click();

    }

    public void smartTvFilterResultNumbers() {

        // Waiting for "Filter Result Count" Button To be Visible,Then .
        String SmartTvTotalResult = waitForVisibility(loginPO.getFilterResultCountButton(), 30).getText();

        // Getting The Numbers of "Smart TV" After Applying Filter And Display here.
        System.out.println("Filter With Smart TV Test Case Passed And " + SmartTvTotalResult);

    }

    public void addNewAddress() {

        // Waiting for "Burger Menu" Button in Main Home Screen to be Visible, Then Click.
        waitForVisibility(loginPO.getBurgerMenuButton(), 30).click();

        // Waiting for "Your Account" Button in [Burger Menu] List to be Visible, Then Click.
        waitForVisibility(loginPO.getYourAccountButton(), 30).click();

        // Waiting for "Your Account" Button in [Burger Menu] List to be Visible, Then Click.
        waitForVisibility(loginPO.getYourAddressesText(), 30).click();

        // Waiting for "Your Account" Button in [Burger Menu] List to be Visible, Then Click.
        waitForVisibility(loginPO.getAddNewAddressButton(), 30).click();

    }

    public void addNewAddressScreen() {

        // Waiting for "Full Name"to be Visible, Then Set The Content.
        waitForVisibility(loginPO.getAddNewAddressHeaderText(), 30);
        waitForVisibility(loginPO.getAddressFullNameButton(), 30).sendKeys("Mohamed Ramadan");

        // Waiting for "Phone Number"to be Visible, Then Set The Content.
        waitForVisibility(loginPO.getAddressPhoneNumberButton(), 30).sendKeys("112223333");

        // Waiting for "Address"to be Visible, Then Set The Content.
        waitForVisibility(loginPO.getAddressAddressButton(), 30).sendKeys("Arjan, Danube Resorts, Block 1, G06");

        // Waiting for "City"to be Visible, Then Set The Content.
        waitForVisibility(loginPO.getAddressCityButton(), 30).sendKeys("Dubai");

        // Waiting for "Stat" Button to be Visible, Then Click.
        waitForVisibility(loginPO.getAddressStateButton(), 30).click();

        // Waiting for "State Selection" List to be Visible, Then Select "Alaska" as State.
        waitForVisibility(loginPO.getAddressSelectAlaskaStateButton(), 30).click();

        // Waiting for "Zip Code"to be Visible, Then Set The Content, Then Scroll
        waitForVisibility(loginPO.getAddressZipCodeButton(), 30).sendKeys("99501");
        scrollFromDownToUp();

        // Waiting for "Add Address" Button to be Visible, Then Click
        waitForVisibility(loginPO.getAddressAddAddressButton(), 30).click();

        // Waiting for "Warning" Text to be Visible, Then Scroll, Then Click
        waitForVisibility(loginPO.getAddressWarningText(), 30);
        scrollFromDownToUp();
        waitForVisibility(loginPO.getAddressAddAddressButton(), 30).click();

    }

    public String fullNameAfterAddingAddress() {

        // Waiting for "Full Name From Last Added Address" Text to be Visible, Then Get It's Text
        String FullName = waitForVisibility(loginPO.getFullNameFromLastAddedAddress(), 30).getText();

        return FullName;

    }

    public void changeCurrency() {

        // Waiting for "Burger Menu" Button in Main Home Screen to be Visible, Then Click.
        waitForVisibility(loginPO.getBurgerMenuButton(), 30).click();

        // Waiting for "Setting" Button in Burger Menu List to be Visible, Then Click.
        waitForVisibility(loginPO.getSettingButton(), 30).click();

        // Waiting for "Country & Language" Button to be Visible, Then Click.
        waitForVisibility(loginPO.getCountryAndLanguageButton(), 30).click();

        // Waiting for "Currency Change" Button to be Visible, Then Click.
        waitForVisibility(loginPO.getCurrencyChangeButton(), 30).click();

        // Waiting for "AED Currency Select" Button to be Visible, Then Click.
        waitForVisibility(loginPO.getSelectAEDCurrencyButton(), 30).click();

        // Waiting for "Done" Button to be Visible, Then Click.
        waitForVisibility(loginPO.getDoneButton(), 30).click();
    }

    public String dealOfTheDayCurrency() {

        // Waiting for "Delivery To" Text to be Visible, Then scroll once.
        waitForVisibility(loginPO.getDeliveryToText(), 30);

        // Scroll From-Down-To-Up, For [Your Payment Section] To Be Displayed
        for (int i = 0; i < 5; i++) {
            scrollFromDownToUp();
        }

        // Waiting for "Full Name From Last Added Address" Text to be Visible, Then Get It's Text
        String Currency = waitForVisibility(loginPO.getDealOfTheDayCurrencyText(), 30).getText();

        return Currency;

    }
}
