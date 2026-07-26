package subsistema2.cep;

public class CepApi {
    private static CepApi insancia = new CepApi();

    private CepApi(){
        super();
    }

    public static CepApi getInsancia(){
        return insancia;
    }

    public String recuperarCidade(String cep){
        return "Cidade";
    }

    public String recuperarEstado(String estado){
        return "Estado";
    }

}
