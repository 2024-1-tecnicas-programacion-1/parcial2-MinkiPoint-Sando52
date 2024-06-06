package parcial2;

public class Motocicleta extends Vehiculo {
    private TipoCombustible tipoMotocicleta;

    public Motocicleta(String marca, String modelo, int año, TipoCombustible tipoMotocicleta) {
        super(marca, modelo, año);
        this.tipoMotocicleta = tipoMotocicleta;
    }

    @Override
    public String imprimirInformacion() {
        return super.imprimirInformacion() + ", " + tipoMotocicleta;
    }

    public TipoCombustible getTipoMotocicleta() {
        return tipoMotocicleta;
    }

    public void setTipoMotocicleta(TipoCombustible tipoMotocicleta) {
        this.tipoMotocicleta = tipoMotocicleta;
    }
}
