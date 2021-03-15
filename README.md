Android-Amazon-Quick-Test

Cover The Following: [Login - Add Payment - Gift Card - Search & Filter - Add Address - Change Currency]

The Goal - To automated Amazon app on android platform using Appium

The Pre Steps

- Istall apk file in your running Emulator, Then Update Amazon App to The Latest from googlePlay 
- apk - https://drive.google.com/file/d/1gVjvDXqbr7XlAlxbSAr0FUO2xxo8gosM/view?usp=drive_web
- Open Appium destop and use the following Host/Port to your appium "http://127.0.0.1:4723/wd/hub"
- Make sure to configure [platformName , platformVersion , deviceName] & Use the following:
- appPackage=com.amazon.mShop.android.shopping
- appActivity=com.amazon.mShop.home.HomeActivity

Excecuting the following:

Scenario 1: [Check Add a new Payment to your profile]

- Open Amazon app with region United State
- Login with valid credentials
- Tap on Your account
- From Payments section, select Your Payments
- Tap on Wallet and add a credit or debit card as the payment method
- Assert on added card with correct type [Visa/Mastercard]

Scenario 2: [Check your gift card's balance is $0.00]

- Tap on Your account
- From Payments section, select Manage gift card balance
- Check the balance of your gift card is $0.00

Scenario 3: [Check the total displayed number of results for category Smart Home | Televisions]

- Click on Shop by Department from burger menu
- Choose category ‘Electronics’
- Choose sub-category category ’TV & VIDEO’
- Filter with ’Smart TV’ and click show results
- Verify the total numbers after applying filter

Scenario 4: [Check Add a new Address to your profile]

- Tap on Your account
- From Account settings, select Your Address
- Add new address
- Assert on added address under personal Addresses

Scenario 5: [Check the selected currency displayed for the products' price]

- Go to Currency Settings
- Select Country & Language
- Change currency from 'USD' to 'AED'
- Save changes
- Assert on selected currency displayed in Deals for day products

===============================================================

Pending...

- Publish test execution report in html format.

- Prepare a test summary report and include the information about platform, app, tools etc

- Include all tests related document in same github repository.

- Manual test cases to cover the given scenarios

- [ Config & App Execution Video Link - https://drive.google.com/file/d/10G-GRBIui6wfbpEKx7mILTIOuLcBhw-U/view?usp=sharing ]
