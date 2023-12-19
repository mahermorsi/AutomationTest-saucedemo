package packages.Test;
import com.sun.tools.javac.Main;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import packages.Infrastructure.Setup;
import packages.Logic.*;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.Assert.assertEquals;

public class CartTest {
    private static Setup newDriver = null;
    @BeforeEach
    public void beforeEach(){
        newDriver = new Setup();
        newDriver.setupDriver("chrome"); // get from configuration file
        newDriver.navigateToURL("https://www.saucedemo.com/"); // get from configuration file
        LoginPage loginPage = new LoginPage(newDriver.getDriver());
        loginPage.fullLoginProcess("standard_user","secret_sauce");
    }

    @Test
    public void Add3Remove1Test(){
        // ARRANGE

        // ACT
        MainPage mainPage = new MainPage(newDriver.getDriver());
        mainPage.addBackPackToCart();
        mainPage.addBikeToCart();
        mainPage.addOneSieToCart();
        mainPage.navigateToCart();
        CartPage cartPage = new CartPage(newDriver.getDriver());
        cartPage.removeOneSieCart();
        // ASSERT
        assertEquals(2,cartPage.getNumOfItemsInCart());
    }

    @Test
    public void Add2Test()  {
        // ARRANGE

        // ACT
        MainPage mainPage = new MainPage(newDriver.getDriver());
        mainPage.addBackPackToCart();
        mainPage.addBikeToCart();
        mainPage.navigateToCart();
        CartPage cartPage = new CartPage(newDriver.getDriver());
        // ASSERT
        assertEquals(2,cartPage.getNumOfItemsInCart());
    }
    @Test
    public void Add3Remove2Test()  {
        // ARRANGE

        // ACT
        MainPage mainPage = new MainPage(newDriver.getDriver());
        mainPage.addBackPackToCart();
        mainPage.addBikeToCart();
        mainPage.addOneSieToCart();
        mainPage.navigateToCart();
        CartPage cartPage = new CartPage(newDriver.getDriver());
        cartPage.removeOneSieCart();
        cartPage.removeBackPackFromCart();
        // ASSERT
        assertEquals(1,cartPage.getNumOfItemsInCart());
    }

    @AfterEach
    public void tearDown(){
        newDriver.closeDriver();

    }
}
