package numeth_backend;

//import javafx.beans.property.DoubleProperty;
//import javafx.beans.property.IntegerProperty;
//import javafx.beans.property.SimpleDoubleProperty;
//import javafx.beans.property.SimpleIntegerProperty;

public class BracketingResult {
    private String i;
    private String xl;
    private String xm;
    private String xu;
    private String fxl;
    private String fxm;
    private String fxu;
    private String approximateError;

    public BracketingResult(String i, String xl, String xm, String xu, String fxl, String fxm, String fxu, String approximateError) {
        this.i = i;
        this.xl = xl;
        this.xm = xm;
        this.xu = xu;
        this.fxl = fxl;
        this.fxm = fxm;
        this.fxu = fxu;
        this.approximateError = approximateError;
    }

    public String getI() {
        return i;
    }

    public String getXl() {
        return xl;
    }

    public String getXm() {
        return xm;
    }

    public String getXu() {
        return xu;
    }

    public String getFxl() {
        return fxl;
    }

    public String getFxm() {
        return fxm;
    }

    public String getFxu() {
        return fxu;
    }

    public String getApproximateError() {
        return approximateError;
    }

    public void setI(String i) {
        this.i = i;
    }

    public void setXl(String xl) {
        this.xl = xl;
    }

    public void setXm(String xm) {
        this.xm = xm;
    }

    public void setXu(String xu) {
        this.xu = xu;
    }

    public void setFxl(String fxl) {
        this.fxl = fxl;
    }

    public void setFxm(String fxm) {
        this.fxm = fxm;
    }

    public void setFxu(String fxu) {
        this.fxu = fxu;
    }

    public void setApproximateError(String approximateError) {
        this.approximateError = approximateError;
    }
}
