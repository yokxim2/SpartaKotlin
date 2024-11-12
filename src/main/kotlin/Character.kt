package com.sparta

class Armor(
    val defensePoint: Int
) {
    fun getDefensedDamage(damage: Int): Int {
        return damage - defensePoint
    }
}

open class Character(
    val armor: Armor?
) {
    var attackPoint: Int = 10
    var healthPoint: Int = 100

    fun attack(target: Character) {
        println("공격했다!")
        target.attacked(attackPoint)
    }

    open fun attacked(damage: Int) {
        println("공격 받았다!")
        val filteredDamage = armor?.getDefensedDamage(damage) ?: damage
        healthPoint -= filteredDamage
    }
}

fun main() {
    val characterWithoutArmor = Character(null)
    val characterWithArmor = Character(Armor(3))

    characterWithoutArmor.attacked(10)
    println(characterWithoutArmor.healthPoint)

    characterWithArmor.attacked(10)
    println(characterWithArmor.healthPoint)

}