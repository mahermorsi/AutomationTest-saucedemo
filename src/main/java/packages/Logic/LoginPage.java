package packages.Logic;
import packages.Infrastructure.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {
    private static final String  INPUT_USER_NAME = "user-name";
    private static final String  INPUT_PASSWORD = "password";
    private static final String  BUTTON_SUBMIT = "login-button";
    private  WebElement user;
    private WebElement pass;
    private WebElement submit;

    public LoginPage(WebDriver driver){
        super(driver);
        this.initPage();
    }
    public void initPage(){
        user = this.driver.findElement(By.id(INPUT_USER_NAME));
        pass = this.driver.findElement(By.id(INPUT_PASSWORD));
        submit = this.driver.findElement(By.id(BUTTON_SUBMIT));
    }
    public void fillUserName(String userName){
        this.user.sendKeys(userName);
    }
    public void fillPassword(String password){
        this.pass.sendKeys(password);
    }
    public void clickOnSubmit(){
        this.submit.click();
    }
    public void fullLoginProcess(String userName,String password){
        this.fillUserName(userName);
        this.fillPassword(password);
        this.clickOnSubmit();
    }
}