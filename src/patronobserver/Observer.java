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
public interface Observer {
    
    //creamos los metodos abstractos que heredaran nuestras clases hijas
    //mandamos como parametro las variables temp,humidity y pressure que hacen referencia a la temperatura,la humedad y la presion 
    public void update(float temp,float humidity,float pressure);
}
