package ffrees.junit_test;

import junit.framework.Assert;

import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.safaribooks.junitattachments.RecordAttachmentRule;

public class SimpleTest {
	
	@Rule
	public RecordAttachmentRule recordArtifactRule = new RecordAttachmentRule(this);
	
	@Test
	public void simpleTest()
	{
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://ffrees:ffrees@beta.ffrees.co.uk");
		Assert.fail("Can't find summat");		
		driver.quit();
	}

}
