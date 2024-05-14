package laba7.Exmpl1.Exmpl4;

public class SuperClass {
    public String textField;

    SuperClass(String text){
        this.textField = text;
    }

    SuperClass(SuperClass obj){
        this.textField = obj.textField;
    }
}
