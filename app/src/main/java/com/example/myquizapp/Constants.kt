package com.example.myquizapp

object Constants {
    const val USER_NAME : String = "user_name"
    const val TOTAL_QUESTIONS : String = "total_questions"
    const val CORRECT_ANSWERS : String = "correct_answers"


    fun getQuestions():ArrayList<Question>{
            val questionsList = ArrayList<Question>()
        val que1 = Question(
            1,"What country Does this flag belongs to ?",
            R.drawable.ic_flag_of_argentina,
            "Argentina",
            "Australia",
            "Armenia",
            "Austria",
            1
        )
        questionsList.add(que1)

        val que2 = Question(
            1,"What country Does this flag belongs to ?",
            R.drawable.ic_flag_of_australia,
            "UK",
            "Australia",
            "Denmark",
            "Russia",
            2
        )
        questionsList.add(que2)

        val que3 = Question(
            1,"What country Does this flag belongs to ?",
            R.drawable.ic_flag_of_india,
            "Ireland",
            "Afghanistan",
            "India",
            "Malaysia",
            3
        )
        questionsList.add(que3)

        val que4 = Question(
            1,"What country Does this flag belongs to ?",
            R.drawable.ic_flag_of_belgium,
            "Belgium",
            "Scotland",
            "Ghana",
            "Sri Lanka",
            1
        )
        questionsList.add(que4)

        val que5 = Question(
            1,"What country Does this flag belongs to ?",
            R.drawable.ic_flag_of_brazil,
            "West Indies",
            "Brazil",
            "Ukraine",
            "Austria",
            2
        )
        questionsList.add(que5)

        val que6 = Question(
            1,"What country Does this flag belongs to ?",
            R.drawable.ic_flag_of_germany,
            "France",
            "North Korea",
            "Spain",
            "Germany",
            4
        )
        questionsList.add(que6)

        val que7 = Question(
            1,"What country Does this flag belongs to ?",
            R.drawable.ic_flag_of_denmark,
            "Netherlands",
            "Denmark",
            "Bangladesh",
            "Uruguay",
            2
        )
        questionsList.add(que7)

        val que8 = Question(
            1,"What country Does this flag belongs to ?",
            R.drawable.ic_flag_of_new_zealand,
            "UAE",
            "Portugal",
            "South Africa",
            "NewZealand",
            4
        )
        questionsList.add(que8)

        val que9 = Question(
            1,"What country Does this flag belongs to ?",
            R.drawable.ic_flag_of_kuwait,
            "Kuwait",
            "Pakistan",
            "Israel",
            "Mexico",
            1
        )
        questionsList.add(que9)

        val que10 = Question(
            1,"What country Does this flag belongs to ?",
            R.drawable.ic_flag_of_fiji,
            "Japan",
            "Australia",
            "Fiji",
            "Turkey",
            3
        )
        questionsList.add(que10)

        return questionsList
    }
}