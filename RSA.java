package com.encryption;

import java.security.*;
import java.util.Base64;

public class RSA{
    public static void main(String[] args) throws NoSuchAlgorithmException {
        KeyPairGenerator keyPairGenerator =
                KeyPairGenerator.getInstance("RSA");
        SecureRandom secureRandom = new SecureRandom();

        keyPairGenerator.initialize(2048,secureRandom);

        KeyPair pair = keyPairGenerator.generateKeyPair();

        PublicKey publicKey = pair.getPublic();

        String publicKeyString =
                Base64.getEncoder().encodeToString(publicKey.getEncoded());

        System.out.println("public key = "+ publicKeyString);

        PrivateKey privateKey = pair.getPrivate();
        String privateKeyString =
                Base64.getEncoder().encodeToString(privateKey.getEncoded());

        System.out.println("private key = "+ privateKeyString);

    }

}