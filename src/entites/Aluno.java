package entites;

public class Aluno {

	public String name;
	public double p1, p2, p3;
	
	public double media() {
		return (p1*30 + p2*35 + p3*35) / (30 + 35 + 35);
	}
	public void resultado() {
		if (media() >= 60.0) {
			System.out.println("PASS");
		}
		else {
		double divida = 60.0 - media();
		System.out.printf("FAILED\nMISSING %.2f POINTS", divida);
		
		
		
		}
	}
}
