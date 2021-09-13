class Bank00 {
    int balance = 0;     // 예금 잔액

    public int deposit(int amount) {
        balance += amount;
        return balance;
    }    

    public int withdraw(int amount) {
        balance -= amount;
        return balance;
    }

    public int checkBalance() {
        System.out.println("잔고 : " + balance);
        return balance;
    }
}
	

class Bank2 {
    public static void main(String[] args) {
        Bank00 myAccount = new Bank00();

        myAccount.deposit(1000);
        myAccount.withdraw(500);

        check(myAccount); //참조 변수를 매개변수로
    }

    public static void check(Bank00 myAcc) {
        myAcc.checkBalance();
    }
}