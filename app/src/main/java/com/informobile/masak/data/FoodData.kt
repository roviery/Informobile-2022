package com.informobile.masak.data

import com.informobile.masak.R

object FoodData {

    private val foodNames = arrayOf(
        "Bihun Goreng",
        "Arem Arem Mie Isi Daging",
        "Guava Freakshake",
        "Kue Pukis Green Tea",
        "Chocolate Mousse a la Restoran"
    )

    private val foodDesc = arrayOf(
        "Penggemar segala menu tumisan saat malam tiba pastinya tidak boleh ketinggalan masakan yang namanya bihun goreng. Inilah sahabat orang Indonesia ketika ingin makan praktis. Dengan sedikit twist, bihun goreng jadi pilihan yang lebih istimewa karena kehadiran jamur.",
        "Setiap Ramadan pastinya ada satu menu takjil yang biasanya dinanti-nanti. Di antara sekian menu gorengan, biasanya terselip yang namanya arem arem atau lontong yang biasanya diisikan daging, sayuran, serta cabai rawit. Kalau biasanya lontong dibuat dari nasi putih, kali ini kita punya arem arem mie yang khas dan tak kalah lezatnya.",
        "Menikmati Buavita Guava adalah cara mudah bagi kita untuk memenuhi kebutuhan vitamin C harian. Karena keseharian kita di rumah, waktunya untuk mencoba berkreasi dengan resep Guava Freakshake yang satu ini.",
        "Kue pukis adalah salah satu jenis kue yang biasanya dijajakan di sekitar pasar tradisional. Dimasak secara dadakan, pukis paling enak kalau disantap saat masih hangat. Adonan kue manis ini mirip sekali dengan pancake atau dorayaki khas Jepang. Bedanya adalah pukis menggunakan santan sebagai cairannya dengan ragi untuk membuat adonannya mengembang dan berpori.",
        "Sebagai menu penutup saat bertandang ke restoran atau prasmanan hotel, chocolate mousse adalah salah satu yang jadi favorit banyak orang. Bisa dibilang popularitasnya mungkin hanya kalah tipis dari suguhan es krim atau sorbet, serta cukup bersaing dengan aneka pastry dan banyak kue lainnya. Meskipun tampilannya sederhana, mousse sebetulnya menyimpan banyak cerita di balik rasanya yang lezat dan teksturnya yang khas."
    )

    private val foodImages = intArrayOf(
        R.drawable.bihun_goreng,
        R.drawable.arem_arem_mie_isi_daging,
        R.drawable.guava_freakshake,
        R.drawable.kue_pukis,
        R.drawable.chocolate_mousse
    )

    val listData: ArrayList<Food>
        get() {
            val list = arrayListOf<Food>()
            for (position in foodNames.indices) {
                val food = Food()
                food.name = foodNames[position]
                food.desc = foodDesc[position]
                food.image = foodImages[position]
                list.add(food)
            }
            return list
        }
}