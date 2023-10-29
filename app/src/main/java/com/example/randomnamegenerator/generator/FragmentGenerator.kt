package com.example.randomnamegenerator.generator

import ViewModelGenerator
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.randomnamegenerator.R

class FragmentGenerator : Fragment(R.layout.fragment_generator) {

    private lateinit var viewModel: ViewModelGenerator

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       viewModel = ViewModelProvider(requireActivity()).get(ViewModelGenerator::class.java)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        screenBinding()
    }

    private fun screenBinding(){
        val view= view?:return
        val labelName = view.findViewById<TextView>(R.id.name)
        val male_button = view.findViewById<Button>(R.id.btn_male)
        val female_button = view.findViewById<Button>(R.id.btn_female)
        male_button.isClickable = true
        female_button.isClickable = true

        // Observar os dados do ViewModel
        viewModel.getData()

        handleMaleButton(male_button, labelName)
        handleFemaleButton(female_button, labelName)

    }

    private fun handleMaleButton(male_button: Button, labelName: TextView){

        male_button.setOnClickListener {
            var displayName = ""
            viewModel.getMaleName().observe(viewLifecycleOwner) { name ->
                displayName = name[0].uppercaseChar() + name.substring(1, name.length)
                labelName.text=displayName
            }

        }
    }

    private fun handleFemaleButton(female_button: Button, labelName: TextView){
        female_button.setOnClickListener{
            var displayName = ""
            viewModel.getFemaleName().observe(viewLifecycleOwner) { name ->
                displayName = name[0].uppercaseChar() + name.substring(1, name.length)
                labelName.text=displayName
            }
        }
    }

}