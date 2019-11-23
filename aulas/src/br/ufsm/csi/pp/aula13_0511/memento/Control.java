package br.ufsm.csi.pp.aula13_0511.memento;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

public class Control implements ControlInterface {

    private Texto texto;
    private List<Texto> textsHistorico = new ArrayList<>();
    private int desafezer;
    private int refazer;

    public Control(Texto texto) {
        this.texto = texto;
        this.desafezer = 0;
        this.refazer = 0;
    }

    public void onKeyPressed(KeyEvent keyEvent) {

        if (keyEvent.getKeyCode() == keyEvent.VK_ENTER || keyEvent.getKeyCode() == keyEvent.VK_BACK_SPACE) {
            this.textsHistorico.add(this.texto);
            this.texto = new Texto();
        }

        if (keyEvent.getKeyCode() == keyEvent.VK_CONTROL + keyEvent.VK_Z) {
            this.desafezer = this.refazer = this.textsHistorico.size() - 1;
            this.texto = this.textsHistorico.get(this.desafezer);
        }

        if (keyEvent.getKeyCode() == keyEvent.VK_CONTROL + keyEvent.VK_R) {
            if (this.textsHistorico.get(this.textsHistorico.size() + 1) != null) {
                this.refazer = this.textsHistorico.size() + 1;
                this.texto = this.textsHistorico.get(this.refazer);
            }
        }

    }


}