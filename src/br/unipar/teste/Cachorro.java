package br.unipar.teste;

import br.unipar.interfaces.interfaceAnimais;

public class Cachorro implements interfaceAnimais   {

    @Override
    public String emitirSom() {
        return "au";
    }

    @Override
    public void correr() {

    }

    @Override
    public void alimentacao() {

    }
}
