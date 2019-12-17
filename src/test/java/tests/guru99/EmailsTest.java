package tests.guru99;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import javax.mail.MessagingException;

import org.testng.annotations.Test;

import pages.BackendLoginPage;

public class EmailsTest extends TestBase2 {

	static BackendLoginPage backObj;

	@Test
	public static void UserCan() {
		backObj = new BackendLoginPage(driver);
		backObj.BackendLogin();
		backObj.ClickOnOrders();

		String filePath = System.getProperty("user.home") + "/Downloads/orders.csv";
		
		try {
			EmailUtil.emailUtil(filePath);
			//Mail.mail(filePath);
		} catch (MessagingException e1) {
			e1.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		// 5. Read downloaded file and display the Heading and all the Order details in
		// the console windows
		File f = new File(filePath);
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String line = br.readLine();
		while (line != null) {
			System.out.println(line);
			line = br.readLine();
		}
		fr.close();
		br.close();
	}

}
