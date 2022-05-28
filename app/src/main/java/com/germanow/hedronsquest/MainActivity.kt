package com.germanow.hedronsquest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.germanow.hedronsquest.fragments.DevLogFragment
import com.germanow.hedronsquest.fragments.ForumFragment
import com.germanow.hedronsquest.fragments.GalleryFragment
import com.germanow.hedronsquest.fragments.SupportFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity()
{
    private val devLogFragment = DevLogFragment()
    private val galleryFragment = GalleryFragment()
    private val forumFragment = ForumFragment()
    private val supportFragment = SupportFragment()

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        replaceFragment(devLogFragment)
        val bottomNavigation = findViewById<BottomNavigationView>(R.id.bottom_navigation)

        bottomNavigation.setOnItemSelectedListener() {
            when(it.itemId){
                R.id.navigation_devLog ->replaceFragment(devLogFragment)
                R.id.navigation_forum ->replaceFragment(forumFragment)
                R.id.navigation_support ->replaceFragment(supportFragment)
                R.id.navigation_gallery ->replaceFragment(galleryFragment)
            }
            true
        }
    }
//
    private fun replaceFragment(fragment: Fragment)
    {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fragment_container, fragment)
        transaction.commit()
    }
}