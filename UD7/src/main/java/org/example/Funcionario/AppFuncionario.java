package org.example.Funcionario;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Stack;

public class AppFuncionario {
    static HashSet<Informe> tipoInformes = new LinkedHashSet<>();

    public static void main(String[] args) {
        Stack<Informe> listaInformes = new Stack<>();

        Informe inf1 = new Informe(349,"trabajo de algo",TIPO.PERSONAL);
        Informe inf2 = new Informe(725,"trabajo de algo",TIPO.ADMINISTRATIVO);
        Informe inf3 = new Informe(749,"trabajo de algo",TIPO.EMPRESARIAL);
        Informe inf4 = new Informe(231,"trabajo de algo",TIPO.PERSONAL);
        Informe inf5 = new Informe(198,"trabajo de algo",TIPO.ADMINISTRATIVO);
        Informe inf6 = new Informe(749,"trabajo de algo",TIPO.EMPRESARIAL);
        Informe inf7 = new Informe(349,"trabajo de algo",TIPO.PERSONAL);

        listaInformes.push(inf1);
        tipoInformes.add(inf1);
        listaInformes.push(inf2);
        tipoInformes.add(inf2);
        listaInformes.push(inf3);
        tipoInformes.add(inf3);
        listaInformes.push(inf4);
        tipoInformes.add(inf4);
        listaInformes.push(inf5);
        tipoInformes.add(inf5);
        listaInformes.push(inf6);
        tipoInformes.add(inf6);
        listaInformes.push(inf7);
        tipoInformes.add(inf7);

        while (!listaInformes.isEmpty()) {
            System.out.println(listaInformes.peek());
            listaInformes.pop();
        }

        System.out.println(listaInformes);
    }
}