package basicas;

public abstract class Letra_C {

    private double raio_Maior;

    private double raio_Menor;

    private double tensao;

    private double torque;

    public double getRaio_Maior() {
        return raio_Maior;
    }

    public void setRaio_Maior(double raio_Maior) {
        this.raio_Maior = raio_Maior;
    }

    public double getRaio_Menor() {
        return raio_Menor;
    }

    public void setRaio_Menor(double raio_Menor) {
        this.raio_Menor = raio_Menor;
    }

    public double getTensao() {
        return tensao;
    }

    public void setTensao(double tensao) {
        this.tensao = tensao;
    }

    public double getTorque() {
        return torque;
    }

    public void setTorque(double torque) {
        this.torque = torque;
    }
}
