package runner;

import common.EmailUtils;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "stepdefinitions",
        plugin = {"pretty", "html:target/cucumber-reports.html", "json:target/cucumber.json"
              }
)


public class TestRunner {

//    @AfterClass
//    public static void tearDown() {
//        int totalTests = 10;
//        int passedTests = 8;
//        int failedTests = 2;
//
//        // Send email report after the tests
//        String toEmail = "nathdipp002@gmail.com"; // Replace with your recipient email
//        String subject = "BDD Cucumber Test Report";
//        //String body = "<h1>Test Report</h1><p>Please find the attached test report.</p>";
//        String body = generateEmailBody(totalTests, passedTests, failedTests);
//        String filePath = "target/cucumber-reports/report.html"; // Path to the report
//
//        EmailUtils.sendEmailWithAttachment(toEmail, subject, body, filePath);
//    }
//    private static String generateEmailBody(int totalTests, int passedTests, int failedTests) {
//        return "<html>" +
//                "<body>" +
//                "<h1>Test Execution Summary</h1>" +
//                "<table border='1' style='border-collapse: collapse;'>" +
//                "<tr>" +
//                "<th>Total Tests</th>" +
//                "<th>Passed Tests</th>" +
//                "<th>Failed Tests</th>" +
//                "</tr>" +
//                "<tr>" +
//                "<td style='text-align: center;'>" + totalTests + "</td>" +
//                "<td style='text-align: center;'>" + passedTests + "</td>" +
//                "<td style='text-align: center;'>" + failedTests + "</td>" +
//                "</tr>" +
//                "</table>" +
//                "<p>Please find the detailed report attached.</p>" +
//                "</body>" +
//                "</html>";
//    }
}
