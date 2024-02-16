package com.jeizard.quizapp.data.room.models.intermediate_models.test_questions.repository

import android.app.Application
import com.jeizard.domain.entities.TestQuestion
import com.jeizard.domain.repository.BaseRepository
import com.jeizard.quizapp.data.room.AppDatabase
import com.jeizard.quizapp.data.room.models.intermediat_models.question_images.dao.QuestionAnswerDao
import com.jeizard.quizapp.data.room.models.intermediat_models.question_images.entity.QuestionAnswerDBEntity
import com.jeizard.quizapp.data.room.models.room.single_models.images.mapper.QuestionAnswerDBEntityMapper
import com.jeizard.quizapp.data.room.repository.BaseRepositoryRoomImpl

class TestQuestionRepositoryRoomImpl(application: Application) :
    BaseRepositoryRoomImpl<QuestionAnswerDBEntity, QuestionAnswerDao, TestQuestion>(
        AppDatabase.getInstance(application).testQuestionDao(),
        QuestionAnswerDBEntityMapper()
    ),
    BaseRepository<TestQuestion>