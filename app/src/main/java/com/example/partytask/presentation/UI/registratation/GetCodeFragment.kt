package com.example.partytask.presentation.UI.registratation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.partytask.R
import kotlinx.android.synthetic.main.fragment_log_in.*

class GetCodeFragment:Fragment(){
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_get_code,container,false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        log_in_toolbar.setNavigationOnClickListener {
            activity?.onBackPressed()
        }
    }
}