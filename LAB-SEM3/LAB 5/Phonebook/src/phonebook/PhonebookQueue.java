/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonebook;


public class PhonebookQueue {
        public static void main(String[]args){
        Phonebook phonebook = new Phonebook();

        phonebook.add("Pendaftaran UMT","096684342");
        phonebook.add("Jabatan Pengurusan Akademik UMT","096684219");
        phonebook.add("Fakulti Teknologi Kejuruteraan Kelautan dan Informatik","096683220");

        phonebook.printAll();
    }  
}
    

