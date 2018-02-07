package co.devpartners.devhub.ui

import android.annotation.SuppressLint
import android.app.DatePickerDialog
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.constraint.ConstraintLayout
import android.view.MenuItem
import android.view.View
import android.widget.*
import co.devpartners.devhub.R
import co.devpartners.devhub.R.layout.datepicker
import co.devpartners.devhub.api.events.CustomDatePickerDialog

import kotlinx.android.synthetic.main.activity_open_space.*



class OpenSpaceActivity : AppCompatActivity(),AdapterView.OnItemSelectedListener {


    var timepick = arrayOf("Hourly", "Daily", "Weekly")
    val datepicker = CustomDatePickerDialog()
    var spinner: Spinner? = null
    var message: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_open_space)



        datePickerButton.setOnClickListener{
            datepicker.show(this)
        }

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
        message!!.text = " Selected : "+timepick[position]
    }


}


