public class MacFactory  implements Factory{
    
    @Override
    public Checkbox createCheckbox(){
        return new MacCheckbox();
    }

    @Override
    public Button createButton(){
        return new MacButton();
    }
}
