import org.jointheleague.graphical.robot.Robot;

public class Graffiti {
	public static void main(String[] args) {
		Robot cat = new Robot();
		cat.penDown();
		cat.setSpeed(100);
		cat.turn(90);
		cat.move(100);
		cat.turn(135);
		cat.move(150);
		cat.turn(-135);
		cat.move(100);
		cat.hide();
	}

}
