/*
 * Copyright (C) 2015 hcadavid
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package edu.eci.pdsw.samples.tests;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Conjunto de pruebas para XXXXXXXXX
 * 

Estados (http://asciiflow.com/):

                 +--------------------+      
+-+              |                    |      
+-+              |                    |      
 |               |                    |      
 |        +------v----+          +----+-----+
 |        |           |          |          |
 +-------->           +---------->          |
          |           |          |          |
          |           |          |          |
          |           |          |          |
          +--^--------+          +-------+--+
             |                           |   
             |                           |   
             |                           |   
             |        +-----------+      |   
             |        |           |      |   
             +--------+           |      |   
                      |           <------+   
                      |           |          
                      |           |          
                      +-----------+          

Clases de equivalencia:

CE1. Casos Básicos.
CE2. Que sumado supere 30 de un mes de 30 dias.
CE3. Que sumado supere 31 de un mes de 31 dias.
CE4. Año Bisiesto y que sumado supere 28 de Febrero ó 365 dias de ese año.
CE5. Que sumado supere 365 dias de ese mismo año si es un año normal.

Condiciones de frontera a evaluar:

F1. Para meses de 31 dias, el dia sumado a N sea igual a 32.
F2. Para meses de 30 dias, el dia sumado a N sea igual a 31.
F3. Para años de "365" dias, si el numero de dia mas N sea igual a 366.
F4. Para años de "366" dias, si el numero de dia mas N sea igual a 367.
F5. Para Febrero en año bisiesto, el dia sumado a N sea iguaql a 30.

 
* @author XXXXXXX
*/
public class NewEmptyJUnitTest {
    
    public NewEmptyJUnitTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @Test
    public void registroPacienteTest(){
        
    }
    
    @Test
    public void registroConsultaTest(){
        
    }
    
}
