package packages.Logic;
import org.openqa.selenium.WebDriver;
import packages.Infrastructure.BasePage;
import org.openqa.selenium.By;
public class MainPage extends BasePage {
    // Locators
    private final By BACKPACK_ID = By.id("add-to-cart-sauce-labs-backpack");
    private final By BIKE_ID = By.id("add-to-cart-sauce-labs-bike-light");
    private final By ONESIE_ID = By.id("add-to-cart-sauce-labs-onesie");
    private final By CART_BUTTON_CLASS = By.className("shopping_cart_link");
    public MainPage(WebDriver driver) {
        super(driver);
    }
    public void addBackPackToCart() {
        this.driver.findElement(BACKPACK_ID).click();
    }
    public void addBikeToCart(){
        this.driver.findElement(BIKE_ID).click();
    }
    public void addOneSieToCart() {
        this.driver.findElement(ONESIE_ID).click();
    }
    public void navigateToCart() {
        this.driver.findElement(CART_BUTTON_CLASS).click();
    }
}
