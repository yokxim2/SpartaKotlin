package com.sparta

import kotlinx.coroutines.*

fun main() {
    println("메인쓰레드 시작")
    var job = CoroutineScope(Dispatchers.Default).launch {
        var fileDownloadCoroutine = async(Dispatchers.IO) {
            delay(10000)
            "파일 다운로드 완료"
        }
        var databaseConnectCoroutine = async(Dispatchers.IO) {
            delay(5000)
            "데이터베이스 연결 완료"
        }
        println("${fileDownloadCoroutine.await()}")
        println("${databaseConnectCoroutine.await()}")
    }
    runBlocking {
        job.join()
    }
    println("메인쓰레드 종료")
    job.cancel()
}
