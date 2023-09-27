package com.example.inventory

import android.app.Application
import com.example.inventory.data.ItemRoomDatabase

//5th step returns Database instance

class InventoryApplication : Application(){
    val database: ItemRoomDatabase by lazy{
        ItemRoomDatabase.getDatabase(this)
    }
}
