package com.example.randomnamegenerator.generator


import com.example.randomnamegenerator.generator.models.Baby
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json
import kotlinx.coroutines.suspendCancellableCoroutine
import okhttp3.*
import kotlin.coroutines.resume
import kotlin.coroutines.resumeWithException

interface RepositoryGeneratorInterface {
    suspend fun fetchJson(): Result<List<Baby>>
}

class RepositoryGenerator: RepositoryGeneratorInterface {

    override suspend fun fetchJson(): Result<List<Baby>> {

        val url = "https://mocki.io/v1/a917794c-33eb-4b8f-b598-f803d7126f2a"
        val request = Request.Builder().url(url).build()

        val client = OkHttpClient()

        val response: Response = suspendCancellableCoroutine { continuation ->
            val call = client.newCall(request)
            continuation.invokeOnCancellation { call.cancel() }
            call.enqueue(object : Callback {
                override fun onFailure(call: Call, e: java.io.IOException) {
                    continuation.resumeWithException(e)
                }
                override fun onResponse(call: Call, response: Response) {
                    continuation.resume(response)
                }
            })
        }

        val body = response.body?.string()

        val posts = Json.decodeFromString<List<Baby>>(body ?: "")

        return Result.success(posts)

    }
}
