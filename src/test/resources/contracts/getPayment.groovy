import org.springframework.cloud.contract.spec.Contract

Contract.make {
    description "Should return a payment"
    request {
        url "/payments/sepa-credit-transfers/27e90ee3-7ca1-46dd-a78b-50842da07c4b"
//        url $(
//                consumer(regex('/payments/sepa-credit-transfers/[0-9]+')),
//                producer('/payments/sepa-credit-transfers/27e90ee3-7ca1-46dd-a78b-50842da07c4b')
//        )
        method GET()
    }
    response {
        status OK()
        body file("getPayment.json")
        headers {
            contentType('application/json')
        }
    }
}