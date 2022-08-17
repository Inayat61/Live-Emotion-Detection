/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package smsapi;

import com.teknikindustries.bulksms.SMS;
//import con.fingerprintsoft.notification.sms.SMS;
public class Smsty {
    public Smsty(){
        SMS jk= new SMS();
    
    jk.SendSMS("jawad_M", "jawad786110", "Alert Your car driver is in sleep mode", "+923492336771", "https://bulksms.vsms.net/eapi/submission/send_sms/2/2.0");
    }
}
