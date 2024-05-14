package laba7.Exmpl1.Exmpl2;

public class SubClass extends SuperClass{

    int numField;

    public void setField(){
    }

    public void setField(String text){
        super.setField(text);
    }

    public void setField(int num){
        this.numField = num;
    }

    public void setField(String Text, int num){
        this.numField = num;
    }

    SubClass(String text, int num){
        super(text);
        this.numField = num;
    }
}
