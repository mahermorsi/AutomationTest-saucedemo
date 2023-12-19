package packages.Logic;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import packages.Infrastructure.BasePage;
import org.openqa.selenium.By;
public class MainPage extends BasePage {
    // Locators
    private final By BACKPACK_ID = By.id("add-to-cart-sauce-labs-backpack");
    private final By BIKE_ID = By.id("add-to-cart-sauce-labs-bike-light");
    private final By ONESIE_ID = By.id("add-to-cart-sauce-labs-onesie");
    private final By CART_BUTTON_CLASS = By.className("shopping_cart_link");

    private final WebElement backPackElement;
    private final WebElement bikeElement;
    private final WebElement oneSieElement;
    private final WebElement cartButtonElement;
    public MainPage(WebDriver driver) {
        super(driver);
        this.backPackElement =this.driver.findElement(BACKPACK_ID);
        this.bikeElement = this.driver.findElement(BIKE_ID);
        this.oneSieElement = this.driver.findElement(ONESIE_ID);
        this.cartButtonElement = this.driver.findElement(CART_BUTTON_CLASS);
    }
    public void addBackPackToCart() {
        this.backPackElement.click();
    }
    public void addBikeToCart(){
        this.bikeElement.click();
    }
    public void addOneSieToCart() {
        this.oneSieElement.click();
    }
    public void navigateToCart() {
        this.cartButtonElement.click();
    }
}
