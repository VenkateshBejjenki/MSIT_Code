/*
 Program:-Write a program HarmonicSum to compute the sum of a harmonic series, as shown below, where n=50. using while loop    
 Author:-Rajesh Kumar Sheela
 */
public class B2 {
	public static void main(String[] args) {
		double sum=0.0;
		for(int i=1;i<50;i++)
			sum+=((double)1/i);		//Formula for  HarmonicSum  Sum
		System.out.println(sum);
	}
}
