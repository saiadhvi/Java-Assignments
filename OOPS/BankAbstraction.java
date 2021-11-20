package OOPS;
 abstract class BankAbstraction
 {

    public abstract void denomination();

}

class CanaraBank extends BankAbstraction {

    CanaraBank() {

        System.out.println("Welcome to Canara Bank");
    }

    public void denomination() {

        System.out.println("Denomination of 100 is available");
    }

}

class SBI extends BankAbstraction {
    SBI() {
        System.out.println("Welcome to SBI Bank");
    }

    public void denomination() {
        System.out.println("Denomination of 500 is available");
    }
}

class HDFC extends BankAbstraction {

    HDFC()
    {
        System.out.println("Welcome to HDFC Bank");

    }
    public void denomination() {
        System.out.println("Denomination of 2000 is available");
    }
}

class ApplicationBank {
    public static void main(String[] args) {

        BankAbstraction object1 =new CanaraBank();
        object1.denomination();

        SBI object2 = new SBI();
        object2.denomination();

        HDFC object3 = new HDFC();
        object3.denomination();

    }
}
