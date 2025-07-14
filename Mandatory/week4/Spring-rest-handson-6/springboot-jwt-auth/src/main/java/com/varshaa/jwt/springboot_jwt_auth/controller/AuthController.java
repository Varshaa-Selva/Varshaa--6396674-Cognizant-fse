import java.util.Base64;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import main.java.com.varshaa.jwt.springboot_jwt_auth.util.JwtUtil;

@RestController
public class AuthController {

    @Autowired
    private JwtUtil jwtUtil;

    @GetMapping("/authenticate")
    public ResponseEntity<?> authenticate(@RequestHeader("Authorization") String authHeader) {
        String encodedCredentials = authHeader.substring("Basic ".length());
        String decoded = new String(Base64.getDecoder().decode(encodedCredentials));
        String[] parts = decoded.split(":");
        String username = parts[0];
        String password = parts[1];

        // Dummy check — replace with real DB check if needed
        if ("user".equals(username) && "pwd".equals(password)) {
            String token = jwtUtil.generateToken(username);
            return ResponseEntity.ok().body("{\"token\":\"" + token + "\"}");
        } else {
            return ResponseEntity.status(401).body("Invalid credentials");
        }
    }
}
