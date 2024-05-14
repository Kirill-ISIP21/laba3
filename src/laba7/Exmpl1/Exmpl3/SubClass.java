package laba7.Exmpl1.Exmpl3;

public class SubClass extends SuperClass{

    public String textField;

    public void setField(int num, String text){
        super.setField(num);
        this.textField = text;
    }

    SubClass(int num, String text){
        super(num);
        this.textField = text;
    }

    @Override
    public String toString() {
        String label = "Class name = " + this.getClass().getSimpleName() + "\n"
                + "num = " + super.numField + "\n"
                + "text = " + this.textField;
        return label;
    }
}
