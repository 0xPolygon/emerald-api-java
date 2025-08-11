package io.emeraldpay.api;

public enum BlockchainType {
    BITCOIN,
    ETHEREUM;

    public static BlockchainType from(Chain chain) {
        if (chain == Chain.BITCOIN) {
            return BlockchainType.BITCOIN;
        } else {
            return BlockchainType.ETHEREUM;
        }
        // throw new IllegalArgumentException("Unknown type of blockchain: " + chain);
    }
}
