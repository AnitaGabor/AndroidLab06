package com.example.quizapp.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController

import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.quizapp.DataAdapter

import com.example.quizapp.R
import com.example.quizapp.model.questions
import com.example.quizapp.viewModel.MainViewModel


class QuestionListFragment : Fragment() , DataAdapter.OnItemClickListener {
    private lateinit var viewModel: MainViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        val layout = inflater.inflate(R.layout.fragment_question_list, container, false)
        Log.d("List", "ListFragment - onCreateView")

        viewModel = ViewModelProvider(requireActivity()).get(MainViewModel::class.java)

        val adapter = DataAdapter(questions, this)
        val recycler_view: RecyclerView = layout.findViewById(R.id.recycler_view)
        recycler_view.adapter = adapter
        recycler_view.layoutManager = LinearLayoutManager(this.context)
        recycler_view.setHasFixedSize(true)

        return layout
    }

    override fun onItemClick(position: Int) {
        viewModel.currentPosition = position
        findNavController().navigate(R.id.action_listFragment_to_questionDetailFragment)
        Log.d("Adapter", "AdapterPosition: $position")
    }

}