package lab1;


public class Hero {
	public ACMovement wayOfMovement = new MoveByFeet();
	public Point location = new Point(0,0);
	public void move(Point destination) {
		wayOfMovement.move(location, destination);
		location = destination;
	}
}
