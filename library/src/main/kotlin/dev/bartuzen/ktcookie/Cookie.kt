package dev.bartuzen.ktcookie

object Cookie {
    fun set(name: String, value: String, cookieOptions: CookieOptions = CookieOptions()) {
        CookieLib.set(name, value, cookieOptions.toObject())
    }

    fun set(name: String, value: String, cookieOptions: CookieOptions.() -> Unit) {
        CookieLib.set(name, value, CookieOptions().apply(cookieOptions).toObject())
    }

    fun get(name: String): String? {
        val cookie = CookieLib.get(name)

        return if (cookie != undefined) {
            cookie
        } else {
            null
        }
    }
}
