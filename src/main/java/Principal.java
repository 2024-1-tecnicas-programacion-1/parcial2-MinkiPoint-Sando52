import parcial2.Automovil;
import parcial2.Motocicleta;
import parcial2.TipoCombustible;
import parcial2.Vehiculo;

public class Principal {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo("Toyota", "Corolla", 2020);
        Automovil automovil = new Automovil("Toyota", "Corolla", 2020, 4, TipoCombustible.GASOLINA);
        Motocicleta motocicleta = new Motocicleta("Yamaha", "YZF-R3", 2020, TipoCombustible.GASOLINA);

        System.out.println("Información del Vehículo: " + vehiculo.imprimirInformacion());
        System.out.println("Información del Automóvil: " + automovil.imprimirInformacion());
        System.out.println("Información de la Motocicleta: " + motocicleta.imprimirInformacion());
    }

}
