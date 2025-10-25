package ui

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun DesktopUI_drawer() {
    Column(
        modifier = Modifier
            .align(Alignment.BottomStart)
            .width(200.dp)
            .background(Color(0xDD222222))
            .padding(8.dp)
    ) {
        Text("App 1", color = Color.White, fontSize = 14.sp, modifier = Modifier.padding(4.dp))
        Text("App 2", color = Color.White, fontSize = 14.sp, modifier = Modifier.padding(4.dp))
        Text("App 3", color = Color.White, fontSize = 14.sp, modifier = Modifier.padding(4.dp))
    }
}
