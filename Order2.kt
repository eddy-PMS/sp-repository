package com.example.myapplication

class Order2 {
    fun gimbapOperation() {
        println("김밥류 세부 메뉴를 선택해 주세요.")
        println("[1]원조김밥 ₩2,500원 ")
        println("[2]치즈김밥 ₩3,500원 ")
        println("[3]참치김밥 ₩4,000원 ")
        println("[4]고추김밥 ₩4,000원 ")
        println("[5]계란말이김밥 ₩4,500원")
        println("[0]전단계")

        val order = Order()
        val order2 = Order2()
        val order3 = Order3()
        val order4 = Order4()
        val order5 = Order5()

        try {

            val select = readLine()!!.toInt()


            if (select == 1) {
                println("- 주문내역 -")
                println("| 원조김밥 ₩2,500원 |")
                println("  ")
                println("  ")
                order.menuOperation()
            } else if (select == 2) {
                println("- 주문내역 -")
                println("| 치즈김밥 ₩3,500원 |")
                println("  ")
                println("  ")
                order.menuOperation()
            } else if (select == 3) {
                println("- 주문내역 -")
                println("| 참치김밥 ₩4,000원 |")
                println("  ")
                println("  ")
                order.menuOperation()
            } else if (select == 4) {
                println("- 주문내역 -")
                println("| 고추김밥 ₩4,000원 |")
                println("  ")
                println("  ")
                order.menuOperation()
            } else if (select == 5) {
                println("- 주문내역 -")
                println("| 계란말이김밥 ₩4,500원 |")
                println("  ")
                println("  ")
                order.menuOperation()
            } else if (select == 0) {
                order.menuOperation()
            } else {
                println("잘못 입력하셨습니다.")
                println("  ")
                order2.gimbapOperation()
            }

        } catch(e:java.lang.NumberFormatException) {
            println("잘못 입력하셨습니다.")
            println("  ")
            order2.gimbapOperation()
        }
    }

}