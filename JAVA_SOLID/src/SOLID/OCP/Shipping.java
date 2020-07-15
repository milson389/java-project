package SOLID.OCP;

// Open/Close Principle = terbuka untuk ditambahkan tertutup untuk dimodifikasi
// system yg telah dibuat tidak perlu diubah melainkan cukup ditambahkan dengan prinsip ini

abstract class Shipping {
    abstract public int calculate(Product product);
}

class JNEShipping extends Shipping{

    @Override
    public int calculate(Product product) {
        return 0;
    }
}

class TIKIShipping extends Shipping{

    @Override
    public int calculate(Product product) {
        return 0;
    }
}

class POSINDOShipping extends Shipping{

    @Override
    public int calculate(Product product) {
        return 0;
    }
}

class SiCepatShipping extends Shipping{

    @Override
    public int calculate(Product product) {
        return 0;
    }
}


