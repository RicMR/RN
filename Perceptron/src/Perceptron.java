import java.util.Random;

public class Perceptron {
	
	public static float[] Percep (int max_it, int E, double alpha, int[][] X, int[] d) {
		Random gerador = new Random();
		float[] w = new float[2];
		w[0] = gerador.nextFloat();
		w[1] = gerador.nextFloat();
		float b = gerador.nextFloat();
		
		float[] wb = new float[3];
		int t=0, n=4, E1=0;
		float[] y = new float [n];
		float[] e = new float [n];

		
		
		while((t<max_it)&&(E>0)) {
			for(int i=0; i< n; i++) {
				y[i]=w[0]*X[i][0]+w[1]*X[i][1]+b;
				e[i]=d[i]-y[i];
				
				b=(float) (b+alpha*e[i]);
			}
			E=count(e);
			t=t+1;
			
		}
		
		wb[0]=w[0];
		wb[1]=w[1];
		wb[2]=b;
		return wb;
	}
	
	public static int count(float[] e) {
		int E=0;
		for(int i=0; i<e.length;i++) {
			if(e[i]!=0) {
				E++;
			}
		}
		return E;
	}
	
}
