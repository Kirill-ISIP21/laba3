package laba7.Exmpl1;

public class SubClass extends SuperClass{
    private String SubCField;

    SubClass(String text){
        super(text);
    }

    SubClass(String text1, String text2){
        super(text1);
        this.SubCField = text2;
    }

    @Override
    public String toString(){
        String label = "Class name = " + this.getClass().getSimpleName() + "\n" +
                "textField1 = " + this.getField() + "\n" +
                "textField2 = " + this.SubCField;
        return  label;
    }
}
