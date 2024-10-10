/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.Map;
import java.math.BigDecimal;

/**
 *
 * @author time
 */
public class Angle extends Unit {

  public Angle() {
    // cambiar las conversiones para que tambien entreguen la formula de conversión
    conversions = Map.of(
      "Arcsecond", Map.of(
        "Degree", new Conversion(1 / 3600f, "Divide the value by 3600"),
        "Gradian", new Conversion(1 / 3240f, "Divide the value by 3240"),
        "Miliradian", new Conversion(1 / 3600f * (float) (Math.PI / 180) * 1000, "value / 3600 * (π / 180) * 1000"),
        "Minute of arc", new Conversion(1 / 60f, "Divide the value by 60"),
        "Radian", new Conversion((float) (Math.PI / (180 * 3600)), "value * (π / (180 * 3600))")
      ),
      "Degree", Map.of(
        "Arcsecond", new Conversion(3600f, "Multiply the value by 3600"),
        "Gradian", new Conversion(0.9f, "Multiply the value by 0.9"),
        "Miliradian", new Conversion((float) (Math.PI / 180) * 1000, "value * (π / 180) * 1000"),
        "Minute of arc", new Conversion(60f, "Multiply the value by 60"),
        "Radian", new Conversion((float) (Math.PI / 180), "value * (π / 180)")
      ),
      "Gradian", Map.of(
        "Arcsecond", new Conversion(3240f, "Multiply the value by 3240"),
        "Degree", new Conversion(1 / 0.9f, "Divide the value by 0.9"),
        "Miliradian", new Conversion((float) (Math.PI / 200) * 1000, "value * (π / 200) * 1000"),
        "Minute of arc", new Conversion(54f, "Multiply the value by 54"),
        "Radian", new Conversion((float) (Math.PI / 200), "value * (π / 200)")
      ),
      "Miliradian", Map.of(
        "Arcsecond", new Conversion(1 / ((float) (Math.PI / (180 * 3600)) * 1000), "value / ((π / (180 * 3600)) * 1000)"),
        "Degree", new Conversion(1 / ((float) (Math.PI / 180) * 1000), "value / ((π / 180) * 1000)"),
        "Gradian", new Conversion(1 / ((float) (Math.PI / 200) * 1000), "value / ((π / 200) * 1000)"),
        "Minute of arc", new Conversion(1 / ((float) (Math.PI / (180 * 60)) * 1000), "value / ((π / (180 * 60)) * 1000)"),
        "Radian", new Conversion(0.001f, "value * 0.001")
      ),
      "Minute of arc", Map.of(
        "Arcsecond", new Conversion(60f, "Multiply the value by 60"),
        "Degree", new Conversion(1 / 60f, "Divide the value by 60"),
        "Gradian", new Conversion(1 / 60f * 0.9f, "Divide the value by 54"),
        "Miliradian", new Conversion(1 / 60f * (float) (Math.PI / 180) * 1000, "value / 60 * (π / 180) * 1000"),
        "Radian", new Conversion((float) (Math.PI / (180 * 60)), "value * (π / (180 * 60))")
      ),
      "Radian", Map.of(
        "Arcsecond", new Conversion((float) (180 * 3600 / Math.PI), "value * (180 * 3600 / π)"),
        "Degree", new Conversion((float) (180 / Math.PI), "value * (180 / π)"),
        "Gradian", new Conversion((float) (200 / Math.PI), "value * (200 / π)"),
        "Miliradian", new Conversion(1000f, "Multiply the vallue by 1000"),
        "Minute of arc", new Conversion((float) (180 * 60 / Math.PI), "value * (180 * 60 / π)")
      )
    );
}
  


  @Override
  protected Result transform(BigDecimal value, String from, String to) {
    Conversion conversion = conversions.get(from).get(to);
    return new Result(value.multiply(BigDecimal.valueOf(conversion.getFactor())), conversion.getFormula());
  
  }

  
    
}
