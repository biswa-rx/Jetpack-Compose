package com.example.viewpager_compose.BottomTab

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.RowScope
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import cafe.adriel.voyager.navigator.tab.CurrentTab
import cafe.adriel.voyager.navigator.tab.LocalTabNavigator
import cafe.adriel.voyager.navigator.tab.Tab
import cafe.adriel.voyager.navigator.tab.TabNavigator
import cafe.adriel.voyager.navigator.tab.TabOptions
import com.example.viewpager_compose.ui.theme.ViewPagerComposeTheme

class BottomNavigationActivity : ComponentActivity() {

    @SuppressLint("UnusedMaterialScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ViewPagerComposeTheme {
                Surface{
                    TabNavigator(tab = HomeTab){
                        Scaffold(
                            bottomBar = {
                                BottomNavigation{
                                    TabNavigationItems(tab = HomeTab)
                                    TabNavigationItems(tab = ProfileTab)
                                }
                            }
                        ) {
                            CurrentTab()
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun RowScope.TabNavigationItems(tab:Tab) {

    val tabNavigator = LocalTabNavigator.current
    BottomNavigationItem(selected = tabNavigator.current == tab, onClick = { tabNavigator.current = tab },
        icon = { Icon(tab.options.icon!!, contentDescription = tab.options.title )}
    )

}

object HomeTab : Tab{

    override val options: TabOptions
        @Composable
        get()  {
            val title = "Home"
            val icon = rememberVectorPainter(Icons.Default.Home)

            return remember {
                TabOptions(
                    0u,
                    title, icon
                )
            }
        }

    @Composable
    override fun Content() {
        Text(text = "Home")
    }

}


object ProfileTab : Tab{

    override val options: TabOptions
        @Composable
        get() {

            val title = "Profile"
            val icon = rememberVectorPainter(Icons.Default.Person)

            return remember {
                TabOptions(
                    1u,
                    title,
                    icon
                )
            }

        }

    @Composable
    override fun Content() {
        Text(text = "Profile")
    }

}