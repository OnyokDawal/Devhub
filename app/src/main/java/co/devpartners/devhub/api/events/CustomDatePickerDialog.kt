package co.devpartners.devhub.api.events

import android.app.Activity
import android.app.Dialog
import android.view.Window
import android.widget.CalendarView
import co.devpartners.devhub.R
import android.widget.TextView



/**
 * Created by DEVPARTNERS SOFTWARE on 2/7/2018.
 */
class CustomDatePickerDialog {

    fun show(activity: Activity){

        val dialog : Dialog = Dialog(activity)
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog.setCancelable(false)
        dialog.setContentView(R.layout.datepicker)

        dialog.show()
    }
}


