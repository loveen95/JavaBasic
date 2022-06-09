package casting_generic;

import java.util.ArrayList;

public class BankDriver {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        MinimumBalanceAccount mba = new MinimumBalanceAccount();
        SavingAccount sa = new SavingAccount();

        ba.deposit(1000);
        mba.deposit(1000);
        sa.deposit(1000);

        ArrayList<BankAccount> accounts = new ArrayList<>();
        accounts.add(ba);
        accounts.add(mba);
        accounts.add(sa);
        for (BankAccount account : accounts){
            account.deposit(1000); // 각 계좌가 BankAccount타입으로 캐스팅 되고, 한꺼번에 묶어서 다룰수 있다
        // sa에만 이자를 붙여주고 싶은데 BankAccount클래스에는 addInterest 메소드가 없다.
        // SavingAccount만 골라서 addInterest메소드를 쓰고 싶으면 instanceof메소드를 사용한다.
            if (account instanceof SavingAccount){
                // instanceof는 어떤 인스턴스는 자식클래스의 인스턴스 인지 확인해볼수 있다.
                // SavingAccount 타입으로 형변환 가능한 경우 addInterest메소드를 호출할수 있다.
                ((SavingAccount)account).addInterest();
            }
        }

    }
}
