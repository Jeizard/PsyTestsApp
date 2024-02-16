package com.jeizard.quizapp.data.room.models.room.single_models.images.mapper

import com.jeizard.domain.entities.TestQuestion
import com.jeizard.quizapp.data.mapper.Mapper
import com.jeizard.quizapp.data.room.models.intermediat_models.question_images.entity.QuestionAnswerDBEntity

class TestQuestionDBEntityMapper : Mapper<QuestionAnswerDBEntity, TestQuestion> {

    override fun mapFromDBEntity(d: QuestionAnswerDBEntity): TestQuestion {
        return TestQuestion(d.testId, d.questionId)
    }

    override fun mapToDBEntity(e: TestQuestion): QuestionAnswerDBEntity {
        return QuestionAnswerDBEntity(e.testId, e.questionId)
    }

    override fun mapFromDBEntity(dCollection: Collection<QuestionAnswerDBEntity>): List<TestQuestion> {
        return dCollection.map { mapFromDBEntity(it) }
    }

    override fun mapToDBEntity(eCollection: Collection<TestQuestion>): List<QuestionAnswerDBEntity> {
        return eCollection.map { mapToDBEntity(it) }
    }
}
