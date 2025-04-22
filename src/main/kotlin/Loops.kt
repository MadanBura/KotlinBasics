fun main() {

    //For-in
    for (i in 1..10) {
        println("i = $i")
    }

    //for-in-untill  (it exclude last number i.e;10)
    for (i in 1 until 10) {
        println("i = $i")
    }

    //for-in downTo (Starting from 10 to 1)
    for (i in 10 downTo 1) {
        print(" >> $i" + " ")
    }
    println()

    //for-in untill-step (Starting from 1 upto 10 but increase by 2)
    for (i in 1 until 10 step 2) {
        print(" >> $i" + " ")
    }
    println()

    //While Loops
    var flag = 0;
    while (flag < 10) {
        print("$flag >> " + " ")
        flag++;
    }
    //do-While  do executes atleast once
    println()

    //Continue and Break
    var mark = 0
    while (mark < 10) {
        mark++
//        if(mark == 7){
//            continue
//        }
        if (mark in 3..7) {
            continue
        }

        print("$mark >> " + " ")

    }


}

