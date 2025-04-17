package com.minjikim.codecobainbackend.util;
/*
import javax.net.ssl.*;
import java.io.FileInputStream;
import java.security.*;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import org.springframework.context.annotation.Profile;

@Profile("sensor")
public class AwsIotSslUtil {

    public static SSLSocketFactory getSocketFactory(
            String caCrtFile, String crtFile, String keyFile
    ) throws Exception {

        // CA 인증서
        CertificateFactory cf = CertificateFactory.getInstance("X.509");
        X509Certificate caCert = (X509Certificate) cf.generateCertificate(new FileInputStream(caCrtFile));

        // 디바이스 인증서
        X509Certificate clientCert = (X509Certificate) cf.generateCertificate(new FileInputStream(crtFile));

        // 개인 키
        byte[] keyBytes = PemUtil.readPrivateKey(keyFile);
        PrivateKey privateKey = PemUtil.getPrivateKeyFromBytes(keyBytes);

        // KeyStore
        KeyStore ks = KeyStore.getInstance(KeyStore.getDefaultType());
        ks.load(null);
        ks.setKeyEntry("alias", privateKey, "".toCharArray(), new java.security.cert.Certificate[]{clientCert});

        // TrustStore
        KeyStore trustStore = KeyStore.getInstance(KeyStore.getDefaultType());
        trustStore.load(null);
        trustStore.setCertificateEntry("ca", caCert);

        // TrustManager & KeyManager
        TrustManagerFactory tmf = TrustManagerFactory.getInstance("X509");
        tmf.init(trustStore);

        KeyManagerFactory kmf = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
        kmf.init(ks, "".toCharArray());

        SSLContext context = SSLContext.getInstance("TLSv1.2");
        context.init(kmf.getKeyManagers(), tmf.getTrustManagers(), new SecureRandom());

        return context.getSocketFactory();
    }


}

 */
