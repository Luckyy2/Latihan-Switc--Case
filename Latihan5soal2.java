import java.util.Scanner;

public class Latihan5soal2{

	public static void main(final String[] args) {
	
	Scanner in = new Scanner(System.in);
		String kota = in.nextLine();
		int penumpang = in.nextInt();

		
			switch(kota){
			case ("Bogor"):
            System.out.print(penumpang*200000);
			break;
			case ("Jakarta"):
			System.out.print(penumpang*145000);
			break;
			case ("Garut"):
			System.out.print(penumpang*75000);
			break;
			case ("Purwakarta"):
			System.out.print(penumpang*75000);
			break;
		}
	}
}