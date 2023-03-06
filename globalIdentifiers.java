package Executor;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.HashMap;
import java.io.Properties;


import org.apache.log4j.Logger;
import org.openqa.selenium.webDriver;

public class globalIdentifiers{

public static WebDriver driver;
public static String TestCaseID= "";
public static String sTestDatafilepath;
public static int rowCount;
public static int iStartRow;
public static int iEndRow;
public static String sApplication _Name;
public static String sModule_Name;
public static String sFeature_Name;

public static String ExecutionBrowser;

public static String chromedriver;

public static HashMap<String, String> sTestDataKeyValues=null;

public static String DemoWebUrl;

public globalIdentifiers() throws IOException{

chromedriver = prop.getProperty("chromedriver");
DemoWebUrl = prop.getProperty("DemoWebUrl");
}
}


