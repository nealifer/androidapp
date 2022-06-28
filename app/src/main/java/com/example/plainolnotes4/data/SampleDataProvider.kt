package com.example.plainolnotes4.data

import java.util.*

class SampleDataProvider {
    companion object{
        private val sampleText1 = "A Simple note"
        private val sampleText2 = "A Simple note\n line feed"
        private val sampleText3 = """
            loriiump ewjv awe awev awev wav awv awvawklv awve awev awef awev waev wav aw vwae vwe vawe vwae vwae vwaev waev wav waevwa
            vawewaeo vawe vaw vawevijaw vawb awrb aewbr aw
            aw vaw caw
            evwe vwae vwaeowaev awv waevo wab wav
            awv awevawbjapwb aeba ewbwaope wvaw vwe[p wavowevwokpv awvawovp waevoawpev waoev awvpow voapw vwav
            vwajveawwve vweopv awvpwowav eowpv w
        """.trimIndent()

        private fun getDate(diff: Long): Date {
            return Date(Date().time + diff)
        }

        fun getNotes() = arrayListOf(
            NoteEnitity(1, getDate(0), sampleText1),
            NoteEnitity(2, getDate(1), sampleText2),
            NoteEnitity(3, getDate(2), sampleText3)

        )

    }
}