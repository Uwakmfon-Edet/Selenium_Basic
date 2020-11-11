package pageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class gmailHomePage{

	WebDriver driver;
	@FindBy(xpath = "/html/body/div[2]/div[1]/div[4]/ul[1]/li[2]/a")
	WebElement signinButton;
	
	public void gmailHomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickLoginButton(){
		signinButton.click();
	}
}
