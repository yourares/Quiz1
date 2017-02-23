import java.util.Scanner;

public class Score {

	public static void main(String[] args) {
		Scanner imput = new Scanner(System.in);

		System.out.println("Comp(completions):");
		double COMP = imput.nextDouble();

		System.out.println("ATT(number of passes attempted):");
		double ATT = imput.nextDouble();

		Double a = CompletionPercentage(COMP, ATT);
		if (a < 0) {
			System.out.println("new Completion  Percentage is: " + 0);
			a = 0.0;
		}
		else if (a > 2.375) {
			System.out.println("new Completion  Percentage is: " + 2.375);
			a = 2.375;
		} else {
			System.out.println("Completion Percentage is: " + a);
		}

		System.out.println("Yards(total):");
		double Y = imput.nextDouble();

		Double b = YardsPerAttp(Y, ATT);
		if (b < 0) {
			System.out.println("new Yards  Per Attempt is: " + 0);
			b =0.0;
		}
		else if (b > 2.375) {
			System.out.println("new Yards  Per Attempt is: " + 2.375);
			b =2.375;
		} else {
			System.out.println("Yards Per Attempt is: " + b);
		}

		System.out.println("TD(collects touchdowns):");
		double TD = imput.nextDouble();

		Double c = TouchPerAttp(TD, ATT);
		if (c < 0) {
			System.out.println("new Touchdowns Per Attempt is: " + 0);
			c =0.0;
		}
		else if (c > 2.375) {
			System.out.println("new Touchdowns Per Attempt is: " + 2.375);
			c = 2.375;
		} else {
			System.out.println("Touchdowns Per Attempt is: " + c);
		}

		System.out.println("INT(interceptions):");
		double INT = imput.nextDouble();

		Double d = IntercePerAttp(INT, ATT);
		if (d < 0) {
			System.out.println("new interceptions Per Attempt is: " + 0);
			d = 0.0;
		}
		else if (d > 2.375) {
			System.out.println("new interceptions Per Attempt is: " + 2.375);
			 d = 2.375;
		} else {
			System.out.println("interceptions Per Attempt is" + d);
		}

		Double PR = PasserRating(a, b, c, d);
		System.out.println("Passer Rating is :" + PR);

	}

	private static double CompletionPercentage(double COMP, double ATT) {
		double a = ((COMP / ATT) - 0.3) * 5;
		return a;
	}

	private static double YardsPerAttp(double Y, double ATT) {
		double b = ((Y / ATT) - 3) * 0.25;
		return b;
	}

	private static double TouchPerAttp(double TD, double ATT) {
		double c = (TD / ATT) * 20;
		return c;
	}

	private static double IntercePerAttp(double INT, double ATT) {
		double d = 2.375 - ((INT / ATT) * 25);
		return d;
	}

	private static double PasserRating(double a, double b, double c, double d) {
		double e = ((a + b + c + d) / 6) * 100;
		return e;
	}
}
