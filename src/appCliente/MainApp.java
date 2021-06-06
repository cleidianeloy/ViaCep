/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appCliente;

import entity.Endereco;
import java.util.Scanner;
import clienteWS.WSClienteServicoCEP;

/**
 *
 * @author cleid
 */
public class MainApp {
    public static void main(String[] args) throws Exception{
        System.out.println("Informe um CEP");
        String cep = new Scanner(System.in).nextLine();
        
        Endereco  endereco = WSClienteServicoCEP.pesquisar(cep);
        System.out.println(endereco.getDados());
    }
}
