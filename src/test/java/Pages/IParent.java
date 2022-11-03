package Pages;

import org.openqa.selenium.WebElement;

public interface IParent {

    void sendKeysFunction(WebElement element, String value);

    void waitUntilVisible(WebElement element);

    void clickFunction(WebElement element);

    void waitUntilClickable(WebElement element);

    void moveToElement(WebElement element);

    void verifyContainsText(WebElement element, String text);

    void scrollToElement(WebElement element);

    void clickFunctionWithoutScroll(WebElement element);

    void waitUntilInvisibilityofElement(WebElement element);
}
