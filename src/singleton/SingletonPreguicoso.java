package singleton;

public class SingletonPreguicoso {

    private static SingletonPreguicoso instancia;

    public SingletonPreguicoso() {
        super();
    }

    public static SingletonPreguicoso getInstancia(){
        if (instancia == null){
            instancia = new SingletonPreguicoso();
        }
        return instancia;
    }
}
