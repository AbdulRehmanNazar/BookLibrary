package org.kmp.library

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform