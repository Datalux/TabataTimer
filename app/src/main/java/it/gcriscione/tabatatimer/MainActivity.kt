package it.gcriscione.tabatatimer

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {

    companion object {
        lateinit var context: Context

        fun startFragment(fragment: Fragment){
            val fm = (context as AppCompatActivity).supportFragmentManager
            val ft = fm.beginTransaction()
            ft.replace(R.id.mainLayout, fragment, "").commit()

        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        context = this

        startFragment(FmTimerList.newInstance())


    }
}
