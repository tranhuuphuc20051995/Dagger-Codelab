package com.jraska.dagger.codelab.app.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.jraska.dagger.codelab.app.R

class MainFragment : Fragment() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
  }

  override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
    return inflater.inflate(R.layout.fragment_main, container, false)
  }

//  override fun onResume() {
//    super.onResume()
//
//    val byeButton = view!!.findViewById<View>(R.id.main_bye_button)
//    if (config.getBoolean("bye_button")) {
//      byeButton.visibility = View.VISIBLE
//    } else {
//      byeButton.visibility = View.GONE
//    }
//  }
}
