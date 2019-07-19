package ChapterFive;

public class AutoPolicy {

    private int accountNumber;
    private String makeAndModel;
    private String state;

    public AutoPolicy( int accountNumber , String makeAndModel , String state){

        this.accountNumber = accountNumber;
        this.makeAndModel = makeAndModel;
        this.state = state;
    }

    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }
    public int getAccountNumber(){
        return accountNumber;
    }
    public void setMakeAndModel(String makeAndModel){
        this.makeAndModel = makeAndModel;
    }
    public String getMakeAndModel(){
        return makeAndModel;
    }
    public void setState(String state){

        if(state == "MA" || state == "NJ" || state == "NY" || state == "PA" || state == "CI" || state == "ME" || state == "NH" || state == "VI") {
            this.state = state;
        } else {
            System.out.println("your state is not found");
        }
    }
    public String getState(){
        return  state;
    }
    public boolean isNofaultState(){
        boolean noFaultState;
        switch (getState())
        {
            case "MA" : case "NJ" : case "NY" : case "PA" : case "CT" : case "ME" : case "NH" : case "VT" :
                noFaultState = true;
                break;
                default:
                    noFaultState = false;
                    break;
        }
        return noFaultState;
    }
}
