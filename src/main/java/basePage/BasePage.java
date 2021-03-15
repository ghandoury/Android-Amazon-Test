package basePage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import pageLocators.Page;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static io.appium.java_client.touch.WaitOptions.waitOptions;

public class BasePage extends Page {

    private TouchAction action;

    public BasePage(AppiumDriver driver) {
       super(driver);
    }

    /**
     * Wait for an element to be visible
     *
     * @param element
     * @param time
     */
    public MobileElement waitForVisibility(MobileElement element, int time) {
        final WebDriverWait wait = new WebDriverWait(driver, time);
        MobileElement elementFounded = (MobileElement) wait.until(ExpectedConditions.visibilityOf(element));
        return elementFounded;
    }

    /**
     * Scroll Up the view
     */
    public void scrollFromDownToUp() {

        action = new TouchAction(driver);

        Dimension size = driver.manage().window().getSize();
        //Start Point Y coordinate
        int starty = (int) (size.height * 0.80);

        // END Point Y coordinate
        int endy = (int) (size.height * 0.40);

        // Start Point x coordinate
        int startx = size.width / 2;

        PointOption p1 = new PointOption();
        action.longPress(p1.point(startx, starty)).moveTo(p1.point(startx, endy)).release().waitAction(waitOptions(Duration.ofMillis(500))).perform();
    }

    public boolean scrollTillElementFound(String text) {
        try {
            driver.findElement(MobileBy.AndroidUIAutomator(
                    "new UiScrollable(new UiSelector()).scrollIntoView("
                            + "new UiSelector().text(\"" + text + "\"))"));
            return true;
        } catch (Exception e) {
            System.out.println("Element not Found");
            return false;
        }
    }
}
