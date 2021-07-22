package utils;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class Utils {

	public static AppiumDriver<WebElement> driver;

	public static void acessarApp() throws MalformedURLException, InterruptedException {
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability("platformName", "Android");
		desiredCapabilities.setCapability("deviceName", "emulator-5554");
		desiredCapabilities.setCapability("automationName", "uiautomator2");
		desiredCapabilities.setCapability("appPackage", "ru.innim.my_finance");
		desiredCapabilities.setCapability("appActivity", "ru.innim.my_finance.MainActivity");

		driver = new AppiumDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), desiredCapabilities);

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

	}

	public static void inputTextAppiumCommand(MobileElement elemento, String keyeventCommand) throws Exception {

		elemento.click();

		List<String> argsCommandKeyevent = Arrays.asList("text", transformarNome(keyeventCommand));
		Map<String, Object> commandKeyevent = ImmutableMap.of("command", "input", "args", argsCommandKeyevent);

		String output = (String) driver.executeScript("mobile: shell", commandKeyevent);

		System.out.println(output);

	}

	public static String transformarNome(String texto) {
		String[] lista = texto.split(" ");

		String stringModificada = "";

		for (String palavra : lista) {
			stringModificada += palavra + "%s";

		}

		if (stringModificada.length() > 0) {
			stringModificada = stringModificada.substring(0, stringModificada.length() - 2);
		}

		return stringModificada;

	}

}
