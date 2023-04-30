package org.example.wallace;

import java.util.ArrayList;
import java.util.List;

public class Computador {
    private boolean ligado;
    private List<String> tarefasExecutadas;

    public Computador() {
        this.ligado = false;
        this.tarefasExecutadas = new ArrayList<>();
    }

    public void ligarComputador() {
        this.ligado = true;
    }

    public void desligarComputador() {
        this.ligado = false;
    }

    public boolean isLigado() {
        return this.ligado;
    }

    public void executarTarefa(String tarefa) {
        this.tarefasExecutadas.add(tarefa);
    }

    public List<String> getTarefasExecutadas() {
        return this.tarefasExecutadas;
    }
}
