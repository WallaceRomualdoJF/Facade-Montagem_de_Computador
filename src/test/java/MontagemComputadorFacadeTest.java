import static org.junit.Assert.*;

import org.example.wallace.MontagemComputadorFacade;
import org.junit.Test;

public class MontagemComputadorFacadeTest {
    @Test
    public void testLigarComputador() {
        MontagemComputadorFacade facade = new MontagemComputadorFacade();
        facade.ligarComputador();
        assertTrue(facade.getComputador().isLigado());
    }

    @Test
    public void testDesligarComputador() {
        MontagemComputadorFacade facade = new MontagemComputadorFacade();
        facade.desligarComputador();
        assertFalse(facade.getComputador().isLigado());
    }

    @Test
    public void testExecutarTarefa() {
        MontagemComputadorFacade facade = new MontagemComputadorFacade();
        facade.ligarComputador();
        facade.executarTarefa("Abrir navegador");
        assertTrue(facade.getComputador().getTarefasExecutadas().contains("Abrir navegador"));
    }

    @Test
    public void testExecutarTarefaInexistente() {
        MontagemComputadorFacade facade = new MontagemComputadorFacade();
        facade.ligarComputador();
        facade.executarTarefa("Fechar programa");
        //assertFalse(facade.getComputador().getTarefasExecutadas().contains("Fechar programa"));
    }
}