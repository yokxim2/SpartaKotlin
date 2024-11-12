package com.sparta

class Enemy (
    val name: String,
) {
    var attackPoint: Int = 10
    var healthPoint: Int = 100

    fun takeAttack(damage: Int) {
        println("공격 받았다!")
        healthPoint -= 10
    }
}