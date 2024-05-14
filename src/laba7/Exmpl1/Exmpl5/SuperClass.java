package laba7.Exmpl1.Exmpl5;

public class SuperClass {
    private String textFiled;

    SuperClass(String text){
        this.textFiled = text;
    }

    public void toConsole() {
        System.out.printf("Class Name = " + this.getClass().getSimpleName() + "\nTextField = " + this.textFiled);
    }
}
