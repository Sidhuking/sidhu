package Executor;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.HashMap;
import java.io.Properties;


import org.openqa.selenium.By;
import org.openqa.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;


public class baseclass {

public static void initiatedriver() throws IOException{

if(globalIdentifiers.ExecutionBrowser.equalsIgnoreCase("Chrome")){

System.setProperty("webdriver.chrome.driver", globalIdentifiers.chromedriver);
try{
 globalIdentifiers.driver= new ChromeDriver();

}

catch(Exception e)
{

globalIdentifiers.driver.manage().window().maximize();
}
}
}

