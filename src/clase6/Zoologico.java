package clase6;

public class Zoologico {
    public static void main(String[] args) {
        Perro firulais = new Perro();
        firulais.hacersonido();
        firulais.buscar();
        alimentar(firulais);

        Animal fido = new Perro(); //polimorfismo
        fido.hacersonido();

        fido = new Gato();
        fido.hacersonido();
        ((Gato) fido).ronronear(); //Castear = conversión
        alimentar(fido);

    }
    public static void alimentar(Animal animal){
        if(animal instanceof Perro)
            System.out.println("aquí está tu comida perro");
        else
            if(animal instanceof Gato)
                System.out.println("aquí está tu comida gato");

    }

}
