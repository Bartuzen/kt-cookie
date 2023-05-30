package dev.bartuzen.ktcookie

object Cookie {
    fun set(name: String, value: String, attributes: CookieOptions = CookieOptions()) {
        CookieLib.set(name, value, attributes.toObject())
    }

    fun set(name: String, value: String, attributes: CookieOptions.() -> Unit) {
        CookieLib.set(name, value, CookieOptions().apply(attributes).toObject())
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
