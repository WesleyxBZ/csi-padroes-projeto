package br.ufsm.csi.pp.aula11.proxy;

import br.ufsm.csi.pp.aula03_04.Banco;
import br.ufsm.csi.pp.aula03_04.BancoInterface;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Proxy;

public class BancoFactory {

    public static BancoInterface createBanco() throws IOException {
        Banco banco = new Banco();
        return (BancoInterface) Proxy.newProxyInstance(BancoFactory.class.getClassLoader(),
                new Class[]{BancoInterface.class},
                new BancoInvocationHandler(banco, new File("log-proxy.txt")));
    }

}
