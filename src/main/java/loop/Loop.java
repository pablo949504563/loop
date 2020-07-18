package loop;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.Timer;
import java.util.TimerTask;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Loop {
	public static void main(String[] args) {

		Timer timer = new Timer();
		final long SEGUNDOS = (100 * 60);

		TimerTask tarefa = new TimerTask() {

			@Override
			public void run() {

				try {

					Robot robot = new Robot();

					robot.delay(20000);
					robot.mouseMove(1000, 500);
					System.out.println("teste");

				} catch (AWTException e) {
					e.printStackTrace();
				}

			}
		};

		timer.scheduleAtFixedRate(tarefa, 0, SEGUNDOS);

	}

}
