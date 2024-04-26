package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class SkillsController {

    @GetMapping()
    public String hello() {
        return """
        
                <html><body><h1>Skills Tracker</h1><h2>We have a few skills we need to learn. Here is the list!</h2>
                <ol>
                  <li>Java</li>
                  <li>Javascript</li>
                  <li>Python</li>
                </ol>""";
    }
    @GetMapping("form")
    public String skillsForm(){
        String html;
        return "<html>" +
                "<body>" +
                "<form action='form-submit' method='post'>" +
                "<label for='name'>Name: </label><br>" +
                "<input id='name' type='text' name='name'/><br>" +
                "<label for='favorite-language'>My Favorite Language: </label><br>" +
                "<select id='favorite-language' name='language1'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select><br>" +
                "<label for='second-favorite'>My Second Favorite Language: </label><br>" +
                "<select id='second-favorite' name='language2'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select><br>" +
                "<label for='third-favorite'>My Third Favorite Language: </label><br>" +
                "<select id='third-favorite' name='language3'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select><br>" +
                "<input type='submit' value='Submit'/>" +
                "</form>" +
                "</body>" +
                "</html>";
    }

    @RequestMapping(value="form-submit", method={RequestMethod.GET, RequestMethod.POST})
    public String formSubmission(@RequestParam String name, @RequestParam String language1, @RequestParam String language2, @RequestParam String language3 ){
        return "<html>" +
                "<body>" +
                "<table>" +
                "<tr><th><h1>" + name + "</h1></th></tr>" +
                "<tr><td>" + language1 + "</td></tr>" +
                "<tr><td>" + language2 + "</td></tr>" +
                "<tr><td>" + language3 + "</td></tr>" +
                "</table>" +
                "</body>" +
                "</html>";
    }
}
