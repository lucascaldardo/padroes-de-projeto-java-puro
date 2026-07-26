import singleton.SingletonApressado;
import singleton.SingletonLazyHolder;
import singleton.SingletonPreguicoso;
import strategy.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Singleton
        SingletonPreguicoso preguicoso = SingletonPreguicoso.getInstancia();
        System.out.println(preguicoso);
        preguicoso = SingletonPreguicoso.getInstancia();
        System.out.println(preguicoso);

        SingletonApressado apressado = SingletonApressado.getInstancia();
        System.out.println(apressado);
        apressado = SingletonApressado.getInstancia();
        System.out.println(apressado);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);

        //strategy
        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setStrategy(normal);
        robo.mover();

        robo.setStrategy(defensivo);
        robo.mover();

        robo.setStrategy(agressivo);
        robo.mover();
        }
    }
