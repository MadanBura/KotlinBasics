package Inline_CrossInline_Reified_Where


fun main() {

    println(sum(10, 9))

        /*

     public final class Inline_ExampleKt {
       public static final void main() {
          int var0 = sum(10, 9);
          System.out.println(var0);
       }

       while in this code while running main funtion compiler will create instance or reference for
       fun sum then it will print

       but while you use inline compiler will cut and paste the whole body of function
       like this
        public static final void main() {
      int var0 = 10;
      int b$iv = 9;
      int $i$f$sum = false;
      var0 += b$iv;
      System.out.println(var0);
   }
        Here no creation instance for function


    */


}

 inline fun sum(a: Int, b: Int) = a + b
//fun sum(a: Int, b: Int) = a + b
//public fun sum(
//    a: Int,
//    b: Int
//): Int