package Qspider1;

import org.testng.annotations.Test;

public class playingcricketTest {
	
	@Test (groups="RegressionTest")
	public void playingcricketTest() {
		System.out.println("fisrt ball six");
	}
	@Test (groups="smokeTest")
	public void lastover() {
		System.out.println("every ball six");
	}

}
