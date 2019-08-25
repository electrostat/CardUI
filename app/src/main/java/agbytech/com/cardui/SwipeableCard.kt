package agbytech.com.cardui

import android.graphics.Color
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import java.util.*

class SwipeableCard: Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {

        val view = inflater.inflate(R.layout.fragment_screen_slide_page, container, false)
        view.rotation = -90f

        val root = view.rootView
        root.setBackgroundColor(pickColor())

        pickColor()

        return view
    }

    fun pickColor(): Int {
        val random = Random()
        val rng = random.nextInt(5)

        var color = Color.WHITE

        when(rng) {
            0 -> color = Color.YELLOW
            1 -> color = Color.RED
            2 -> color = Color.BLUE
            3 -> color = Color.GREEN
            4 -> color = Color.MAGENTA
            5 -> color = Color.LTGRAY
        }

        return color
    }

}