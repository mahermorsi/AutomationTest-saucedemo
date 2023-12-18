package packages.Logic;
import org.openqa.selenium.WebDriver;
import packages.Infrastructure.BasePage;
import org.openqa.selenium.By;
public class CartPage extends BasePage {
    private final By REMOVE_BIKE_ID = By.id("remove-sauce-labs-bike-light");
    private final By REMOVE_BACKPACK_ID =By.id("remove-sauce-labs-backpack");
    private final By REMOVE_ONESIE_ID =By.id("remove-sauce-labs-onesie");
    private final By COUNT_ITEM_CLASS =By.className("shopping_cart_badge");
    public CartPage(WebDriver driver) {
        super(driver);
    }
    public void removeBikeFromCart(){
        driver.findElement(REMOVE_BIKE_ID).click();
    }
    public void removeBackPackFromCart(){
        driver.findElement(REMOVE_BACKPACK_ID).click();
    }
    public void removeOneSieCart(){
        driver.findElement(REMOVE_ONESIE_ID).click();
    }
    public int getNumOfItemsInCart(){
        return Integer.parseInt(driver.findElement(COUNT_ITEM_CLASS).getText());
    }
}
