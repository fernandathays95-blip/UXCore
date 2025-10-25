package ui

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun DesktopUI_iniciar(onClick: () -> Unit) {
    Box(
        modifier = Modifier
            .size(60.dp, 40.dp)
            .align(Alignment.BottomStart)
            .background(Color(0x220000FF)) // transparente azul
            .clickable { onClick() },
        contentAlignment = Alignment.Center
    ) {
        Text("Iniciar", fontSize = 12.sp, color = Color.White)
    }
}
