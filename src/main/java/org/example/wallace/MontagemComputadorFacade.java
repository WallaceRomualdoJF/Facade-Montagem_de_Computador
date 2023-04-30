package org.example.wallace;

public class MontagemComputadorFacade {
    private Computador computador;

    public MontagemComputadorFacade() {
        this.computador = new Computador();
    }

    public void ligarComputador() {
        computador.ligarComputador();
    }

    public void desligarComputador() {
        computador.desligarComputador();
    }

    public void executarTarefa(String tarefa) {
        computador.executarTarefa(tarefa);
    }

    public Computador getComputador() {
        return computador;
    }
}
