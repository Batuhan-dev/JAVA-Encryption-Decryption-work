import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		Crip crip=new Crip();
		System.out.println("Enter the your key words = ");
		String key= input.nextLine();
		
		crip.enCryption(key);
		crip.showInfos();
		crip.deCryption(key);
	}

}
