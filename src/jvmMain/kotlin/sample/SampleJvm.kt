package sample

import io.ktor.client.HttpClient

actual object Platform {
    actual val name: String = "JVM"
}

actual val client: HttpClient
    get() = HttpClient()