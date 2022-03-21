package method;

import com.pduda.method.AuthenticationService;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AuthenticationServiceTest {

    @Test
    public void administratorIsAlwaysAuthenticated() throws Exception {
        AuthenticationService service = new AuthenticationService();
        int adminId = 12345;
        assertThat(service.isAuthenticated(adminId)).isTrue();
    }

    @Test
    public void normalUserIsNotAuthenticatedInitially() throws Exception {
        AuthenticationService service = new AuthenticationService();
        int normalUserId = 11111;
        assertThat(service.isAuthenticated(normalUserId)).isFalse();
    }

}
