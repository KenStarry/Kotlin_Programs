package solid_principles.dsp

interface PaymentType {
    fun processPayment(amount: Double): Boolean
}

class PaypalPaymentProcessor : PaymentType {
    override fun processPayment(amount: Double): Boolean {
        // Process payment via Paypal API
        return true
    }
}

class StripePaymentProcessor : PaymentType {
    override fun processPayment(amount: Double): Boolean {
        // Process payment via Stripe API
        return true
    }
}

class PaymentServicey(private val paymentProcessor: PaymentType) {
    fun processPayment(amount: Double): Boolean {
        return paymentProcessor.processPayment(amount)
    }
}

fun main() {
    val paymentProcessor = PaypalPaymentProcessor()
    val paymentService = PaymentServicey(paymentProcessor)

    println(paymentService.processPayment(50.0)) // Process payment via Paypal API
}