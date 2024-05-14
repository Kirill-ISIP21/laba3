package laba7.Exmpl1.Exmpl5;

public class SubBClass extends SuperClass{
    private String textField;

    SubBClass(String text1, String text2){
        super(text1);
        this.textField = text2;
    }

    public void toConsole() {
        System.out.printf("Class Name = " + this.getClass().getSimpleName() +
                "\nTextSubField = " + this.textField);
    }
}
