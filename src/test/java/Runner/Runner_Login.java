package Runner;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Util.org.BaseClass;
import pojo.org.Buttons;
import pojo.org.Login_IIE_Invoice;

public class Runner_Login extends BaseClass {

	
	
	public static void main(String[] args) throws IOException {
		
		openBrowser();
		
		maxWindow();
		
		launchUrl("https://iiedev.securevendorportal.com/uaa/login");
		
		implicitWait();
		
		Login_IIE_Invoice login = new Login_IIE_Invoice();
		
		WebElement username = login.getUsername();
		username.sendKeys(readDataFromExcel(0, 0, 1));
		
		WebElement password = login.getPassword();
		password.sendKeys(readDataFromExcel(0, 1, 1));
		
		WebElement loginh_Submit = login.getLoginh_Submit();
		loginh_Submit.submit();
		
Buttons p =new Buttons();
		
		//. Case 1
		
		p.getDashboardMenu().click();
		long startTime1 = System.currentTimeMillis(); // Start time
		p.getDashboard_Invoice_MyActionable().click();
         long endTime1 = System.currentTimeMillis(); // End time

         // Calculate and print the response time
         long responseTime1 = endTime1 - startTime1;
         
         System.out.println("MyActionable_to_Manage_Invoice :" + responseTime1 + "ms");
         
         //Case 2
         
         p.getDashboardMenu().click();
         p.getInvoiceManagementMainMenu().click();
 		long startTime2 = System.currentTimeMillis(); // Start time
 		p.getCreateInvoiceMenu().click();
          long endTime2 = System.currentTimeMillis(); // End time

          // Calculate and print the response time
          long responseTime2 = endTime2 - startTime2;
          
          System.out.println("Dashboard_to_CreateInvoiceScreen :" + responseTime2 + "ms");
		
          // case 3
          
          p.getDashboardMenu().click();
          p.getInvoiceManagementMainMenu().click();
          
   		long startTime3 = System.currentTimeMillis(); // Start time
   		p.getManageInvoiceMenu().click();
            long endTime3 = System.currentTimeMillis(); // End time

            // Calculate and print the response time
            long responseTime3 = endTime3 - startTime3;
            
            System.out.println("Dashboard_to_ManageInvoiceScreen :" + responseTime3 + "ms");
            
            
            //Case 4
            long startTime4 = System.currentTimeMillis(); // Start time
            
            p.getCreateServiceInvoiceButton_CrtInv().click();
            long endTime4 = System.currentTimeMillis(); // End time

            // Calculate and print the response time
            long responseTime4 = endTime4 - startTime4;
            
            System.out.println("ManageInvoiceScreene_to_CreateServiceInvoiceScreen :" + responseTime4 + "ms");
		
		
		   //case 5
            
              p.getInvoiceManagementMainMenu().click();
              p.getCreateInvoiceMenu().click();
              p.getSelectPO_CreateInvoiceScreen().click();
              long startTime5 = System.currentTimeMillis(); // Start time
              p.getCreateInvoiceButton_CrtInv().click();
              long endTime5 = System.currentTimeMillis(); // End time
              long responseTime5 = endTime5 - startTime5;
              System.out.println("CreateInvoiceScreen_to_Create_New_Deatil_Invoice :" + responseTime5);
              
              // Create Detail Invoice
              
              p.getInvoiceNumber().sendKeys("INV01010134");
            //  p.getInvoiceDateField().click();
//              WebElement Date = driver.findElement(By.xpath("//td[@class='day']/parent::tr/parent::tbody/preceding-sibling::thead[1]/child::tr[1]/child::th[2]"));
//  		      Date.click();
//		
	}

}
