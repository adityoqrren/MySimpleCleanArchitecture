package id.interconnect.mysimplecleanarchitecture.data

import id.interconnect.mysimplecleanarchitecture.domain.MessageEntity

interface IMessageDataSource {
    fun getMessageFromSource(name: String): MessageEntity
}