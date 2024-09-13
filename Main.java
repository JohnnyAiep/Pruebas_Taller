// Creación de la clase cabeza
public class CabezaJohnny {
    // atributos
    String ojos;
    String boca;
    
    // creación de constructor para cabeza
    public CabezaJohnny(String ojos, String boca) {
        this.ojos = ojos;
        this.boca = boca;
    }
    
    // método para clase cabeza
    public void moverJohnny () {
        System.out.println("Al cerrar mis ojos " + ojos + ", mi boca " + boca);
    }
}

// creación de la clase torso 
public class TorsoJohnny {
    // atributos 
    String color;
    String material;

    // constructor de la clase torso
    public TorsoJohnny(String color, String material) {
        this.color = color;
        this.material = material;
    }

    // método para la clase torso
    public void mostrarJohnny () {
        System.out.println("El color de mi torso es " + color + " y está hecho de " + material); 
    }
}

// creación clase piernas
public class PiernasJohnny {
    // atributos 
    String patada;
    int rodillas;

    // constructor para clase piernas 
    public PiernasJohnny(String patada, int rodillas) {
        this.patada = patada;
        this.rodillas = rodillas;
    }

    // método para clase piernas
    public void dar () {
        System.out.println("Daré mi ataque de " + patada + " rematando con las " + rodillas + " rodillas");
    }
}

// creación clase manos
public class ManosJohnny {
    // atributos
    int dedos;
    String arma;

    // constructor clase manos
    public ManosJohnny(int dedos, String arma) {
        this.dedos = dedos;
        this.arma = arma;
    }

    // método para manos
    public void atacarJohnny () {
        System.out.println("Moveré mi " + dedos + " dedos, para usar mi " + arma);
    }
}

// creación de la clase robot 
public class RobotJohnny {
    // atributos
    String nombre;
    String profesion;
    private CabezaJohnny cabeza;
    private TorsoJohnny torso;
    private PiernasJohnny piernas;
    private ManosJohnny manos;

    // constructor clase robot
    public RobotJohnny(String nombre, String profesion) {
        this.nombre = nombre;
        this.profesion = profesion;
        this.cabeza = new CabezaJohnny("Abiertos", "Hablar");
        this.torso = new TorsoJohnny("Amarillo", "Plástico");
        this.piernas = new PiernasJohnny("Patada Voladora", 2);
        this.manos = new ManosJohnny(5, "Garra");
    }

    // método para Robot
    public void saludarJohnny () {
        System.out.println("Hola, mi nombre es " + nombre + " y mi profesión es " + profesion);
        cabeza.moverJohnny();
        torso.mostrarJohnny(); // Corrección: usar el método correcto
        piernas.dar(); // Corrección: usar el método correcto
        manos.atacarJohnny(); // Corrección: falta punto y coma
    }
}

// Creación de la clase Main donde comienza la ejecucion 
public class Main {
    public static void main(String[] args) {
        // Crear un objeto de clase RobotJohnny
        RobotJohnny rbtJohnny = new RobotJohnny("Johnny", "Guerrero");

        // Llamar al método saludarJohnny
        rbtJohnny.saludarJohnny();
    }
}
