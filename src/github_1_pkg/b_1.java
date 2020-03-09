package github_1_pkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class b_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver_v79.exe");
		WebDriver d=new ChromeDriver();
		d.get("http://demowebshop.tricentis.com");

	}

}
