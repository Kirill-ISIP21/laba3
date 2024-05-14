package laba7.Exmpl1;

public class SuperClass {
    private String textField;

    SuperClass(String text){
        this.textField = text;
    }

    @Override
    public String toString(){
        String label = "Class name = " + this.getClass().getSimpleName() + "\n" +
                "TextField = " + this.textField;
        return label;
    }

    public String getField(){
        return this.textField;
    }
}
