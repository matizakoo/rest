package auth.rest.mapper;

import auth.rest.domain.Author;
import auth.rest.dto.AuthorDTO;
import auth.rest.service.AuthorService;
import org.mapstruct.Mapper;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface AuthorMapper {
    Author authorToAuthorDto(AuthorDTO authorDTO);
    AuthorDTO authorDtoToAuthor(Author author);
}
