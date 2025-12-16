package com.crm.listeners;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.crm.BaseClass.BaseClass;

public class TestCaseFailSc extends BaseClass implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		String name = result.getMethod().getMethodName();
		Reporter.log(name+" is onTestStart",true);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String name = result.getMethod().getMethodName();
		Reporter.log(name+" is onTestSuccess",true);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String date = LocalDateTime.now().toString().replace(':', '-');
		String name = result.getMethod().getMethodName();
		String dynamicName = name+date;
		Reporter.log(name+" is onTestFailure",true);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 TakesScreenshot ts = (TakesScreenshot) driver;
	        File src = ts.getScreenshotAs(OutputType.FILE);
	        File dest = new File(".\\src\\test\\resources\\Screenshots\\"+dynamicName+".png");
	        try {
				FileHandler.copy(src, dest);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String name = result.getMethod().getMethodName();
		Reporter.log(name+" is onTestSkipped",true);
	}

	@Override
	public void onStart(ITestContext context) {
		Reporter.log("onStart",true);
	}

	@Override
	public void onFinish(ITestContext context) {
		Reporter.log("onFinish",true);	}
	
}
