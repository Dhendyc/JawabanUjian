//package belajarweb;

public class Soal1 {
	
	public static String biodata(String name, int age, String address, String[] hobbies, boolean is_married, School[] schools, boolean interest_in_coding) {
		
		String hasil_json = "";
		
		hasil_json+="{ ";
		hasil_json+="\"name\": \""+name+"\", ";
		hasil_json+="\"age\" : \""+Integer.toString(age)+"\", ";
		hasil_json+="\"address\" : \""+address+"\", ";

		//--------------------------------
		
		hasil_json+="\"hobbies\" : [";
		for (int i=0; i<hobbies.length; i++) {
			
			if (i < hobbies.length-1) {
				hasil_json += "\"" + hobbies[i] + "\", ";
			} else {
				hasil_json += "\"" + hobbies[i] + "\"";
			}
		}
		hasil_json+="], ";
		
		//--------------------------------
		
		if(is_married) {
			hasil_json+="\"is_married\" : \"1\", ";
		} else {
			hasil_json+="\"is_married\" : \"0\", ";
		}
		
		// -------------------------------
		
		hasil_json+="\"list_of_school\" : ";
		for (int i=0; i<schools.length; i++) {
			hasil_json+="{ ";
			
			hasil_json += "\"school_name\": \""	+schools[i].school_name	+ "\", ";
			hasil_json += "\"year_in\": \"" 	+schools[i].year_in		+ "\", ";
			hasil_json += "\"year_out\": \"" 	+schools[i].year_out	+ "\", ";
			
			if (i < schools.length-1) {
				hasil_json += "\"major\": \"" 	+schools[i].major		+ "\"";
			} else {
				hasil_json += "\"major\": \"" 	+schools[i].major		+ "\"";
			}

			hasil_json+="}, ";			
		}
		// -------------------------------

		if(interest_in_coding) {
			hasil_json+="\"interest_in_coding\" : \"1\"";
		} else {
			hasil_json+="\"interest_in_coding\" : \"0\"";
		}
		
		hasil_json+=" }";
		
		return hasil_json;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		School school1 = new School("Sekolah 1", 2009, 2014, "Teknik Informatika");
		School school2 = new School("Sekolah 2", 2014, 2016, "Sistem Informasi");
		School[] schools = {school1, school2};
		
		String hobi1 = "basket";
		String hobi2 = "futsal";
		String[] hobbies = {hobi1, hobi2};
		
		String json = biodata("Dennis", 28, "Pekayon", hobbies, false, schools, true);
		System.out.println(json);
		
	}

}
