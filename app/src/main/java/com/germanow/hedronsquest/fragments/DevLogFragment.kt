package com.germanow.hedronsquest.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.germanow.hedronsquest.R

/**
 * A simple [Fragment] subclass.
 */
class DevLogFragment : Fragment()
{
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View?
    { // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_dev_log, container, false)
    }
}