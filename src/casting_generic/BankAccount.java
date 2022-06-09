package casting_generic;

public class BankAccount {
    private int balance;

    public int getBalance(){
        return balance;
    }
    public void setBalance(int balance){
        this.balance = balance;
    }
    // 출금
    public boolean withdraw (int amount){
        if (balance >= amount){ //출금할려는 금액이 잔액보다 작아야하고 잔액이 출금액보다 더 커야한다.
            balance -= amount;
            return true;
        }
        return false;
    }
    // 입금
    public boolean deposit(int amount){
        balance += amount;
        return true;
    }
}
