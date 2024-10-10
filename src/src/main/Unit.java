/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.Map;
import java.math.BigDecimal;

/**
 * la clase debe almacenar las unidades de medida y sus factores de conversión
 * @author time
 */
public abstract class Unit {
    
  protected Map<String,
      Map<String, Conversion>
  > conversions;  
  
  protected abstract Result transform(BigDecimal value, String from, String to);
}
