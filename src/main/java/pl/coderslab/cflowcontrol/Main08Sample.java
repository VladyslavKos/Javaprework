package pl.coderslab.cflowcontrol;

public class Main08Sample {

	public static void main(String[] args) {

	    int n = 5;


	    for (int i = 0; i < n; i++) {
	        String row = "";
	        for (int j = 0; j < n; j++) {
	            row += "*";
	        }
	        System.out.print(row + "\n");
	    }
	}

}
