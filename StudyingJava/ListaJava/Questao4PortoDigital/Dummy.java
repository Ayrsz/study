package Questao4PortoDigital;

public class Dummy {
    private String estado;
    private Double vida;
    private Double nivel;

    public Dummy(){
        estado = "Normal";
        vida = java.lang.Double.MAX_VALUE;
        nivel = 10.;
    }

    public Double getNivel() {
        return nivel;
    }

    public void setNivel(Double nivel) {
        this.nivel = nivel;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Double getVida() {
        return vida;
    }

    public void setVida(Double vida) {
        this.vida = vida;
    }

    @Override
    public String toString() {
        return "Dummy [estado=" + estado + ", vida=" + vida + ", nivel=" + nivel + "]";
    }
}
