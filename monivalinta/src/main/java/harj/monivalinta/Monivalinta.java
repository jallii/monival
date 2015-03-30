/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package harj.monivalinta;

import harj.monivalinta.view.UserInterface;
import harj.monivalinta.Controller;

/**
 *
 * @author boss
 */
public class Monivalinta {

    private static Object ui;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Controller kone = new Controller();
        kone = new Controller();
        UserInterface ui = new UserInterface(kone) {

            
            @Override
            public void start() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        ui.start();
    }

}
