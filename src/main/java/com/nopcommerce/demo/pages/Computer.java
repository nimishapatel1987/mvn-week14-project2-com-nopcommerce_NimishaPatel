package com.nopcommerce.demo.pages;


import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;

public class Computer extends Utility {

    //Click on Computer Menu
    By computerMenu = By.xpath("//body/div[6]/div[2]/ul[1]/li[1]/a[1]");
    public void clickOnComputer(){
        clickOnElement(computerMenu);
    }
    // Click on Desktop
    By desktopMenu = By.xpath("//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/h2[1]/a[1]");
    public void clickOnDesktop() {
        clickOnElement(desktopMenu);
    }
    //Select Sort By position "Name: Z to A"
    By selectByValue = By.xpath("//select[@name='products-orderby']");
    public void getSelectByValue(String value){
        selectByValueFromDropDown(selectByValue,value);
    }
    //Click on "Add To Cart"
    By addToCart = By.xpath("//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/button[1]");
    public void clickOnAddToCart() {
        try {
            clickOnElement(By.xpath("//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/button[1]"));
        } catch (StaleElementReferenceException e) {
            clickOnElement(By.xpath("//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/button[1]"));
        }
        clickOnElement(addToCart);
    }
    //Verify the text "Build your own computer"
    By verifyBuildYourOwn = By.xpath("//h1[contains(text(),'Build your own computer')]");
    public String getVerifyBuildYourOwn() {
        return getTextFromElement(verifyBuildYourOwn);
    }
    // Select "2.2 GHz Intel Pentium Dual-Core E2200" using Select class
    By sortProcessor = By.xpath("//select[@id='product_attribute_1']");
    By selectProcessor = By.xpath("//select[@id='product_attribute_1']");
    public void selectProcessorByValue(String value){
        selectByValueFromDropDown(selectProcessor,value);
    }
    // Select "8GB [+$60.00]" using Select class.
    By selectByVisibleTextFromDropDown = By.xpath("//select[@id='product_attribute_2']");
    By selectRam = By.xpath("//select[@id='product_attribute_2']");
    public void selectRamByValue(String value){
        selectByValueFromDropDown(selectRam,value);
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
    By addToCard = By.cssSelector("#add-to-cart-button-1");
    public void clickOnAddToCartButton() {
        clickOnElement(addToCart);
    }
    //verify product added to cart
    By verifyCartMessage = By.xpath("//body/div[@id='bar-notification']/div[1]/p[1]");
    public String verifyCaryMessage() {
        return getTextFromElement(verifyCartMessage);
    }
    //Verify the Message "The product has been added to your shopping cart" on Top green Bar
    By verifythemessage = By.xpath("//body/div[@id='bar-notification']/div[1]/span[1]");
    public void closeMessageBar() {
        clickOnElement(addToCart);
    }
    // Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
    By mouseHover = By.xpath("//span[contains(text(),'Shopping cart')]");
    public void mouseHoverOnShoppingCart() {
        mouseHoverToElementAndClick(mouseHover);
    }
}

