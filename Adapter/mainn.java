// Cliente que toca la guitarra acustica con adaptador a eléxtrica
public class mainn {
    public static void main(String[] args) {
        // Crear una instancia de guitarra eléctrica
        GuitarraElectricaInterface guitarraElectrica = new MiGuitarraElectrica();

        // Crear una instancia de guitarra acústica
        GuitarraAcusticaInterface guitarraAcustica = new MiGuitarraAcustica();

        // Crear un adaptador para la guitarra acústica
        GuitarraElectricaInterface adaptador = new AdaptadorGuitarra(guitarraAcustica);

        // Tocar la guitarra eléctrica
        System.out.println("Tocando la guitarra eléctrica:");
        guitarraElectrica.encender();
        guitarraElectrica.apagar();

        // Tocar la guitarra acústica usando el adaptador
        System.out.println("\nTocando la guitarra acústica con el adaptador:");
        adaptador.encender();
        adaptador.apagar();
    }
}



