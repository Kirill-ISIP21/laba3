package laba7.Exmpl1.Exmpl2;

public class SuperClass {
    private String textField;

    public void setField(String text){
        this.textField = text;
    }

    public void setField(){
    }

    SuperClass(String text){
        this.textField = text;
    }

    public int weightTextField(){
        return this.textField.length();
    }
}
