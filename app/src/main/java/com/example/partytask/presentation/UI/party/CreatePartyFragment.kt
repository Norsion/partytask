package com.example.partytask.presentation.UI.party

import android.app.DatePickerDialog
import android.os.Bundle
import android.text.Editable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.DatePicker
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.create_party_fragment.*
import java.util.*
import android.widget.EditText
import android.widget.TextView
import com.example.partytask.R
import kotlinx.android.synthetic.main.activity_start.*
import java.text.SimpleDateFormat
import java.time.Month


class CreatePartyFragment: Fragment(){

    private var editTextDate: EditText? = null

    var cal = Calendar.getInstance()
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        editTextDate = this.add_date_edit_text
        editTextDate!!.setOnClickListener {
             var datePickerDialog = DatePickerDialog(
                 context!!, DatePickerDialog.OnDateSetListener{ view, year, month, day -> editTextDate!!.setText(day.toString()
                         + "-" +
                         (month + 1).toString()
                         + "-" +
                         year.toString())
                     cal.set(year, month, day)
             },
                 cal.get(Calendar.YEAR),
                 cal.get(Calendar.MONTH),
                 cal.get(Calendar.DAY_OF_MONTH)
             )
            datePickerDialog.show()
        }

        return inflater.inflate(R.layout.create_party_fragment,container,false)

    }


}

