package steps;

import static utils.Utils.*;

import java.io.InterruptedIOException;
import java.net.MalformedURLException;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	
	
	@Before	
	public void setUp() throws MalformedURLException, InterruptedIOException, InterruptedException {
		acessarApp();	
		
	}
	
	@After
	public void fecharApp() {
		driver.quit();
	}

}
