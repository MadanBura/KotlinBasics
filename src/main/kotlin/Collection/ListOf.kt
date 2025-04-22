package Collection

fun main(){

    var sample = listOf("Name1","Name2","Name3","Name4","Name5","Name6")

    //listOf ----> it is immuatable we can't add into it

    //sample.forEach { println(it) }

    //for (s in sample){ println(s)  }

    var sample1= mutableListOf("Name1","Name2","Name3","Name4","Name5","Name6")
    sample1.add("Name7")

    //sample1.forEach { println(it) }

    var human =Human("Madan","NYC",26)
    var human1 =Human("ABC","XXX",26)
    var human2 =Human("EFG","AAA",26)
    var human3 =Human("HIJ","ABB",26)
    var human4 =Human("KLM","CCC",26)

    var userList = mutableListOf<Human>(human,human1,human2,human3,human4)

    userList.forEach { println(it) }




}