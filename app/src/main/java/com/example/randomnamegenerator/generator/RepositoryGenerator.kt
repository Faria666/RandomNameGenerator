package com.example.randomnamegenerator.generator


import android.util.Log
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

        val url = "https://mocki.io/v1/7ef85e29-63e8-432c-8704-abd6d8397c3b"
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
        Log.d("RepositoryGenerator", "Posts: $posts")

        return Result.success(posts)

    }
}
