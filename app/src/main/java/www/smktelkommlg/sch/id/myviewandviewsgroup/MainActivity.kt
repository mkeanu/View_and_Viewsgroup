package www.smktelkommlg.sch.id.myviewandviewsgroup

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import www.smktelkommlg.sch.id.myviewandviewsgroup.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.title = "Xiaomi 11"

    }
}
