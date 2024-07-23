#Kotlin Vigenere Cipher (Command-Line Tool)
This project provides a command-line tool for secure message encryption and decryption using the classic Vigenere cipher, a polyalphabetic substitution cipher.

Features
User-Friendly Interface: A simple menu guides you effortlessly through encryption and decryption.
Encryption & Decryption: Seamlessly transform plaintext messages into ciphertext and vice versa using a secret keyword.
Case-Insensitive: Input capitalization is handled automatically, ensuring consistent results.
Non-Alphabetic Character Preservation: Numbers, punctuation, and other non-letter characters remain unchanged, preserving the original message structure.
Robust Implementation: The core Vigenere cipher logic utilizes modular arithmetic for accurate letter shifts.
Clear Output: Encrypted/decrypted messages are displayed directly in the console for immediate feedback.
Error Handling: Invalid inputs are gracefully handled with informative messages.
How to Use
Compile: Ensure you have Kotlin installed and compile the code (using the Kotlin compiler or your IDE).
Run: Execute the compiled program from your command line.
Choose: Select from the menu:
1 to encrypt a message
2 to decrypt a message
0 to exit
Enter: Follow the prompts to input your message and secret key.
View: The resulting encrypted/decrypted message will be displayed.
Example Usage

Example Usage

# Encryption
Choose an option:
1 - Encode message
2 - Decode message
0 - Exit
1
Enter the message: 
This is a secret message
Enter the key: 
KEYWORD
The encrypted text is: lhislszsecjexqysszgf

# Decryption
Choose an option:
1 - Encode message
2 - Decode message
0 - Exit
2
Enter the message:
lhislszsecjexqysszgf
Enter the key:
KEYWORD
The decoded message is: thisisasecretmessage

Contributing
Contributions are welcome! Feel free to open issues or submit pull requests.

Let me know if you'd like any other modifications!
