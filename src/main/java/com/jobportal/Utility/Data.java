package com.jobportal.Utility;

public class Data {
    public static String getMessageBody(String otp, String name) {
        return "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "    <title>Your OTP Code</title>\n" +
                "    <style>\n" +
                "        body {\n" +
                "            font-family: Arial, sans-serif;\n" +
                "            background-color: #f4f4f4;\n" +
                "            padding: 20px;\n" +
                "            text-align: center;\n" +
                "        }\n" +
                "        .container {\n" +
                "            background-color: #ffffff;\n" +
                "            padding: 20px;\n" +
                "            border-radius: 10px;\n" +
                "            box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);\n" +
                "            max-width: 500px;\n" +
                "            margin: auto;\n" +
                "        }\n" +
                "        .header h1 {\n" +
                "            color: #333;\n" +
                "        }\n" +
                "        .otp {\n" +
                "            font-size: 24px;\n" +
                "            font-weight: bold;\n" +
                "            color: #ff5733;\n" +
                "            margin: 20px 0;\n" +
                "        }\n" +
                "        .footer {\n" +
                "            font-size: 12px;\n" +
                "            color: #777;\n" +
                "            margin-top: 20px;\n" +
                "        }\n" +
                "    </style>\n" +
                "</head>\n" +
                "<body>\n" +
                "    <div class=\"container\">\n" +
                "        <div class=\"header\">\n" +
                "            <h1>Your OTP Code</h1>\n" +
                "        </div>\n" +
                "        <div class=\"body\">\n" +
                "            <p>Hello" + name + ",</p>\n" +
                "            <p>We have received a request to verify your email address. Your OTP code is:</p>\n" +
                "            <div class=\"otp\">" + otp + "</div>\n" +
                "            <p>This OTP code is valid for 10 minutes. If you did not request this, please ignore this email.</p>\n" +
                "            <p>Thank you for using our service!</p>\n" +
                "        </div>\n" +
                "        <div class=\"footer\">\n" +
                "            <p>&copy; 2025 FJobs. All rights reserved.</p>\n" +
                "        </div>\n" +
                "    </div>\n" +
                "</body>\n" +
                "</html>";
    }
}
