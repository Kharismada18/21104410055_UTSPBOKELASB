/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package penyanyi;

/**
 *
 * @author Kharisma Dinda Amareta
* Kelas TI-B
* NIM 21104410055
 */
Public class Pop {
String penyanyi = "Raisa";
String lagu = "Kali Kedua";

Pop(){
    
}
Pop(String penyanyi, String lagu){
    this.penyanyi = penyanyi;
    this.lagu = lagu;
    System.out.printIn(this.penyanyi=" <=> "+this.lagu);
}

public void singer(String penyanyi){
    this.penyanyi = penyanyi;
}

protected void song(String lagu){
    this.lagu = lagu;
}

private void cetakLabel(){
    System.out.printIn(this.penyanyi+" <=> "+this.lagu);
              
}

    void cetakLabel1() {
        
    }
}
