
package utils;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.IAnnotationTransformer;
import org.testng.ITestContext ;		
import org.testng.ITestListener ;		
import org.testng.ITestResult ;
import org.testng.annotations.ITestAnnotation;

public class SuiteListner implements ITestListener, IAnnotationTransformer {
	public static WebDriver driver;

	public void onFinish(ITestContext arg0) {					
        // TODO Auto-generated method stub				
        		 
    }		

    public void onStart(ITestContext arg0) {					
        // TODO Auto-generated method stub				
        		
    }		

    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {					
        // TODO Auto-generated method stub				
        		
    }		
    
    public void onTestFailure(ITestResult iTestResult) {					
        String filename = System.getProperty(".//screenshots//")+ File.separator + "screenshots" + File.separator + iTestResult.getMethod().getMethodName();			
        File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 	
        try {
        	FileUtils.copyFile(f, new File(filename + ".png"));
        }catch (IOException e) {
        	e.printStackTrace();
        }
    }		

    public void onTestSkipped(ITestResult arg0) {					
        // TODO Auto-generated method stub				
        		
    }		

    public void onTestStart(ITestResult arg0) {					
        // TODO Auto-generated method stub				
        		
    }		

    public void onTestSuccess(ITestResult arg0) {					
        // TODO Auto-generated method stub				
        		
    }	
    
    public void transform(ITestAnnotation annotation, @SuppressWarnings("rawtypes") Class testClass, @SuppressWarnings("rawtypes") Constructor testConstructor, Method testMethod) {
		
		annotation.setRetryAnalyzer(RetryAnalyzer.class);
					
	}
}
