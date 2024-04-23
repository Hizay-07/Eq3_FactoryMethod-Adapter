// Clase que representa al que se va a adaptar porque se requiere una nueva guitarra incompatible
//Adaptee
public class MiGuitarraAcustica implements GuitarraAcusticaInterface {
    @Override
    public void tocar() {
        System.out.println("Guitarra acústica siendo tocada");
    }

    @Override
    public void dejarDeTocar() {
        System.out.println("Guitarra acústica dejada de tocar");
    }
}
