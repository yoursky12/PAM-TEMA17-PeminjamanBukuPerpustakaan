package com.example.pertemuan2

import kotlin.test.Test
import kotlinx.coroutines.runBlocking

class MainRunnerTest {

    @Test
    fun testMainRunner() {
        runBlocking {
            mainRunner()
        }
    }
}
