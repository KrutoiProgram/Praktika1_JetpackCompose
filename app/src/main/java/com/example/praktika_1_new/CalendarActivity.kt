package com.example.praktika_1_new

import android.content.Intent
import android.os.Bundle
import android.widget.CalendarView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.viewinterop.AndroidView
import com.example.praktika_1_new.ui.theme.Green200
import com.example.praktika_1_new.ui.theme.Green700
import com.example.praktika_1_new.ui.theme.Praktika_1_newTheme

class CalendarActiviry : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Praktika_1_newTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Green700
                ) {
                    Greeting3()
                }
            }
        }
    }
}

@Composable
fun Greeting3() {
    val context = LocalContext.current
    Box(contentAlignment = Alignment.TopStart )
    {

        Text(text = "Календарь", fontSize = 24.sp,color= Color.White, fontWeight = FontWeight.Bold, modifier = Modifier.padding(27.dp,23.dp,0.dp,0.dp))

    }
    Box(contentAlignment = Alignment.TopEnd )
    {

        Image(painter= painterResource(R.drawable.avatar),
            contentDescription="Avatar",
            modifier = Modifier
                .padding(0.dp, 14.dp, 13.dp, 0.dp)
                .size(56.dp)
                .clip(CircleShape))

    }
    Box(contentAlignment = Alignment.TopCenter)
    {

        AndroidView({CalendarView(it)},
            modifier = Modifier.padding(0.dp,96.dp,0.dp,0.dp).fillMaxSize(),
            update = {views->views.setOnDateChangeListener{calendarview,i,i2,i3->}})
    }

    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Bottom
    ) {
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .height(72.dp)
                .width(300.dp)
                .clip(
                    RoundedCornerShape(25.dp, 25.dp, 0.dp, 0.dp)
                )
                .background(Green200)

        )
        {

            Row()
            {

                IconButton(onClick = {context.startActivity(Intent(context,MainActivity::class.java))})
                {
                    Image(
                        painter = painterResource(id = R.drawable.listbutton_red),
                        contentDescription = "list",
                        modifier = Modifier.size(50.dp)
                    )
                }
                Spacer(modifier = Modifier.width(16.dp))
                IconButton(onClick = {context.startActivity(Intent(context,AlarmActivity::class.java))})
                {
                    Image(
                        painter = painterResource(id = R.drawable.alarmbutton_red),
                        contentDescription = "list",
                        modifier = Modifier.size(50.dp)
                    )
                }
                Spacer(modifier = Modifier.width(16.dp))
                IconButton(onClick = {})
                {
                    Image(
                        painter = painterResource(id = R.drawable.calendarbutton_green),
                        contentDescription = "list",
                        modifier = Modifier.size(50.dp)
                    )
                }
                Spacer(modifier = Modifier.width(16.dp))
                IconButton(onClick = {context.startActivity(Intent(context,SettingsActivity::class.java))})
                {
                    Image(
                        painter = painterResource(id = R.drawable.settingsbutton_red),
                        contentDescription = "list",
                        modifier = Modifier.size(50.dp)
                    )
                }
            }
        }

    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview3() {
    Praktika_1_newTheme {
        Greeting3()
    }
}