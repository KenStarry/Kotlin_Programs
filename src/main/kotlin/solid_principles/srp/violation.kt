package solid_principles.srp

//  Single Responsibility Principle
//  Here, the SystemManager class is trying to handle many different
//  situations at the same time. This approach can cause major problems in the future
class SystemManager {

    fun addUser(user: String) {}
    fun deleteUser(user: String) {}
    fun sendNotification(notification: String) {}
    fun sendEmail(user: String, email: String) {}
}