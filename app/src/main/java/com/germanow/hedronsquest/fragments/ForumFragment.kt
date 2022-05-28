package com.germanow.hedronsquest.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.germanow.hedronsquest.R

/**
 * A simple [Fragment] subclass.
 * Use the [ForumFragment.newInstance] factory method to
 */

class ForumFragment : Fragment()
{

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View?
    { // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_forum, container, false)
    }

}