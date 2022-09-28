package com.example.notekeeper

data class CourseInfo (val courseId: String, val title: String) {
    override fun toString(): String {
        return title
    }
}

data class NoteInfo (var course: CourseInfo,val title: String, var text: String)