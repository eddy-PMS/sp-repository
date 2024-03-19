package com.example.myapplication

class Order3 {

    fun snackOperation() {
        println("분식류 세부 메뉴를 선택해 주세요.")
        println("[1]라면 ₩4,000원 ")
        println("[2]떡라면 ₩4,500원 ")
        println("[3]치즈라면 ₩4,500원 ")
        println("[4]짬뽕라면 ₩5,000원 ")
        println("[5]떡볶이 ₩3,500원")
        println("[6]라볶이 ₩4,000원")
        println("[7]오뎅탕 ₩4,000원")
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
            println("| 라면 ₩4,000원 |")
            println("  ")
            println("  ")
            order.menuOperation()
        } else if(select == 2) {
            println("- 주문내역 -")
            println("| 떡라면 ₩4,500원 |")
            println("  ")
            println("  ")
            order.menuOperation()
        } else if(select == 3) {
            println("- 주문내역 -")
            println("| 치즈라면 ₩4,500원 |")
            println("  ")
            println("  ")
            order.menuOperation()
        } else if(select == 4) {
            println("- 주문내역 -")
            println("| 짬뽕라면 ₩5,000원 |")
            println("  ")
            println("  ")
            order.menuOperation()
        } else if(select == 5) {
            println("- 주문내역 -")
            println("| 떡볶이 ₩3,500원 |")
            println("  ")
            println("  ")
            order.menuOperation()
        } else if(select == 6) {
            println("- 주문내역 -")
            println("| 라볶이 ₩4,000원 |")
            println("  ")
            println("  ")
            order.menuOperation()
        } else if(select == 7) {
                println("- 주문내역 -")
                println("| 오뎅탕 ₩4,000원 |")
                println("  ")
                println("  ")
                order.menuOperation()
        } else if(select == 0) {
            order.menuOperation()
        } else {
            println("잘못 입력하셨습니다.")
            println("  ")
            order3.snackOperation()
        }
    } catch(e:java.lang.NumberFormatException) {
        println("잘못 입력하셨습니다.")
        println("  ")
        order3.snackOperation()
    }
    }
}