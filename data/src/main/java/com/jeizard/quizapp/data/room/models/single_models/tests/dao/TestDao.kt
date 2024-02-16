package com.jeizard.quizapp.data.room.models.single_models.questions.dao

import androidx.room.Dao
import androidx.room.Query
import com.jeizard.quizapp.data.room.dao.BaseDao
import com.jeizard.quizapp.data.room.models.single_models.questions.entity.AnswerDBEntity

@Dao
abstract class TestDao : BaseDao<AnswerDBEntity> {

    @Query("DELETE FROM tests")
    abstract fun deleteAllTests()

    @Query("SELECT * FROM tests")
    abstract fun getAllTests(): List<AnswerDBEntity>

    override fun deleteAll() {
        deleteAllTests()
    }

    override fun getAll(): List<AnswerDBEntity> {
        return getAllTests()
    }
}
