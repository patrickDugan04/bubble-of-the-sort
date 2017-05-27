import java.util.Scanner;
import java.util.ArrayList;
public class Sort {
	 public static void main(String[] args) {	
		 
		ArrayList<Integer> anArray = new ArrayList<Integer>();
		Scanner input = new Scanner(System.in);		
		int x = 0;
		int a;
		int b;
		String in;
		int num;
		boolean go = false;
		int check = 0;
		boolean done = false;
		boolean display = false;
		int loop = 0;
		
		while(!go){
			System.out.println("type \"F\" to be done entering numbers type a number to enter it");
			in = input.nextLine();
			if(in.equals("F")){
				System.out.println("second check");
				input.close();
				x = 0;
				go = true;
				System.out.println("third check");
			}else{
			anArray.add(x,Integer.parseInt(in));
			System.out.println("first check");
			}
		
			x = x + 1;
		}
		while(!done){
			
			a = anArray.get(x);
			System.out.println("forth");
			b = anArray.get(x - 1);
			System.out.println("fith");
			if(a < b){
				check = 0;
				anArray.set(x,b);
				anArray.set(x - 1, a);
				x = x + 1;
			}else{
				check = check + 1;
				x = x + 1;
			}
			if(check >= anArray.size() - 1){
				done = true;
			}else if(x == anArray.size()){
				x = 1;
			}
			loop = 0;
			display = false;
			while(!display){
				new display(anArray.get(loop));
				loop = loop + 1;
				if(loop == anArray.size()){
					display = true;
					if(done){
						System.exit(0);
					}
				}
			}
		}
	 }
	}