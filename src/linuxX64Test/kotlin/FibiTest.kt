import kotlin.test.Test
import kotlin.test.assertEquals

class FibiTest {
    @Test
    fun `test 3rd element`(){
       assertEquals(8, fibi.take(3).last())
    }
}
