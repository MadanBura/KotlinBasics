package SealedClass


sealed class PageLoading{

    class Success(val success : String) : PageLoading()
    class Loading(val wait:String) : PageLoading()
    object error : PageLoading()

}



fun load(pageL : PageLoading){
    when(pageL){
        is PageLoading.Loading -> TODO()
        is SubClass -> TODO()
        is PageLoading.Success -> TODO()
        PageLoading.error -> TODO()
    }
}

abstract class PageLoadingAbstract{

    abstract fun onSuccess(a:String)

}