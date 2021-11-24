/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import com.mycompany.hotel.Habitaciones;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author erikj
 */
public class habitacionesHotel {
    
    public habitacionesHotel() {
    }
    Habitaciones hab = new Habitaciones();
    @Test
    public void testSomething() {
        assertEquals("1180", hab.redireccion("Junior",1,1));
}
    @Test
    public void testSomething2() {
        assertEquals("Minimo 1 persona y maximo 3 personas", hab.redireccion("Junior",4,2));
}
     public void testSomething3() {
        assertEquals("Minimo 1 persona y maximo 5 personas", hab.redireccion("Double",6,1));
}
    @Test
    public void testSomething4() {
        assertEquals("3434", hab.redireccion("Double",5,2));
}
     public void testSomething5() {
        assertEquals("Minimo 1 persona y maximo 5 personas", hab.redireccion("Suite",6,1));
}
    @Test
    public void testSomething6() {
        assertEquals("3270", hab.redireccion("Suite",2,2));
}
}
