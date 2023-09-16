/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronobserver;

/**
 *
 * @author Arxate
 */
public class ConcreteObserver implements Observer {

    public ConcreteObserver() {
    }
//agregamos el metodo heredado de Observer

    @Override
    public void update(float temp, float humidity, float pressure) {
    }
   
    
}
