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
public class Area extends Unit {

    public Area() {
        conversions = Map.of(
            "Square Kilometre", Map.of(
                "Square metre", new Conversion(1e6f, "Multiply the value by 1e+6"),
                "Square mile", new Conversion(1/2.59f, "Divide the value by 2.59"),
                "Square yard", new Conversion(1.196e6f, "Multiply the value by 1.196e+6"),
                "Square foot", new Conversion(1.076e7f, "Multiply the value by 1.076e+7"),
                "Square inch", new Conversion(1.55e9f, "Multiply the value by 1.55e+9"),
                "Hectare", new Conversion(100f, "Multiply the value by 100"),
                "Acre", new Conversion(247.1f, "Multiply the value by 247.1")
            ),
            "Square metre", Map.of(
                "Square Kilometre", new Conversion(1e-6f, "Divide the value by 1e+6"),
                "Square mile", new Conversion(1/2.59e6f, "Divide the value by 2.59e+6"),
                "Square yard", new Conversion(1.196f, "Multiply the value by 1.196"),
                "Square foot", new Conversion(10.764f, "Multiply the value by 10.764"),
                "Square inch", new Conversion(1550f, "Multiply the value by 1550"),
                "Hectare", new Conversion(1e-4f, "Divide the value by 1e4"),
                "Acre", new Conversion(1/4047f, "Divide the value by 4047")
            ),
            "Square mile", Map.of(
                "Square Kilometre", new Conversion(2.59f, "Multiply the value by 2.59"),
                "Square metre", new Conversion(2.59e6f, "Multiply the value by 2.59e+6"),
                "Square yard", new Conversion(3.098e6f, "Multiply the value by 3.098e+6"),
                "Square foot", new Conversion(2.788e7f, "Multiply the value by 2.788e+7"),
                "Square inch", new Conversion(4.014e9f, "Multiply the value by 4.014e+9"),
                "Hectare", new Conversion(259f, "Multiply the value by 259"),
                "Acre", new Conversion(640f, "Multiply the value by 640")
            ),
            "Square yard", Map.of(
                "Square Kilometre", new Conversion(1/1.196e6f, "Divide the value by 1.196e+6"),
                "Square metre", new Conversion(1/1.196f, "Divide the value by 1.196"),
                "Square mile", new Conversion(1/3.098e6f, "Divide the value by 3.098e+6"),
                "Square foot", new Conversion(9f, "Multiply the value by 9"),
                "Square inch", new Conversion(1296f, "Multiply the value by 1296"),
                "Hectare", new Conversion(1/11960, "Divide the value by 11960"),
                "Acre", new Conversion(1/4840f, "Divide the value by 4840")
            ),
            "Square foot", Map.of(
                "Square Kilometre", new Conversion(1/1.076e7f, "Divide the value by 1.076e+7"),
                "Square metre", new Conversion(1/10.764f, "Divide the value by 10.764"),
                "Square mile", new Conversion(1/2.788e7f, "Divide the value by 2.788e+7"),
                "Square yard", new Conversion(1/9f, "Divide the value by 9"),
                "Square inch", new Conversion(144f, "Multiply the value by 144"),
                "Hectare", new Conversion(1/1.076e5f, "Divide the value by 1.076e+5"),
                "Acre", new Conversion(1/43560f, "Divide the value by 43560")
            ),
            "Square inch", Map.of(
                "Square Kilometre", new Conversion(1/1.55e9f, "Divide the value by 1.55e+9"),
                "Square metre", new Conversion(1/1550f, "Divide the value by 1550"),
                "Square mile", new Conversion(1/4.014e9f, "Divide the value by 4.014e+9"),
                "Square yard", new Conversion(1/1296f, "Divide the value by 1296"),
                "Square foot", new Conversion(1/144f, "Divide the value by 144"),
                "Hectare", new Conversion(1/1.55e7f, "Divide the value by 1.55e+7"),
                "Acre", new Conversion(1/6.273e6f, "Divide the value by 6.273e+6")
            ),
            "Hectare", Map.of(
                "Square Kilometre", new Conversion(0.01f, "Divide the value by 100"),
                "Square metre", new Conversion(1e4f, "Multiply the value by 1e4"),
                "Square mile", new Conversion(1/259f, "Divide the value by 259"),
                "Square yard", new Conversion(11960f, "Multiply the value by 11960"),
                "Square foot", new Conversion(1.076e5f, "Multiply the value by 107600"),
                "Square inch", new Conversion(1.55e7f, "Multiply the value by 1.55e+7"),
                "Acre", new Conversion(2.471f, "Multiply the value by 2.471")
            ),
            "Acre", Map.of(
            "Square Kilometre", new Conversion(1/247.1f, "Divide the value by 247.1"),
            "Square metre", new Conversion(4047f, "Multiply the value by 4047"),
            "Square mile", new Conversion(1/640f, "Divide the value by 640"),
            "Square yard", new Conversion(4840f, "Multiply the value by 4840"),
            "Square foot", new Conversion(43560f, "Multiply the value by 43560"),
            "Square inch", new Conversion(6.273e6f, "Multiply the value by 6.273e+6"),
            "Hectare", new Conversion(1/2.471f, "Divide the value by 2.471")
            )
        );
    }
    
    @Override
  protected Result transform(BigDecimal value, String from, String to) {
    Conversion conversion = conversions.get(from).get(to);
    return new Result(value.multiply(BigDecimal.valueOf(conversion.getFactor())), conversion.getFormula());
  
  }
    
    
}
