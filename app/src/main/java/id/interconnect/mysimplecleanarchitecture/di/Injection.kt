package id.interconnect.mysimplecleanarchitecture.di

import id.interconnect.mysimplecleanarchitecture.data.IMessageDataSource
import id.interconnect.mysimplecleanarchitecture.data.MessageDataSource
import id.interconnect.mysimplecleanarchitecture.data.MessageRepository
import id.interconnect.mysimplecleanarchitecture.domain.IMessageRepository
import id.interconnect.mysimplecleanarchitecture.domain.MessageInteractor
import id.interconnect.mysimplecleanarchitecture.domain.MessageUseCase

object Injection {
    fun provideUseCase(): MessageUseCase{
        val messageRepository = provideRespository()
        return MessageInteractor(messageRepository)
    }

    private fun provideRespository(): IMessageRepository{
        val messageDataSource = provideDataSource()
        return MessageRepository(messageDataSource)
    }

    private fun provideDataSource(): IMessageDataSource{
        return MessageDataSource()
    }
}