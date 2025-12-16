package popUp;
import org.openqa.selenium.edge.EdgeDriver;

public class AuthenticationPop {

	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://admin:admin@basic-auth-git-main-shashis-projects-4fa03ca5.vercel.app/");
		Thread.sleep(2000);
		
		driver.close();
	}

}
