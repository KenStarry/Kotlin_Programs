package solid_principles.srp

//  Here, we have divided our SystemManager class into parts
//  and placed the functions in their respective classes
class MailManager {
    fun sendEmail(user: String, email: String){}
}

class NotificationManager {
    fun sendNotification(notification: String){}
}

class UserManager {
    fun addUser(user: String){}
    fun deleteUser(user: String){}
}