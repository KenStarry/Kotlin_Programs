package solid_principles.dsp

//  each of our payment methods is processed separately in our Service class in a hard code way
class PaymentService {

    private val paymentProcessorPaypal = PaypalPayment()
    private val paymentProcessorStripe = StripePayment()

    fun processPaymentWithPaypal(amount: Double): Boolean {
        return paymentProcessorPaypal.processPayment(amount)
    }

    fun processPaymentWithStripe(amount: Double): Boolean {
        return paymentProcessorStripe.processPayment(amount)
    }
}

class PaypalPayment {
    fun processPayment(amount: Double): Boolean {
        // Process payment via Paypal API
        return true
    }
}

class StripePayment {
    fun processPayment(amount: Double): Boolean {
        // Process payment via Stripe API
        return true
    }
}

fun main() {
    val paymentService = PaymentService()
    println(paymentService.processPaymentWithPaypal(50.0)) // Process payment via Paypal API
    println(paymentService.processPaymentWithStripe(50.0)) // Process payment via Stripe API
}











































