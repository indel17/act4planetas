import java.util.Set;

public class Planeta extends CuerpoCeleste {

    public String nombrePlaneta;
    public double periodoOrbital;

    public Planeta(String nombre, double periodoOrbital, TipoCuerpoCeleste tipoCuerpo, String nombrePlaneta, double periodoOrbital1) {
        super(nombre, periodoOrbital, tipoCuerpo);
        this.nombrePlaneta = nombrePlaneta;
        this.periodoOrbital = periodoOrbital1;
    }


    public boolean addsatelite(Set<CuerpoCeleste> satelite) {

        return  satelite.add(this);
    }


}
