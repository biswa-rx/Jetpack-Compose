package com.example.viewpager_compose.Screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ChainStyle
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.ConstraintSet

@Composable
fun ConstraintLayoutDemo() {


//    LoginPageWithConstraintLayout()
//    ArrangeHorizontally()
//    GuideLineExample()
//    CreateBarrierExample()
    CreateChainsExample()
}

@Composable
fun CreateChainsExample() {
    ConstraintLayout(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
    ) {
        val (text1,text2,text3) = createRefs()

        createHorizontalChain(text1,text2,text3,
            chainStyle = ChainStyle.Spread
            )

        Text(text = "text1",
            modifier = Modifier.constrainAs(text1){
                start.linkTo(parent.start)
                top.linkTo(parent.top)
            }
        )
        Text(text = "text2",
            modifier = Modifier.constrainAs(text2){
                start.linkTo(text1.end)
                top.linkTo(text1.top)
                bottom.linkTo(text1.bottom)
            }
        )
        Text(text = "text1",
            modifier = Modifier.constrainAs(text3){
                start.linkTo(text2.end)
                top.linkTo(text2.top)
                bottom.linkTo(text2.bottom)
            }
        )
    }
}

@Composable
fun CreateBarrierExample() {

    ConstraintLayout(
        modifier = Modifier
            .fillMaxWidth()
            .padding(30.dp)
    ) {

        val (text1,text2,text3) = createRefs()
        val barrierEnd = createEndBarrier(
            text1,text2
        )

        Text(text = "TEXT ONE CONTENT",
            modifier = Modifier.constrainAs(text1){
                start.linkTo(parent.start)
                top.linkTo(parent.top)
            }
        )
        Text(text = "TEXT TWO CONTENT",
            modifier = Modifier.constrainAs(text2){
                start.linkTo(parent.start)
                top.linkTo(text1.bottom)
            }
        )
        Text(text = "TEXT THREE CONTENT",
            modifier = Modifier.constrainAs(text3){
                start.linkTo(barrierEnd)
                top.linkTo(text1.bottom)
            }
        )
    }
}

@Composable
fun GuideLineExample() {

    ConstraintLayout(
        modifier = Modifier.fillMaxSize()
    ) {

        val (text1) = createRefs()
        val createGuideTop = createGuidelineFromTop(40.dp)

        Text(text = "Some Contents",
        modifier = Modifier
            .constrainAs(text1){
                start.linkTo(parent.start)
                end.linkTo(parent.end)
                top.linkTo(createGuideTop)
            }
        )

    }
}

@Composable
fun ArrangeHorizontally() {
    ConstraintLayout(
        modifier = Modifier.fillMaxSize()
    ) {
        val (text1,text2,text3) = createRefs()

        Text(text = "Text one",
        modifier = Modifier
            .constrainAs(text1){
                start.linkTo(parent.start)
                top.linkTo(parent.top)
                bottom.linkTo(parent.bottom)
            },
            color = Color.Blue
        )

        Text(text = "Text two",
            modifier = Modifier
                .constrainAs(text2){
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                },
            color = Color.Green
        )

        Text(text = "Text three",
            modifier = Modifier
                .constrainAs(text3){
                    end.linkTo(parent.end)
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                },
            color = Color.Red
        )

    }
}

@Composable
fun LoginPageWithConstraintLayout() {
    var username1 = remember { mutableStateOf("") }
    var password1 = remember { mutableStateOf("") }

    val constraints = ConstraintSet {
        val username = createRefFor("username")
        val password = createRefFor("password")
        val button = createRefFor("button")

        constrain(username) {
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            top.linkTo(parent.top)
        }

        constrain(password) {
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            top.linkTo(username.bottom, margin = 10.dp)
        }

        constrain(button) {
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            top.linkTo(password.bottom, margin = 10.dp)
        }
    }

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        ConstraintLayout(
            constraintSet = constraints
        ) {
            TextField(value = username1.value, onValueChange = {
                username1.value = it
            },
                modifier = Modifier.layoutId("username")
                )
            TextField(value = password1.value, onValueChange = {
                password1.value = it
            },
                modifier = Modifier.layoutId("password")
            )

            Button(onClick = { /*TODO*/ },
                modifier = Modifier.layoutId("button")
                ) {
                Text(text = "Login")
            }
        }

    }

}
