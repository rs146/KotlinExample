package example.com.kotlinexample

import org.junit.Test

import org.junit.Assert.*

class SealedClassTest {

    fun eval(expr: Expr) : Double = when(expr) {
        is Const -> expr.number
        is Sum -> eval(expr.e1) + eval(expr.e2)
        NotANumber -> Double.NaN
    }

    @Test
    fun testExpr() {
        val const = Const(12.9)
        assertEquals(12.9, eval(const), 0.0)
    }

    @Test
    fun testExprSum() {
        val const = Const(12.9)
        val const2 = Const(1.1)
        val sum = Sum(const, const2)
        assertEquals(14.0, eval(sum), 0.0)
    }

    @Test
    fun testNan() {
        val nan = NotANumber
        assertEquals(Double.NaN, eval(nan), 0.0)
    }
}