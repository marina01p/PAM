package com.example.laboratory1.navigation

import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.example.laboratory1.R
import com.google.android.material.navigation.NavigationView

class DrawerCoordinator(private val drawer: DrawerLayout,
                        private val navigationView: NavigationView,
                        private val toggle: ActionBarDrawerToggle,
                        private val navigator: Navigator) {

    private val menuItemSelectedConsumers: HashMap<Int, (() -> Unit)>

    init {
        drawer.addDrawerListener(toggle)
        toggle.syncState()
        navigationView.setNavigationItemSelectedListener(this::onNavigationItemSelected)
        menuItemSelectedConsumers = HashMap()

        getSecondActivity()
        getThirdActivity()
        getFourthActivity()
        getFifthActivity()
        getSixthActivity()
    }

    private fun getSecondActivity() {
        menuItemSelectedConsumers[R.id.games_menu_navigation] = navigator::openSecondActivity
    }

    private fun getThirdActivity() {
        menuItemSelectedConsumers[R.id.my_profile_menu_navigation] = navigator::openThirdActivity
    }

    private fun getFourthActivity() {
        menuItemSelectedConsumers[R.id.randomise_menu_navigation] = navigator::openFourthActivity
    }

    private fun getFifthActivity() {
        menuItemSelectedConsumers[R.id.posts_menu_navigation] = navigator::openFifthActivity
    }

    private fun getSixthActivity() {
        menuItemSelectedConsumers[R.id.users_menu_navigation] = navigator::openSixthActivity
    }

    private fun onNavigationItemSelected(item: MenuItem) : Boolean {
        menuItemSelectedConsumers[item.itemId]?.let { it() }
        drawer.closeDrawer(GravityCompat.START)

        return false
    }
}