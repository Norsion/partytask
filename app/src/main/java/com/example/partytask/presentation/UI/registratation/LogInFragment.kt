package com.example.partytask.presentation.UI.registratation

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.partytask.R
import com.example.partytask.presentation.UI.party.MainActivity
import kotlinx.android.synthetic.main.fragment_log_in.*
import kotlinx.android.synthetic.main.fragment_log_in.button_get_code

class LogInFragment:Fragment(){
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_log_in,container,false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        log_in_toolbar.setNavigationOnClickListener {
            activity?.onBackPressed()
        }
        button_get_code.setOnClickListener {
            var intent = Intent(context, MainActivity::class.java)
            startActivity(intent)
            /*activity?.supportFragmentManager
                ?.beginTransaction()
                ?.replace(R.id.container, GetCodeFragment())
                ?.addToBackStack(null)
                ?.commit()*/
        }
    }
}