package SOLID.ISP;

interface EWalletProvider{
    void accountID();
    void walletProviderID();
}

interface PaymentProvider{
    void paymentName();
    void amount();
}

interface BankProvider{
    void bankID();
    void virtualAccount();
}

/**
 * Interface Segregation Principles
 * prinsip ini bertujuan untuk mengurangi jumlah ketergantungan class terhadap interface class yang tidak dibutuhkan
 * memecah isi interface menjadi bagian bagian yang lebih kecil
 */
