package sample

import io.ktor.client.HttpClient
import io.ktor.client.request.get

// each platform must specify their name
expect object Platform {
    val name: String
}

fun hello(): String = "Hello from ${Platform.name}"

///

expect val client: HttpClient

interface ToDo {
    val userId: Number
    val id: Number
    val title: String
    val completed: Boolean
}

suspend fun getTodo(todoIndex: Number): ToDo {
    if (todoIndex == 0) {
        throw IllegalArgumentException("Bad index")
    }

    val url = "https://jsonplaceholder.typicode.com/todos/${todoIndex}"

    return client.get(url)
}