import { Gender } from "./gender.enum";

export interface User
{
        email:string;
        password:string;
        role:number;
        firstName:string;
        lastName:string;
        pid:string;
        location:string;
        city:string;
        country:string;
        gender:Gender;
        phoneNumber:string;
        placeOfEmployment:string;
}

