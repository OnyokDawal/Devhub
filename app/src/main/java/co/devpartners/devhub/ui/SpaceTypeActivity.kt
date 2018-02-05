package co.devpartners.devhub.ui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import co.devpartners.devhub.R
import kotlinx.android.synthetic.main.activity_space_type.*
import org.jetbrains.anko.alert
import org.jetbrains.anko.startActivity

class SpaceTypeActivity : AppCompatActivity() {
    companion object {
        var selectedSpace : ActivityType? = null
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_space_type)

        supportActionBar?.hide()

        openSpace.setOnClickListener {
            selectedSpace = ActivityType.OpenSpaceActivity
        }
        privateSpace.setOnClickListener {
            selectedSpace = ActivityType.PrivateActivity
        }
        conferenceSpace.setOnClickListener {
            selectedSpace = ActivityType.ConferenceActivity
        }

        nextButton.setOnClickListener {
            nextPage()
        }
    }

    fun nextPage(){
        when(selectedSpace){
            ActivityType.OpenSpaceActivity -> {
                startActivity<OpenSpaceActivity>()
                finish()
            }
            ActivityType.ConferenceActivity ->{
                startActivity<ConferenceActivity>()
                finish()
            }
            ActivityType.PrivateActivity -> {

            }
            null -> {
                alert("Please select space type"){
                    title = "Information"
                }.show()
            }
        }
    }

    enum class ActivityType{
        OpenSpaceActivity,
        PrivateActivity,
        ConferenceActivity
    }

}
