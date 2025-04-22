package OOP_Concepts

fun main() {

    var bankObj = BankExample("Madan")

    bankObj.deposite(5000)
    bankObj.deposite(3000)

    println("Your Balance is : "+ bankObj.findBalance())

    bankObj.withdrawn(500)
    bankObj.withdrawn(300)
    bankObj.withdrawn(500)

    println("Your Balance is : "+ bankObj.findBalance())



}

class BankExample(var accountName : String ){

    private var balance : Int = 0
    private var transaction = mutableListOf<Int>()

    fun deposite(amount : Int){
        if(amount>0){
            transaction.add(amount)
            this.balance += amount
            println("$amount is deposited, your current Balance is ${this.balance}")
        }else{
            println("Amount should be positive")
        }
    }

    fun withdrawn(withdrawal :Int){
        if (withdrawal > 0){
            transaction.add(-withdrawal)
            this.balance -= withdrawal
            println("$withdrawal is withdrawn, your current Balance is ${this.balance}")
        }else{
            println("Amount should be positive")
        }
    }

    fun findBalance() : Int{
        this.balance = 0;
        for(t in transaction){
            balance += t;
        }
        return balance;
    }

}


