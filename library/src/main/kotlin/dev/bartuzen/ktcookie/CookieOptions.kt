package dev.bartuzen.ktcookie

class CookieOptions(
    var expires: Int? = null,
    var path: String? = null,
    var domain: String? = null,
    var secure: Boolean? = null,
    var sameSite: SameSite? = null
) {
    internal fun toObject(): dynamic {
        val obj: dynamic = object {}

        expires?.let { obj["expires"] = it }
        path?.let { obj["path"] = it }
        domain?.let { obj["domain"] = it }
        secure?.let { obj["secure"] = it }
        sameSite?.let { obj["sameSite"] = it.toString() }

        return obj
    }

    enum class SameSite {
        STRICT {
            override fun toString() = "Strict"
        },
        LAX {
            override fun toString() = "Lax"
        },
        NONE {
            override fun toString() = "None"
        }
    }
}
