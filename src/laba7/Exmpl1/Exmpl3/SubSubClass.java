package laba7.Exmpl1.Exmpl3;

public class SubSubClass extends SubClass{

    public String subTextField;

    public void setField(int num, String text1, String text2){
        super.setField(num, text1);
        this.subTextField = text2;
    }

    SubSubClass(int num, String text1, String text2){
        super(num, text1);
        this.subTextField = text2;
    }

    @Override
    public String toString() {
        String label = "Class name = " + this.getClass().getSimpleName() + "\n"
                + "num = " + super.numField + "\n"
                + "text1 = " + super.textField + "\n"
                + "text2 = " +this.subTextField;
        return label;
    }
}
