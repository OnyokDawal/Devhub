package co.devpartners.devhub.ui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import co.devpartners.devhub.R
import kotlinx.android.synthetic.main.activity_conference.*


class ConferenceActivity : AppCompatActivity() {
    var roomType = arrayOf("Conference","Meeting")
    var schedule = arrayOf("Day","Week")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_conference)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)
        val adapterRoomType : ArrayAdapter<String> = ArrayAdapter(this, android.R.layout.simple_list_item_1,roomType)
        val adapterSchedule : ArrayAdapter<String> = ArrayAdapter(this, android.R.layout.simple_list_item_1,schedule)
     roomTypeSpinner.adapter = adapterRoomType
        scheduleSpinner.adapter = adapterSchedule
    }

}
