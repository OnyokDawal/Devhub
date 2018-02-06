package co.devpartners.devhub.ui

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import co.devpartners.devhub.R
import co.devpartners.devhub.expandable.adapter.ListAdapter
import kotlinx.android.synthetic.main.activity_private_space.*

class PrivateSpaceActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_private_space)

        val listHeader = listOf("Length Plan")
        val numbersList = listOf("Hourly", "Daily", "Weekly")
        val listChild = HashMap<String, List<String>>()
        listChild.put(listHeader[0],numbersList)

        val expandableListAdapter = ListAdapter(this, listHeader, listChild)

        expandableView.setAdapter(expandableListAdapter)
    }
}