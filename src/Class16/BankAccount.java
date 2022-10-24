package Class16;

public class BankAccount {

    private String username;
    private String password;
    int accountNumber;                 //not private because can be share with others for funds
    public String bankName;           // bank is public to anyone no reason to make it private

    public void printBankName(){

    }
    void printUserName(){
        System.out.println(username);
    }
    void printAccountNumber(){
        System.out.println(accountNumber);
    }
}
