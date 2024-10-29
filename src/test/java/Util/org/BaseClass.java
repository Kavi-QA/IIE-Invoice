package Util.org;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static Select s;
	public static Actions a;
	public static Robot r;
	
	
	
	public static void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	public static void maxWindow() {
		driver.manage().window().maximize();
	}

	public static void launchUrl(String url) {
		driver.get(url);
	}

	public static String fetchTitle() {
		String title = driver.getTitle();
		return title;
	}

	public static void closeCurrentTab() {
		driver.close();
	}

	public static void closeBrowser() {
		driver.quit();
	}

	public static String fetchText(WebElement txt) {
		String text = txt.getText();
		return text;
	}

	public static void SendText(WebElement e1, String value) {
		e1.sendKeys(value);
	}

	public static void click(WebElement e2) {
		e2.click();
	}

	public static void implicitWait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	public static String fetchTxtPassed(WebElement e3, String name) {
		String valuePassed = e3.getAttribute(name);
		return valuePassed;

	}

	public static void selectIndex(WebElement e4, int index) {
		s = new Select(e4);
		s.selectByIndex(index);
	}
	
//	public static String readDataFromExcel(int sheetNo, int rowNo, int cellNo) throws IOException {
//		File f = new File("‪C:\\Users\\USER\\Desktop\\Test Data.xlsx");
//		FileInputStream fil = new FileInputStream(f);
//		Workbook w = new XSSFWorkbook(fil);
//		Sheet sheet = w.getSheetAt(sheetNo);
//		Row row = sheet.getRow(rowNo);
//		Cell cell = row.getCell(cellNo);
//		CellType type = cell.getCellType();
//
//		String input;
//		if (type == 1) {
//			input = cell.getStringCellValue();
//		} else if (DateUtil.isCellDateFormatted(cell)) {
//			Date date = cell.getDateCellValue();
//			SimpleDateFormat sim = new SimpleDateFormat("dd/MMM/yyyy");
//			input = sim.format(date);
//
//		} else {
//			double dou = cell.getNumericCellValue();
//			long l = (long) dou;
//			input = String.valueOf(l);
//		}
//
//		return input;
//
//	}
	
	public static void ScreenShot () throws IOException {
		TakesScreenshot t = (TakesScreenshot)driver;
		File source = t.getScreenshotAs(OutputType.FILE);
		File f = new File("C:\\Users\\KAVI B\\eclipse-workspace\\Zerion_Task\\ScreenShot\\image.img");
		FileUtils.copyDirectory(source, f);
		
		
	}
	
	public static void jsclick(WebElement d) {
		JavascriptExecutor  j = (JavascriptExecutor)driver;
		 j.executeScript("arguments[0].click()", d);
	}
	
	public static void scroolDown(WebElement d) {
		JavascriptExecutor  j = (JavascriptExecutor)driver;
		 j.executeScript("arguments[0].scrollIntoView(true)", d);
	}

	public static void moveToElement() {
		a = new Actions(driver);
		
		
	}
	
	public static void down() throws AWTException {
		r= new Robot();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
	}
	
	public static void fluientwait() {
		FluentWait<WebDriver> f = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(6)).pollingEvery(Duration.ofMillis(2000)).ignoring(Exception.class);
	       f.until(ExpectedConditions.alertIsPresent());
	       Alert l = driver.switchTo().alert();
	       l.accept();
	
	
	}
	
	public static void takeScreenShot() throws IOException {
		//JavascriptExecutor js = (JavascriptExecutor)driver;
		
		TakesScreenshot Screen = (TakesScreenshot)driver;
	//	js.executeScript(arguments[0].takesScreenshot, null)
		
		File screenshotAs = Screen.getScreenshotAs(OutputType.FILE);
		
	
		File f = new File("C:\\Users\\KAVI B\\eclipse-workspace\\Phygital\\ScreenShots\\paymentSucess.jpg");
		
		FileUtils.copyFile(screenshotAs, f);
		
		
	}
	
	
	   public static String readDataFromExcel(int sheetnumber, int rowNumber, int cellNumber) throws IOException{
		File f = new File("C:\\Users\\HP\\eclipse-workspace\\IIE_Invoice\\Excel\\Test Data1.xlsx");
		FileInputStream f1 = new FileInputStream(f);
		Workbook w1 = new XSSFWorkbook(f1);
		Sheet s = w1.getSheetAt(sheetnumber);
		Row r = s.getRow(rowNumber);
		Cell c = r.getCell(cellNumber);
		CellType ct = c.getCellType();

		String input;

		if(ct  ==CellType.STRING){
		    input = c.getStringCellValue();
		}

		else if (DateUtil.isCellDateFormatted(c)){
		     Date date = c.getDateCellValue();
		     SimpleDateFormat d = new SimpleDateFormat("dd/MM/YYYY");
		     input = d.format(date); 
		}
		else{
		        double d1 = c.getNumericCellValue();
		        long l = (long) d1;
		        input = String.valueOf(l);

		}

		w1.close();
		f1.close();
		return input;
		}

	
}
