package ohtu;

import com.google.gson.Gson;
import java.io.IOException;
import org.apache.http.client.fluent.Request;

public class Main {

    public static void main(String[] args) throws IOException {
        // ÄLÄ laita githubiin omaa opiskelijanumeroasi
        String studentNr = "012345678";
        if (args.length > 0) {
            studentNr = args[0];
        }

        String url = "https://studies.cs.helsinki.fi/courses/students/" + studentNr + "/submissions";

        String bodyText = Request.Get(url).execute().returnContent().asString();

        //System.out.println("json-muotoinen data:");
        //System.out.println(bodyText);
        System.out.println("");

        Gson mapper = new Gson();
        Submission[] subs = mapper.fromJson(bodyText, Submission[].class);

        //System.out.println("Oliot:");
        for (Submission submission : subs) {
            System.out.println(submission);
        }

        // part 2
        //String bodyText2 = Request.Get("https://studies.cs.helsinki.fi/courses/courseinfo").execute().returnContent().asString();
        //Submission[] subs2 = mapper.fromJson(bodyText2, Submission[].class);
        //System.out.println("Oliot2:");
        //for (Submission submission : subs2) {
        //    System.out.println(submission);
        //}
        //System.out.println("");

        //System.out.println("Opiskelijanumero: " + studentNr);
    }
}
