package SOLID.DIP;

public class PaymentService {
    private Database database;

    public PaymentService(Database database){
        this.database = database;
    }

    void paymentIsValid(){

    }

    void openDatabase(){

    }

    void addNewPayment(){

    }

    void removePaymentByID(){

    }

    void updatePaymentByID(){

    }
}

/**
 * Dependency Inversion Principles
 * mirip prinsip layering dalam aplikasi
 * low level modules -> bertanggung jawab dengan fungsi yang mendetail
 * high level modules -> menggunakan low level classes untuk mencapai tugas yang lebih besar
 * bergantung pada abstraksi ketika ada ketergantugnan pada kelas seperti interface daripada referensi langsung ke kelas lainnya
 * */