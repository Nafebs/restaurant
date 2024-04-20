package com.phttproduction.gettable

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.phttproduction.gettable.data.model.RestaurantModel


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        App.databaseRepository.deleteAll()
        addMockRestaurantsToDB()
        setContentView(R.layout.activity_main)
        window.decorView.setBackgroundColor(Color.BLACK)
    }

    private fun addMockRestaurantsToDB() {
        App.databaseRepository.insertRestaurants(
            rest1 = RestaurantModel(
                1,
                "Four",
                "a1",
                "Мира, 45б Four Elements Perm, Пермь 614022 Россия",
                "12:00–23:59",
                "Итальянская, Морепродукты, Средиземноморская, Европейская, Русская, Центральноевропейская, Международная"
            ),
            rest2 = RestaurantModel(
                2,
                "Ле Марш",
                "a2",
                "Газета Звезда ул., д. 27 (3 этаж) , Пермь 614000 Россия",
                "00:00–12:00",
                "Морепродукты, Европейская, Восточноевропейская, Французская, Средиземноморская"
            ),
            rest3 = RestaurantModel(
                3,
                "Наири",
                "a3",
                "Советская, 67, Пермь 614000 Россия",
                "09:00–00:00",
                "Бельгийская, Русская, Восточноевропейская, Европейская"
            ),
            rest4 = RestaurantModel(
                4,
                "La Bottega.VS",
                "a4",
                " ул. Советская, 62, Пермь 614000 Россия",
                "00:00–23:00",
                "Европейская, Итальянская, Средиземноморская"
            ),
            rest5 = RestaurantModel(
                5,
                "Old Moose",
                "a5",
                "Комсомольский Проспект, 14, Пермь 614000 Россия",
                "16:00–01:00",
                "Бар, Паб, Пивные рестораны"
            )
        )
    }
}