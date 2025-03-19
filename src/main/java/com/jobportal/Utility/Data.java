package com.jobportal.Utility;

public class Data {
    public static String getMessageBody(String otp, String name) {
        return "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "    <title>OTP Email</title>\n" +
                "    <style>\n" +
                "        body { font-family: Arial, sans-serif; background-color: #f4f4f4; margin: 0; padding: 0; }\n" +
                "        .email-container { max-width: 600px; margin: 0 auto; background-color: #ffffff; padding: 20px; border-radius: 8px; box-shadow: 0 0 10px rgba(0, 0, 0, 0.1); }\n" +
                "        .header { text-align: center; padding: 10px 0; }\n" +
                "        .header h1 { margin: 0; color: #333333; }\n" +
                "        .content { padding: 20px; text-align: center; }\n" +
                "        .otp-code { font-size: 24px; font-weight: bold; color: #007BFF; margin: 20px 0; }\n" +
                "        .footer { text-align: center; padding: 10px 0; font-size: 12px; color: #777777; }\n" +
                "    </style>\n" +
                "</head>\n" +
                "<body>\n" +
                "    <div class=\"email-container\">\n" +
                "        <div class=\"header\">\n" +
                "            <h1>Your One-Time Password (OTP)</h1>\n" +
                "        </div>\n" +
                "        <div class=\"content\">\n" +
                "            <p>Hello " +name+ ",</p>\n" +
                "            <p>We have received a request to verify your email address. Your OTP code is : </p>\n" +
                "            <div class=\"otp-code\">" + otp + "</div>\n" +
                "            <p>Please use this code to complete your verification process. This OTP is valid for " + validityDuration + " minutes.</p>\n" +
                "            <p>If you did not request this OTP, please ignore this email or contact support.</p>\n" +
                "        </div>\n" +
                "        <div class=\"footer\">\n" +
                "            <p>Thank you,</p>\n" +
                "            <p>" + companyName + "</p>\n" +
                "            <p>" + companyAddress + "</p>\n" +
                "            <p>" + contactInfo + "</p>\n" +
                "        </div>\n" +
                "    </div>\n" +
                "</body>\n" +
                "</html>";
    }
}
