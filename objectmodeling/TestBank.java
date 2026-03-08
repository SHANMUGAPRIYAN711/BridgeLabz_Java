package BridgeLabz_Java.objectmodeling;

class Bank{
    String bankname;
    Bank(String bankname){
        this.bankname = bankname;
    }
    void openAccount(Customers c){
        System.out.println(c.name+" " + "Opened Account "+" " + bankname);
    }
}
class Customers{
    String name;
    double balance;
    Customers(String name, double balance){
        this.name = name;
        this.balance = balance;
    }
    void viewBalance(){
        System.out.println(name + " "+"Balance" + " "+ balance);
    }
}
public class TestBank{
    public static void main(String[] args) {
        Bank bank = new Bank("StateBank");
        Customers c1 = new Customers("Shanmugapriyan", 100000);
        bank.openAccount(c1);
        c1.viewBalance();
    }
}