package ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.material3.*

@Composable
fun DesktopUI() {
    var showStartMenu by remember { mutableStateOf(false) }

    Box(modifier = Modifier.fillMaxSize()) {
        DesktopUI_home()
        DesktopUI_iniciar(onClick = { showStartMenu = !showStartMenu })
        if (showStartMenu) {
            DesktopUI_drawer()
        }
        DesktopUI_dock()
    }
}
