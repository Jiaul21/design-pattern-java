package org.example.adapter;

// Target Interface
interface ModernPrinter {
    void print(String message);
}

// Adaptee (existing class we can't change)
class LegacyPrinter {
    public void showText(String text) {
        System.out.println("LegacyPrinter: " + text);
    }
}

// Adapter Class that helps to one to another
class PrinterAdapter implements ModernPrinter {
    private final LegacyPrinter legacyPrinter;

    public PrinterAdapter(LegacyPrinter legacyPrinter) {
        this.legacyPrinter = legacyPrinter;
    }

    @Override
    public void print(String message) {
        legacyPrinter.showText(message);  // adapting call
    }
}

public class Main {
    public static void main(String[] args) {
        LegacyPrinter legacy = new LegacyPrinter();
        ModernPrinter printer = new PrinterAdapter(legacy);
        printer.print("Hello from adapter!");
    }
}


