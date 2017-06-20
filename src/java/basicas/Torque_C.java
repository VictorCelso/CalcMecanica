package basicas;
public class Torque_C extends Letra_C {


	private double momento_polar;

	private double result;

	private double result1;

	Torque_C() {

	}
	
	public double getMomento_polar() {
		return momento_polar;
	}

	public void setMomento_polar(double momento_polar) {
		this.momento_polar = momento_polar;
	}

	public double getResult() {
		return result;
	}

	public void setResult(double result) {
		this.result = result;
	}

	public double getResult1() {
		return result1;
	}

	public void setResult1(double result1) {
		this.result1 = result1;
	}

	public void calcular() {

		/** CALCULANDO O MOMENTO POLAR: **/

		setResult(Math.pow(getRaio_Maior(), 4));

		setResult1(Math.pow(getRaio_Menor(), 4));

		setMomento_polar((3.1416 * (getResult() - getResult1())) / 2);
		

		/** CALCULANDO O TORQUE PARA UM TUBO/EIXO DADOS OS PARAMETROS: **/

		setTorque((getMomento_polar() * getTensao()) / getRaio_Maior());

	}

}
