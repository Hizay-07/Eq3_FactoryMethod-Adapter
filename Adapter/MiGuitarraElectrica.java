// Clase que representa a la clase a actualizar se desea representar por medio de la acústica
//Target
public class MiGuitarraElectrica implements GuitarraElectricaInterface {
    @Override
    public void encender() {
        System.out.println("Guitarra eléctrica encendida");
    }

    @Override
    public void apagar() {
        System.out.println("Guitarra eléctrica apagada");
    }
}
