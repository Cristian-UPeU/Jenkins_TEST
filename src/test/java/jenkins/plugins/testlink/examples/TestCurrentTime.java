package jenkins.plugins.testlink.examples;

import org.testng.Assert;
import org.testng.annotations.Test;


public class TestCurrentTime
{

	@Test
	public void testCurrentTime() 
	{
		Assert.assertNotNull( System.currentTimeMillis() );
		
		Assert.assertTrue( System.currentTimeMillis() > 0 );
	}
	
}
