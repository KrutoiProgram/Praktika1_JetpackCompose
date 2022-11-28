package com.example.praktika_1_new

import android.content.Intent
import android.os.Bundle
import android.widget.Space
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.praktika_1_new.ui.theme.Green200
import com.example.praktika_1_new.ui.theme.Green700
import com.example.praktika_1_new.ui.theme.Orange200
import com.example.praktika_1_new.ui.theme.Praktika_1_newTheme

class AlarmActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Praktika_1_newTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Green700
                ) {
                    Greeting2()
                }
            }
        }
    }
}

@Composable
fun Greeting2() {
    val context = LocalContext.current
    Box(contentAlignment = Alignment.TopStart )
    {

        Text(text = "Будильник", fontSize = 24.sp,color= Color.White, fontWeight = FontWeight.Bold, modifier = Modifier.padding(27.dp,23.dp,0.dp,0.dp))

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
    Column(horizontalAlignment = Alignment.Start, verticalArrangement = Arrangement.Top,modifier = Modifier.padding(20.dp,0.dp,0.dp,0.dp))
    {
        Spacer(modifier = Modifier.height(96.dp))
        Text("07:30", fontSize = 48.sp,color = Color.White)
        Text("08:30", fontSize = 48.sp,color = Color.White)
    }

    Column(horizontalAlignment = Alignment.End, verticalArrangement = Arrangement.Top, modifier = Modifier.padding(0.dp,0.dp,20.dp,0.dp)) {
        Spacer(modifier = Modifier.height(116.dp))
        val checkedState = remember { mutableStateOf(false) }
        val checkedState1 = remember { mutableStateOf(true) }
        Switch(
            checked = checkedState.value,
            onCheckedChange = { checkedState.value = it },
            colors = SwitchDefaults.colors(
                uncheckedTrackColor = Orange200
                , checkedTrackColor = Green200,
                uncheckedThumbColor = Color.White,
                checkedThumbColor = Color.White

            )
        )
        Switch(
            checked = checkedState1.value,
            onCheckedChange = { checkedState1.value = it },
            colors = SwitchDefaults.colors(
                uncheckedTrackColor = Orange200
                , checkedTrackColor = Green200,
                uncheckedThumbColor = Color.White,
                checkedThumbColor = Color.White

            )
        )
    }
    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Bottom
    ) {
        Button(
            onClick = {}, modifier = Modifier
                .width(324.dp)
                .height(48.dp)
                .background(Green200), colors = ButtonDefaults.buttonColors(
                Green200
            )
        )
        {
            Text("Добавить будильник", fontSize = 18.sp, color = Color.White)
        }
        Spacer(modifier = Modifier.height(16.dp));
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
                IconButton(onClick = {})
                {
                    Image(
                        painter = painterResource(id = R.drawable.alarmbutton_green),
                        contentDescription = "list",
                        modifier = Modifier.size(50.dp)
                    )
                }
                Spacer(modifier = Modifier.width(16.dp))
                IconButton(onClick = {context.startActivity(Intent(context,CalendarActiviry::class.java))})
                {
                    Image(
                        painter = painterResource(id = R.drawable.calendarbutton_red),
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
fun DefaultPreview2() {
    Praktika_1_newTheme {
        Greeting2()
    }
}