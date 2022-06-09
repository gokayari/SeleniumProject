package com.cydeo.tests.day12_pom_design_explicit_wait;

import com.cydeo.pages.LibraryLoginPage;
import com.cydeo.utilities.Driver;
import com.cydeo.utilities.HandleWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class POMPractices {

    @Test
    public void required_field_error_message_test(){
        //TC #1: Required field error message test
        //1- Open a Chrome browser
        //2- Go to: https://library1.cydeo.com
        Driver.getDriver().get("https://library1.cydeo.com");

        HandleWait.staticWait(1);

        //3- Do not enter any information
        //4- Click to “Sign in” button
        LibraryLoginPage libraryLoginPage = new LibraryLoginPage();

        libraryLoginPage.signInButton.click();

        HandleWait.staticWait(1);

        //5- Verify expected error is displayed:
        //Expected: This field is required. NOTE: FOLLOW POM DESIGN PATTERN
        Assert.assertTrue(libraryLoginPage.fieldRequiredErrorMessage.isDisplayed());

    }


}