
public class classe {

	public static void main(String[] args) {
		int[] d = {1,-1,-1,-1};
		int[][] X = {{1,1},{1,0},{0,1},{0,0}};
		float[] recebe = new float[3];
		Perceptron p = new Perceptron();
		recebe=p.Percep(100, 1, 0.1, X, d);
		for(int i=0; i<3; i++) {
			System.out.printf("%f\n", recebe[i]);
		}
	}

}
