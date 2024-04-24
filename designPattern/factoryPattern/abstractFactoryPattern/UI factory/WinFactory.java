public class WinFactory  implements Factory{
    
    @Override
    public Checkbox createCheckbox(){
        return new WinCheckbox();
    }

    @Override
    public Button createButton(){
        return new WinButton();
    }
}
