package com.example.myapplication

class Order4 {

    fun mealOperation() {
        println("식사류 세부 메뉴를 선택해 주세요.")
        println("[1]김치찌개 ₩6,000원")
        println("[2]참치찌개 ₩6,000원")
        println("[3]된장찌개 ₩6,000원")
        println("[4]순두부찌개 ₩6,000원")
        println("[5]돈까스 ₩7,000원")
        println("[6]오무라이스 ₩7,000원")
        println("[7]김치볶음밥 ₩7,000원")
        println("[8]돌솥비빔밥 ₩8,000원")
        println("[9]육개장 ₩8,000원")
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
            println("| 김치찌개 ₩6,000원 |")
            println("  ")
            println("  ")
            order.menuOperation()
        } else if(select == 2) {
            println("- 주문내역 -")
            println("| 참치찌개 ₩6,000원 |")
            println("  ")
            println("  ")
            order.menuOperation()
        } else if(select == 3) {
            println("- 주문내역 -")
            println("| 된장찌개 ₩6,000원 |")
            println("  ")
            println("  ")
            order.menuOperation()
        } else if(select == 4) {
            println("- 주문내역 -")
            println("| 순두부찌개 ₩6,000원 |")
            println("  ")
            println("  ")
            order.menuOperation()
        } else if(select == 5) {
            println("- 주문내역 -")
            println("| 돈까스 ₩7,000원 |")
            println("  ")
            println("  ")
            order.menuOperation()
        } else if(select == 6) {
            println("- 주문내역 -")
            println("| 오무라이스 ₩7,000원 |")
            println("  ")
            println("  ")
            order.menuOperation()
        } else if(select == 7) {
            println("- 주문내역 -")
            println("| 김치볶음밥 ₩7,000원 |")
            println("  ")
            println("  ")
            order.menuOperation()
        } else if(select == 8) {
            println("- 주문내역 -")
            println("| 돌솥비빔밥 ₩8,000원 |")
            println("  ")
            println("  ")
            order.menuOperation()
        } else if(select == 9) {
            println("- 주문내역 -")
            println("| 육개장 ₩8,000원 |")
            println("  ")
            println("  ")
            order.menuOperation()
        } else if(select == 0) {
            order.menuOperation()
        } else {
            println("잘못 입력하셨습니다.")
            println("  ")
            order4.mealOperation()
        }
        } catch(e:java.lang.NumberFormatException) {
            println("잘못 입력하셨습니다.")
            println("  ")
            order4.mealOperation()
        }
    }
}