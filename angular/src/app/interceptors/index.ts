import { HTTP_INTERCEPTORS } from "@angular/common/http";
import { HeaderInterceptor } from "./headers-interceptor";

export const HttpInterceptorProvider = [{
    provide: HTTP_INTERCEPTORS,
    useClass: HeaderInterceptor,
    multi: true,
},
{
    provide: HTTP_INTERCEPTORS,
    useClass: HeaderInterceptor,
    multi: true,
}

]