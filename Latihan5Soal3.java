import java.util.Scanner;

public class Latihan5soal3{

	public static void main(final String[] args) {
	
	Scanner in = new Scanner(System.in);
		String kota = in.nextLine();
		int penumpang = in.nextInt();

		
			switch(kota){
			case ("Bogor"):
            int total = penumpang*200000;
            if (total > 250000){
			System.out.println(
                String.format("%.0f%n",total - total*0.10));

            } 
            if (total <250000){
            System.out.print(total);
            }


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