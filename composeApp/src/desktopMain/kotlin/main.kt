import androidx.compose.runtime.remember
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import io.ktor.client.engine.okhttp.OkHttp
import networking.InsultCensorClient
import networking.createHttpClient

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "CMP-Ktor",
    ) {
        App(
            client = remember {
                InsultCensorClient(createHttpClient(OkHttp.create()))
            }
        )
    }
}