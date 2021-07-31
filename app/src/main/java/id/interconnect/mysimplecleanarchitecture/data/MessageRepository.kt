package id.interconnect.mysimplecleanarchitecture.data

import id.interconnect.mysimplecleanarchitecture.domain.IMessageRepository
import id.interconnect.mysimplecleanarchitecture.domain.MessageEntity

class MessageRepository(private val messageDataSource: IMessageDataSource): IMessageRepository {
    override fun getWelcomeMessage(name: String): MessageEntity =
        messageDataSource.getMessageFromSource(name)

}