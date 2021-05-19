package com.example.laboratory1

import android.os.Bundle
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import com.example.laboratory1.databinding.ActivityMainBinding
import com.example.laboratory1.navigation.DrawerCoordinator
import com.example.laboratory1.navigation.Navigator

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var drawerCoordinator: DrawerCoordinator

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initDrawer()
    }

    private fun initDrawer() {
        setSupportActionBar(binding.toolbar)

        val toggle = ActionBarDrawerToggle(
            this,
            binding.drawerLayout,
            binding.toolbar,
            R.string.navigation_drawer_open,
            R.string.navigation_drawer_close
        )

        drawerCoordinator = DrawerCoordinator(
            binding.drawerLayout,
            binding.navView,
            toggle,
            Navigator(this)
        )
    }
}