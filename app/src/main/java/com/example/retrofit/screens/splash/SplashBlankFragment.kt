package com.example.retrofit.screens.splash

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.retrofit.R
import com.example.retrofit.screens.start.StartAdapter
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashBlankFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view = inflater.inflate(R.layout.fragment_splash_blank, container, false)
        CoroutineScope(Dispatchers.Main).launch {
            delay(1500)
            Navigation.findNavController(view)
                .navigate(R.id.action_splashBlankFragment_to_rootFragment)
        }
        return view
    }
}