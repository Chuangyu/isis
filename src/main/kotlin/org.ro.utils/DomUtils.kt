package org.ro.utils

import org.ro.core.encodeURIComponent
import org.w3c.dom.parsing.DOMParser
import kotlin.browser.document

/**
 * Dom ^= Document Object Model
 */
object DomUtils {

    fun appendTo(response: String, elementId: String, type: String = "image/svg+xml") {
        val p = DOMParser()
        val svg = p.parseFromString(response, type)
        val element = document.getElementById(elementId)
        element.asDynamic().appendChild(svg.documentElement)
    }

    fun download(filename: String, text: String) {
        val element = document.createElement("a")
        element.setAttribute("href", "data:text/plain;charset=utf-8," + encodeURIComponent(text))
        element.setAttribute("download", filename)
        document.body?.appendChild(element)
        console.log(document)
        element.asDynamic().click()
        document.body?.removeChild(element)
    }

}
