package compareImg;

import base.BaseTests;
import com.groupdocs.comparison.Comparer;
import org.testng.Assert;
import org.testng.annotations.Test;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class CompareImages extends BaseTests {


    @Test
    public void getSuccessfulPageScreenShot() {
        loginPage.loginStandardUser();
        productsPage.getPageTitle();
        captureImages.captureSuccessfulPageScreenShot();
    }

    @Test
    public void getProblemUserPageScreenShot() {
        loginPage.loginProblemUser();
        productsPage.getPageTitle();
        captureImages.captureProblemUserScreenShot();
    }
}
