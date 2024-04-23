// Adaptador que convierte la interfaz de GuitarraAcustica en GuitarraElectrica
//Usa la inerface de GuitarraElectrica pero con guitarra acustica
class AdaptadorGuitarra implements GuitarraElectricaInterface {
    private final GuitarraAcusticaInterface guitarraAcustica;

    public AdaptadorGuitarra(GuitarraAcusticaInterface guitarraAcustica) {
        this.guitarraAcustica = guitarraAcustica;
    }

    @Override
    public void encender() {
        guitarraAcustica.tocar();
    }

    @Override
    public void apagar() {
        guitarraAcustica.dejarDeTocar();
    }
}
