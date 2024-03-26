import java.util.HashMap;
import java.util.HashSet;


public class Main {

    public static HashMap<String, CuerpoCeleste> sistemaSolar = new HashMap<>();
    public static HashSet<CuerpoCeleste> planetas = new HashSet<>();
    public static HashSet<CuerpoCeleste> satelites = new HashSet<>();

    public static void main(String[] args) {

        //CREAR TIPO PLANETA
        CuerpoCeleste Mercurio = new CuerpoCeleste("Mercurio ◯ ", 88, CuerpoCeleste.TipoCuerpoCeleste.PLANETA);
        CuerpoCeleste Venus = new CuerpoCeleste("Venus ◯ ", 225, CuerpoCeleste.TipoCuerpoCeleste.PLANETA);
        CuerpoCeleste Tierra = new CuerpoCeleste("La Tierra ●", 365, CuerpoCeleste.TipoCuerpoCeleste.PLANETA);
        CuerpoCeleste Marte = new CuerpoCeleste("Marte ◯ ", 687, CuerpoCeleste.TipoCuerpoCeleste.PLANETA);
        CuerpoCeleste Jupiter = new CuerpoCeleste("Jupiter ●", 4332, CuerpoCeleste.TipoCuerpoCeleste.PLANETA);
        CuerpoCeleste Urano = new CuerpoCeleste("Urano ●", 30660, CuerpoCeleste.TipoCuerpoCeleste.PLANETA);
        CuerpoCeleste Saturno = new CuerpoCeleste("Saturno ●", 10759, CuerpoCeleste.TipoCuerpoCeleste.PLANETA);
        CuerpoCeleste Neptuno = new CuerpoCeleste("Neptuno ●", 165, CuerpoCeleste.TipoCuerpoCeleste.PLANETA);
        CuerpoCeleste Pluton = new CuerpoCeleste("Pluton · ", 248, CuerpoCeleste.TipoCuerpoCeleste.PLANETA_ENANO);

        //CREAR TIPO SATÉLITE

        CuerpoCeleste Luna = new CuerpoCeleste("Luna", 27, CuerpoCeleste.TipoCuerpoCeleste.SATELITE);
        CuerpoCeleste Deimos = new CuerpoCeleste("Deimos", 1.3, CuerpoCeleste.TipoCuerpoCeleste.SATELITE);
        CuerpoCeleste Phobos = new CuerpoCeleste("Phobos", 0.3, CuerpoCeleste.TipoCuerpoCeleste.SATELITE);
        CuerpoCeleste Io = new CuerpoCeleste("Io", 1.8, CuerpoCeleste.TipoCuerpoCeleste.SATELITE);
        CuerpoCeleste Europa = new CuerpoCeleste("Europa", 3.5, CuerpoCeleste.TipoCuerpoCeleste.SATELITE);
        CuerpoCeleste Ganymede = new CuerpoCeleste("Ganymede", 7.1, CuerpoCeleste.TipoCuerpoCeleste.SATELITE);
        CuerpoCeleste Callisto = new CuerpoCeleste("Callisto", 16.7, CuerpoCeleste.TipoCuerpoCeleste.SATELITE);


        //AÑADIR SATÉLITES A SUS PLANETAS
        Tierra.addsatelite(Luna);
        Marte.addsatelite(Deimos);
        Marte.addsatelite(Phobos);
        Jupiter.addsatelite(Io);
        Jupiter.addsatelite(Europa);
        Jupiter.addsatelite(Ganymede);
        Jupiter.addsatelite(Callisto);

        //AÑADIR AL SISTEMA SOLAR
        sistemaSolar.put("Mercurio", Mercurio);
        sistemaSolar.put("Venus", Venus);
        sistemaSolar.put("Tierra", Tierra);
        sistemaSolar.put("Marte", Marte);
        sistemaSolar.put("Jupiter", Jupiter);
        sistemaSolar.put("Urano", Urano);
        sistemaSolar.put("Saturno", Saturno);
        sistemaSolar.put("Neptuno", Neptuno);
        sistemaSolar.put("Luna", Luna);

        //AÑADIR PLANETAS
        planetas.add(Mercurio);
        planetas.add(Venus);
        planetas.add(Tierra);
        planetas.add(Marte);
        planetas.add(Jupiter);
        planetas.add(Urano);
        planetas.add(Saturno);
        planetas.add(Neptuno);
        planetas.add(Pluton);


        //AÑADIR SATELITES
        satelites.add(Luna);
        satelites.add(Deimos);
        satelites.add(Phobos);
        satelites.add(Io);
        satelites.add(Ganymede);
        satelites.add(Callisto);
        satelites.add(Europa);

        System.out.println("Planetas: ");
        for (CuerpoCeleste cuerpoCeleste : planetas) {
            System.out.println(cuerpoCeleste);
        }
        System.out.println(" ");
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println(" ");
        System.out.println("Satélites: ");
        for (CuerpoCeleste satelite : satelites){
            System.out.println(satelite);
        }

    }
}