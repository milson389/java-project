package SOLID.LSP;

import java.util.Date;

abstract class Product {
    abstract String setName();

    public void getProductInfo(){

    }
}


/**
 * Aturan LSP
 * Contravariant, kondisi dimana parameter dari sebuah fungsi yang berada pada subclass harus memiliki tipe dan jumlah yang sama
 * dengan fungsi yang ada di superclassnya
 * Covariant, kondisi pengembalian nilai dari fungsi yang berada pada subclass dan superclassnya
 * PreCondition, tindakan yang harus ada sebelum proses dijalankan
 * PostCondition, tindakan yang harus ada sesudah proses dijalankan
 * contoh pre/post condition , saat proses C.R.U.D. pada Database telah selesai, kita harus memastikan database telah tertutup
 * InVariant, kondisi suatu proses yang benar sebelum proses tersebut dimulai dan tetap benar setelahnya
 * Constraint, pembatasan yang ditentukan oleh superclass terhadap perubahan keadaan sebuah objek
 * maksud constraint yaitu subclass tidak diijinkan untuk mengubah keadaan dari nilai obyek yg ia warisi dari superclassnya
 */

