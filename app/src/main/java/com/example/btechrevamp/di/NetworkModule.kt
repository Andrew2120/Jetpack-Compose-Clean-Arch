package com.example.btechrevamp.di


import android.util.Log
import com.example.btechrevamp.data.ApiDataSource
import com.google.android.gms.auth.api.Auth
import io.ktor.client.HttpClient
import io.ktor.client.engine.android.Android
import io.ktor.client.plugins.DefaultRequest
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.plugins.logging.DEFAULT
import io.ktor.client.plugins.logging.LogLevel
import io.ktor.client.plugins.logging.Logger
import io.ktor.client.plugins.logging.Logging
import io.ktor.client.plugins.observer.ResponseObserver
import io.ktor.client.request.header
import io.ktor.http.ContentType
import io.ktor.http.HttpHeaders
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json
import org.koin.dsl.module

private const val TIME_OUT = 60_000


val networkModule = module {

    single {

        HttpClient(Android) {

            install(ContentNegotiation) {
                json(Json {
                    ignoreUnknownKeys = true
                    prettyPrint = true
                    isLenient = true
                })

            }


            engine {
                connectTimeout = TIME_OUT
                socketTimeout = TIME_OUT
            }

            install(Logging) {
                logger = Logger.DEFAULT
                level = LogLevel.ALL
            }


            install(ResponseObserver) {
                onResponse { response ->
                    Log.d("HTTP status:", "${response.status.value}")
                    Log.d("HTTP status:", "${response.call.request}")
                }
            }

            val token = "ADD YOUR TOKEN HERE"
            install(DefaultRequest) {
                url("https://dev.btech.com/en/rest/en/V1/")
                header(HttpHeaders.ContentType, ContentType.Application.Json)
                header("Authorization", "Bearer $token")
            }
        }
    }



}

