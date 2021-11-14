package com.example.quizapp.viewModel

import androidx.lifecycle.ViewModel
import com.example.quizapp.model.Question
import com.example.quizapp.model.questions
import com.example.quizapp.model.numberOfCorrectAnswer

class MainViewModel : ViewModel() {
    var currentPosition: Int = 0
    private var  userName:String = ""
    var points:Int = 0
    fun pointInProfile() : Int
    {
        if(points < numberOfCorrectAnswer)
            points = numberOfCorrectAnswer
        return points
    }
    fun setName(name :String)
    {
        userName = name
    }
    fun getName() :String
    {
        return userName
    }
    fun addQuestion(question: Question)
    {
        questions.add(question)
    }
    fun getQuestion() : Question
    {
        return questions[currentPosition]
    }
}