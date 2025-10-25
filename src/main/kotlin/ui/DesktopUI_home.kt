package ui

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp

@Composable
fun DesktopUI_home() {
    Text(
        text = "Hello UXCore USER!",
        fontSize = 24.sp,
        color = MaterialTheme.colorScheme.primary,
        modifier = Modifier.align(Alignment.Center)
    )
}
