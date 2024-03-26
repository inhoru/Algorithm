class Solution {
    public String solution(String new_id) {
        String lowerId = toLowerCase(new_id);

        String cleanId = toCleanString(lowerId);

        String mergerPeriodId = toMergingPeriods(cleanId);

        String trimPeriod = toTrimFirstOrLastPeriods(mergerPeriodId);

        String setDefaultId = toSetDefaultId(trimPeriod);

        String trimIdLength = toIdLength(setDefaultId);

        String connectId = toConnectId(trimIdLength);


        return connectId;


    }

    private static String toLowerCase(String id) {
        return id.toLowerCase();
    }

    private static String toCleanString(String id) {
        StringBuilder result = new StringBuilder();
        for (char a : id.toCharArray()) {
            if (Character.isLowerCase(a) || Character.isDigit(a) || a == '-' || a == '_' || a == '.') {
                result.append(a);
            }
        }
        return result.toString();
    }

    private static String toMergingPeriods(String id) {
        return id.replaceAll("\\.{2,}", ".");
    }

    private static String toTrimFirstOrLastPeriods(String id) {
        if (id.startsWith(".")) {
            id = id.substring(1);
        }
        if (id.endsWith(".")) {
            id = id.substring(0, id.length() - 1);
        }
        return id;
    }

    private static String toSetDefaultId(String id) {
        return id.isEmpty() ? "a" : id;

    }

    private static String toIdLength(String id) {
        if (id.length() >= 16) {
            id = id.substring(0, 15);
        }
        if (id.endsWith(".")) {
            id = id.substring(0, id.length() - 1);
        }
        return id;

    }

    private static String toConnectId(String id) {
        while (id.length() <= 2) {
                id += id.charAt(id.length() - 1);
            }
        return id;
    }
}
