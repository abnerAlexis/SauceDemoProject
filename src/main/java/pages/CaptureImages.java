package pages;

import com.groupdocs.comparison.Comparer;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import java.io.File;
import java.io.IOException;

public class CaptureImages {
    private WebDriver webDriver;
    private static final int SLEEP_TIME_MILLI_SECONDS = 2000;

    public CaptureImages(WebDriver driver) {
        this.webDriver = driver;
    }

    public void captureSuccessfulPageScreenShot() {
        getScreenShot("images/screenshot.png");
    }

    public void captureProblemUserScreenShot() {
        getScreenShot("images/problemUserScrSh.png");
    }

    private void getScreenShot(String filePath) {
        sleep(SLEEP_TIME_MILLI_SECONDS);
        TakesScreenshot screenshot = (TakesScreenshot) webDriver;
        File file = screenshot.getScreenshotAs(OutputType.FILE);
        File path = new File(filePath);
        try {
            FileUtils.copyFile(file, path);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void sleep(int milliSecond) {
        try {
            Thread.sleep(milliSecond);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
