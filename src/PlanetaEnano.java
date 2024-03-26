public class PlanetaEnano extends CuerpoCeleste{

    public String nombrePlanetaEnano;
    public double periodoOrbitalE;

    public PlanetaEnano(String nombre, double periodoOrbital, TipoCuerpoCeleste tipoCuerpo, String nombrePlanetaEnano, double periodoOrbitalE) {
        super(nombre, periodoOrbital, tipoCuerpo);
        this.nombrePlanetaEnano = nombrePlanetaEnano;
        this.periodoOrbitalE = periodoOrbitalE;
    }

    @Override
    public String toString() {
        return "PlanetaEnano ->" +
                "nombre del planeta enano: '" + nombrePlanetaEnano + '\'' +
                ", periodoOrbitalE=" + periodoOrbitalE +
                '}';
    }
}
