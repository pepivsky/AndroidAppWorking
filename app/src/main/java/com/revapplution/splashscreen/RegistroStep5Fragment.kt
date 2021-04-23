package com.revapplution.splashscreen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController


class RegistroStep5Fragment : Fragment() {
    lateinit var btnValidar5: Button



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_registro_step5, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btnValidar5 = view.findViewById(R.id.btnValidar5)
        btnValidar5.setOnClickListener {
            findNavController().navigate(R.id.action_registroStep5Fragment_to_registroExitosoActivity)
            (activity as RegistroActivity).incrementarProgress()
        }
    }


}