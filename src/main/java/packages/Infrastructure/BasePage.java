package packages.Infrastructure;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {
    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }
    public WebElement getHeader(){
        By headerLocator = By.id("header");
        return driver.findElement(headerLocator);
    }
    public WebElement getFooter(){
        By footerLocator=By.className(("footer"));
        return driver.findElement((footerLocator));
    }


}
