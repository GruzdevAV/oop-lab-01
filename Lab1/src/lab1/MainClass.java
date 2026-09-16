package lab1;

import java.util.Scanner;

public class MainClass {
	public static void main() {
		Hero hero = new Hero();
		Scanner scanner = new Scanner(System.in);
		boolean loop = true;
		while(loop) {
			System.out.println(String.format("\nHero is at point (%.2f; %.2f).", hero.location.x, hero.location.y));
			System.out.println("Movement method: " + hero.wayOfMovement.getName());
			System.out.println("Choose movement method:\n\t1 - walk\n\t2 - horse\n\t3 - plane\n\n\t0 - break");
			if (!scanner.hasNextInt()) {
				scanner.next();
				System.out.println("Previous movement method remains.");
			}
			else {
				switch(scanner.nextInt()) {
				case 1:
					hero.wayOfMovement = new MoveByFeet();
					break;
				case 2:
					hero.wayOfMovement = new MoveByHorse();
					break;
				case 3:
					hero.wayOfMovement = new MoveByPlane();
					break;
				case 0:
					loop = false;
					continue;
				default:
					System.out.println("Previous movement method remains.");
					break;
				}
			}
			do {
				System.out.print("Enter next x -> ");
			}
			while (!scanner.hasNextDouble() && scanner.next().contains(""));
			double x = scanner.nextDouble();
			do {
				System.out.print("Enter next y -> ");
			}
			while (!scanner.hasNextDouble() && scanner.next().contains(""));
			double y = scanner.nextDouble();
			hero.move(new Point(x, y));
		}
		scanner.close();
	}
}
