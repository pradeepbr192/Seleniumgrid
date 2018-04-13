package gridTest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Gridtest {

	public static void main(String[] args) throws MalformedURLException {
		
	//Set the desired capabilities for the nodes.
	DesiredCapabilities descap = new DesiredCapabilities();
	descap.setBrowserName("chrome");;
	descap.setPlatform(Platform.WIN10);

	//Chrome Options Definition
	
	ChromeOptions options = new ChromeOptions();
	
	// Merge the desired Capabilities with Chrome options
	
	options.merge(descap);
	
	descap.setBrowserName("firefox");
	
	
	String huburl= "http://localhost:4444/wd/hub";
	
	//Remote WebDriver is always used to execute scripts on a remote server 
	WebDriver driver = new RemoteWebDriver(new URL(huburl),options);
	
	driver.get("https://www.google.com");
	System.out.println(driver.getTitle());
	}

}
