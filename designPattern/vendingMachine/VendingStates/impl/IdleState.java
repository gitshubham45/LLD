package VendingStates.impl;

public class IdleState<Coin> implements States {

    public IdleState(){
        System.out.println("Currently, Vending Machine is in Idle state");
    }

    public IdleState(VendingMachine machine){
        System.out.println("Currently Vending machine is in Idle state");
        machine.setCoinList(new ArrayList<>());
    }

    public countCoin(Coin coin){
        System.out.println("Coin coin");
    }
    
    @Override
    public void clickOnInsertCoinButton(VendingMachine machine) throws Exception{

    }
}
