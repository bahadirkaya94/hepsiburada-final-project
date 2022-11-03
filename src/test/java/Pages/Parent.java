package Pages;

import Utilities.GWD;
import junit.framework.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Parent implements IParent{
    @Override
    public void sendKeysFunction(WebElement element, String value)
    {
        waitUntilVisible(element);
        element.clear();
        element.sendKeys(value);
    }
    @Override
    public void waitUntilVisible(WebElement element)
    {
        WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOf(element));
    }
    @Override
    public void clickFunction(WebElement element)
    {
        waitUntilClickable(element);
        scrollToElement(element);
        moveToElement(element);
        element.click();
    }
    @Override
    public void waitUntilClickable(WebElement element)
    {
        WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
    @Override
    public void moveToElement(WebElement element)
    {
        Actions actions = new Actions(GWD.getDriver());
        Action action = actions.moveToElement(element).build();
        action.perform();
    }
    @Override
    public void verifyContainsText(WebElement element, String text)
    {
        waitUntilVisible(element);
        Assert.assertTrue(element.getText().toUpperCase().contains(text.toUpperCase()));
    }

    @Override
    public void scrollToElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) GWD.getDriver();
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    @Override
    public void clickFunctionWithoutScroll(WebElement element)
    {
        waitUntilClickable(element);
        element.click();
    }
    @Override
    public void waitUntilInvisibilityofElement(WebElement element)
    {
        WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.invisibilityOf(element));
    }
}