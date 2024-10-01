package main;

public class Result {
    private final float value;
    private final String formula;

    public Result(float value, String formula) {
        this.value = value;
        this.formula = formula;
    }

    public float getValue() {
        return value;
    }

    public String getUnit() {
        return formula;
    }
  
}
