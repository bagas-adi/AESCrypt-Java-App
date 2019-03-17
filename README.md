# AESCrypt-Java-App
AESCrypt for Java Application, forked from AESCrypt-Android by <a href="https://github.com/code-assassin/AESCrypt-Android">scottyab</a>
<br/>I use this to encrypt & decrypt "things" from my Android App and my Computer.
<ol>
<li>First, I generate the plaintext here (somekind of URL)</li> 
<li>the ciphertext is stored in database and can be accessed from API</li>
<li>the Android App get the data from API and decrypted it to access things, so it cannot be accessed from any app ;)</li>
</ol>
<br/>Hope it can help 
<h2>Usage</h2>
<h3>Encrypt</h3>
<pre>String password = "password";
String message = "hello world";	
try {
    String encryptedMsg = AESCrypt.encrypt(password, message);
}catch (GeneralSecurityException e){
    //handle error
}</pre>
<h3>Decrypt</h3>
<pre>String password = "password"; 
String encryptedMsg = "2B22cS3UC5s35WBihLBo8w==";
try {
    String messageAfterDecrypt = AESCrypt.decrypt(password, encryptedMsg);
}catch (GeneralSecurityException e){
     //handle error - could be due to incorrect password or tampered encryptedMsg
}</pre>
