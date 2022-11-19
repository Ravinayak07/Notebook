package application.example.notebook.Repository

import androidx.lifecycle.LiveData
import application.example.notebook.Dao.NotesDao
import application.example.notebook.Model.Notes

class NotesRepository(val dao: NotesDao) {

    fun getAllNotes(): LiveData<List<Notes>> {
        return dao.getNotes()
    }
    fun getLowNotes(): LiveData<List<Notes>> {
        return dao.getLowNotes()
    }
    fun getHighNotes(): LiveData<List<Notes>> {
        return dao.getHighNotes()
    }
    fun getMediumNotes(): LiveData<List<Notes>> {
        return dao.getMediumNotes()
    }
    fun insertNotes(notes: Notes) {
        dao.insertNotes(notes)
    }
    fun deleteNotes(id: Int){
        dao.deleteNotes(id)
    }
    fun updateNotes(notes:Notes){
        dao.updateNotes(notes)
    }
}