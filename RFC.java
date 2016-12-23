import java.util.*;

public class RFC{
	private HashMap<String,String> valoresnombres;
	private HashMap<String,String> valorescoeficienteyresiduo;
	private HashMap<String,String> codigoverificacion;
	private String[] palabrasnovalidas={
		"BUEI",
		"CACA",
		"CAGA",
		"CAKA",
		"COGE",
		"COJE",
		"COJO",
		"FETO",
		"JOTO",
		"KACO",
		"KAGO",
		"KOJO",
		"KULO",
		"MAMO",
		"MEAS",
		"MION",
		"MULA",
		"PEDO",
		"PUTA",
		"QULO",
		"RUIN",
		"GUEY",
		"KACA",
		"KAGA",
		"KOGE",
		"KAKA",
		"MAME",
		"MEAR",
		"MEON",
		"MOCO",
		"PEDA",
		"PENE",
		"PUTO",
		"RATA"
	};
	private String[] nexosnovalidos={
		"LA",
		"SA DE CV",
		"LOS",
		"Y",
		"SA",
		"CIA",
		"SOC",
		"COOP",
		"A EN P",
		"S EN C",
		"EN",
		"CON",
		"SUS",
		"SC",
		"SCS",
		"THE",
		"AND",
		"CO",
		"MAC",
		"VAN",
		"A",
		"SA DE CV MI",
		"COMPAÑÍA",
		"SRL MI",
		"DE",
		"LA",
		"LAS",
		"MC",
		"VON",
		"DEL",
		"LOS",
		"Y",
		"MAC",
		"VAN",
		"MI"
	};
	private String nombre,aP,aM,dia,mes,año,tipo;

	public RFC(){
		setDefaults();
	}
	public RFC(String nombre,String aP,String aM,String dia,String mes,String año,String tipo){
		this.nombre=nombre;
		this.aP=aP;
		this.aM=aM;
		this.dia=dia;
		this.mes=mes;
		this.año=año;
		this.tipo=tipo;
		setDefaults();
	}
	private void setDefaults(){
		valoresnombres=new HashMap<String,String>();
		valoresnombres.put(" ","00");
		valoresnombres.put("B","12");
		valoresnombres.put("O","26");
		valoresnombres.put("0","00");
		valoresnombres.put("C","13");
		valoresnombres.put("P","27");
		valoresnombres.put("1","01");
		valoresnombres.put("D","14");
		valoresnombres.put("Q","28");
		valoresnombres.put("2","02");
		valoresnombres.put("E","15");
		valoresnombres.put("R","29");
		valoresnombres.put("3","03");
		valoresnombres.put("F","16");
		valoresnombres.put("S","32"); 
		valoresnombres.put("4","04");
		valoresnombres.put("G","17");
		valoresnombres.put("T","33");
		valoresnombres.put("5","05"); 
		valoresnombres.put("H","18");
		valoresnombres.put("U","34");
		valoresnombres.put("6","06");
		valoresnombres.put("I","19");
		valoresnombres.put("V","35"); 
		valoresnombres.put("7","07");
		valoresnombres.put("J","21");
		valoresnombres.put("W","36");
		valoresnombres.put("8","08");
		valoresnombres.put("K","22");
		valoresnombres.put("X","37");
		valoresnombres.put("9","09"); 
		valoresnombres.put("L","23"); 
		valoresnombres.put("Y","38");
		valoresnombres.put("&","10");
		valoresnombres.put("M","24");
		valoresnombres.put("Z","39");
		valoresnombres.put("A","11");
		valoresnombres.put("N","25");

		valorescoeficienteyresiduo=new HashMap<String,String>();

		valorescoeficienteyresiduo.put("0","1");
		valorescoeficienteyresiduo.put("17","I");
		valorescoeficienteyresiduo.put("1","2");
		valorescoeficienteyresiduo.put("18","J");
		valorescoeficienteyresiduo.put("2","3"); 
		valorescoeficienteyresiduo.put("19","K");
		valorescoeficienteyresiduo.put("3","4");
		valorescoeficienteyresiduo.put("20","L");
		valorescoeficienteyresiduo.put("4","5"); 
		valorescoeficienteyresiduo.put("21","M");
		valorescoeficienteyresiduo.put("5","6"); 
		valorescoeficienteyresiduo.put("22","N");
		valorescoeficienteyresiduo.put("6","7");
		valorescoeficienteyresiduo.put("23","P");
		valorescoeficienteyresiduo.put("7","8"); 
		valorescoeficienteyresiduo.put("24","Q");
		valorescoeficienteyresiduo.put("8","9");
		valorescoeficienteyresiduo.put("25","R");
		valorescoeficienteyresiduo.put("9","A");
		valorescoeficienteyresiduo.put("26","S");
		valorescoeficienteyresiduo.put("10","B");
		valorescoeficienteyresiduo.put("27","T");
		valorescoeficienteyresiduo.put("11","C");
		valorescoeficienteyresiduo.put("28","U");
		valorescoeficienteyresiduo.put("12","D");
		valorescoeficienteyresiduo.put("29","V");
		valorescoeficienteyresiduo.put("13","E");
		valorescoeficienteyresiduo.put("30","W");
		valorescoeficienteyresiduo.put("14","F");
		valorescoeficienteyresiduo.put("31","X");
		valorescoeficienteyresiduo.put("15","G");
		valorescoeficienteyresiduo.put("32","Y"); 
		valorescoeficienteyresiduo.put("16","H");
		valorescoeficienteyresiduo.put("33","Z"); 

		codigoverificacion=new HashMap<String,String>();

		codigoverificacion.put("0","00");
		codigoverificacion.put("1","01");
		codigoverificacion.put("2","02");
		codigoverificacion.put("3","03");
		codigoverificacion.put("4","04");
		codigoverificacion.put("5","05");
		codigoverificacion.put("6","06");
		codigoverificacion.put("7","07");
		codigoverificacion.put("8","08");
		codigoverificacion.put("9","09");
		codigoverificacion.put("A","10");
		codigoverificacion.put("B","11");
		codigoverificacion.put("C","12");
		codigoverificacion.put("D","13");
		codigoverificacion.put("E","14");
		codigoverificacion.put("F","15");
		codigoverificacion.put("G","16");
		codigoverificacion.put("H","17");
		codigoverificacion.put("I","18");
		codigoverificacion.put("J","19");
		codigoverificacion.put("K","20");
		codigoverificacion.put("L","21");
		codigoverificacion.put("M","22");
		codigoverificacion.put("N","23");
		codigoverificacion.put("&","23");
		codigoverificacion.put("O","25");
		codigoverificacion.put("P","26");
		codigoverificacion.put("Q","27");
		codigoverificacion.put("R","28");
		codigoverificacion.put("S","29");
		codigoverificacion.put("T","30");
		codigoverificacion.put("U","31");
		codigoverificacion.put("V","32");
		codigoverificacion.put("W","33");
		codigoverificacion.put("X","34");
		codigoverificacion.put("Y","35");
		codigoverificacion.put("Z","36");
		codigoverificacion.put(" ","37");
		codigoverificacion.put("Ñ","38");
	}
	private String getFirstVocal(String cad){
        cad=cad.toUpperCase();
        String vocales="AEIOU";
        for (int i=0;i<cad.length();i++ ) {
            String c=cad.substring(i,i+1);
            for (int j = 0; j < vocales.length(); j++) {
                String vc=vocales.substring(j,j+1);
                if(c.equals(vc)) return vc;
            }
            
        }
        return "";
    } 
    private ArrayList<String> getConsonates(String cad){
        cad=cad.toUpperCase();
        ArrayList<String> ar=new ArrayList<String>();
        String vocales="AEIOU";
        for (int i=0;i<vocales.length();i++ ) {
            String vc=vocales.substring(i,i+1);
            if(cad.indexOf(vc)==-1) ar.add(vc);
        }
        return ar;
    }
    public String quitarPalabras(String cad){
    	String nomaux=cad;
    	for (String v :nomaux.split(" ") ) {
	        for(String con:nexosnovalidos){
	        	if(v.equals(con))
	            	nomaux=nomaux.replace(con, "");
	        }
    	}
        return nomaux.toUpperCase();
    }
    private String formar4nombre(){
    	String aP_=quitarPalabras(aP.toUpperCase());
    	String aM_=quitarPalabras(aM.toUpperCase());
    	String nombre_=quitarPalabras(nombre.toUpperCase()).replace(" ","");
    	String cad=aP_.substring(0,1)+getFirstVocal(aP_)+aM_.substring(0,1)+nombre_.substring(0,1);
    	for (String mal : palabrasnovalidas) {
    		if(cad.equals(mal))
    			cad=cad.substring(0,3)+"X";
    	}
    	return cad;
    }
    private String formar6fecha(){
    	String cad=año.substring(2,4)+mes+dia;
    	return cad;
    }
    private String formar2Homoclave(){
    	String cad="";
    	String nomaux=aP+" "+aM+" "+nombre;
    	nomaux=nomaux.toUpperCase();
    	for (int i=0;i<nomaux.length() ;i++ ) {
    		cad+=valoresnombres.get(nomaux.substring(i,i+1));
    	}
    	cad="0"+cad;
    	int suma=0;
    	for (int i=0;i<cad.length()-1 ;i++ ) {
    		suma+=Integer.parseInt(cad.substring(i,i+2))*Integer.parseInt(cad.substring(i+1,i+2));
    	}
    	String newcad=(suma+"").substring(1,(suma+"").length());
    	int cociente=Integer.parseInt(newcad)/34;
    	int residuo=Integer.parseInt(newcad)%34;
    	
       	return valorescoeficienteyresiduo.get(cociente+"")+valorescoeficienteyresiduo.get(residuo+"");
    }
    private String formar1Verificador(String rfc){
    	String rfc_=rfc;
    	int v=13;
    	int suma=0;
    	for (int i=0;i<rfc_.length() ;i++ ) {
    		suma+=Integer.parseInt(codigoverificacion.get(rfc_.substring(i,i+1)))*v--;
    	}
    	int cociente=suma/11;
    	int residuo=suma%11;
    	String finalC="";
    	if(residuo==0)finalC="0";
    	if(residuo>0) finalC=(11-residuo)+"";
    	if(residuo==10) finalC="A";
    	return rfc+finalC;
    }

	public String get(){
		return formar1Verificador(formar4nombre()+formar6fecha()+formar2Homoclave());		
	}
	private static void print(Object a){
		System.out.println(a);
	}
	public static void main(String[] args) {
		RFC rfc=new RFC("Edgar Efren","Pozas","Bogarin","07","02","1997","Fisica");

		print(rfc.get());


	}

}