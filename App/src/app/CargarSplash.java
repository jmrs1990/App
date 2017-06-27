package app;

import javax.swing.JProgressBar;

/**
 *
 * @author Jose Ma
 */
public class CargarSplash extends Thread {

    JProgressBar progreso;

    public CargarSplash(JProgressBar progreso) {
        super();
        this.progreso = progreso;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            progreso.setValue(i);
            pausa(50);
        }
    }

    public void pausa(int mlSeg) {
        try {
            Thread.sleep(mlSeg);
        } catch (Exception e) {
        }
    }
}
