class Bank000 {
    String myAccNumber; // 계좌번호
    int balance = 0;          // 예금 잔액

    // 생성자
    public Bank000(String myAccNo, int bal) {
    	myAccNumber = myAccNo;
    	balance = bal;
    }
    
    public int deposit(int amount) {
        balance += amount;
        return balance;
    }    

    public int withdraw(int amount) {
        balance -= amount;
        return balance;
    }

    public int checkBalance() {
        System.out.println("계좌번호 : " + myAccNumber);
        System.out.println("잔고 : " + balance);
        return balance;
    }
}
	

class Bank3 {
    public static void main(String[] args) {
        Bank000 myAccount = new Bank000("010-1234-1004", 1000);

        myAccount.deposit(1000);
        myAccount.withdraw(500);

        check(myAccount); //참조 변수를 매개변수로
    }

    public static void check(Bank000 myAcc) {
        myAcc.checkBalance();
    }
}