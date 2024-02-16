package com.jeizard.quizapp.data.room

import android.content.Context
import android.os.AsyncTask
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase
import com.jeizard.quizapp.data.room.models.intermediat_models.question_images.dao.QuestionAnswerDao
import com.jeizard.quizapp.data.room.models.intermediat_models.question_images.entity.QuestionAnswerDBEntity
import com.jeizard.quizapp.data.room.models.intermediat_models.question_images.entity.TestQuestionDBEntity
import com.jeizard.quizapp.data.room.models.single_models.questions.dao.AnswerDao
import com.jeizard.quizapp.data.room.models.single_models.questions.dao.QuestionDao
import com.jeizard.quizapp.data.room.models.single_models.questions.dao.TestDao
import com.jeizard.quizapp.data.room.models.single_models.questions.entity.AnswerDBEntity
import com.jeizard.quizapp.data.room.models.single_models.questions.entity.QuestionDBEntity
import com.jeizard.quizapp.data.room.models.single_models.questions.entity.TestDBEntity

@Database(
    entities = [TestDBEntity::class,
                QuestionDBEntity::class,
                AnswerDBEntity::class,
                TestQuestionDBEntity::class,
                QuestionAnswerDBEntity::class],
    version = 1,
    exportSchema = false
)
abstract class AppDatabase : RoomDatabase() {
    abstract fun testDao(): TestDao
    abstract fun questionDao(): QuestionDao
    abstract fun answerDao(): AnswerDao
    abstract fun testQuestionDao(): TestQuestionDBEntity
    abstract fun questionAnswerDao(): QuestionAnswerDao

    companion object {
        private var instance: AppDatabase? = null

        @Synchronized
        fun getInstance(context: Context): AppDatabase {
            if (instance == null) {
                instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java, "tests_database.db"
                )
                    .fallbackToDestructiveMigration()
                    .createFromAsset("tests.db")
                    .build()
            }
            return instance as AppDatabase
        }
    }
}
