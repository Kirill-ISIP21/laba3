package laba7.Exmpl1.Exmpl4;

public class SubClass extends SuperClass{
    public String subTextField;

    SubClass(String text1, String text2){
        super(text1);
        this.subTextField = text2;
    }

    SubClass(SubClass obj){
        super(obj);
        this.subTextField = obj.subTextField;
    }
}
