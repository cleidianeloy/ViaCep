/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clienteWS;

import com.google.gson.Gson;
import entity.Endereco;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import util.UtilJson;

/**
 *
 * @author cleid
 */
public class WSClienteServicoCEP {
    //link do serviço
    static String webService = "http://www.viacep.com.br/ws/";
    //codigo para verificar se deu certo
    static int codigoSucesso = 200;
    
    //metodo para pesquisar o cep
    public static Endereco pesquisar(String cep) throws Exception{
        String urlRequisicao = webService + cep + "/json";
        //^ http://www.viacep.com.br/ws/88000000/json
        try {
            //tente acessar a url de um serviço web 
            URL url = new URL(urlRequisicao);
            HttpURLConnection conexao = (HttpURLConnection)url.openConnection();
            if (conexao.getResponseCode() != codigoSucesso){
                //se o codigo de resposta for diferente de codigo sucesso:
                throw new RuntimeException("HTTP Erro Code: " + conexao.getResponseCode());
            }
            //vai pegar a resposta da conexao em buffer
            BufferedReader resposta = new BufferedReader(new InputStreamReader(
                    conexao.getInputStream()));
            //colocar em um formado json
            String jsonEmString = UtilJson.jsonToString(resposta);
            //biblioteca  gson permite transformar um json em dados de um objeto
            Gson gson = new Gson();
            //objeto endereco criado com os dados do json 
            Endereco endereco = gson.fromJson(jsonEmString, Endereco.class);
            //retorna
            return endereco;
        } catch (Exception ex){
            throw new Exception("Erro: " + ex);
        }
    }
}
