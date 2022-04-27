System.out.println(hm.containsKey("UK"));// having this key
        System.out.println(hm.containsKey("Austria"));
        System.out.println(hm.containsValue("London"));
        System.out.println(hm.get("India"));// print value of this key

        hm.remove("India");
        for (String s : hm.keySet()) {
            System.out.println(hm.get(s) + " " + s);
        }