package com.example.ciceron.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.ciceron.R
import com.example.ciceron.screenNavigator
import kotlinx.android.synthetic.main.fragment_gratitude.*

class GratitudeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_gratitude, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btnGoToMainAgain.setOnClickListener {
            screenNavigator.navigateToMain()
        }
    }

}