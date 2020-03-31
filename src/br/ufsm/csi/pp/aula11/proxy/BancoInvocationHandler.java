package br.ufsm.csi.pp.aula11.proxy;

import br.ufsm.csi.pp.aula03_04.Banco;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class BancoInvocationHandler implements InvocationHandler {

    private Banco banco;
    private Writer writer;

    public BancoInvocationHandler(Banco banco, File logFile) throws IOException {
        this.banco = banco;
        this.writer = new FileWriter(logFile);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long time = System.currentTimeMillis();
        Object ret = method.invoke(banco, args);
        time = System.currentTimeMillis() - time;
        writer.write("Método invocado (" + time + "ms): " + method);
        return ret;
    }

}
