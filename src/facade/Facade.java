package facade;

import subsistema1.crm.CrmService;
import subsistema2.cep.CepApi;

public class Facade {

    public void migarCliente(String nome, String cep){
        String cidade = CepApi.getInsancia().recuperarCidade(cep);
        String estado = CepApi.getInsancia().recuperarEstado(cep);

        CrmService.gravarCliente(nome,cep,cidade,estado);
    }

}
