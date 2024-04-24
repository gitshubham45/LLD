public class Demo {
    public static void main(String[] args){

        Factory mf = new MacFactory();

        mf.createButton().getStatus();

        mf.createCheckbox().getStatus();


    }
}
