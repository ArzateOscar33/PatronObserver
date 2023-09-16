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
public interface Subject {
    //creamos los metodos abstractos que heredaran nuestras clases hijas
    //mandamos como parametro el tipo Observer tanto para agregar a un observador como para eliminar
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
