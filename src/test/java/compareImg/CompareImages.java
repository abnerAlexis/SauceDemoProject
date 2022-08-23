package compareImg;

import base.BaseTests;
import org.testng.annotations.Test;

public class CompareImages extends BaseTests {


    @Test
    public void getSuccessfulPageScreenShot() {
        loginPage.loginStandardUser();
        productsPage.getPageTitle();
        captureImages.captureSuccesfulPageScreenShot();
    }

    @Test
    public void getProblemUserPageScreenShot() {
        loginPage.loginProblemUser();
        productsPage.getPageTitle();
        captureImages.captureProblemUserScreenShot();
    }


}
