class Bank {
    static int balance = 0;     // 예금 잔액

    public static void main(String[] args) {
        deposit(1000);
        checkBalance();
        
        withdraw(500);
        checkBalance(); 
    }

    public static int deposit(int amount) {
        balance += amount;
        return balance;
    }    

    public static int withdraw(int amount) {
        balance -= amount;
        return balance;
    }

    public static int checkBalance() {
        System.out.println("잔고 : " + balance);
        return balance;
    }

}
	