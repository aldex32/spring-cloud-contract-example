package sinanaj.aldo.payment.service;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PisService {

    @GetMapping(value = "/payments/sepa-credit-transfers/{paymentId}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<String> getPaymentById(@PathVariable("paymentId") String paymentId) {

        String body = String.format("{\n"
                + "  \"creditorAccount\": {\n"
                + "    \"iban\": \"NL66MOYO0000000001\"\n"
                + "  },\n"
                + "  \"creditorName\": \"Merchant123\",\n"
                + "  \"debtorAccount\": {\n"
                + "    \"iban\": \"NL66MOYO0000000002\"\n"
                + "  },\n"
                + "  \"instructedAmount\": {\n"
                + "    \"currency\": \"EUR\",\n"
                + "    \"value\": 123.5\n"
                + "  },\n"
                + "  \"paymentId\": \"%s\",\n"
                + "  \"remittanceInformationUnstructured\": \"Ref Number Merchant\",\n"
                + "  \"tppName\": \"TPP name\",\n"
                + "  \"internalStatus\": \"OPEN\",\n"
                + "  \"tppNokRedirectUri\": \"https://www.tpp.com\",\n"
                + "  \"tppRedirectUri\": \"https://www.tpp.com\",\n"
                + "  \"transactionDateTimestamp\": 1543408716815\n"
                + "}", paymentId);

        return ResponseEntity.ok(body);
    }
}
