package com.example.myapplication

import kotlin.system.exitProcess

class Order {
    fun menuOperation() {
        val order = Order()
        val order2 = Order2()
        val order3 = Order3()
        val order4 = Order4()
        val order5 = Order5()


        println("어서오세요! '김밥천국'입니다.")
        println("메뉴를 선택해 주세요.")
        println("[1]김밥류, [2]분식류, [3]식사류, [4]음료, [0]종료")
        try {
            val select = readLine()!!.toInt()



            if (select == 1) {
                order2.gimbapOperation()
            } else if (select == 2) {
                order3.snackOperation()
            } else if (select == 3) {
                order4.mealOperation()
            } else if (select == 4) {
                order5.drinkOperation()
            } else if (select == 0) {
                System.exit(0)
            } else {
                println("잘못 입력하셨습니다.")
                println("  ")
                order.menuOperation()

            }
        } catch(e:java.lang.NumberFormatException) {
            println("잘못 입력하셨습니다.")
            println("  ")
            order.menuOperation()
        }
    }
}