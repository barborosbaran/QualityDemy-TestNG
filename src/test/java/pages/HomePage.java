package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utilities.ConfigReader;
import utilities.Driver;

public class HomePage {

    public HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[text()='Categories']")
    public WebElement category;

    @FindBy(xpath = "(//*[text()='All courses'])[1]")
    public WebElement allCourseCategory;

    @FindBy(xpath = "//a[@onclick='cookieAccept();']")
    public WebElement cookies;

    @FindBy(xpath = "//a[text()='Instructor']")
    public WebElement instructorLink;

    @FindBy(xpath = "//*[text()='Log in']")
    public WebElement logInLinki;

    @FindBy(xpath = "(//a[text()='My courses'])[1]")
    public WebElement myCoursesLinki;

    @FindBy(xpath = "//*[@class='btn btn-sign-in-simple']")
    public WebElement firstLogInButton;

    @FindBy(xpath = "//*[@id='login-email']")
    public WebElement emailInput;

    @FindBy(xpath = "//*[@id='login-password']")
    public WebElement passwordInput;

    @FindBy(xpath = "//button[@class='btn red radius-5 mt-4 w-100']")
    public WebElement loginButton;

    @FindBy(linkText = "Sign Up")
    public WebElement signUpButton;

    @FindBy(xpath = "(//div[@class='icon'])[5]")
    public WebElement userMenuIcon;

    @FindBy(xpath = "(//li[@class='user-dropdown-menu-item'])[4]")
    public WebElement purchaseHistory;

    @FindBy(xpath = "(//i[@class='far fa-heart'])[1]")
    public WebElement wishListKalp;

    @FindBy(xpath = "//*[text()='Go to wishlist']")
    public WebElement gotoWishListLinki;

    @FindBy(xpath = "(//i[@class='fas fa-shopping-cart'])[1]")
    public WebElement sepet;

    @FindBy(xpath = "//i[@class='fab fa-twitter']")
    public WebElement twitterIcon;

    public static void login(){
        HomePage homePage=new HomePage();
        LoginPage login=new LoginPage();
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        homePage.cookies.click();
        homePage.logInLinki.click();
        login.logInEmail.sendKeys(ConfigReader.getProperty("emailBrn"));
        login.logInPassword.sendKeys(ConfigReader.getProperty("PswrdBrn"));
        login.loginButonu.click();
    }


    @FindBy(xpath = "//a[@href=\"https://facebook.com\"]")
    public WebElement fb;
}
