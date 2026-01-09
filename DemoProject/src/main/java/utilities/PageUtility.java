package utilities;

//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PageUtility {

	public void selectByVisibleText(WebElement element, String visibleText) {
		Select select = new Select(element);
		select.selectByVisibleText(visibleText);

	}

	public void selectByIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.selectByIndex(index);

	}

	public void selectByValue(WebElement element, String Value) {
		Select select = new Select(element);
		select.selectByValue(Value);

	}

	/*public void javascriptscroll() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2500)", "");
		js.executeScript("window.scrollBy(0,-2500)", "");
	}

	public void dragAndDrop(WebElement source, WebElement target) {

		Actions actions = new Actions(driver);

		actions.dragAndDrop(source, target).perform();
	}*/

}
