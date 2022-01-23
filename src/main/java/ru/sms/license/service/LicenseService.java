package ru.sms.license.service;

import org.springframework.stereotype.Service;
import ru.sms.license.model.License;

import java.util.Random;

@Service
public class LicenseService {
    public License getLicense(String licenseId, String organizationId) {
        final License license = new License();
        license.setId(new Random().nextInt(100));
        license.setLicenseId(licenseId);
        license.setOrganizationId(organizationId);
        license.setDescription("Software Product");
        license.setProductName("Ostock");
        license.setLicenseType("full");

        return license;
    }

    public String createLicense(License license, String organizationId) {
        String responseMessage = null;
        if (license != null) {
            license.setOrganizationId(organizationId);
            responseMessage = String.format("This is the post and the object is: %s", license);
        }
        return responseMessage;
    }

    public String updateLicense(License license, String organizationId) {
        String responseMessage = null;
        if (license != null) {
            license.setOrganizationId(organizationId);
            responseMessage = String.format("This is the put and the object is: %s", license);
        }
        return responseMessage;
    }

    public String deleteLicense(String licenseId, String organizationId) {
        return String.format("Deleting license with id %s for organization %s", licenseId, organizationId);
    }

}
