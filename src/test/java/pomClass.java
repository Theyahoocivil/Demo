
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pomClass extends BaseClass {
public pomClass() {
	PageFactory.initElements(Driver, this);
}
@FindBy(id="email")
private WebElement username;
@FindBy(id="pass")
private WebElement password;
@FindBy(name="login")
private WebElement login;

public WebElement getUsername() {
	return username;
} 
public WebElement getPassword() {
	return password;
}
public WebElement getLogin() {
	return login;
}
}
