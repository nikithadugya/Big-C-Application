package com.qa.bigC;

import java.io.IOException;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utility.ExcelUtility;

public class TC_bigC_01 extends TestBase {

	@Test(priority=1)
	public void login()
	{
		Objects.getLogin().click();
		Objects.getEmail().sendKeys("nikithadugya@gmail.com");
		Objects.getPassword().sendKeys("Nikitha@25");
		Objects.getSignin().click();
		
		
	}
	@Test(dataProvider = "getData",priority=2)
	public void SearchItem(String Input) throws InterruptedException {
		
	
		Objects.getSearchBox().clear();
		Objects.getSearchBox().sendKeys(Input);
		Objects.getSearchBox().submit();
		Thread.sleep(2000);
	   
	
		
	}

	@DataProvider
	public String[][] getData() throws IOException {
		String xlPath ="C:\\Users\\Admin\\eclipse-workspace\\seleniumautomation\\src\\test\\java\\com\\qa\\bigC\\bigC\\bigC.xlsx";
		String xlSheet = "Sheet1";

		int rowCount = ExcelUtility.getRowCount(xlPath, xlSheet);
		int cellCount = ExcelUtility.getCellCount(xlPath, xlSheet, rowCount);
		String[][] data = new String[rowCount][cellCount];
		for (int i = 1; i <= rowCount; i++) {
			for (int j = 0; j < cellCount; j++)

			{
				data[i - 1][j] = ExcelUtility.getCellData(xlPath, xlSheet, i, j);
			}
		}
		return data;
	}

}