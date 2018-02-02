package co.devpartners.devhub.ui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import co.devpartners.devhub.R
import kotlinx.android.synthetic.main.activity_space_type.*
import org.jetbrains.anko.startActivity

class SpaceTypeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_space_type)

        supportActionBar?.hide()

        nextButton.setOnClickListener {
            startActivity<OpenSpaceActivity>()
            finish()
        }
    }
}
