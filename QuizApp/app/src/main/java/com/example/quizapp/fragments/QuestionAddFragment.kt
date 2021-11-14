package com.example.quizapp.fragments

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.quizapp.R
import com.example.quizapp.model.Question
import com.example.quizapp.viewModel.MainViewModel


class QuestionAddFragment : Fragment() {
    private lateinit var viewModel: MainViewModel
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val layout = inflater.inflate(R.layout.fragment_question_add, container, false)

        viewModel = ViewModelProvider(requireActivity()).get(MainViewModel::class.java)

        val question: EditText = layout.findViewById(R.id.editTextTextQuestion)
        val textView1: EditText = layout.findViewById(R.id.editTextTextFirstAnswer)
        val textView2: EditText = layout.findViewById(R.id.editTextTextSecondAnswer)
        val textView3: EditText = layout.findViewById(R.id.editTextTextThirdAnswer)
        val textView4: EditText = layout.findViewById(R.id.editTextTextFourthAnswer)

        val button: Button = layout.findViewById(R.id.addQuestionButton)
        button.setOnClickListener{
            val answers = mutableListOf<String>()
            answers.add(textView1.text.toString())
            answers.add(textView2.text.toString())
            answers.add(textView3.text.toString())
            answers.add(textView4.text.toString())
            viewModel.addQuestion(Question(question.text.toString(), answers, textView1.text.toString()))
            findNavController().navigate(R.id.action_addFragment_to_listFragment)
        }
        return layout
    }



}