package ui

import androidx.compose.ui.window.application
import androidx.compose.ui.window.Window

fun main() = application {
    Window(onCloseRequest = ::exitApplication, title = "UXCore Desktop") {
        DesktopUI() // Chama a interface principal
    }
}
