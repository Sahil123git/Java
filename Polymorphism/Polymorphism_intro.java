class Bank {
    String name;
    double branchBalance;

    Bank() {
        System.out.println("Bank constructor called");
    }

    void showBalance() {
        System.out.println("Branch balance is : " + branchBalance);
    }

    static void methStatBank() {
        System.out.println("static method of Bank");
    }

}

class SBI extends Bank {
    SBI() {

    }

    void showDetails() {
        System.out.println("SHOW showDetails method of SBI");
    }

    static void methStatSBIBank() {
        System.out.println("static method of SBIBank");
    }
}

public class Polymorphism_intro

{
    public static void main(String[] args) {

        Bank b1;
        b1 = new Bank();
        SBI sb1 = new SBI();

        b1.showBalance();
        Bank.methStatBank();
        b1.methStatBank();

        sb1.showDetails();
        sb1.methStatSBIBank();
        SBI.methStatSBIBank();

    }

}