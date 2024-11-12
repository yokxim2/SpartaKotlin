package com.sparta

object Singleton {
    // 클래스 내부에서만 접근 가능한 변수
    private var instance: Singleton? = null

    // 클래스 내부에서만 호출 가능한 초기화 블록
    init {
        // 인스턴스 초기화 로직
    }

    // 유일한 인스턴스를 반환하는 메서드
    fun getInstance(): Singleton {
        if (instance == null) {
            instance = Singleton
        }
        return instance!!
    }
}