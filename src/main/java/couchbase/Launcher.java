package couchbase;

import couchbase.test.sdk.Loader;
import couchbase.rest_server.RestApplication;

class Launcher {
    public static void main(String args[]) {
        if (args.length > 0 && args[0].equals("rest_loader")) {
            String[] arguments = new String[args.length - 1];
            System.arraycopy(args, 1, arguments, 0, arguments.length);
            RestApplication.main(arguments);
        } else {
            System.out.println("Assuming default cmd loader");
            Loader.main(args);
        }
    }
}
