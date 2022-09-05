import java.util.*;

class Account {
    private int account_no;
    private int balance;

    public int getAccount_no() {
        return account_no;
    }

    public void setAccount_no(int account_no) {
        this.account_no = account_no;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

}

class Savings extends Account {
    private int Interest;

    public int getInterest() {
        return Interest;
    }

    public void setInterest(int interest) {
        Interest = interest;
    }

    void Deposit(int d) {
        int temp = getBalance();
        temp += d;
        setBalance(temp);
        System.out.println("Money deposited Successfully");
    }

    void Withdraw(int w) {
        int temp = getBalance();
        temp -= w;
        setBalance(temp);
        System.out.println("Money withdrawn succesfully");
    }
}

class Current extends Account {
    private int overdraftlimit;

    public int getOverdraftlimit() {
        return overdraftlimit;
    }

    public void setOverdraftlimit(int overdraftlimit) {
        this.overdraftlimit = overdraftlimit;
    }

    void deposit(int d) {
        int temp = getBalance();
        temp += d;
        setBalance(temp);
        System.out.println("Money deposited Successfully");
    }

    void withdraw(int w) {
        if (w > overdraftlimit) {
            System.out.println("Invalid amount entered");
        } else {
            int temp = getBalance();
            temp -= w;
            setBalance(temp);
            System.out.println("Money withdrawn succesfully");
        }

    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Savings s1 = new Savings();
        Current c1 = new Current();
        System.out.println("Enter your account number :");
        s1.setAccount_no(sc.nextInt());
        System.out.println("Enter your balance :");
        s1.setBalance(sc.nextInt());
        System.out.println("Enter money to deposit :");
        s1.Deposit(sc.nextInt());
        System.out.println("Your current Balance is :"+s1.getBalance());
        sc.close();

    }
}