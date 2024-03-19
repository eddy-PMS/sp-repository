package com.example.myapplication

class Order5 {

    fun drinkOperation() {
        println("음료 세부 메뉴를 선택해 주세요.")
        println("[1]콜라 ₩2,000원")
        println("[2]사이다 ₩2,000원")
        println("[0]전단계")


        val order = Order()
        val order2 = Order2()
        val order3 = Order3()
        val order4 = Order4()
        val order5 = Order5()

        try {


        val select = readLine()!!.toInt()


        if(select == 1) {
            println("- 주문내역 -")
            println("| 콜라 ₩2,000원 |")
            println("  ")
            println("  ")
            order.menuOperation()
        } else if(select == 2) {
            println("- 주문내역 -")
            println("| 사이다 ₩2,000원 |")
            println("  ")
            println("  ")
            order.menuOperation()
        } else if(select == 0) {
            order.menuOperation()
        } else {
            println("잘못 입력하셨습니다.")
            println("  ")
            order5.drinkOperation()
        }
        } catch(e:java.lang.NumberFormatException) {
            println("잘못 입력하셨습니다.")
            println("  ")
            order5.drinkOperation()
        }
    }
}