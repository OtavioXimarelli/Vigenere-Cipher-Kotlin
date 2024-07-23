# Kotlin Vigenère Cipher 🔐

This command-line tool securely encrypts and decrypts messages using the classic Vigenère cipher, a historically significant polyalphabetic substitution cipher known for its strength in the pre-computer era.

## Key Features
- Command-Line Interface: Easily encrypt and decrypt messages directly from your terminal.
- Kotlin Implementation: Modern and expressive programming language for a clean codebase.
- User-Friendly Menu: Intuitive menu guides you through the encryption/decryption process.

## Getting Started
### Prerequisites
Ensure you have Kotlin installed on your system. [Kotlin Installation Guide](https://kotlinlang.org/docs/tutorials/command-line.html)

### Compilation
- Open the project in your favorite IDE (IntelliJ IDEA, etc.) or use the Kotlin compiler directly.
- Build the project to generate the executable file.

### Running the Application
- Open your terminal or command prompt.
- Navigate to the directory where the compiled executable is located.
- Run the executable (e.g., `./kotlin-vigenere-cipher` or `kotlin-vigenere-cipher.exe`).

### Using the Menu
- **Encrypt:** Enter 1 and follow the prompts to provide your message and secret key.
- **Decrypt:** Enter 2 and follow the prompts to provide your ciphertext and secret key.
- **Exit:** Enter 0 to quit the application.

## Example Usage
```bash
# Encryption
Choose an option:
1 - Encode message
2 - Decode message
0 - Exit
1
Enter the message: attackatdawn
Enter the key: LEMON
The encrypted text is: lxfopvefrnhr

# Decryption
Choose an option:
1 - Encode message
2 - Decode message
0 - Exit
2
Enter the message: lxfopvefrnhr
Enter the key: LEMON
The decoded message is: attackatdawn
````

## Contributions
😄 Contributions are always welcome! Feel free to open issues or submit pull requests to contribute to this project.

Let me know if you need further modifications!
