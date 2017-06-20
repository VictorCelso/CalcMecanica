package basicas;

public abstract class Letra_D {

	private double coluna;

	private double raio_E;

	private double raio_I;

	private double moduloElastico;

	private double tensao_C_pinos;

	private double tensao_C_engast_livre;

	private double tensao_C_pino_engast;

	private double tensao_C_engast;
        
	public abstract void calcular();

    public double getColuna() {
        return coluna;
    }

    public void setColuna(double coluna) {
        this.coluna = coluna;
    }

    public double getRaio_E() {
        return raio_E;
    }

    public void setRaio_E(double raio_E) {
        this.raio_E = raio_E;
    }

    public double getRaio_I() {
        return raio_I;
    }

    public void setRaio_I(double raio_I) {
        this.raio_I = raio_I;
    }

    public double getModuloElastico() {
        return moduloElastico;
    }

    public void setModuloElastico(double moduloElastico) {
        this.moduloElastico = moduloElastico;
    }

    public double getTensao_C_pinos() {
        return tensao_C_pinos;
    }

    public void setTensao_C_pinos(double tensao_C_pinos) {
        this.tensao_C_pinos = tensao_C_pinos;
    }

    public double getTensao_C_engast_livre() {
        return tensao_C_engast_livre;
    }

    public void setTensao_C_engast_livre(double tensao_C_engast_livre) {
        this.tensao_C_engast_livre = tensao_C_engast_livre;
    }

    public double getTensao_C_pino_engast() {
        return tensao_C_pino_engast;
    }

    public void setTensao_C_pino_engast(double tensao_C_pino_engast) {
        this.tensao_C_pino_engast = tensao_C_pino_engast;
    }

    public double getTensao_C_engast() {
        return tensao_C_engast;
    }

    public void setTensao_C_engast(double tensao_C_engast) {
        this.tensao_C_engast = tensao_C_engast;
    }


}
