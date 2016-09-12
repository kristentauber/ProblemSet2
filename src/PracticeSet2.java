import java.util.Scanner;
public class PracticeSet2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many touchdowns? ");
		double td = input.nextDouble();
		
		System.out.println("How many total yards? ");
		double yards = input.nextDouble();
		
		System.out.println("How many interceptions? ");
		double interceptions = input.nextDouble();
		
		System.out.println("How many completions? ");
		double comp = input.nextDouble();
		
		System.out.println("How many passes attempted? ");
		double att = input.nextDouble();
		
		double a = ((comp/att)-.3)*5;
		double b = ((yards/att)-3)*1/4;
		double c = td/att*20;
		double d = 2.375- (interceptions/att*25);
		
		double passerRating = (((comp/att)-.3)*5 + ((yards/att)-3)*1/4 + td/att*20 + 2.375- (interceptions/att*25))/6*100;
		System.out.printf("%.2f", passerRating);
		
	}

}
