package ui

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(onCloseRequest = ::exitApplication, title = "UXCore Desktop") {
        DesktopUI() // componente principal que junta todos os módulos
    }
}
