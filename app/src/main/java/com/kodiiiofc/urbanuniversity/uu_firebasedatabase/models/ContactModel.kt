package com.kodiiiofc.urbanuniversity.uu_firebasedatabase.models

data class ContactModel(val name: String? = null, val phone: String? = null) {
    override fun toString(): String {
        return "$name, $phone"
    }
}
