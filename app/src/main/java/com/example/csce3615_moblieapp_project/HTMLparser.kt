package com.example.csce3615_moblieapp_project

import android.os.Build
import androidx.annotation.RequiresApi
import java.net.URL
import java.net.URLConnection
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.Scanner
import java.util.Vector


class HTMLparser {

    enum class cafe {
        BRUCE,
        CHAMPS,
        EAGLE,
        MEAN_GREEN,
        WEST
    }

    class menuEntry {
        var ID = ""
        var category = ""
        var itemName = ""
    }

//    @RequiresApi(Build.VERSION_CODES.O)
//    fun main() {                // <--------------------------- Example of how to use
//        var menuList: Vector<menuEntry?>? = Vector()
//        menuList = retrieveMenu("EAGLE", 0) //Refer to ENUM for cafe keywords
//    }
    @RequiresApi(Build.VERSION_CODES.O)
    fun retrieveMenu(cafeChoice: String?, dayOffset: Int): Vector<menuEntry> {
        val date = LocalDate.now() //We need the date for the URL
        val format = DateTimeFormatter.ofPattern("MM/dd/yyyy")
        val s_date = date.format(format)
        val content: String? = null
        var connection: URLConnection? = null
        val urls = arrayOf(
            "https://diningmenus.unt.edu/?locationID=20&date=",  //Bruce
            "https://diningmenus.unt.edu/?locationID=15&date=",  //Champs
            "https://diningmenus.unt.edu/?locationID=31&date=",  //Eagle Landing
            "https://diningmenus.unt.edu/?locationID=10&date=",  //Mean Green
            "https://diningmenus.unt.edu/?locationID=25&date="
        ) //West

        //System.out.println(s_date);           //For debug
        var currentCategory: String
        val menuList = Vector<menuEntry>()
        var numChoice = 0
        when (cafeChoice) {
            "BRUCE" -> numChoice = 0
            "CHAMPS" -> numChoice = 1
            "EAGLE" -> numChoice = 2
            "MEAN_GREEN" -> numChoice = 3
            "WEST" -> numChoice = 4
        }
        try {
            connection = URL(urls[numChoice] + s_date).openConnection()
            val myReader = Scanner(connection.getInputStream())
            while (myReader.hasNextLine()) {
                var data = myReader.nextLine()
                //System.out.println(data);         //For debug
                if (data.contains("[] -- ")) //Determine category
                {
                    currentCategory = data.substring(6, data.lastIndexOf(" -"))
                    do {
                        val temp = menuEntry() //Make new entry object
                        temp.category = currentCategory
                        temp.itemName = data.substring(9, data.indexOf('|'))
                        temp.ID = data.substring(0, 8)
                        data = myReader.nextLine()
                        menuList.addElement(temp)
                    } while (myReader.hasNextLine() && !data.contains("[] -- "))
                }
            }
            myReader.close()
        } catch (ex: Exception) {
            ex.printStackTrace()
        }

        /*      //For Debug
        for (int i = 0; i < menuList.size(); i++) {
            System.out.println(menuList.get(i).ID);
            System.out.println(menuList.get(i).category);
            System.out.println(menuList.get(i).itemName);
//        }*/return menuList
    }
}