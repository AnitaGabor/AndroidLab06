package com.example.quizapp.model

data class Question(val text: String, val answers: MutableList<String>, val correctAnswer: String ) {


}

var numberOfCorrectAnswer = 0

val questions: MutableList<Question> = mutableListOf(
    Question(
        text = "What does the keyword \"val\" mean?",
        answers = mutableListOf("read-only", "mutable", "singleton", "doesn't exist"),
        correctAnswer = "read-only"
    ),
    Question(
        text = "What the next term creates: 10 to \"apple\"",
        answers = mutableListOf("ERROR", "Int,String", "pair<Int,String>", "10 .. \"apple\""),
        correctAnswer = "pair<Int,String>"
    ),
    Question(
        text = "How long will the interval go from: 1 until 10",
        answers = mutableListOf("1", "9", "10", "8"),
        correctAnswer = "9"
    ),
    Question(
        text = "Is it possible to modify an object stored in val?",
        answers = mutableListOf("maybe", "no", "yes", "kotlin has no objects"),
        correctAnswer = "yes"
    ),
    Question(
        text = "Which type does length variable below have: val length = string?.length?",
        answers = mutableListOf("Double?", "String?", "Unit?", "Int?"),
        correctAnswer = "Int?"
    ),
    Question(
        text = "What will be printed for{ch in \"abc\") { print(ch+1) }",
        answers = mutableListOf("bcd", "bc", "ERROR", "b"),
        correctAnswer = "bcd"
    ),
    Question(
        text = "What does the keyword \"object\" mean?",
        answers = mutableListOf("enum", "simple class", "singleton", "abstract class"),
        correctAnswer = "singleton"
    ),
    Question(
        text = "What is the term \"init\" in a constructor?",
        answers = mutableListOf("static members are set up here", "constructor body, initialization", "the constructor is private", "does not belong to the constructor"),
        correctAnswer = "constructor body, initialization"
    ),
    Question(
        text = "What is the difference between listOf() and mutableListOf() functions?",
        answers = mutableListOf("kotlin has only mutableListOf() function", "kotlin has only listOf() function", "listOf() create an immutable list and other create a mutable", "there is no difference"),
        correctAnswer = "listOf() create an immutable list and other create a mutable"
    ),
    Question(
        text = "What does the associateBy() function do?",
        answers = mutableListOf("group by a field but duplicates are removed", "group by a field", "merge two lists by a criterion", "doesn't exist"),
        correctAnswer = "group by a field but duplicates are removed"
    ),

    Question(
        text = "What is the activity?",
        answers = mutableListOf("screen", "class", "type", "screen piece"),
        correctAnswer = "screen"
    ),
    Question(
        text = "What is the fragment?",
        answers = mutableListOf("screen", "doesn't exist", "class", "screen piece"),
        correctAnswer = "screen piece"
    ),
    Question(
        text = "Where can be found the UI elements?",
        answers = mutableListOf("java folder", "layout package", "drawable package", "values package"),
        correctAnswer = "layout package"
    ),
    Question(
        text = "What does do the Broadcast Receiver?",
        answers = mutableListOf("here is defined the manifest", "communication with service and activity", "none of the above", "communication with activities"),
        correctAnswer = "communication with service and activity"
    ),
    Question(
        text = "Activity lifecycle: ",
        answers = mutableListOf("created, started, resumed, paused, stopped, destroyed", "created, resumed, destroyed", "started, resumed, paused, destroyed", "created, started, paused, stopped, destroyed"),
        correctAnswer = "created, started, resumed, paused, stopped, destroyed"
    ),
    Question(
        text = "How to pass the data between activities in Android?",
        answers = mutableListOf("none of the above", "Broadcast Receiver", "content provider", "intent"),
        correctAnswer = "intent"
    ),
    Question(
        text = "What is sleep mode in android?",
        answers = mutableListOf("switched off", "only Radio interface layer and alarm are in active mode", "air plane mode", "none of the above"),
        correctAnswer = "only Radio interface layer and alarm are in active mode"
    ),
    Question(
        text = " What is a thread in android?",
        answers = mutableListOf("same as services", "background activity", "Broadcast Receiver", "independent dis-patchable unit is called a thread"),
        correctAnswer = "independent dis-patchable unit is called a thread"
    ),
    Question(
        text = "Android is based on which language",
        answers = mutableListOf("C++", "Python", "java", "C"),
        correctAnswer = "java"
    ),
    Question(
        text = "Which Android Studio file is most of the app coding done in?",
        answers = mutableListOf("MainActivity.kt", "activity_main.xml", "AndroidManifest.xml", "none of the above"),
        correctAnswer = "MainActivity.kt"
    )

    )
