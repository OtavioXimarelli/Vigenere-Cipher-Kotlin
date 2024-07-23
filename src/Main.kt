import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    while (true) {
        println("\nEscolha uma opção:")
        println("1 - Codificar mensagem")
        println("2 - Decodificar mensagem")
        println("0 - Sair")

        val choice = scanner.nextLine().toIntOrNull()

        when(choice) {
            1 -> {
                println("Digite a mensagem: ")
                val messageToEncrypt = getUserInput(scanner)

                println("Digite a chave: ")
                val keyToEncrypt = getUserInput(scanner)

                encryptMessage(messageToEncrypt, keyToEncrypt)
            }
            2 -> {
                println("Digite a mensagem: ")
                val messageToEncrypt = getUserInput(scanner)

                println("Digite a chave: ")
                val keyToEncrypt = getUserInput(scanner)

                decodeMessage(messageToEncrypt, keyToEncrypt)
            }
            0 -> {
                println("Saindo...")
                break
            }
            else -> println("Opção invalida. Tente novamente")
        }
    }

}

fun getUserInput(scanner: Scanner): String {
    return scanner.nextLine()

}


fun encryptMessage(message: String, key: String, alphabet: String = "abcdefghijklmnopqrstuvwxyz"): String {
    var finalMessage = ""
    var keyIndex = 0

    for (char in message.lowercase()) {
        if (!char.isLetter()) {
            finalMessage += char
        } else {
            val keyChar = key[keyIndex % key.length]
            keyIndex++

            val offset = alphabet.indexOf(keyChar)
            val index = alphabet.indexOf(char)
            val newIndex = (index + offset) % alphabet.length

            finalMessage += alphabet[newIndex]
        }
    }

    println("O texto criptografado é: $finalMessage")
    return finalMessage
}

fun decodeMessage(message: String, key: String, alphabet: String = "abcdefghijklmnopqrstuvwxyz"): String {
    var finalMessage = ""
    var keyIndex = 0

    for (char in message.lowercase()) {
        if (!char.isLetter()) {
            finalMessage += char
        } else {
            val keyChar = key[keyIndex % key.length]
            keyIndex++

            val offset = alphabet.indexOf(keyChar)
            val index = alphabet.indexOf(char)
            val newIndex = (index - offset + alphabet.length) % alphabet.length  // Decryption: subtract offset

            finalMessage += alphabet[newIndex]
        }
    }

    println("A mensagem decodificada é: $finalMessage")
    return finalMessage
}
