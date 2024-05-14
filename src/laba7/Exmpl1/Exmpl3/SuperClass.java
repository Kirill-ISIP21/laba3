package laba7.Exmpl1.Exmpl3;

public class SuperClass {
    public int numField;

    public void setField(int num){
        this.numField = num;
    }

    SuperClass(int num){
        this.numField = num;
    }

    @Override
    public String toString() {
        String label = "Class name = " + this.getClass().getSimpleName() + "\n"
                + "num = " + this.numField;
        return label;
    }
}
