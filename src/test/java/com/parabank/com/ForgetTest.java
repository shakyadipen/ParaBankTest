package com.parabank.com;

import Pages.ForgetPage;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class ForgetTest extends BaseTest{
    @Test
    public void ForgetTest(){
        ForgetPage forgetpage=new ForgetPage(driver);
        forgetpage.ClickForgetLink();
        assertTrue(forgetpage.forgetPageVerify().contains("Customer Lookup"));
        forgetpage.fillDetails();
        forgetpage.clickFind();

    }
}
