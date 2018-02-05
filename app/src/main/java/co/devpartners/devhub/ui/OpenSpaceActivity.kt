package co.devpartners.devhub.ui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import co.devpartners.devhub.R
import co.devpartners.devhub.expandable.adapter.ListAdapter
import kotlinx.android.synthetic.main.activity_open_space.*


class OpenSpaceActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_open_space)

        val listHeader = listOf("Length Plan")
        val numbersList = listOf("Hourly", "Daily", "Weekly")

        val listChild = HashMap<String, List<String>>()
        listChild.put(listHeader[0],numbersList)

        val expandableListAdapter = ListAdapter(this, listHeader,listChild)

        expandableView.setAdapter(expandableListAdapter)
    }
}
