package Exception

fun main() {
    val account = BankAccount()
    account.deposite(50)
    account.printBalance()    // Current balance: 150

    account.withdrawal(200)
}


class BankAccount(){

    private var balance : Int = 0

    fun deposite(amount: Int){
        require(amount>0) { "Deposit amount must be greater than zero" }
        balance += amount
    }

    fun withdrawal(amount: Int){
        require(amount>0) { "Deposit amount must be greater than zero" }
        check(balance>=amount) {"insufficient Fund"}
        balance -= amount
    }

    fun printBalance(){
        println("Final balance is $balance")
    }
}