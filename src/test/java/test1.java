import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 extends TeatBase {



   /* @Test
    public void open() {
        String login = "demo";
        String parol = "1234";
        LoginPage loginPage = new LoginPage();
        loginPage.auth(login, parol);
        }
*/


     @Test
    public void pokupka(){
        String Otcuda = "Саратов";
        String Kuda = "Москва";
        String DataTuda = "30.01.2025";
        String DataObratno = "28.02.2025";
        LoginPage loginPage = new LoginPage(driver);
        loginPage.poiskBiletov(Otcuda,Kuda,DataTuda, DataObratno);
        time();

    }

}
