package com.example.plainolnotes4

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.plainolnotes4.data.NoteEnitity
import com.example.plainolnotes4.data.SampleDataProvider

class MainViewModel : ViewModel() {
    val notesList = MutableLiveData<List<NoteEnitity>>()

    init {
        notesList.value = SampleDataProvider.getNotes()
    }


}