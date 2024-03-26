import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class CuerpoCeleste {

    private String nombre;
    private double periodoOrbital;
    private Set<CuerpoCeleste> satelites;
    private TipoCuerpoCeleste tipoCuerpo;


    public CuerpoCeleste(String nombre, double periodoOrbital, TipoCuerpoCeleste tipoCuerpo) {
        this.nombre = nombre;
        this.periodoOrbital = periodoOrbital;
        this.tipoCuerpo = tipoCuerpo;
        this.satelites = new HashSet<>();
    }

    public enum TipoCuerpoCeleste {
        ESTRELLA,
        PLANETA,
        PLANETA_ENANO,
        SATELITE, //Se llama satélite para que quede más claro, pero es "luna"
        COMETA,
        ASTEROIDE
    }


    public String getNombre() {
        return nombre;
    }

    public Set<CuerpoCeleste> getSatelites() {
        return satelites;
    }

    public TipoCuerpoCeleste getTipoCuerpo() {
        return tipoCuerpo;
    }


    public boolean addsatelite(CuerpoCeleste satelite1) {
        return satelites.add(satelite1);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CuerpoCeleste)) return false;
        CuerpoCeleste that = (CuerpoCeleste) o;
        return nombre.equals(that.nombre) && tipoCuerpo == that.tipoCuerpo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNombre(), periodoOrbital, getSatelites(), getTipoCuerpo());
    }

    @Override
    public String toString() {
        return "Nombre ->'" + nombre + '\'' +
                ", periodo orbital: " + periodoOrbital +
                ", satélites: " + satelites +
                ", tipo de cuerpo: " + tipoCuerpo+
                '}';
    }
}
