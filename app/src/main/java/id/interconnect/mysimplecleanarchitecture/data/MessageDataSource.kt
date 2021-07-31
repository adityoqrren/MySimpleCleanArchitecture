package id.interconnect.mysimplecleanarchitecture.data

import id.interconnect.mysimplecleanarchitecture.domain.MessageEntity

class MessageDataSource: IMessageDataSource {
    override fun getMessageFromSource(name: String) = MessageEntity("Hello $name! Welcome to Clean Architecture")
}