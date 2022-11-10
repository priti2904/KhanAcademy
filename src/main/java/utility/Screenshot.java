package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
public static void clickScreenshot(WebDriver driver, String name) throws IOException{
		
		File Source =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination=new File("E:\\velocity\\SwagLaps\\Screenshots\\"+name+".png");

		FileHandler.copy(Source,destination);
			
		}
}
