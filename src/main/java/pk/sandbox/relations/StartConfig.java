package pk.sandbox.relations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import pk.sandbox.relations.model.*;
import pk.sandbox.relations.repository.CustomerRepo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
public class StartConfig {

    CustomerRepo customerRepo;

    @Autowired
    public StartConfig(CustomerRepo customerRepo) {
        this.customerRepo = customerRepo;

        List<Address> addresses = new ArrayList<>();
        addresses.add(new Address("Gazowa", "52/1", "Wrocław", EAddressType.Instalacja));
        addresses.add(new Address("Klimasa", "43/14", "Wrocław", EAddressType.Zamieszkania));
        addresses.add(new Address("Mikołajewicza", "8B/1", "Rawicz", EAddressType.Zamieszkania));

        DetalCustomer customer1 = new DetalCustomer("Jan", "Nowak");
        BusinessCustomer customer2 = new BusinessCustomer("Budpol");

        Subscription subscription = new Subscription("300/30", false, true, false);
        GponSettings gpon = new GponSettings.GponSettingsBuilder()
                .setOltId(0)
                .setOltPort(2)
                .build();
        subscription.setGponSettings(gpon);

        IpSettings ipSettings = new IpSettings();
        ipSettings.setIp("172.16.1.2");
        ipSettings.setSubnetMask("255.255.255.128");
        ipSettings.setGateway("172.16.1.1");
        ipSettings.setVlan(161);
        ipSettings.setMacId("11:22:33:44:55:66");
        subscription.setIpSettings(ipSettings);

        customer1.setSubscription(subscription);
        customer1.setIdCard("ABC123456");
        customer1.setPesel("85010234567");

        customer2.setNip("654-321-78-45");

        customer1.setAddresses(Arrays.asList(addresses.get(0), addresses.get(1)));
        customer2.setAddresses(Arrays.asList(addresses.get(2)));
        customerRepo.save(customer1);
        customerRepo.save(customer2);
    }
}
