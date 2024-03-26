public class Satelite extends CuerpoCeleste{

    //se llama satélite y no luna para hacerlo más claro, pero es la clase "luna" del ejercicio
    public String nombreSatelite;
    public double periodoOrbitalS;

    public Satelite(String nombre, double periodoOrbital, TipoCuerpoCeleste tipoCuerpo, String nombreSatelite , double periodoOrbitalS) {
        super(nombre, periodoOrbital, tipoCuerpo);
        this.nombreSatelite = nombreSatelite;
        this.periodoOrbitalS = periodoOrbitalS;
    }

    public String getNombreSatelite() {
        return nombreSatelite;
    }

    public double getPeriodoOrbitalS() {
        return periodoOrbitalS;
    }

    @Override
    public String toString() {
        return "Satélite -> {" +
                "nombre: '" + nombreSatelite + '\'' +
                ", periodo orbital:" + periodoOrbitalS +
                '}';
    }
}
