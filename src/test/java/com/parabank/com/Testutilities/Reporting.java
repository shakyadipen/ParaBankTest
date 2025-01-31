package com.parabank.com.Testutilities;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Reporting extends TestListenerAdapter {
    public ExtentReports extent;
    public ExtentHtmlReporter htmlReporter;
    public ExtentTest logger;
    public void onStart(ITestContext testContext) {

        String dateFormat = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
        String ReportName = "Parabank" + dateFormat + ".html";
        htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") + "/test-output/" + ReportName);
        htmlReporter.loadXMLConfig(System.getProperty("user.dir")+ "/extent-report-config.xml");
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        extent.setSystemInfo("Host Name", "LocalHost");
        extent.setSystemInfo("Environment", "QA");
        extent.setSystemInfo("User", "Shakya");

        htmlReporter.config().setDocumentTitle("Parabank WebApp Test");
        htmlReporter.config().setReportName("Functional Test Report");
        htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
        htmlReporter.config().setTheme(Theme.DARK);
    }

    public void onTestSuccess(ITestResult tr){
        logger=extent.createTest(tr.getName());
        logger.log(Status.PASS, MarkupHelper.createLabel(tr.getName(), ExtentColor.GREEN));
    }
    public void onTestFailure (ITestResult tr){
        logger=extent.createTest(tr.getName());
        logger.log(Status.FAIL, MarkupHelper.createLabel(tr.getName(), ExtentColor.RED));
//        String screenshotPath=System.getProperty("user.dir"+"\\Screenshots\\"+tr.getName()+".png");
//        File f=new File(screenshotPath);
//        if(f.exists()){
//            try{
//                logger.fail("The test failed with screemshot"+logger.addScreenCaptureFromPath(screenshotPath));
//
//            }
//            catch(IOException e){
//                e.printStackTrace();
//            }

        //}
    }
    public void onTestSkip(ITestResult tr){
        logger=extent.createTest(tr.getName());
        logger.log(Status.SKIP, MarkupHelper.createLabel(tr.getName(), ExtentColor.YELLOW));

    }
    public void onFinish(ITestContext testContext){
        extent.flush();

    }
}
