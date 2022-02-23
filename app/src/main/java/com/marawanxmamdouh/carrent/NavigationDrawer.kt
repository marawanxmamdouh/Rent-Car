package com.marawanxmamdouh.carrent

import android.os.Bundle
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_navigation_drawer.*

class NavigationDrawer : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_navigation_drawer)

        setSupportActionBar(m_tool_bar)
        supportActionBar?.title = "App"

        val actionToggle = ActionBarDrawerToggle(
            this,
            drawer_layout,
            m_tool_bar,
            R.string.drawe_open,
            R.string.drawer_close
        )
        drawer_layout.addDrawerListener(actionToggle)
        actionToggle.syncState()
    }
}