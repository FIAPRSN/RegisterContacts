package com.example.registercontacts.Model

data class Contact (
    var id : String ?= null,
    var name : String ?= null,
    var email : String ?= null,
    var phone : String ?= null,
    var job : String ?= null,
    var postalAddress : String ?= null,
    var birthDate : String ?= null
)