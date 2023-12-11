public class Account {
    private float balance;

    public void deposit(float amount){
        this.balance += (amount>0 ? amount  : 0);
    }

    public void withdraw(float amount){
        this.balance -= (amount>0 ? amount :0);
    }

    public void setBalance(float balance){
        if (balance >0)
            this.balance = balance;
    }

    public float getBalance(){
        return balance;
    }
}
