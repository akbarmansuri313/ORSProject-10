import { Component } from "@angular/core";
import { BaseCtl } from "./base.component";
import { ServiceLocatorService } from "./service-locator.service";
import { ActivatedRoute } from "@angular/router";


@Component({

    template: ''
})
export class BaseListCtl extends BaseCtl {

    isMasterSel: boolean = false;

    constructor(endpoint: String, locator: ServiceLocatorService, route: ActivatedRoute) {
        super(endpoint, locator, route);
    }

    override ngOnInit() {
        this.preload();
        this.search();
    }

    previous() {
        this.isMasterSel = false;
        this.form.pageNo--
        this.search();
    }

    next() {
        this.isMasterSel = false;
        this.form.pageNo++;
        this.search();
    }
}