package com.example.quizapp

object Constants {

    const val USER_NAME: String="user_name"
    const val TOTAL_QUESTIONS: String="total_questions"
    const val CORRECT_ANSWERS: String="correct_answers"


    fun getQuestion():ArrayList<Question>{
        val questionList=ArrayList<Question>()

        // 1
        val ques1=Question(
            1, "Which country does this flag belong to?", R.drawable.ic_flag_of_argentina,
            "Australia", "Argentina", "Austria", "Armenia",
            2
        )
        questionList.add(ques1)

        // 2
        val ques2=Question(
            2, "Which country does this flag belong to?", R.drawable.ic_flag_of_australia,
            "Austria", "Australia", "New Zealand", "USA",
            2
        )
        questionList.add(ques2)

        // 3
        val ques3=Question(
            3, "Which country does this flag belong to?", R.drawable.ic_flag_of_belgium,
            "Sudan", "Germany", "Greece", "Belgium",
            4
        )
        questionList.add(ques3)

        // 4
        val ques4=Question(
            4, "Which country does this flag belong to?", R.drawable.ic_flag_of_brazil,
            "Brazil", "South Africa", "Chile", "None of these",
            1
        )
        questionList.add(ques4)

        // 5
        val ques5=Question(
            5, "Which country does this flag belong to?", R.drawable.ic_flag_of_denmark,
            "Sweden", "Switzerland", "Denmark", "Hungary",
            3
        )
        questionList.add(ques5)

        // 6
        val ques6=Question(
            6, "Which country does this flag belong to?", R.drawable.ic_flag_of_fiji,
            "Fiji", "Indonesia", "Myanmar", "Finland",
            1
        )
        questionList.add(ques6)

        // 7
        val ques7=Question(
            7, "Which country does this flag belong to?", R.drawable.ic_flag_of_germany,
            "Greece", "Georgia", "France", "Germany",
            4
        )
        questionList.add(ques7)

        // 8
        val ques8=Question(
            8, "Which country does this flag belong to?", R.drawable.ic_flag_of_india,
            "India", "Ireland", "Hungary", "Iran",
            1
        )
        questionList.add(ques8)

        // 9
        val ques9=Question(
            9, "Which country does this flag belong to?", R.drawable.ic_flag_of_kuwait,
            "Jordan", "Sudan", "Palestine", "Kuwait",
            4
        )
        questionList.add(ques9)

        // 10
        val ques10=Question(
            10, "Which country does this flag belong to?", R.drawable.ic_flag_of_new_zealand,
            "Australia", "New Zealand", "Tuvalu", "USA",
            2
        )
        questionList.add(ques10)

        return questionList
    }
}