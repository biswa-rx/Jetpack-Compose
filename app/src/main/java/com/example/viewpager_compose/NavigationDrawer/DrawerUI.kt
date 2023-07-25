package com.example.viewpager_compose.NavigationDrawer

import android.annotation.SuppressLint
import android.app.Activity
import android.os.Bundle
import android.os.PersistableBundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Scaffold
import androidx.compose.material.ScaffoldState
import androidx.compose.material.Surface
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.List
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.graphics.Color
import com.example.viewpager_compose.ui.theme.ViewPagerComposeTheme
import kotlinx.coroutines.launch


class NavigationDrawerActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterialScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ViewPagerComposeTheme {
                Surface {
                    val scaffoldState = rememberScaffoldState()
                    val scope = rememberCoroutineScope()
                    Scaffold(
                        scaffoldState = scaffoldState,
                        drawerContent = {
                            Column() {
                                IconButton(onClick = {
                                    scope.launch {
                                        scaffoldState.drawerState.close()
                                    }
                                }){
                                    Icon(Icons.Default.Close,contentDescription = "",tint = Color.Blue)
                                }

                            }
                        },
                        drawerGesturesEnabled = true
                    ) {
                        CreateDrawerLayout(scaffoldState = scaffoldState)
                    }
                }

            }
        }
    }
}


@Composable
fun CreateDrawerLayout(scaffoldState: ScaffoldState) {

    val scope = rememberCoroutineScope()

    IconButton(onClick = {
        scope.launch {
            scaffoldState.drawerState.open()
        }
    }) {
        Icon(Icons.Default.List, contentDescription =  "", tint = Color.Blue)
    }

}