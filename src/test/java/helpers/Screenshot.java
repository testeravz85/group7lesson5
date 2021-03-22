package test.java.helpers;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Screenshot {

    private final WebDriver driver;

    public Screenshot(WebDriver driver) {
        this.driver = driver;
    }

    public void makeScreenshot(ITestResult testResult) {

        String pattern = "MM-dd-yyyy HH:mm:ss";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String date = simpleDateFormat.format(new Date());

        TakesScreenshot screenshot = (TakesScreenshot)driver;
        File src = screenshot.getScreenshotAs(OutputType.FILE);
        Path curentRelativePath = Paths.get("");
        try {
            FileUtils.copyFile(src, new File(
                    curentRelativePath.toAbsolutePath().toString()
                            + "/screenshots/"
                            + testResult.getTestClass().getName().replace(".", "/")
                            + "/" + testResult.getMethod().getConstructorOrMethod().getName() + "_" + date
                            + ".png"
            ));
            System.out.println(curentRelativePath.toAbsolutePath().toString()
                    + "/screenshots/"
                    + testResult.getTestClass().getName().replace(".", "/")
                    + "/" + testResult.getMethod().getConstructorOrMethod().getName()
                    + ".png");
        } catch (IOException e) {
            System.out.println("Hello");
            e.printStackTrace();
        }
    }
}
