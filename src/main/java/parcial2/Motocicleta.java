package parcial2;

public class Motocicleta extends Vehiculo {
    private TipoCombustible tipoCombustible;
    private TipoMotocicleta tipoMotocicleta; 
    
    public Motocicleta(String marca, String modelo, int año, TipoCombustible tipoCombustible, TipoMotocicleta tipoMotocicleta) {
        super(marca, modelo, año);
        this.tipoCombustible = tipoCombustible;
        this.tipoMotocicleta = tipoMotocicleta; 
    }

    @Override
    public String imprimirInformacion() {
        return super.imprimirInformacion() + ",  combustión a " + tipoCombustible + ", tipo de motocicleta: " + tipoMotocicleta;
    }

    public TipoCombustible getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(TipoCombustible tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

   
    public TipoMotocicleta getTipoMotocicleta() {
        return tipoMotocicleta;
    }

    public void setTipoMotocicleta(TipoMotocicleta tipoMotocicleta) {
        this.tipoMotocicleta = tipoMotocicleta;
    }
}