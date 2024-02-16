package com.jeizard.quizapp.data.room.models.tests.mapper

import com.jeizard.domain.entities.Question
import com.jeizard.quizapp.data.mapper.Mapper
import com.jeizard.quizapp.data.room.models.single_models.questions.entity.AnswerDBEntity

class QuestionDBEntityMapper : Mapper<AnswerDBEntity, Question> {

    override fun mapFromDBEntity(d: AnswerDBEntity): Question {
        return Question(d.id, d.question)
    }

    override fun mapToDBEntity(e: Question): AnswerDBEntity {
        return AnswerDBEntity(e.id, e.question)
    }

    override fun mapFromDBEntity(dCollection: Collection<AnswerDBEntity>): List<Question> {
        return dCollection.map { mapFromDBEntity(it) }
    }

    override fun mapToDBEntity(eCollection: Collection<Question>): List<AnswerDBEntity> {
        return eCollection.map { mapToDBEntity(it) }
    }
}

