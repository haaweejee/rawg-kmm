package id.haaweejee.rawgmultiplatform

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform