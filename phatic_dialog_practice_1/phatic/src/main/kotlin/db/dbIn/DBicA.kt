package db.dbIn

import interchanges.A
import interchanges.Answerable

class DBicA {

    companion object {
        fun getInterchanges(): MutableList<A> {
            val interchanges = mutableListOf<A>()
            interchanges.add(
                A(
                    listOf(" слава україні "),
                    listOf("Героям слава!")
                )
            )

            interchanges.add(
                A(
                    listOf(" слава нації "),
                    listOf("Смерть ворогам!")
                )
            )

            interchanges.add(
                A(
                    listOf(" україна "),
                    listOf("Понад усе!")
                )
            )

            interchanges.add(
                A(
                    listOf(" слава зсу "),
                    listOf("Слава! Слава! Слава!")
                )
            )

            interchanges.add(
                A(
                    listOf(" ти "),
                    listOf("ну я")
                )
            )

            interchanges.add(
                A(
                    listOf(" я "),
                    listOf("ну ти")
                )
            )


            interchanges.add(
                A(
                    listOf(" бєлгород "),
                    listOf("БНР? Ну і шо, і шо?")
                )
            )

            interchanges.add(
                A(
                    listOf(
                        " привіт ", " добрий день ",
                        " доброго дня ", " здоров "
                    ),
                    listOf(
                        "Привіт.", "Добрий день.",
                        "Доброго дня!", "Здоровенькі були.",
                        "Доброго здоров’ячка!", "Вітаю."
                    )
                )
            )

            interchanges.add(
                A(
                    listOf(
                        " як настрій ", " як твої справи ",
                        " як сямаєш ", " як справи ", " як здоров'ячко "
                    ),
                    listOf(
                        "Та шо, потихеньку, як у тебе?",
                        "Сьогодні нормально, ти як?",
                        "Тіп-топ, боєць, як сам?",
                        " Золото, а не настрій, ти як? ",
                        " Життя цікаве і мотівація" +
                                " то є сильна, філософія," +
                                "психологія, саме головне - як у тебе справи? ",
                    )

                )
            )

            interchanges.add(
                A(
                    listOf(
                        " немає ", " нема ",
                    ),
                    listOf(
                        "Погано, коли нема",
                        "І шо будеш робити, коли нема?",
                        "Ну нема, то й не треба"
                    )

                )
            )

            interchanges.add(
                A(
                    listOf(
                        " файно знаєш ", " рухаємось вгору на щастя ",
                        " гаразд усе ", " чудно ", "добре",
                    ),
                    listOf(
                        "Бачу настрій у тебе дійсно гарний",
                        "Виспався напевно",
                        "Ну, так, я в тобі сумнівів ніколи не мав"
                    )
                )
            )

            interchanges.add(
                A(
                    listOf(" будєм всіх бомбіть "),
                    listOf(" Так на чому ж будем?" +
                                " Пропонуй літак ")
                )
            )

            interchanges.add(
                A(
                    listOf(" важкий багатоцільовий високоманевровий "),
                    listOf(" всепогодний винущувач четвертого покоління ")
                )
            )

            interchanges.add(
                A(
                    listOf(
                        " мєрзкий настрій ", " погано ",
                        " так собі ", " половинка на половинку ",
                        " все жахливо ", " відверто настрій не дуже ",
                        " eх ні пером описати ні словом сказати "
                    ),
                    listOf(
                        " Ну, розкажи трохи, що се в тебе там сталося" +
                                ", а потім поговорим про винущувачі ",
                        " Чув \"Диявол\" Паліндрома, ти заціни" +
                                ", настрій підніметься гарантую ",
                        " Що трапилось, кому морду бити? "
                    )
                )
            )

            return interchanges
        }
    }
}