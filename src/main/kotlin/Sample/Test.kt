package Sample

import SealedClass.PageLoading
import SealedClass.PageLoadingAbstract

// class Testing : PageLoading() // This will not work
                    //bcoz Sealed Class PageLoading is not in same package

class Testing_ : PageLoadingAbstract(){
    override fun onSuccess(a: String) {
        TODO("Not yet implemented")
    }

}