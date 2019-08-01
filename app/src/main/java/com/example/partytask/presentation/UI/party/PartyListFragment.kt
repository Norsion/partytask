package com.example.partytask.presentation.UI.party

import android.os.Bundle
import android.view.*
import android.widget.Toolbar
import androidx.fragment.app.Fragment
import com.example.partytask.R
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_list_party.*
import androidx.appcompat.app.AppCompatActivity



class PartyListFragment : Fragment() {
    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when(item?.itemId){
                R.id.new_party ->{
                    activity?.supportFragmentManager?.beginTransaction()
                            ?.replace(R.id.main_container, CreatePartyFragment())
                            ?.addToBackStack(null)
                            ?.commit()
                }
        }
        return super.onOptionsItemSelected(item)
    }


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        setHasOptionsMenu(true)
        return inflater.inflate(R.layout.fragment_list_party, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        (activity as AppCompatActivity).setSupportActionBar(toolbar_list)

    }

    override fun onCreateOptionsMenu(menu: Menu?, inflater: MenuInflater?) {
        inflater?.inflate(R.menu.menu_main, menu)
        super.onCreateOptionsMenu(menu, inflater)
    }

}
