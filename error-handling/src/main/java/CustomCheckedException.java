import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;

class CustomCheckedException extends Exception {

    CustomCheckedException() throws IOException {
        super();
    }

    CustomCheckedException(String message) {
        super(message);
    }

}
