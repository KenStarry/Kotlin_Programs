package codewars

object DoubleSort {
    fun dbSort(a:Array<Any>):Array<Any> {

        val nums = mutableListOf<Int>()
        val strs = mutableListOf<String>()

        a.forEach {
            if (it is Int) {
                nums.add(it)
            } else {
                strs.add(it.toString())
            }
        }

        val newArr = mutableListOf<Any>()

        newArr.addAll(nums.sorted())
        newArr.addAll(strs.sorted())

        return newArr.toTypedArray()
    }
}