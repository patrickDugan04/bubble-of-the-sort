
public class display{
	display(int loop){
	
		while(loop > 0){
			loop = loop - 1;
			if(loop > 0){
				System.out.print("-");
			}else{
				System.out.println("-");
			}
		}
	}	
}
