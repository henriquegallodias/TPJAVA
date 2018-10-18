package ammatriz;

 public class Matrizes {
	
	 public static void main (String args []) {
		
		double matriz[][] = new double[3][3];
		
		matriz [0][0] = 1;
		matriz [0][1] = 10;
		matriz [0][2] = 20;
		
		matriz [1][0] = 2;
		matriz [1][1] = 20;
		matriz [1][2] = 40;
		
		matriz [2][0] = 3;
		matriz [2][1] = 52;
		matriz [2][2] =74;
		
		for( double i = 0; i <= 2; i++) {
			for(double x = 0; x <= 2; x++) {
					
				System.out.println(matriz[0][0] +  matriz[1][1] + matriz[2][2]);
				System.out.println(matriz[0][2] *  matriz[1][1] * matriz[2][0]);
				System.out.println(matriz[1][1] /  matriz[2][1] );
			
			}
			  System.out.println();	
			}
	    
		
		
		
		}

}

