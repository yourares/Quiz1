import java.util.Scanner;

public class Score {

	public static void main(String[] args) {
		Scanner imput = new Scanner(System.in);

		System.out.print("Comp(completions):");
		double COMP = imput.nextDouble();

		System.out.print("ATT(number of passes attempted):");
		double ATT = imput.nextDouble();
		
		Double a = CompletionPercentage(COMP, ATT);
		System.out.println("Completion Percentage:"+a);
		
		System.out.print("Yards(total):");
		double Y = imput.nextDouble();

		Double b = YardsPerAttp(Y, ATT);
		System.out.println("Yards Per Attempt:"+b);
		
		System.out.print("TD(collects touchdowns):");
		double TD = imput.nextDouble();

		Double c = TouchPerAttp(TD, ATT);
		System.out.println("Touchdowns Per Attempt:"+c);
		
		System.out.print("INT(interceptions):");
		double INT = imput.nextDouble();

		Double d = IntercePerAttp(INT, ATT);
		System.out.println("nterceptions Per Attempt:"+d);

		Double PR = PasserRating(a, b, c, d);
		System.out.println("Passer Rating per person is :"+PR);

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
