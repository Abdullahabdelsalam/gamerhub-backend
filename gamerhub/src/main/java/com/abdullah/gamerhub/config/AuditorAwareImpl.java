package com.abdullah.gamerhub.config;

import org.springframework.data.domain.AuditorAware;

import java.util.Optional;

public class AuditorAwareImpl implements AuditorAware<String> {

//    Authentication authentication =
//            SecurityContextHolder.getContext().getAuthentication();
    @Override
    public Optional<String> getCurrentAuditor() {
        return Optional.of("SYSTEM");
    }
}
