/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.monedaconversor;
import com.mycompany.monedaconversor.Moneda_DAL;
import java.util.Scanner;
/**
 *
 * @author CHURCHILL
 */
public class Moneda_UX {
   
     public static void main(String[] args) {
         try {            
              Scanner scanner = new Scanner(System.in);
              boolean exit = false;
        System.out.println("""
                                      Escoje una opcion:
                                         1.Ayuda
                                         2.Convertir moneda
                                         3.Monedas disponibles   
                                         4.Salir
                                      """);
             while (!exit) {     
                 switch (scanner.nextLine().trim()) {
                     case "1":                         
                         System.out.println("""
                                      Opciones disponibles:
                                         1.Ayuda(ver opciones disponibles)
                                         2.Convertir moneda(convertir moneda utilizando su codigo)
                                         3.Monedas disponibles(lista de las monedas disponibles)                                    
                                      """);
                         break;
                          case "2":                             
                              convert();                                 
                         break;
                          case "3":
                         monedasdisponibles();
                         break;
                          case "4":
                         exit = true;
                         break;
                        
                     default:
                          System.out.print("Opcion invalda");
                         break;
                 }
                 System.out.println("""
                                    ------------------------------------------
                                    Escoje una opcion
                                    """);
             }
         } catch (Exception ex) {
             System.out.println("Error" + ex.toString());
         }
      
    }
     public static void monedasdisponibles(){
       try {
            System.out.print("""
                                      Monedas disponibles:
                                      =============================================================================================
                                        AED = Dirham de los Emiratos Árabes Unidos     |  AFN = Afgani afgano                     |                 
                                        ALL = Lek albanés                              |  AMD = Dram armenio                      |                   
                                        ANG = Florín de las Antillas Neerlandesas      |  AOA = Kwanza angoleño                   |                 
                                        ARS = Peso argentino                           |  AUD = Dólar australiano                 |                
                                        AWG = Florín arubeño                           |  AZN = Manat azerí                       |                 
                                        BAM = Marco convertible de Bosnia-Herzegovina  |  BBD = Dólar de Barbado                  |                       
                                        BDT = Taka bangladesí                          |  BGN = Lev búlgaro                       |                  
                                        BHD = Dinar bahreiní                           |  BIF = Franco burundés                   |                  
                                        BMD = Dólar bermudeño                          |  BND = Dólar de Brunéi                   |                 
                                        BOB = Boliviano boliviano                      |  BRL = Real brasileño                    |                  
                                        BSD = Dólar bahameño                           |  BTN = Ngultrum butanés                  |                
                                        BWP = Pula botsuano                            |  BYN = Rublo bielorruso                  |                 
                                        BZD = Dólar beliceño                           |  CAD = Dólar canadiense                  |                 
                                        CDF = Franco congoleño                         |  CHF = Franco suizo                      |                   
                                        CLP = Peso chileno                             |  CNY = Yuan chino                        |                  
                                        COP = Peso colombiano                          |  CRC = Colón costarricense               |               
                                        CUP = Peso cubano                              |  CVE = Escudo caboverdiano               |             
                                        CZK = Corona checa                             |  DJF = Franco yibutiano                  |                
                                        DKK = Corona danesa                            |  DOP = Peso dominicano                   |                 
                                        DZD = Dinar argelino                           |  EGP = Libra egipcia                     |                  
                                        ERN = Nakfa eritreo                            |  ETB = Birr etíope                       |                   
                                        EUR = Euro                                     |  FJD = Dólar fiyiano                     |                    
                                        FKP = Libra malvinense                         |  FOK = Corona feroesa                    |                      
                                        GBP = Libra esterlina                          |  GEL = Lari georgiano                    |                   
                                        GGP = Libra de Guernsey                        |  GHS = Cedi ghanés                       |                   
                                        GIP = Libra de Gibraltar                       |  GMD = Dalasi gambiano                   |                 
                                        GNF = Franco guineano                          |  GTQ = Quetzal guatemalteco              |              
                                        GYD = Dólar guyanés                            |  HKD = Dólar de Hong Kong                |                
                                        HNL = Lempira hondureño                        |  HRK = Kuna croata                       |                 
                                        HTG = Gourde haitiano                          |  HUF = Forint húngaro                    |                   
                                        IDR = Rupia indonesia                          |  ILS = Nuevo séquel israelí              |             
                                        IMP = Libra de la Isla de Man                  |  INR = Rupia india                       |                
                                        IQD = Dinar iraquí                             |  IRR = Rial iraní                        |               
                                        ISK = Corona islandesa                         |  JEP = Libra de Jersey                   |             
                                        JMD = Dólar jamaicano                          |  JOD = Dinar jordano                     |           
                                        JPY = Yen japonés                              |  KES = Chelín keniano                    |           
                                        KGS = Som kirguís                              |  KHR = Riel camboyano                    |          
                                        KID = Dólar kiribatiano                        |  KMF = Franco comorense                  |          
                                        KRW = Won surcoreano                           |  KWD = Dinar kuwaití                     |         
                                        KYD = Dólar de las Islas Caimán                |  KZT = Tenge kazajo                      |      
                                        LAK = Kip laosiano                             |  LBP = Libra libanesa                    |      
                                        LKR = Rupia de Sri Lanka                       |  LRD = Dólar liberiano                   |        
                                        LSL = Loti lesothense                          |  LYD = Dinar libio                       |        
                                        MAD = Dirham marroquí                          |  MDL = Leu moldavo                       |         
                                        MGA = Ariary malgache                          |  MKD = Denar macedonio                   |        
                                        MMK = Kyat birmano                             |  MNT = Tugrik mongol                     |      
                                        MOP = Pataca macaense                          |  MRU = Ouguiya mauritana                 |       
                                        MUR = Rupia mauriciana                         |  MVR = Rufiyaa maldiva                   |       
                                        MWK = Kwacha malauí                            |  MXN = Peso mexicano                     |       
                                        MYR = Ringgit malayo                           |  MZN = Metical mozambiqueño              |        
                                        NAD = Dólar namibio                            |  NGN = Naira nigeriano                   |        
                                        NIO = Córdoba nicaragüense                     |  NOK = Corona noruega                    |        
                                        NPR = Rupia nepalí                             |  NZD = Dólar neozelandés                 |         
                                        OMR = Rial omaní                               |  PAB = Balboa panameño                   |         
                                        PEN = Sol peruano                              |  PGK = Kina de Papúa Nueva Guinea        |        
                                        PHP = Peso filipino                            |  PKR = Rupia pakistaní                   |      
                                        PLN = Zloty polaco                             |  PYG = Guaraní paraguayo                 |          
                                        QAR = Riyal catarí                             |  RON = Leu rumano                        |             
                                        RSD = Dinar serbio                             |  RUB = Rublo ruso                        |          
                                        RWF = Franco ruandés                           |  SAR = Riyal saudí                       |             
                                        SBD = Dólar de las Islas Salomón               |  SCR = Rupia de Seychelles               |           
                                        SDG = Libra sudanesa                           |  SEK = Corona sueca                      |          
                                        SGD = Dólar de Singapur                        |  SHP = Libra de Santa Elena              |         
                                        SLE = Leone de Sierra Leona                    |  SLL = Leone de Sierra Leona             |         
                                        SOS = Chelín somalí                            |  SRD = Dólar surinamés                   |        
                                        SSP = Libra sursudanesa                        |  STN = Dobra de Santo Tomé y Príncipe    |     
                                        SYP = Libra siria                              |  SZL = Lilangeni suazi                   |         
                                        THB = Baht tailandés                           |  TJS = Somoni tayiko                     |            
                                        TMT = Manat turcomano                          |  TND = Dinar tunecino                    |         
                                        TOP = Pa'anga tongano                          |  TRY = Lira turca                        |                 
                                        TTD = Dólar de Trinidad y Tobago               |  TVD = Dólar tuvaluano                   |  
                                        TWD = Nuevo dólar taiwanés                     |  TZS = Chelín tanzano                    |  
                                        UAH = Grivna ucraniana                         |  UGX = Chelín ugandés                    |  
                                        USD = Dólar estadounidense                     |  UYU = Peso uruguayo                     |  
                                        UZS = Som uzbeko                               |  VES = Bolívar venezolano                |  
                                        VND = Dong vietnamita                          |  VUV = Vatu vanuatuense                  |  
                                        WST = Tala samoano                             |  XAF = Franco CFA de África Central      |  
                                        XCD = Dólar del Caribe Oriental                |  XDR = Derechos especiales de giro       |  
                                        XOF = Franco CFA de África Occidental          |  XPF = Franco CFP                        |  
                                        YER = Rial yemení                              |  ZAR = Rand sudafricano                  |  
                                        ZMW = Kwacha zambiano                          |  ZWL = Dólar zimbabuense                 |  
                                      =============================================================================================
                                            """);

                                 
            } catch (Exception ex) {
            System.out.println("------------------------------------------");
             System.out.println("Error" + ex.toString());
         }
     }
     public static void convert() {
         try {
                  Scanner scanner = new Scanner(System.in);
                   System.out.println("--Ingresar Codigo de la moneda actual");
                    Moneda_DAL monedaIn = getMoneda();
                     System.out.println(monedaIn.toString());
                     System.out.println("--Ingresar Codigo de la moneda a convertir");
                      Moneda_DAL monedaOut = getMoneda();
                     System.out.println(monedaOut.toString());
                     System.out.println("--Ingresar la cantidad a convertir");
                     double cantidad = Double.parseDouble(scanner.nextLine());
                     System.out.println("------------------------------------------");
                     System.out.println("--La cantidad equivale a "+monedaIn.convertir(cantidad,monedaOut)+monedaOut.getSimbolo()+
                             " en "+monedaOut.getNombre());                 
            } catch (Exception ex) {
            System.out.println("------------------------------------------");
             System.out.println("Error" + ex.toString());
         }
    }
      public static Moneda_DAL getMoneda(){
           Scanner scanner = new Scanner(System.in);
          String codigo = scanner.nextLine().toUpperCase().trim();
          Moneda_DAL moneda = null;
          boolean pass = true;
          while (pass) {
             switch (codigo) {
                     case "AED":
                        moneda = new Moneda_DAL("Dirham de Emiratos Árabes Unidos", codigo, "د.إ");
                        pass = false;
                        break;
                    case "AFN":
                        moneda = new Moneda_DAL("Afgani afgano", codigo, "؋");
                        pass = false;
                        break;
                    case "ALL":
                        moneda = new Moneda_DAL("Lek albanés", codigo, "L");
                        pass = false;
                        break;
                    case "AMD":
                        moneda = new Moneda_DAL("Dram armenio", codigo, "֏");
                        pass = false;
                        break;
                    case "ANG":
                        moneda = new Moneda_DAL("Florín de las Antillas Neerlandesas", codigo, "ƒ");
                        pass = false;
                        break;
                    case "AOA":
                        moneda = new Moneda_DAL("Kwanza angoleño", codigo, "Kz");
                        pass = false;
                        break;
                    case "ARS":
                        moneda = new Moneda_DAL("Peso argentino", codigo, "$");
                        pass = false;
                        break;
                    case "AUD":
                        moneda = new Moneda_DAL("Dólar australiano", codigo, "$");
                        pass = false;
                        break;
                    case "AWG":
                        moneda = new Moneda_DAL("Florín arubeño", codigo, "ƒ");
                        pass = false;
                        break;
                    case "AZN":
                        moneda = new Moneda_DAL("Manat azerbaiyano", codigo, "₼");
                        pass = false;
                        break;
                    case "BAM":
                        moneda = new Moneda_DAL("Marco convertible de Bosnia-Herzegovina", codigo, "KM");
                        pass = false;
                        break;
                    case "BBD":
                        moneda = new Moneda_DAL("Dólar de Barbados", codigo, "$");
                        pass = false;
                        break;
                    case "BDT":
                        moneda = new Moneda_DAL("Taka bangladesí", codigo, "৳");
                        pass = false;
                        break;
                    case "BGN":
                        moneda = new Moneda_DAL("Lev búlgaro", codigo, "лв");
                        pass = false;
                        break;
                    case "BHD":
                        moneda = new Moneda_DAL("Dinar bareiní", codigo, ".د.ب");
                        pass = false;
                        break;
                    case "BIF":
                        moneda = new Moneda_DAL("Franco burundés", codigo, "FBu");
                        pass = false;
                        break;
                    case "BMD":
                        moneda = new Moneda_DAL("Dólar bermudeño", codigo, "$");
                        pass = false;
                        break;
                    case "BND":
                        moneda = new Moneda_DAL("Dólar bruneano", codigo, "$");
                        pass = false;
                        break;
                    case "BOB":
                        moneda = new Moneda_DAL("Boliviano", codigo, "Bs.");
                        pass = false;
                        break;
                    case "BRL":
                        moneda = new Moneda_DAL("Real brasileño", codigo, "R$");
                        pass = false;
                        break;
                    case "BSD":
                        moneda = new Moneda_DAL("Dólar bahameño", codigo, "$");
                        pass = false;
                        break;
                    case "BTN":
                        moneda = new Moneda_DAL("Ngultrum butanés", codigo, "Nu.");
                        pass = false;
                        break;
                    case "BWP":
                        moneda = new Moneda_DAL("Pula botsuano", codigo, "P");
                        pass = false;
                        break;
                    case "BYN":
                        moneda = new Moneda_DAL("Rublo bielorruso", codigo, "Br");
                        pass = false;
                        break;
                    case "BZD":
                        moneda = new Moneda_DAL("Dólar beliceño", codigo, "$");
                        pass = false;
                        break;
                    case "CAD":
                        moneda = new Moneda_DAL("Dólar canadiense", codigo, "$");
                        pass = false;
                        break;
                    case "CDF":
                        moneda = new Moneda_DAL("Franco congoleño", codigo, "FC");
                        pass = false;
                        break;
                    case "CHF":
                        moneda = new Moneda_DAL("Franco suizo", codigo, "Fr.");
                        pass = false;
                        break;
                    case "CLP":
                        moneda = new Moneda_DAL("Peso chileno", codigo, "$");
                        pass = false;
                        break;
                    case "CNY":
                        moneda = new Moneda_DAL("Yuan chino", codigo, "¥");
                        pass = false;
                        break;
                    case "COP":
                        moneda = new Moneda_DAL("Peso colombiano", codigo, "$");
                        pass = false;
                        break;
                    case "CRC":
                        moneda = new Moneda_DAL("Colón costarricense", codigo, "₡");
                        pass = false;
                        break;
                    case "CUP":
                        moneda = new Moneda_DAL("Peso cubano", codigo, "$");
                        pass = false;
                        break;
                    case "CVE":
                        moneda = new Moneda_DAL("Escudo caboverdiano", codigo, "$");
                        pass = false;
                        break;
                    case "CZK":
                        moneda = new Moneda_DAL("Corona checa", codigo, "Kč");
                        pass = false;
                        break;
                    case "DJF":
                        moneda = new Moneda_DAL("Franco yibutiano", codigo, "Fdj");
                        pass = false;
                        break;
                    case "DKK":
                        moneda = new Moneda_DAL("Corona danesa", codigo, "kr");
                        pass = false;
                        break;
                    case "DOP":
                        moneda = new Moneda_DAL("Peso dominicano", codigo, "$");
                        pass = false;
                        break;
                    case "DZD":
                        moneda = new Moneda_DAL("Dinar argelino", codigo, "د.ج");
                        pass = false;
                        break;
                    case "EGP":
                        moneda = new Moneda_DAL("Libra egipcia", codigo, "£");
                        pass = false;
                        break;
                    case "ERN":
                        moneda = new Moneda_DAL("Nakfa eritreo", codigo, "Nfk");
                        pass = false;
                        break;
                    case "ETB":
                        moneda = new Moneda_DAL("Birr etíope", codigo, "Br");
                        pass = false;
                        break;
                    case "EUR":
                        moneda = new Moneda_DAL("Euro", codigo, "€");
                        pass = false;
                        break;
                    case "FJD":
                        moneda = new Moneda_DAL("Dólar fiyiano", codigo, "$");
                        pass = false;
                        break;
                    case "FKP":
                        moneda = new Moneda_DAL("Libra malvinense", codigo, "£");
                        pass = false;
                        break;
                    case "FOK":
                        moneda = new Moneda_DAL("Corona feroesa", codigo, "kr");
                        pass = false;
                        break;
                    case "GBP":
                        moneda = new Moneda_DAL("Libra esterlina", codigo, "£");
                        pass = false;
                        break;
                    case "GEL":
                        moneda = new Moneda_DAL("Lari georgiano", codigo, "₾");
                        pass = false;
                        break;
                    case "GGP":
                        moneda = new Moneda_DAL("Libra de Guernsey", codigo, "£");
                        pass = false;
                        break;
                    case "GHS":
                        moneda = new Moneda_DAL("Cedi ghanés", codigo, "₵");
                        pass = false;
                        break;
                    case "GIP":
                        moneda = new Moneda_DAL("Libra gibraltareña", codigo, "£");
                        pass = false;
                        break;
                    case "GMD":
                        moneda = new Moneda_DAL("Dalasi gambiano", codigo, "D");
                        pass = false;
                        break;
                    case "GNF":
                        moneda = new Moneda_DAL("Franco guineano", codigo, "FG");
                        pass = false;
                        break;
                    case "GTQ":
                        moneda = new Moneda_DAL("Quetzal guatemalteco", codigo, "Q");
                        pass = false;
                        break;
                    case "GYD":
                        moneda = new Moneda_DAL("Dólar guyanés", codigo, "$");
                        pass = false;
                        break;
                    case "HKD":
                        moneda = new Moneda_DAL("Dólar de Hong Kong", codigo, "$");
                        pass = false;
                        break;
                    case "HNL":
                        moneda = new Moneda_DAL("Lempira hondureño", codigo, "L");
                        pass = false;
                        break;
                    case "HRK":
                        moneda = new Moneda_DAL("Kuna croata", codigo, "kn");
                        pass = false;
                        break;
                    case "HTG":
                        moneda = new Moneda_DAL("Gourde haitiano", codigo, "G");
                        pass = false;
                        break;
                    case "HUF":
                        moneda = new Moneda_DAL("Forinto húngaro", codigo, "Ft");
                        pass = false;
                        break;
                    case "IDR":
                       moneda = new Moneda_DAL("Rupia indonesia", codigo, "Rp");
                       pass = false;
                       break;
                   case "ILS":
                       moneda = new Moneda_DAL("Nuevo shéquel israelí", codigo, "₪");
                       pass = false;
                       break;
                   case "IMP":
                       moneda = new Moneda_DAL("Libra de la Isla de Man", codigo, "£");
                       pass = false;
                       break;
                   case "INR":
                       moneda = new Moneda_DAL("Rupia india", codigo, "₹");
                       pass = false;
                       break;
                   case "IQD":
                       moneda = new Moneda_DAL("Dinar iraquí", codigo, "ع.د");
                       pass = false;
                       break;
                   case "IRR":
                       moneda = new Moneda_DAL("Rial iraní", codigo, "﷼");
                       pass = false;
                       break;
                   case "ISK":
                       moneda = new Moneda_DAL("Corona islandesa", codigo, "kr");
                       pass = false;
                       break;
                   case "JEP":
                       moneda = new Moneda_DAL("Libra de Jersey", codigo, "£");
                       pass = false;
                       break;
                   case "JMD":
                       moneda = new Moneda_DAL("Dólar jamaicano", codigo, "$");
                       pass = false;
                       break;
                   case "JOD":
                       moneda = new Moneda_DAL("Dinar jordano", codigo, "د.ا");
                       pass = false;
                       break;
                   case "JPY":
                       moneda = new Moneda_DAL("Yen japonés", codigo, "¥");
                       pass = false;
                       break;
                   case "KES":
                       moneda = new Moneda_DAL("Chelín keniano", codigo, "Sh");
                       pass = false;
                       break;
                   case "KGS":
                       moneda = new Moneda_DAL("Som kirguís", codigo, "с");
                       pass = false;
                       break;
                   case "KHR":
                       moneda = new Moneda_DAL("Riel camboyano", codigo, "៛");
                       pass = false;
                       break;
                   case "KID":
                       moneda = new Moneda_DAL("Dólar kiribatiano", codigo, "$");
                       pass = false;
                       break;
                   case "KMF":
                       moneda = new Moneda_DAL("Franco comorano", codigo, "CF");
                       pass = false;
                       break;
                   case "KRW":
                       moneda = new Moneda_DAL("Won surcoreano", codigo, "₩");
                       pass = false;
                       break;
                   case "KWD":
                       moneda = new Moneda_DAL("Dinar kuwaití", codigo, "د.ك");
                       pass = false;
                       break;
                   case "KYD":
                       moneda = new Moneda_DAL("Dólar de las Islas Caimán", codigo, "$");
                       pass = false;
                       break;
                   case "KZT":
                       moneda = new Moneda_DAL("Tengue kazajo", codigo, "₸");
                       pass = false;
                       break;
                   case "LAK":
                       moneda = new Moneda_DAL("Kip laosiano", codigo, "₭");
                       pass = false;
                       break;
                   case "LBP":
                       moneda = new Moneda_DAL("Libra libanesa", codigo, "ل.ل");
                       pass = false;
                       break;
                   case "LKR":
                       moneda = new Moneda_DAL("Rupia de Sri Lanka", codigo, "Rs");
                       pass = false;
                       break;
                   case "LRD":
                       moneda = new Moneda_DAL("Dólar liberiano", codigo, "$");
                       pass = false;
                       break;
                   case "LSL":
                       moneda = new Moneda_DAL("Loti lesotense", codigo, "L");
                       pass = false;
                       break;
                   case "LYD":
                       moneda = new Moneda_DAL("Dinar libio", codigo, "ل.د");
                       pass = false;
                       break;
                   case "MAD":
                       moneda = new Moneda_DAL("Dírham marroquí", codigo, "د.م.");
                       pass = false;
                       break;
                   case "MDL":
                       moneda = new Moneda_DAL("Leu moldavo", codigo, "L");
                       pass = false;
                       break;
                   case "MGA":
                       moneda = new Moneda_DAL("Ariary malgache", codigo, "Ar");
                       pass = false;
                       break;
                   case "MKD":
                       moneda = new Moneda_DAL("Denar macedonio", codigo, "ден");
                       pass = false;
                       break;
                   case "MMK":
                       moneda = new Moneda_DAL("Kyat birmano", codigo, "K");
                       pass = false;
                       break;
                   case "MNT":
                       moneda = new Moneda_DAL("Tugrik mongol", codigo, "₮");
                       pass = false;
                       break;
                   case "MOP":
                       moneda = new Moneda_DAL("Pataca de Macao", codigo, "MOP$");
                       pass = false;
                       break;
                   case "MRU":
                       moneda = new Moneda_DAL("Uguiya mauritana", codigo, "UM");
                       pass = false;
                       break;
                   case "MUR":
                       moneda = new Moneda_DAL("Rupia mauriciana", codigo, "₨");
                       pass = false;
                       break;
                   case "MVR":
                       moneda = new Moneda_DAL("Rufiyaa maldiva", codigo, "Rf");
                       pass = false;
                       break;
                   case "MWK":
                       moneda = new Moneda_DAL("Kwacha malauí", codigo, "MK");
                       pass = false;
                       break;
                   case "MXN":
                       moneda = new Moneda_DAL("Peso mexicano", codigo, "$");
                       pass = false;
                       break;
                   case "MYR":
                       moneda = new Moneda_DAL("Ringgit malasio", codigo, "RM");
                       pass = false;
                       break;
                   case "MZN":
                       moneda = new Moneda_DAL("Metical mozambiqueño", codigo, "MT");
                       pass = false;
                       break;
                   case "NAD":
                       moneda = new Moneda_DAL("Dólar namibio", codigo, "$");
                       pass = false;
                       break;
                   case "NGN":
                       moneda = new Moneda_DAL("Naira nigeriana", codigo, "₦");
                       pass = false;
                       break;
                   case "NIO":
                       moneda = new Moneda_DAL("Córdoba nicaragüense", codigo, "C$");
                       pass = false;
                       break;
                   case "NOK":
                       moneda = new Moneda_DAL("Corona noruega", codigo, "kr");
                       pass = false;
                       break;
                   case "NPR":
                       moneda = new Moneda_DAL("Rupia nepalí", codigo, "₨");
                       pass = false;
                       break;
                   case "NZD":
                       moneda = new Moneda_DAL("Dólar neozelandés", codigo, "$");
                       pass = false;
                       break;
                   case "OMR":
                       moneda = new Moneda_DAL("Rial omaní", codigo, "ر.ع.");
                       pass = false;
                       break;
                   case "PAB":
                       moneda = new Moneda_DAL("Balboa panameño", codigo, "B/.");
                       pass = false;
                       break;
                   case "PEN":
                       moneda = new Moneda_DAL("Sol peruano", codigo, "S/.");
                       pass = false;
                       break;
                   case "PGK":
                       moneda = new Moneda_DAL("Kina papú", codigo, "K");
                       pass = false;
                       break;
                   case "PHP":
                       moneda = new Moneda_DAL("Peso filipino", codigo, "₱");
                       pass = false;
                       break;
                   case "PKR":
                       moneda = new Moneda_DAL("Rupia pakistaní", codigo, "₨");
                       pass = false;
                       break;
                   case "PLN":
                       moneda = new Moneda_DAL("Zloty polaco", codigo, "zł");
                       pass = false;
                       break;
                   case "PYG":
                       moneda = new Moneda_DAL("Guaraní paraguayo", codigo, "₲");
                       pass = false;
                       break;
                   case "QAR":
                       moneda = new Moneda_DAL("Rial catarí", codigo, "ر.ق");
                       pass = false;
                       break;
                   case "RON":
                       moneda = new Moneda_DAL("Leu rumano", codigo, "lei");
                       pass = false;
                       break;
                   case "RSD":
                       moneda = new Moneda_DAL("Dinar serbio", codigo, "дин");
                       pass = false;
                       break;
                   case "RUB":
                       moneda = new Moneda_DAL("Rublo ruso", codigo, "₽");
                       pass = false;
                       break;
                   case "RWF":
                       moneda = new Moneda_DAL("Franco ruandés", codigo, "RF");
                       pass = false;
                       break;
                case "SAR":
                     moneda = new Moneda_DAL("Riyal saudí", codigo, "ر.س");
                     pass = false;
                     break;
                 case "SBD":
                     moneda = new Moneda_DAL("Dólar de las Islas Salomón", codigo, "$");
                     pass = false;
                     break;
                 case "SCR":
                     moneda = new Moneda_DAL("Rupia de Seychelles", codigo, "₨");
                     pass = false;
                     break;
                 case "SDG":
                     moneda = new Moneda_DAL("Libra sudanesa", codigo, "ج.س.");
                     pass = false;
                     break;
                 case "SEK":
                     moneda = new Moneda_DAL("Corona sueca", codigo, "kr");
                     pass = false;
                     break;
                 case "SGD":
                     moneda = new Moneda_DAL("Dólar de Singapur", codigo, "$");
                     pass = false;
                     break;
                 case "SHP":
                     moneda = new Moneda_DAL("Libra de Santa Elena", codigo, "£");
                     pass = false;
                     break;
                 case "SLE":
                     moneda = new Moneda_DAL("Leone de Sierra Leona", codigo, "Le");
                     pass = false;
                     break;
                 case "SLL":
                     moneda = new Moneda_DAL("Leone de Sierra Leona", codigo, "Le");
                     pass = false;
                     break;
                 case "SOS":
                     moneda = new Moneda_DAL("Chelín somalí", codigo, "Sh");
                     pass = false;
                     break;
                 case "SRD":
                     moneda = new Moneda_DAL("Dólar surinamés", codigo, "$");
                     pass = false;
                     break;
                 case "SSP":
                     moneda = new Moneda_DAL("Libra sursudanesa", codigo, "£");
                     pass = false;
                     break;
                 case "STN":
                     moneda = new Moneda_DAL("Dobra de Santo Tomé y Príncipe", codigo, "Db");
                     pass = false;
                     break;
                 case "SYP":
                     moneda = new Moneda_DAL("Libra siria", codigo, "£S");
                     pass = false;
                     break;
                 case "SZL":
                     moneda = new Moneda_DAL("Lilangeni suazi", codigo, "L");
                     pass = false;
                     break;
                 case "THB":
                     moneda = new Moneda_DAL("Baht tailandés", codigo, "฿");
                     pass = false;
                     break;
                 case "TJS":
                     moneda = new Moneda_DAL("Somoni tayiko", codigo, "ЅМ");
                     pass = false;
                     break;
                 case "TMT":
                     moneda = new Moneda_DAL("Manat turcomano", codigo, "m");
                     pass = false;
                     break;
                 case "TND":
                     moneda = new Moneda_DAL("Dinar tunecino", codigo, "د.ت");
                     pass = false;
                     break;
                 case "TOP":
                     moneda = new Moneda_DAL("Pa'anga tongano", codigo, "T$");
                     pass = false;
                     break;
                 case "TRY":
                     moneda = new Moneda_DAL("Lira turca", codigo, "₺");
                     pass = false;
                     break;
                 case "TTD":
                     moneda = new Moneda_DAL("Dólar de Trinidad y Tobago", codigo, "$");
                     pass = false;
                     break;
                 case "TVD":
                     moneda = new Moneda_DAL("Dólar tuvaluano", codigo, "$");
                     pass = false;
                     break;
                 case "TWD":
                     moneda = new Moneda_DAL("Nuevo dólar taiwanés", codigo, "$");
                     pass = false;
                     break;
                 case "TZS":
                     moneda = new Moneda_DAL("Chelín tanzano", codigo, "Sh");
                     pass = false;
                     break;
                 case "UAH":
                     moneda = new Moneda_DAL("Grivna ucraniana", codigo, "₴");
                     pass = false;
                     break;
                 case "UGX":
                     moneda = new Moneda_DAL("Chelín ugandés", codigo, "Sh");
                     pass = false;
                     break;
                 case "USD":
                     moneda = new Moneda_DAL("Dólar estadounidense", codigo, "$");
                     pass = false;
                     break;
                 case "UYU":
                     moneda = new Moneda_DAL("Peso uruguayo", codigo, "$");
                     pass = false;
                     break;
                 case "UZS":
                     moneda = new Moneda_DAL("Som uzbeko", codigo, "so'm");
                     pass = false;
                     break;
                 case "VES":
                     moneda = new Moneda_DAL("Bolívar venezolano", codigo, "Bs.");
                     pass = false;
                     break;
                 case "VND":
                     moneda = new Moneda_DAL("Dong vietnamita", codigo, "₫");
                     pass = false;
                     break;
                 case "VUV":
                     moneda = new Moneda_DAL("Vatu vanuatuense", codigo, "Vt");
                     pass = false;
                     break;
                 case "WST":
                     moneda = new Moneda_DAL("Tala samoano", codigo, "WS$");
                     pass = false;
                     break;
                 case "XAF":
                     moneda = new Moneda_DAL("Franco CFA de África Central", codigo, "FCFA");
                     pass = false;
                     break;
                 case "XCD":
                     moneda = new Moneda_DAL("Dólar del Caribe Oriental", codigo, "$");
                     pass = false;
                     break;
                 case "XDR":
                     moneda = new Moneda_DAL("Derechos especiales de giro", codigo, "XDR");
                     pass = false;
                     break;
                 case "XOF":
                     moneda = new Moneda_DAL("Franco CFA de África Occidental", codigo, "CFA");
                     pass = false;
                     break;
                 case "XPF":
                     moneda = new Moneda_DAL("Franco CFP", codigo, "₣");
                     pass = false;
                     break;
                 case "YER":
                     moneda = new Moneda_DAL("Rial yemení", codigo, "﷼");
                     pass = false;
                     break;
                 case "ZAR":
                     moneda = new Moneda_DAL("Rand sudafricano", codigo, "R");
                     pass = false;
                     break;
                 case "ZMW":
                     moneda = new Moneda_DAL("Kwacha zambiano", codigo, "ZK");
                     pass = false;
                     break;
                 case "ZWL":
                     moneda = new Moneda_DAL("Dólar zimbabuense", codigo, "$");
                     pass = false;
                     break;
                    default:
                       System.out.println("--Error codigo invalido");
                       codigo = scanner.nextLine().toUpperCase().trim();
                       break;
                }     
              
          }
          
         
        return moneda;
    }
}


