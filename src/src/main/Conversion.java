package main;

public class Conversion {
    private final float factor;
    private final String formula;

    public Conversion(float factor, String formula) {
        this.factor = factor;
        this.formula = formula;
    }

    public float getFactor() {
        return factor;
    }

    public String getFormula() {
        return formula;
    }
  
}
