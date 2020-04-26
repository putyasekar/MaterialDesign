package com.diki.idn.materialdesign

import android.R.id.text1
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.fragment_play.*

class PlayFragment : Fragment() {

    val objectData = arrayOf(
        "Web Design", "Fullstack Material", "UI/UX Development", "Mobile Native Development", "Cross Platform Development",
        "Flat Design", " Data Structure", "Flow Diagram", "Material Design", "Android Developer", "Database", "Laravel")

    companion object {
        fun newInstance(): PlayFragment {
            val fragment = PlayFragment()
            val arg = Bundle()
            fragment.arguments = arg
            return fragment
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_play, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val adapter = this!!.context?.let { ArrayAdapter<String>(it, android.R.layout.simple_list_item_1, text1, objectData) }
        list_view.adapter = adapter

    }

}
