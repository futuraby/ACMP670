import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("OUTPUT.TXT");
		FileReader fr = new FileReader("INPUT.TXT");
		Scanner scan = new Scanner(fr); 
		int k = scan.nextInt();
		int i=0;
		int m=1;
		int ans = 0;
		for(i=1; i<=k;i++,m++) {
			if((isOthDig(m))) {
				i--;
				
			}
			ans=m;
		}
		fw.write(Integer.toString(ans));
		
		scan.close();
		fr.close();
		fw.close();

	}
	protected static boolean isOthDig(int a) {
		boolean result=false;
		byte x;
		byte[] vector = new byte[10];
		while(a>9) {
			x=(byte) (a%10);
			vector[x]++;
			a=a/10;
		}
		vector[a]++;
		for (byte b : vector) {
			if (b>1) {
				result=true;
				break;
			}
		}
		return result;
	}
}
