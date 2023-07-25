package com.example.viewpager_compose

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Scaffold
import androidx.compose.material.rememberScaffoldState
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import cafe.adriel.voyager.navigator.Navigator
import com.codingwithjks.composeyt.composeTutorials.components.screen.RadioButtonScreen
import com.codingwithjks.composeyt.viewpager.OnBoardingScreen
import com.example.viewpager_compose.Navigation.FirstScreen
import com.example.viewpager_compose.Screen.AlertDialogScreen
import com.example.viewpager_compose.Screen.BoxLayout
import com.example.viewpager_compose.Screen.ButtonLayout
import com.example.viewpager_compose.Screen.CheckBoxScreen
import com.example.viewpager_compose.Screen.ConstraintLayoutDemo
import com.example.viewpager_compose.Screen.CustomToggleButton
import com.example.viewpager_compose.Screen.CustomToggleButton2
import com.example.viewpager_compose.Screen.DialogScreen
import com.example.viewpager_compose.Screen.PickImageFromCamera
import com.example.viewpager_compose.Screen.PickImageFromGallery
import com.example.viewpager_compose.Screen.ShowSnackBar
import com.example.viewpager_compose.Screen.StateHosting
import com.example.viewpager_compose.Screen.FilterChipLayout
import com.example.viewpager_compose.Screen.SearchView
import com.example.viewpager_compose.Screen.SuggestionChipLayout
import com.example.viewpager_compose.sharedviewmodel.viewmodel.ScreenNavigation
import com.example.viewpager_compose.ui.theme.ViewPagerComposeTheme
import com.google.accompanist.pager.ExperimentalPagerApi


class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterialScaffoldPaddingParameter")
    @OptIn(ExperimentalAnimationApi::class, ExperimentalPagerApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ViewPagerComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
//                    OnBoardingScreen()
//                    Navigator(screen = FirstScreen())
//                    RadioButtonScreen()
//                    CheckBoxScreen()
//                    AlertDialogScreen()
//                    PickImageFromGallery()
//                    PickImageFromCamera()

//                    var scaffoldState = rememberScaffoldState()
//                    Scaffold(
//                        scaffoldState = scaffoldState
//                    ) {
//                        ShowSnackBar(scaffoldState)
//                    }

//                    ButtonLayout()

//                    BoxLayout()
//                    ConstraintLayoutDemo()
//                    StateHosting()
//                    CustomToggleButton()
//                    SuggestionChipLayout()
//                    FilterChipLayout()
//                    SearchView()

//                    var isToggle by remember{
//                        mutableStateOf(false)
//                    }
//                    CustomToggleButton2(isToggle) {
//                        isToggle = it
//                    }
                    
                    ScreenNavigation()
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ViewPagerComposeTheme {
        Greeting("Android")
    }
}