fun main()
{
    val first  = Point(10,13);
    val second  = Point(5,8);
    val third = Point(10,13)
    println(first.toString())
    println(first.equals(second))
    println(first.equals(third))
    third.symmetryFromCentre()
    println(first.x.toString() + " " + first.y.toString())

}
class Point(x:Int,y:Int)
{
    public var x  : Int = 0;
    public var y  : Int = 0;
    init {
        this.x = x
        this.y = y
    }
    fun equals(point: Point): Boolean {
        if (this.x==point.x && this.y == point.y)
            return true
        return false
    }
    fun symmetryFromCentre() {
        this.x = -1*x;
        this.y = -1*y;
    }
    override fun toString(): String {
        return x.toString() + " " +  y.toString()
    }

}