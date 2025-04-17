package com.minjikim.codecobainbackend.util;
/*
import org.bouncycastle.jce.provider.BouncyCastleProvider;

import java.io.FileReader;
import java.io.StringWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.PrivateKey;
import java.security.Security;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.KeyFactory;
import java.util.Base64;
import org.springframework.context.annotation.Profile;

@Profile("sensor")
public class PemUtil {

    public static byte[] readPrivateKey(String filename) throws Exception {
        FileReader reader = new FileReader(filename);
        StringWriter writer = new StringWriter();
        int c;
        while ((c = reader.read()) != -1) writer.write(c);
        String privateKeyPEM = writer.toString()
                .replace("-----BEGIN PRIVATE KEY-----", "")
                .replace("-----END PRIVATE KEY-----", "")
                .replaceAll("\\s", "");
        return Base64.getDecoder().decode(privateKeyPEM);
    }

    public static PrivateKey getPrivateKeyFromBytes(byte[] keyBytes) throws Exception {
        Security.addProvider(new BouncyCastleProvider());
        PKCS8EncodedKeySpec spec = new PKCS8EncodedKeySpec(keyBytes);
        KeyFactory kf = KeyFactory.getInstance("RSA");
        return kf.generatePrivate(spec);
    }


}

 */