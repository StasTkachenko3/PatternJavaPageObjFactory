import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class LoginPage extends TeatBase {

    public String url = "https://www.rzd.ru/";

    @FindBy(xpath = "/html/body/div/div/form/div[1]/input")
    public WebElement username;


    @FindBy(xpath = "/html/body/div/div/form/div[2]/input")
    public WebElement password;

    @FindBy(xpath = "/html/body/div/div/form/div[3]/a")
    public WebElement button;


    @FindBy(xpath = "/html/body/div[1]/header/div[2]/section/div[3]/div/div[1]/div[1]/div[1]/div[1]/div[1]/input")
    public WebElement otcuda;

    @FindBy(xpath = "/html/body/div[1]/header/div[2]/section/div[3]/div/div[1]/div[1]/div[1]/div[2]/div[1]/input")
    public WebElement kuda;

    @FindBy(xpath = "/html/body/div[1]/header/div[2]/section/div[3]/div/div[1]/div[1]/div[2]/div[3]/div[1]/input")
    public WebElement dataTuda;

    @FindBy(xpath = "/html/body/div[1]/header/div[2]/section/div[3]/div/div[1]/div[1]/div[2]/div[4]/div[1]/input")
    public WebElement dataObratno;

    @FindBy(xpath = "/html/body/div[1]/header/div[2]/section/div[3]/div/div[1]/div[2]/a")
    public WebElement poisk;

    @FindBy(xpath = "/html/body/div[1]/header/div[2]/section/div[3]/div/div[1]/div[1]/div[2]/div[6]/div[2]/table/tbody/tr[6]/td[4]/a")
    public WebElement vybrData;

    @FindBy(xpath = "/html/body/div[1]/header/div[2]/section/div[3]/div/div[1]/div[1]/div[2]/div[6]/div[2]/table/tbody/tr[6]/td[5]/a")
    public WebElement vybrDataObr;

    @FindBy(xpath = "/html/body/div[1]/header/div[2]/section/div[3]/div/div[1]/div[1]/div[1]/div[1]/ul/li[2]")
    public WebElement vybrOtcuda;

    @FindBy(xpath = "/html/body/div[1]/header/div[2]/section/div[3]/div/div[1]/div[1]/div[1]/div[2]/ul/li[2]")
    public WebElement vybrKuda;

    /* public LoginPage(WebDriver driver) {
        this.driver = driver;
        driver.get(url);
        PageFactory.initElements(driver, this);
    }

    public LoginPage auth(String login, String parol) {
        username.sendKeys(login);
        password.sendKeys(parol);
        button.click();
        return new LoginPage(driver);



    }
 */


    public LoginPage(WebDriver driver) {
        this.driver = driver;
        driver.get(url);
        PageFactory.initElements(driver, this);
    }

    public LoginPage poiskBiletov(String Otcuda, String Kuda, String DataTuda, String DataObratno) {
        otcuda.sendKeys(Otcuda);
        vybrOtcuda.click();
        kuda.sendKeys(Kuda);
        vybrKuda.click();
        dataTuda.sendKeys(DataTuda);
        vybrData.click();
        dataObratno.sendKeys(DataObratno);
        vybrDataObr.click();
        poisk.click();
        return new LoginPage(driver);
    }

}
