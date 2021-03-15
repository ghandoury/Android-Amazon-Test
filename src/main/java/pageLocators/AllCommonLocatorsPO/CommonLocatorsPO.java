package pageLocators.AllCommonLocatorsPO;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import pageLocators.Page;

import java.util.List;

public class CommonLocatorsPO extends Page {

    /**
     * "Home" Button in Burger Menu
     */
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Home']")
    private MobileElement burgerMenuHomeButton;

    /**
     * "Sign In" button displayed in the Welcome landing Screen.
     */
    @AndroidFindBy(id = "sign_in_button")
    private MobileElement signInButton;

    /**
     * "Email Field" Section displayed in the landing Screen.
     */
    @AndroidFindBy(className = "android.widget.EditText")
    private MobileElement emailField;

    /**
     * "Continue" button displayed in Sign In Screen.
     */
    @AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id, 'continue')]")
    private MobileElement continueButton;

    /**
     * "Pass Word" Section displayed in the landing Screen.
     */
    @AndroidFindBy(xpath = "//android.widget.EditText[contains(@resource-id, 'ap_password')]")
    private MobileElement passwordField;

    /**
     * "Sign In Submit" button displayed in the landing Screen.
     */
    @AndroidFindBy(className = "android.widget.Button")
    private MobileElement signInSubmitButton;

    /**
     * "Pass word Auto Save" Native button displayed After login sometimes.
     */
    @AndroidFindBy(id = "android:id/autofill_save_no")
    private MobileElement passwordAutoSavedNativePopup;

    /**
     * "Burger Menu" button displayed in Home Screen.
     */
    @AndroidFindBy(id = "com.amazon.mShop.android.shopping:id/chrome_action_bar_burger")
    private MobileElement burgerMenuButton;

    /**
     * "Your Account" Section/Button displayed in [Burger Menu] List.
     */
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Your Account']")
    private MobileElement yourAccountButton;

    /**
     * "Shop By Department" button displayed in [Burger Menu] List.
     */
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Shop by Department']")
    private MobileElement shopByDepartmentButton;

    /**
     * "Your Payment" Section/Button displayed in [Your Account] Section List.
     */
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Your Payments']")
    private MobileElement yourPaymentButton;

    /**
     * "Manage Gift Card Balance" Section/Button displayed in [Burger Menu] List.
     */
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Manage gift card balance']")
    private MobileElement manageGiftCardBalanceButton;

    /**
     * "Add Payment Method" Button displayed in the [Wallet] landing Screen.
     */
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Add a payment method']")
    private MobileElement addPaymentMethodButton;

    /**
     * "Add Credit Card" Button displayed in Payment Selection List Screen.
     */
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Add a credit or debit card']")
    private MobileElement addCreditCardButton;

    /**
     * "Name On The Card" Section/Button displayed in [Add Card] Screen.
     */
    @AndroidFindBy(className = "android.widget.EditText")
    private List<MobileElement> nameOnCardField;

    /**
     * "Card Expiry" Section/Button displayed in [Add Card] Screen.
     */
    @AndroidFindBy(xpath = "//android.widget.Spinner[@text='2021']")
    private MobileElement cardExpiryButton;

    /**
     * "Card Expiry Selection" Button displayed in [Add Card] Screen..
     */
    @AndroidFindBy(xpath = "//android.view.View[@text='2024']")
    private MobileElement cardExpirySelectedDate;

    /**
     * "Add Your Card" Button displayed In Adding Card Screen.
     */
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Add your card']")
    private MobileElement addYourCardButton;

    /**
     * "Payment Method Added" Text displayed After Adding Card.
     */
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Use this address']")
    private MobileElement useThisAddressButton;

    /**
     * "Use This Address" Button displayed After Adding Card.
     */
    @AndroidFindBy(xpath = "//android.view.View[@text='Payment method added']")
    private MobileElement paymentMethodAddedText;

    /**
     * "Visa Type" Text displayed in the Wallet Screen After Adding Credit Card.
     */
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Visa']")
    private MobileElement cardTypeText;

    /**
     * "Your Gift Card Balance" Text displayed in Gift Card Balance Screen.
     */
    @AndroidFindBy(xpath = "//android.view.View[@text='$0.00']")
    private MobileElement giftCardBalanceText;

    /**
     * "Electronics" Button displayed in "Shop by Department" List.
     */
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Electronics']")
    private MobileElement electronicsButton;

    /**
     * "TV & Video" Section displayed in "Shop by Category" Screen.
     */
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='TV & VIDEO']")
    private MobileElement tvAndVideoButton;

    /**
     * "Shop By Category" Text displayed in "Electronics" Screen.
     */
    @AndroidFindBy(xpath = "//android.view.View[@text='SHOP BY CATEGORY']")
    private MobileElement shopByCategoryText;

    /**
     * "Delivery To" Text displayed in "Home" Screen.
     */
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Deliver')]")
    private MobileElement deliveryToText;

    /**
     * "TV Filter" Quick Filter Button displayed in Search Results Screen.
     */
    @AndroidFindBy(xpath = "//android.widget.ToggleButton[contains(@text, 'Television')]")
    private MobileElement tvFilterButton;

    /**
     * "Smart TV" Filter Button displayed in Filter Screen.
     */
    @AndroidFindBy(xpath = "//android.view.View[@text='Smart TV']")
    private MobileElement smartTvFilterButton;

    /**
     * "Filter Result Count" Filter Button displayed in Filter Screen.
     */
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Show')]")
    private MobileElement filterResultCountButton;

    /**
     * "Your Address" Button displayed in "Your Account" List.
     */
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Your Addresses']")
    private MobileElement yourAddressesText;

    /**
     * "Add New Address" Button displayed in "Your Address" Screen.
     */
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Add a new address']")
    private MobileElement addNewAddressButton;

    /**
     * "Add New Address" Header Text displayed in "Your Address" Screen.
     */
    @AndroidFindBy(xpath = "//android.view.View[@text='Add a new address']")
    private MobileElement addNewAddressHeaderText;

    /**
     * "Full Name" Text displayed in "Your Address" Screen, From Last Added Address.
     */
    @AndroidFindBy(xpath = "//android.view.View[@text='Mohamed Ramadan']")
    private MobileElement fullNameFromLastAddedAddress;

    /**
     * "Full Name" Button displayed in "Add New Address" Screen.
     */
    @AndroidFindBy(className = "android.widget.EditText")
    private List<MobileElement> editTextList;

    /**
     * "State" Button displayed in "Add New Address" Screen.
     */
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ViewAnimator/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.widget.Spinner[2]")
    private MobileElement addressStateButton;

    /**
     * "Select State" List displayed in "Add New Address" Screen.
     */
    @AndroidFindBy(xpath = "//android.view.View[@text='Alaska']")
    private MobileElement addressSelectAlaskaStateButton;

    /**
     * "Add Address" Button displayed in "Add New Address" Screen.
     */
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Add address']")
    private MobileElement addressAddAddressButton;

    /**
     * "Add Address" Button displayed in "Add New Address" Screen.
     */
    @AndroidFindBy(xpath = "//android.view.View[contains(@text, 'Please verify')]")
    private MobileElement addressWarningText;

    /**
     * "Setting" Button displayed in "Burger Menu" List.
     */
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Settings')]")
    private MobileElement settingButton;

    /**
     * "Country & Language" Button displayed in "Burger Menu" List.
     */
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Country & Language')]")
    private MobileElement countryAndLanguageButton;

    /**
     * "Country & Language" Button displayed in "Burger Menu" List.
     */
    @AndroidFindBy(xpath = "//android.widget.Button[contains(@text, 'Currency:')]")
    private MobileElement currencyChangeButton;

    /**
     * "AED Currency" Button displayed in "Currency" Screen.
     */
    @AndroidFindBy(xpath = "//android.widget.RadioButton[contains(@text, 'AED')]")
    private MobileElement selectAEDCurrencyButton;

    /**
     * "Done" Button displayed After Select Currency.
     */
    @AndroidFindBy(xpath = "//android.widget.Button[contains(@text, 'Done')]")
    private MobileElement doneButton;

    /**
     * "Deal Of The Day" Text displayed After Select Currency In Home Screen.
     */
    @AndroidFindBy(xpath = "//android.view.View[contains(@text, 'Deal of the Day')]")
    private MobileElement dealOfTheDayText;

    /**
     * "Currency of Deal of The Day" Item Text displayed After Select Currency In Home Screen.
     */
    @AndroidFindBy(xpath = "//android.view.View[contains(@text, 'AED')]")
    private MobileElement dealOfTheDayCurrencyText;

    /**
     * @param driver
     */
    public CommonLocatorsPO(AppiumDriver driver) {
        super(driver);
    }

    public MobileElement getBurgerMenuHomeButton() {
        return burgerMenuHomeButton;
    }

    public MobileElement getSignInButton() {
        return signInButton;
    }

    public MobileElement getEmailField() {
        return emailField;
    }

    public MobileElement getContinueButton() {
        return continueButton;
    }

    public MobileElement getPasswordField() {
        return passwordField;
    }

    public MobileElement getSignInSubmitButton() {
        return signInSubmitButton;
    }

    public MobileElement getPasswordAutoSavedNativePopup() {
        return passwordAutoSavedNativePopup;
    }

    public MobileElement getBurgerMenuButton() {
        return burgerMenuButton;
    }

    public MobileElement getYourAccountButton() {
        return yourAccountButton;
    }

    public MobileElement getShopByDepartmentButton() {
        return shopByDepartmentButton;
    }

    public MobileElement getYourPaymentButton() {
        return yourPaymentButton;
    }

    public MobileElement getManageGiftCardBalanceButton() {
        return manageGiftCardBalanceButton;
    }

    public MobileElement getAddPaymentMethodButton() {
        return addPaymentMethodButton;
    }

    public MobileElement getAddCreditCardButton() {
        return addCreditCardButton;
    }

    public List<MobileElement> getNameOnCardField() {
        return nameOnCardField;
    }

    public MobileElement getCardExpiryButton() {
        return cardExpiryButton;
    }

    public MobileElement getCardExpirySelectedDate() {
        return cardExpirySelectedDate;
    }

    public MobileElement getAddYourCardButton() {
        return addYourCardButton;
    }

    public MobileElement getPaymentMethodAddedText() {
        return paymentMethodAddedText;
    }

    public MobileElement getUseThisAddressButton() {
        return useThisAddressButton;
    }

    public MobileElement getCardTypeText() {
        return cardTypeText;
    }

    public MobileElement getGiftCardBalanceText() {
        return giftCardBalanceText;
    }

    public MobileElement getElectronicsButton() {
        return electronicsButton;
    }

    public MobileElement getTvAndVideoButton() {
        return tvAndVideoButton;
    }

    public MobileElement getShopByCategoryText() {
        return shopByCategoryText;
    }

    public MobileElement getDeliveryToText() {
        return deliveryToText;
    }

    public MobileElement getTvFilterButton() {
        return tvFilterButton;
    }

    public MobileElement getSmartTvFilterButton() {
        return smartTvFilterButton;
    }

    public MobileElement getFilterResultCountButton() {
        return filterResultCountButton;
    }

    public MobileElement getYourAddressesText() {
        return yourAddressesText;
    }

    public MobileElement getAddNewAddressButton() {
        return addNewAddressButton;
    }

    public MobileElement getAddNewAddressHeaderText() {
        return addNewAddressHeaderText;
    }

    public MobileElement getFullNameFromLastAddedAddress() {
        return fullNameFromLastAddedAddress;
    }

    public MobileElement getAddressFullNameButton() {
        return editTextList.get(0);
    }

    public MobileElement getAddressPhoneNumberButton() {
        return editTextList.get(1);
    }

    public MobileElement getAddressAddressButton() {
        return editTextList.get(2);
    }

    public MobileElement getAddressCityButton() {
        return editTextList.get(4);
    }

    public MobileElement getAddressZipCodeButton() {
        return editTextList.get(5);
    }

    public MobileElement getAddressAddAddressButton() {
        return addressAddAddressButton;
    }

    public MobileElement getAddressWarningText() {
        return addressWarningText;
    }

    public MobileElement getAddressStateButton() {
        return addressStateButton;
    }

    public MobileElement getAddressSelectAlaskaStateButton() {
        return addressSelectAlaskaStateButton;
    }

    public MobileElement getSettingButton() {
        return settingButton;
    }

    public MobileElement getCountryAndLanguageButton() {
        return countryAndLanguageButton;
    }

    public MobileElement getCurrencyChangeButton() {
        return currencyChangeButton;
    }

    public MobileElement getSelectAEDCurrencyButton() {
        return selectAEDCurrencyButton;
    }

    public MobileElement getDoneButton() {
        return doneButton;
    }

    public MobileElement getDealOfTheDayText() {
        return dealOfTheDayText;
    }

    public MobileElement getDealOfTheDayCurrencyText() {
        return dealOfTheDayCurrencyText;
    }
}
