package com.app.extend;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;

public class TestOne implements ITestListener{

	@Override
	public void onStart(ITestContext context) {
		Extent_Reports.getInstance();
	}
	
	@Override
	public void onTestStart(ITestResult result) {
		Extent_Reports.createdReportTest(result.getName());
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		Extent_Reports.extenttest.log(Status.PASS, "TestCasesPassed");
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		Extent_Reports.extenttest.log(Status.FAIL, "TestcasesFailed");
	}
	
	@Override
	public void onTestSkipped(ITestResult result) {
		Extent_Reports.extenttest.log(Status.SKIP, "TestCaseSkipped");
	}
			
	@Override
	public void onFinish(ITestContext context) {
		Extent_Reports.flushreport();
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		
	}
	
}
