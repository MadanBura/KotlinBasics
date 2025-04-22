package OOP_Concepts

//Inner classes -> are generally class defined inside another class
fun main() {

    val listViewObj = ListView(arrayOf("Dell", "Acer", "HP", "MacBOOK", "SAMSUNG"))

    listViewObj.ListViewItem().displayItems(2);


}
//Event Handling or Callbacks, Access to outer class members
class ListView(val items : Array<String> ){

    inner class ListViewItem(){


        fun displayItems(position : Int){
            println(items[position])
        }
    }

}