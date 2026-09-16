package lab1;

public abstract class ACMovement {
	public abstract double getSpeed();
	public abstract String getName();
	public void move(Point start, Point end) {
		double timeInTravel = start.absDiff(end) / getSpeed();
		System.out.println("Moving by "+ getName());
		System.out.println(String.format("It takes %.2f days.", timeInTravel));
	}
}
