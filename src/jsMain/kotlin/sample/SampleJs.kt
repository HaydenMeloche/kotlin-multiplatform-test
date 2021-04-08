package sample

import io.ktor.client.*
import io.ktor.client.engine.js.*

actual object Platform {
    actual val name: String = "Javascript"
}

actual val client = HttpClient(Js)

