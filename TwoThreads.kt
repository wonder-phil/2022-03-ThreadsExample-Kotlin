
fun main() {
    
    var a: Int = 10
    var b: Int = -9
    
    fun my_method() {
        a = a+5;
		b = b+5;
    }
    
    class SimpleThread: Thread() {
    public override fun run() {
        	println("${Thread.currentThread()} has run.")
            println("${Thread.currentThread().getId()}")
        	my_method()
    	}
	}
    
    val t1 = SimpleThread()
    val t2 = SimpleThread()
    
    t1.start()
    t2.start()
    
    print("1, a: " + a.toString() + "\n")
    print("1, b: " + b.toString() + "\n")
    
    t1.join()
    t2.join()
    
    print("2 a: " + a.toString() + "\n")
    print("2 b: " + b.toString() + "\n")
    
}
