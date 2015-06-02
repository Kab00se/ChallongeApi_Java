package com.elgoooog.challonge.request;

/**
 * @author Kevin C.Y. T.
 */
public class CheckInProcessTournamentRequest {
	private final String tournamentUrlPath;
	private final Boolean includeParticipants;
    private final Boolean includeMatches;

    public CheckInProcessTournamentRequest(String urlPath, Boolean includeParticipants, Boolean includeMatches) {
        this.tournamentUrlPath = urlPath;
        this.includeParticipants = includeParticipants;
        this.includeMatches = includeMatches;
    }

    public String getUrlPath() {
        return tournamentUrlPath;
    }

    public Boolean isIncludeParticipants() {
        return includeParticipants;
    }

    public Boolean isIncludeMatches() {
        return includeMatches;
    }
    
    public static class Builder {
        private final String urlPath;
        private Boolean includeParticipants;
        private Boolean includeMatches;

        public Builder(String urlPath) {
            this.urlPath = urlPath;
        }

        public Builder doIncludeParticipants(Boolean includeParticipants) {
            this.includeParticipants = includeParticipants;
            return this;
        }

        public Builder doIncludeMatches(Boolean includeMatches) {
            this.includeMatches = includeMatches;
            return this;
        }

        public CheckInProcessTournamentRequest build() {
            return new CheckInProcessTournamentRequest(urlPath, includeParticipants, includeMatches);
        }
    }
}
