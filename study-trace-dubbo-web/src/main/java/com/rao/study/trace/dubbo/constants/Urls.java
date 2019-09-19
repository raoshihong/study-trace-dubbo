package com.rao.study.trace.dubbo.constants;

public interface Urls {
    interface V1{
        String V1 = "/v1";

        interface User{
            String USER = V1 + "/user";
            String SAVE = USER + "/save";
            String UPDATE = USER + "/update";
            String DELETE = USER + "/delete/{id}";
        }

        interface Agent{
            String AGENT = V1 + "/agent";
            String SAVE = AGENT + "/save";
        }

        interface Channel{
            String CHANNEL = V1 + "/channel";
            String SAVE = CHANNEL + "/save";
            String DISABLE = CHANNEL + "/disable/{id}";
        }

    }
}
