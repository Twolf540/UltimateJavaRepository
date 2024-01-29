package Unit03.Topic3_2;

public class Magpie {
    public String getGreeting(){
        return "Hello, let's talk";
    }

    public String getResponse(String statement){
        String response = "";
        if (statement == ""){
            response = "Say something, please";
        }
        return response;
    }

    public String getResponse2(String statement){
        String response = "Bye";
        if (statement == "Bye"){
            response = "Have a good day";
        }
        return response;
}
}
