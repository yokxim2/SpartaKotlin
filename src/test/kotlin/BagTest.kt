import com.sparta.Bag
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.shouldBe

class BagTest : BehaviorSpec({
    Given("a valid max weight") {
        val validMaxWeight = 10

        When("execute constructor with ") {
            val result = Bag(validMaxWeight)

            Then("max weight should be valid max weight") {
                result.maxWeight shouldBe validMaxWeight
            }
        }
    }

    Given("a max weight = 0") {
        val maxWeight = 0

        When("execute constructor") {
            val exception = shouldThrow<Exception> { Bag(maxWeight) }

            Then("exception message should be expected") {
                exception.message shouldBe "가방의 최대 무게가 잘못 설정되었습니다."
            }
        }
    }

    Given("a max weight is negative") {
        val maxWeight = -10

        When("execute constructor") {
            val exception = shouldThrow<Exception> { Bag(maxWeight) }

            Then("exception message should be expected") {
                exception.message shouldBe "가방의 최대 무게가 잘못 설정되었습니다."
            }
        }
    }
})
