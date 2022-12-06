package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.Computer;
import com.nopcommerce.demo.pages.Electronics;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComputerTest extends BaseTest {

    Computer computer = new Computer();
    Electronics electronicsPage = new Electronics();
    HomePage homePage = new HomePage();

    @Test
    public void verifyUserShouldNavigateToComputer() {
        homePage.selectMenu("Computers");
        Assert.assertEquals(homePage.getVerifyComputer(), "Computers", "Error Message not displayed");
    }

    @Test
    public void verifyUserShouldNavigateToElectronics() {
        homePage.selectMenu("Electronics");
        Assert.assertEquals(homePage.getVerifyElectronics(), "Electronics", "Error Message not displayed");
    }

    @Test
    public void verifyUserShouldNavigateToApparel() {
        homePage.selectMenu("Apparel");
        //   Assert.assertEquals(homePage.getVerifyElectronics(), "Apparal", "Error Message not displayed");
    }


    @Test
    public void verifyProductArrangeInAlphaBaticalOrder() {
        computer.clickOnComputer();
        computer.clickOnDesktop();
        computer.getSelectByValue("6");

        List<WebElement> products = driver.findElements(By.xpath("//h4/a"));
        ArrayList<String> originalProductsName = new ArrayList<>();
        for (WebElement e : products) {
            originalProductsName.add(e.getText());
        }
        System.out.println(originalProductsName);
        // Reverse order
        Collections.reverse(originalProductsName);
        System.out.println(originalProductsName);
        // sort by Name Z - A
    //    selectByVisibleTextFromDropDown(By.id("products-orderby"), "Name (Z - A)");
        // After filter Z -A Get all the products name and stored into array list
   //     products = driver.findElements(By.xpath("//h4/a"));
        ArrayList<String> afterSortByZToAProductsName = new ArrayList<>();
        for (WebElement e : products) {
            afterSortByZToAProductsName.add(e.getText());
        }
        System.out.println(afterSortByZToAProductsName);
        //Assert.assertEquals("Product not sorted into Z to A order",originalProductsName, afterSortBy "Z To A" ProductsName);

    }
}
