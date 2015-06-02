package com.elgoooog.challonge.request;

/**
 * @author Kevin C.Y. T.
 */
public class CheckInParticipantRequest {
    private final String tournamentUrlPath;
    private final int participantId;

    public CheckInParticipantRequest (final String tournamentUrlPath, final int participantId) {
        this.tournamentUrlPath = tournamentUrlPath;
        this.participantId = participantId;
    }

    public String getTournamentUrlPath() {
        return tournamentUrlPath;
    }

    public int getParticipantId() {
        return participantId;
    }
    
}
