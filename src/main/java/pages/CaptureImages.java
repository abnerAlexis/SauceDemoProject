package pages;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class CaptureImages {
    private WebDriver driver;
    private By visibleImage = By.xpath("//a[@id=\"item_4_img_link\"]");
    private ProductsPage productsPage;

    public CaptureImages(WebDriver driver) {
        this.driver = driver;
    }

    public void waitElementVisibility(By visibleImage) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
        wait.until(ExpectedConditions.visibilityOfElementLocated(visibleImage));

    }

    public void captureSuccesfulPageScreenShot() {
        waitElementVisibility(visibleImage);
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File file = screenshot.getScreenshotAs(OutputType.FILE);
        File path = new File("images/screenshot.png");
        try {
            FileUtils.copyFile(file, path);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void captureProblemUserScreenShot() {
        waitElementVisibility(visibleImage);
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File file = screenshot.getScreenshotAs(OutputType.FILE);
        File path = new File("images/problemUserScrSh.png");
        try {
            FileUtils.copyFile(file, path);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
