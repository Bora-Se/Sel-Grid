import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Grid3 {
    public static void main(String[] args) throws MalformedURLException {

       // Desired capabilities olustur  // 108.0.5359.99 (Resmi Derleme) (64 bit) Sürümü http://192.168.0.172:4444
        DesiredCapabilities cap = new DesiredCapabilities();

        // DesiredCapabilities icerisine konulacaklari hazirla
        // a-isletim sistemi
        cap.setPlatform( Platform.ANY );
        // b-browser name
        cap.setBrowserName( "Chrome" );
        // c- browser version
        cap.setVersion( "108.0.5359.99" );

        // 2- options olusturma

        ChromeOptions options=new ChromeOptions();
        options.merge( cap );
        String hubURL = "http://192.168.0.172:4444";


        // 3) Kodlama


        WebDriver driver = new RemoteWebDriver(new URL(hubURL),options);

        driver.get("https://www.google.com/");

        System.out.println(driver.getTitle());


        System.out.println(driver.getCurrentUrl());


    }
}
