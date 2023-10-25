import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Duenio duenio1 = new Duenio("Luis","1753468311",32,'M');
        Motor motor1 = new Motor(2.0,"Gasolina");
        Motor motor2 = new Motor(4.0,"Diesel");

        Auto auto1 =new Auto(4,"Plata",4,motor1,duenio1);
        Auto auto2 = new Auto(6,"Blanco",2,motor2,duenio1);

        Map<String,Auto> mapAutos = new HashMap<>();

        mapAutos.put("Azul",auto1);
        mapAutos.put("Rojo",auto2);
        mapAutos.put("Blanco",auto2);
        mapAutos.put("Negro",auto1);
        mapAutos.put("Cafe",auto2);


        System.out.println("El auto de color negro tiene: "+mapAutos.get("Negro").getNumeroRuedas()+" ruedas");
        System.out.println("El auto de color azul tiene: "+mapAutos.get("Azul").getPuertas()+" ruedas");

        mapAutos.remove("Azul");

        /*mapAutos.put(duenio1,auto1);

        System.out.println("El color del auto de: "+duenio1.getNombre()+" es: "+mapAutos.get(duenio1).getColor());

        mapAutos.put(duenio1,auto2);

        System.out.println("El color del auto de: "+duenio1.getNombre()+" es: "+mapAutos.get(duenio1).getColor());*/

        List<Auto> listaAutos = new ArrayList<>();
        listaAutos.add(auto1);
        listaAutos.add(auto2);
        listaAutos.add(auto1);
        listaAutos.add(auto2);

        Auto autox = listaAutos.get(1);
        listaAutos.remove(0);



    }
}