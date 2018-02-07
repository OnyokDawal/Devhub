package co.devpartners.devhub.ui

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.TextView
import co.devpartners.devhub.R
import kotlinx.android.synthetic.main.activity_private_space.*

class PrivateSpaceActivity : AppCompatActivity(),AdapterView.OnItemSelectedListener{



    var timepick = arrayOf("Hourly", "Daily", "Weekly")

    var spinner: Spinner? = null
    var message: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_private_space)

        message = this.lengthMsg
        spinner = this.spinnerView
        spinnerView.onItemSelectedListener = this

        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, timepick)
        // Set layout to use when the list of choices appear
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        // Set Adapter to Spinner
        spinnerView!!.adapter = adapter
    }
    override fun onNothingSelected(adapterView: AdapterView<*>?) {

    }

    override fun onItemSelected(adapterView: AdapterView<*>?, view: View?, position: Int, p3: Long) {
        message!!.text = "Length Stay: "+timepick[position]
    }

}