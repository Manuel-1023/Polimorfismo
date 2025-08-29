public class App {
    public static void main(String[] args) throws Exception {
        Animal[] animales = { new Foca(), new Caballo(), new Elefante() };
        for (Animal animal : animales) {
            animal.hacerSonido(); //
        }
    }
}
