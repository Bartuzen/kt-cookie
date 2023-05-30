package dev.bartuzen.ktcookie

@JsName("Cookie")
@JsModule("js-cookie")
@JsNonModule
internal external object CookieLib {
    fun set(name: String, value: String, attributes: dynamic)
    fun get(name: String): String
}
