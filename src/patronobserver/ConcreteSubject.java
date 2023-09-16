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
public class ConcreteSubject implements Subject {
//creamos sus atributos
    
    public ConcreteSubject() {
    }
    
    
    
    
    
    
    
//Creamos los metodos heredados de la interface Subject

    @Override
    public void registerObserver(Observer o) {
    }

    @Override
    public void removeObserver(Observer o) {
   }

    @Override
    public void notifyObservers() {
    }
  
}
