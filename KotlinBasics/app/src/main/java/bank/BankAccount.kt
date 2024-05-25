package bank

class BankAccount(var accountHolder:String, var balance:Double) {
    private val transactionHistory= mutableListOf<String>()
    fun deposit(amount:Double){
        balance += amount
        transactionHistory.add("$accountHolder deposited $$amount")
    }
    fun withdraw(amount:Double){
        if(amount<=balance) {
            balance -= amount
            transactionHistory.add("$accountHolder withdrew $$amount")
        }else{
            println("amount to be withdrawn is greater than the balance of your account.\ncurrent balance is :$balance")
        }

    }
    fun showTransactionHistory(){
        println("showing transactions of $accountHolder")
        for (transaction in transactionHistory){
            println(transaction)
        }
        println("current balance is: $balance")

    }

}