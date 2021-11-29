package com.example.studyapp

class CardInfo(title: String, description: String) {

    companion object {
        var type = 0
        var kotlinList = ArrayList<CardInfo>()
        var androidList = ArrayList<CardInfo>()

        fun createKotlinCard(title: String, description: String){
            val card = CardInfo(title, description)
            kotlinList.add(card)
        }

        fun createAndroidCard(title: String, description: String){
            val card = CardInfo(title, description)
            androidList.add(card)
        }

        fun initCards(){
            kotlinList.clear()
            createKotlinCard("var and val", "Declaring variables")
            createKotlinCard("User Input", "Getting user input")
            createKotlinCard("String", "String concatenations, interpolation, and methods")
            createKotlinCard("Basic Operations", "Performing math operations in Kotlin")
            createKotlinCard("If Statements", "Guide your program")
            createKotlinCard("Try/Catch", "Error handling")
            createKotlinCard("For Loops", "Something happen multiple times")
            createKotlinCard("While Loops", "Very similar to For Loops")
            createKotlinCard("When", "Perform a check in a more concise way")

            androidList.clear()
            createAndroidCard("Android Studio", "IDE for android app development")
            createAndroidCard("Project Setup", "Setting up an Android Studio Project")
            createAndroidCard("Console", "Printing to the console")
            createAndroidCard("Main Activity", "initializing Application")
            createAndroidCard("Design .xmi File", "Creating, modifying, and initializing UI Elements")
            createAndroidCard("colors.xmi", "initializing colors for UI Elements")
            createAndroidCard("Dependencies", "allows to include external")
            createAndroidCard("Recyclerview", "Display large sets of data in your UI while minimizing memory usage.")
            createAndroidCard("Emulator", "Simulates Android devices on your computer")

        }
    }

    var title: String
    var description: String

    init {
        this.title = title
        this.description = description
    }

}