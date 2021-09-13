class Bank0 {
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
	

class Bank1 {
    public static void main(String[] args) {
        Bank0 myAccount = new Bank0();

        myAccount.deposit(1000);
        myAccount.checkBalance();
        myAccount.withdraw(500);
        myAccount.checkBalance();
    }
}