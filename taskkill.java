import java.io.*;
import java.sql.*;
import java.awt.*;
import java.time.*;
import java.text.*;
import java.awt.event.*;
import java.util.TimerTask;
import java.time.LocalDateTime;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import javax.swing.*;


//Start CMD as administrator privileged.
//chkdsk & defrag does not work at all. [Printing only empty lines.]


public class taskkill{
	
	public static void main (String [] args){
		//int[] array;
		//int i = 11;
		//array = new int[i];
		
		
		//int[] array = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		//String[] Sarray = new String[] {FlashUtil64_32_0_0_171_ActiveX.exe, MovieColorEnhancer.exe, Media+Player10Serv.exe, EasySpeedUpManager.exe, AthBtTray.exe, YCMMirage.exe, sipnotify.exe, BtvStack.exe, SWMAgent.exe, CLMLSvc.exe, jusched.exe, AdobeARM.exe};
		
		try{
									// /F = Force 	/im = image name
			Runtime runtime = Runtime.getRuntime();
			Process proc000 = runtime.exec("taskkill /F /im FlashUtil64_32_0_0_171_ActiveX.exe");
			Process proc001 = runtime.exec("taskkill /F /im MovieColorEnhancer.exe");
			Process proc002 = runtime.exec("taskkill /F /im Media+Player10Serv.exe");
			Process proc003 = runtime.exec("taskkill /F /im EasySpeedUpManager.exe");
			Process proc004 = runtime.exec("taskkill /F /im AnySign4PC.exe");
			Process proc005 = runtime.exec("taskkill /F /im AthBtTray.exe");
			Process proc006 = runtime.exec("taskkill /F /im YCMMirage.exe");
			Process proc007 = runtime.exec("taskkill /F /im sipnotify.exe");
			Process proc008 = runtime.exec("taskkill /F /im BtvStack.exe");
			Process proc009 = runtime.exec("taskkill /F /im SWMAgent.exe");
			Process proc010 = runtime.exec("taskkill /F /im AdobeARM.exe");
			Process proc011 = runtime.exec("taskkill /F /im igfxTray.exe");
			Process proc012 = runtime.exec("taskkill /F /im dinotify.exe");
			Process proc013 = runtime.exec("taskkill /F /im igfxext.exe");
			Process proc014 = runtime.exec("taskkill /F /im CLMLSvc.exe");
			Process proc015 = runtime.exec("taskkill /F /im jusched.exe");
			Process proc016 = runtime.exec("taskkill /F /im igfxHK.exe");
			Process proc017 = runtime.exec("taskkill /F /im igfxEM.exe");
			
			
			//Process chkdsk = runtime.exec("chkdsk");
			//Process defrag = runtime.exec("defrag /C");
			
			// chkdsk & defrag works but no progress is not appeared on cmd.
			
			/*
			for(int i = 0 ; i < 11 ; i++){
				
				Process procarray[i] = runtime.exec("taskkill /im Sarray[i]");
			}
			*/
		}
		
		catch(IOException a){
			
		}
		
		/*
			for(int o = 0 ; o < 11 ; o++){
				
				System.out.println(Sarray[o]);
			}
		*/
		System.out.println("\n'Adobe Reader and Acrobat Manager' has been killed.");
		System.out.println("'CyberLink Media Library Service' has been killed.");
		System.out.println("'Bluetooth Stack Server' has been killed.");
		System.out.println("'Java Update Scheduler' has been killed.");
		System.out.println("'Easy Speed Up Manager' has been killed.");
		System.out.println("'Movie Color Enhancer' has been killed.");
		System.out.println("'Bluetooth Tray' has been killed.");
		System.out.println("'igfx Modules' have been killed.");
		System.out.println("'Samsung Agent' has been killed.");
		System.out.println("'YouCam Mirage' has been killed.");
		System.out.println("'Media Player' has been killed.");
		System.out.println("'Adobe Update' has been killed.");
		System.out.println("'Nosstarter' has been killed.");
		System.out.println("'Sipnotify' has been killed.");
		System.out.println("'AnySign' has been killed.");
	}
}