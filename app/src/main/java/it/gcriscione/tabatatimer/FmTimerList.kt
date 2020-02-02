package it.gcriscione.tabatatimer

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fm_timer_list.*

class FmTimerList : Fragment() {

    companion object {
        fun newInstance() : FmTimerList {
            return FmTimerList()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fm_timer_list, container, false)

        val toolbarTitle = view.findViewById(R.id.toolbarTitle) as TextView
        toolbarTitle.text = "Tabata Timer"

        return  view
    }


}