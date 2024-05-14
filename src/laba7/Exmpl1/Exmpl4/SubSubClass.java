package laba7.Exmpl1.Exmpl4;

public class SubSubClass extends SubClass{
    public int numField;

    SubSubClass(String text1, String text2, int num){
        super(text1, text2);
        this.numField = num;
    }

    SubSubClass(SubSubClass obj){
        super(obj);
        this.numField = obj.numField;
    }
}
