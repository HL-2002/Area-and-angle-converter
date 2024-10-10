package main;
import java.math.*;
import java.text.*;

public class Result {
    private final BigDecimal value;
    private final String formula;

    public Result(BigDecimal value, String formula) {
        this.value = value;
        this.formula = formula;
    }

    public String getValue() {
        return format(value, 3);
    }
    
    private static String format(BigDecimal x, int scale) 
    {
        NumberFormat formatter = new DecimalFormat("0.0E0");
        formatter.setRoundingMode(RoundingMode.HALF_UP);
        formatter.setMinimumFractionDigits(scale);
        return formatter.format(x);
      }

    public String getUnit() {
        return formula;
    }
  
}
