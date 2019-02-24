package extensionFunctions4

import atomictest.eq

class Book(val title: String)

fun categorize(book: Book, category: String) =
        """title: "${book.title}", category: $category"""

fun main(args: Array<String>) {
    categorize(Book("Dracula"), "Vampire") eq
            """title: "Dracula", category: Vampire"""
}