/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.io.BufferedReader;
import java.io.IOException;

/**
 *
 * @author cleid
 */
public class UtilJson {
    //classe para ler o json 
    public static String jsonToString(BufferedReader bufferedReader) throws IOException{
         //iniciando a variavel resposta e jsonToString como vazio
        String resposta, jsonToString = "";
        
        while ((resposta = bufferedReader.readLine()) != null){
           //vai ler linha por linha da resposta do buffer incluido no metodo
           jsonToString += resposta;
           //Alimentando o jsonToString com a resposta
        }
        return jsonToString;
    }
}
