package singleton;

public class SingletonApressado {

    private static SingletonApressado instancia = new SingletonApressado();

    public SingletonApressado() {

        super();
    }

    public static SingletonApressado getInstancia(){
        return instancia;
    }
}
