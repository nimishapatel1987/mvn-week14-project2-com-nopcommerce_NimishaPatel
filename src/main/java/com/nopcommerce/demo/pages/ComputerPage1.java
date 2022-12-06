package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ComputerPage1 extends Utility {
    //Click on Computer Menu
    By computerMenu = By.xpath("//body/div[6]/div[2]/ul[1]/li[1]/a[1]");
    public void clickOnComputer() {
        clickOnElement(computerMenu);
    }
    // Click on Desktop
    By desktopMenu = By.xpath("//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/h2[1]/a[1]");
    public void clickOnDesktop() {
        clickOnElement(desktopMenu);
    }
    //Select Sort By position "Name: Z to A"
    By selectByValue = By.xpath("//select[@id='products-orderby']");
    public void getSelectByValue(String value) {
        selectByValueFromDropDown(selectByValue, value);
    }
    //Verify the Product will arrange in Descending order.
    By selectPosition = By.xpath("//option[contains(text(), Name: Z to A");
    //Click on "Add To Cart"
    By AddToCart = By.xpath("//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/button[1]");
    public void clickOnAddToCart() {
        try {
            clickOnElement(By.xpath("//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/button[1]"));
        } catch (StaleElementReferenceException e) {
            clickOnElement(By.xpath("//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/button[1]"));
        }
        clickOnElement(AddToCart);
    }

    //Verify the text "Build your own computer"
    By verifyBuildYourOwn = By.xpath("//h1[contains(text(),'Build your own computer')]");
    public String getVerifyBuildYourOwn() {
        return getTextFromElement(verifyBuildYourOwn);
    }

    // Select "2.2 GHz Intel Pentium Dual-Core E2200" using Select class
    By selectProcessor = By.xpath("//select[@id='product_attribute_1']");
    public void selectProcessorByValue(String value) {
        selectByValueFromDropDown(selectProcessor, value);
    }
    // Select "8GB [+$60.00]" using Select class.
    By selectram = By.xpath("//select[@id='product_attribute_2']");
    public void selectRamByValue(String value) {
        selectByValueFromDropDown(selectram, value);
    }
    //// Select HDD radio "400 GB [+$100.00]"
    By selectHDD = By.cssSelector("#product_attribute_3_7");
    public void clickOnHDD400GB() {
        clickOnElement(selectHDD);
    }
    //Select OS radio "Vista Premium [+$60.00]"
    By selectOS = By.id("product_attribute_5_12");
    public void clickOnOsVistaPremium() {
        clickOnElement(selectOS);
    }

    //Verify the price "$1,475.00"
    By verifyTotal = By.id("price-value-1");
    public String verifyTotalPrice() {
        return getTextFromElement(verifyTotal);
    }
    //Click on "ADD TO CARD" Button.
    By addToCartButton = By.cssSelector("#add-to-cart-button-1");
    public void clickOnAddToCartButton() {
        clickOnElement(addToCartButton);
    }
    //verify product added to cart
    By verifyCartMessage = By.xpath("//body/div[@id='bar-notification']/div[1]/p[1]");
    public String verifyCaryMessage() {
        return getTextFromElement(verifyCartMessage);
    }
    //Verify the Message "The product has been added to your shopping cart" on Top green Bar
    By closeMessage = By.xpath("//body/div[@id='bar-notification']/div[1]/span[1]");
    public void closeMessageBar() {
        clickOnElement(closeMessage);
    }
    // Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
    By mouseHover = By.xpath("//body/div[@id='bar-notification']/div[1]/span[1]");
    public void mouseHoverOnShoppingCart() {
        mouseHoverToElementAndClick(mouseHover);
    }
    By mouseHoverOnShoppingCart = By.xpath("//button[@class='button-1 cart-button']");
    //Verify the message "Shopping cart"
    By verifyMessage = By.xpath("//body/div[@id='bar-notification']/div[1]/span[1]");
    public void mouseHoverOnElementShoppingCart() {
        mouseHoverToElement(mouseHoverOnShoppingCart);
    }
    By clickOnGoToCart = By.xpath("//button[@class='button-1 cart-button']");

    public void clickOnGoToCart() {
        clickOnElement(clickOnGoToCart);
    }
    // Change the Qty to "2"
    By clearText = By.xpath("//input[@value='1']");
    public void clearTextInQuantityField() {
        Actions actions = new Actions(driver);
        WebElement quantity = driver.findElement(clearText);
        quantity.clear();
    }
    By sendTextToQuantity = By.xpath("//input[@value='1']");

    public void sendTextToQuantityField() {
        sendTextToElement(sendTextToQuantity, "2");
    }
    By clickOnUpdateShoppingCart = By.xpath("//button[@id='updatecart']");
    public void clickOnUpdateShoppingCartButton() {
        clickOnElement(clickOnUpdateShoppingCart);
    }
    //Verify the Total"$2,950.00
    By verifyTheTotal = By.xpath("//tbody/tr[1]/td[6]/span[1]");
    //click on check box and agreed terms
    By clickOnCheckbox = By.xpath("//button[@id='checkout']");
    public void clickOnCheckBoxIAgreeWithTermsAndCondition() {
        clickOnElement(clickOnCheckbox);
    }
    //Click on “CHECKOUT”
    By clickOnCheckout = By.xpath("//button[@id='checkout']");
    public void clickOnCheckOutButton() {
        clickOnElement(clickOnCheckout);
    }

    //Verify the Text “Welcome, Please Sign In!”
    By welcomeText = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");
    //Click on “CHECKOUT AS GUEST” Tab
    By clickOnCheckoutAsGuest= By.xpath("//button[contains(text(),'Checkout as Guest')]");
    public void clickOnCheckOutAsGuest() {
        clickOnElement(clickOnCheckoutAsGuest);
    }
    //Fill the all mandatory field
    By sendTextToFirstName = By.id("BillingNewAddress_FirstName");
    public void sendTextToFirstNameField(String name) {
        sendTextToElement(sendTextToFirstName, name);
    }
    By sendTextToLastName = By.id("BillingNewAddress_LastName");
    public void sendTextToLastNameField(String lastName) {
        sendTextToElement(sendTextToLastName, lastName);
    }
    By sendTextToEmail = By.id("BillingNewAddress_Email");
    public void sendTextToEmailField(String email) {
        sendTextToElement(sendTextToEmail, email);
    }

    By sendTextToCompany = By.xpath("//select[@id='BillingNewAddress_CountryId']");
    public void sendTextToCompanyField(String company) {
        sendTextToElement(sendTextToCompany, company);
    }
    public void selectCountryFromDropDownList() {
        selectByValueFromDropDown(By.xpath("//select[@id='BillingNewAddress_CountryId']"), "146");
    }
    By sendTextToCity = By.xpath("//input[@id='BillingNewAddress_City']");
    public void sendTextToCityField(String city) {
        sendTextToElement(sendTextToCity, city);
    }

    By sendTextToAddress1 = By.cssSelector("#BillingNewAddress_Address1");
    public void sendTextToAddressLine1(String address) {
        sendTextToElement(sendTextToAddress1, address);
    }
    By sendTextToAddress2 = (By.cssSelector("#BillingNewAddress_Address2"));

    public void sendTextToAddressLine2(String address) {
        sendTextToElement(sendTextToAddress2, address);
    }
    By sendTextToPostalCode = By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']");

    public void sendTextToPostcode(String postcode) {
        sendTextToElement(sendTextToPostalCode, postcode);
    }
    By sendTextToPhoneNumber = By.xpath("//input[@id='BillingNewAddress_PhoneNumber']");

    public void sendTextToPhoneNumberField(String number) {
        sendTextToElement(sendTextToPhoneNumber, number);
    }
    //Click on “CONTINUE”
    By clickOnContinue = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[1]/div[2]/div[1]/button[4]");
    public void clickOnContinueButton() {
        clickOnElement(clickOnContinue);
    }
    //Click on Radio Button “Next Day Air($0.00)”
    By clickOnNextDayAir = By.xpath("//input[@id='shippingoption_1']");
    public void clickOnNextDayAirButton() {
        clickOnElement(clickOnNextDayAir);
    }
    // Click on “CONTINUE”
    By clickOnContinueTab = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[3]/div[2]/form[1]/div[2]/button[1]");
    public void clickOnContinueButtonAgain() {
        clickOnElement(clickOnContinueTab);
    }
    //Select Radio Button “Credit Card”
    By clickOnCreditCard = By.xpath("//input[@id='paymentmethod_1']");
    public void clickOnCreditCardButton() {
        clickOnElement(clickOnCreditCard);
    }
    //Select “Master card” From Select credit card dropdown
    By continueButton = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[4]/div[2]/div[1]/button[1]");
    public void selectClickOnContinue1() {
        clickOnElement(continueButton);
    }
    By clickOnMasterCard = By.xpath("//select[@id='CreditCardType']");
    public void selectMasterCardFromCreditCardDropdown(String value) {
        selectByValueFromDropDown(clickOnMasterCard,value);
    }

    //Fill all the details
    By cardholdername = By.xpath("//input[@id='CardholderName']");
    public void sendTextTOCardHolderName(String name) {
        sendTextToElement(cardholdername, name);
    }
    By cardNumber = By.xpath("//input[@id='CardNumber']");
    public void sendTextTOCardNumber(String num) {
        sendTextToElement(cardNumber, num);
    }
    By selectMonth = By.xpath("//select[@id='ExpireMonth']");
    By selectYear = By.xpath("//select[@id='ExpireYear']");
    public void selectMonthAndYearForCreditCardExpireData() {
        selectByValueFromDropDown(By.id("ExpireMonth"), "10");
        selectByValueFromDropDown(By.id("ExpireYear"), "2025");
    }
    By cardCode = By.xpath("//input[@id='CardCode']");
    public void sendTextToCardCode(String code) {
        sendTextToElement(cardCode, code);
    }

    //Click on “CONTINUE”
    By continueButton2 = By.xpath("//button[@class='button-1 payment-info-next-step-button']");

    public void clickOnContinueButton2() {
        clickOnElement(continueButton2);
    }
    By varifText1 = By.xpath("//li[@class='payment-method']/span[2]");

    public String getVerifyText1() {
        return getTextFromElement(varifText1);

    }
    By varifText2 = By.xpath("//li[@class='shipping-method']//span[2]");

    public String getVerifyText2() {
        return getTextFromElement(varifText2);

    }
    By varifText3 = By.xpath("//tr[@class='order-total']/td[2]/span/strong");

    public String getVerifyText3() {
        return getTextFromElement(varifText3);

    }
    By conform = By.xpath("//button[@class='button-1 confirm-order-next-step-button']");

    public void clickOnConformButton() {
        clickOnElement(conform);
    }
    By varifText4 = By.xpath("//div[@class='page-title']/h1");

    public String getVerifyText4() {
        return getTextFromElement(varifText4);

    }
    By varifText5 = By.xpath("//strong[contains(text(),'Your order has been successfully processed!')]");

    public String getVerifyText5() {
        return getTextFromElement(varifText5);

    }

    By continueButton3 = By.cssSelector("div.master-wrapper-page:nth-child(6) div.master-wrapper-content div.master-column-wrapper div.center-1 div.page.checkout-page.order-completed-page div.page-body.checkout-data div.section.order-completed div.buttons > button.button-1.order-completed-continue-button");

    public void clickOnContinueButton3() {
        clickOnElement(continueButton3);
    }
    By varifText6 = By.xpath("//h2[contains(text(),'Welcome to our store')]");

    public String getVerifyText6() {
        return getTextFromElement(varifText6);

    }

}
