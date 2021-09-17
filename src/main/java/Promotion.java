public class Promotion {
    public static int freshPromotin(String[][] codeList, String[] shoppingCart) {
        int cartIdx = 0, codeIdx = 0;
        while (cartIdx < shoppingCart.length && codeIdx < codeList.length) {
            String cur = shoppingCart[cartIdx];
            // If the first fruit of codeList is anything of if it matches the current fruit at the cart idx.
            if ((codeList[codeIdx][0].equals("anything") || codeList[codeIdx][0].equals(cur)) &&
                    hasOrder(shoppingCart, cartIdx, codeList[codeIdx])) {
                cartIdx += codeList[codeIdx++].length;
            } else {
                cartIdx++;
            }
        }
        return codeIdx == codeList.length ? 1 : 0;
    }

    public static boolean hasOrder(String[] shoppingCart, int idx, String[] order) {
        // loop through the codeList to check if the fruits are in order
        for (String s : order) {
            if (idx < shoppingCart.length && (s.equals("anything") || shoppingCart[idx].equals(s))) {
                idx++;
            } else {
                return false;
            }
        }
        return true;
    }
}
