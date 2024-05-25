package bank

fun main(){
    val denisBankAccount = BankAccount("denis",300.32)
    denisBankAccount.deposit(500.3)
    denisBankAccount.withdraw(4000.0)
    denisBankAccount.showTransactionHistory()

}