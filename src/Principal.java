import com.aluracursos.screematch.modelos.Pelicula;

public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula();
        miPelicula.setNombre("Encanto");
        miPelicula.setFechaDeLanzamiento(2021);
        miPelicula.setDuracionEnMinutos(120);

        System.out.println("Mi pelicula es: "+miPelicula.getNombre());
        System.out.println("Su fecha de lanzamiento es: "+miPelicula.getFechaDeLanzamiento());



    }
}
