package apps.movieService.src.main.java.response;

import org.springframework.http.HttpStatus;

public enum ResponseStatus {
    SUCCESS (200, "Success", HttpStatus.OK, "API call success"),
    API_CALLED_SUCCESS (201, "Success", HttpStatus.OK, "API call success"),
    REQUEST_FAILURE(204, "Request failure", HttpStatus.BAD_REQUEST, "API call doesn't succeed"),
    NO_NEW_DATA(204, "Success", HttpStatus.OK, "No new data from Accurate"),
    DUPLICATE_REQUEST (200, "Duplicate Request", HttpStatus.OK, "Request is duplicate"),
    // 4xx => Request related error
    BAD_REQUEST (400, "Bad Request", HttpStatus.BAD_REQUEST, "Invalid request parameters"),
    UNAUTHORIZED (401, "Unauthorized", HttpStatus.UNAUTHORIZED, "Unauthorized to access this resource"),
    NO_DATA_FOUND (401, "No data found", HttpStatus.BAD_REQUEST, "Data is not found"),
    NOT_FOUND (404, "Resource Not Found", HttpStatus.NOT_FOUND, "The requested resource is not found"),
    HYBRID_ERROR (422, "Unprocessable Offline Request", HttpStatus.BAD_REQUEST, "Failed to execute hybrid mode"),

    NO_USER_LOGIN_FOUND	(408, "Maaf, login gagal. Akun tidak dapat ditemukan. Silakan coba lagi.", HttpStatus.BAD_REQUEST, "Sorry, login failed. Account cannot be found. Please try again."),
    INVALID_APP_KEY (409, "Invalid Appkey", HttpStatus.BAD_REQUEST, "Invalid request parameters appkey"),
    INVALID_CLIENT_ID (410, "Invalid Client ID", HttpStatus.BAD_REQUEST, "Invalid request parameters client id"),

    CONFLICT (409, "Resource already exists", HttpStatus.CONFLICT, "Resource already exists"),
    OPERATION_NOT_ALLOWED (405, "Operation Not Allowed", HttpStatus.BAD_REQUEST, "The requested operation is not allowed"),
    METHOD_NOT_ALLOWED (4005, "Request Method Not Allowed", HttpStatus.METHOD_NOT_ALLOWED, "Request Method Not Allowed"),
    INVALID_PARAMETER_FORMAT (406, "Invalid Parameter Format", HttpStatus.BAD_REQUEST, "Failed Parsing Request Parameter"),
    FAILED_TO_DELETE_ROLE_RIGHT (496, "Failed to Delete Role Right", HttpStatus.UNAUTHORIZED, "Failed to delete role right"),
    SALES_ORDER_STATUS_IS_NOT_ALLOCATED (403, "Sales order is not Allocated", HttpStatus.BAD_REQUEST, "Status dari sales order tidak Allocated"),

    ASSET_NOT_FOUND (403, "Asset Not Found",  HttpStatus.NOT_FOUND, "The requested asset is not found"),
    NO_CUSTOMER_ID_FOUND(409, "No Customer Id Found", HttpStatus.NOT_FOUND, "Customer Id tidak ditemukan"),
    DUPLICATE_ASSET(409, "Asset with serial number already exist", HttpStatus.BAD_REQUEST, "Asset dengan serial number sudah ada"),
    ASSET_NOT_ASSIGNED(407, "Asset hasn't assigned at this customer", HttpStatus.BAD_REQUEST, "Asset belum diberikan kepada customer"),
    ASSET_HAS_ASSIGNED_AT_THIS_ADVOCATE(409, "Asset has assigned at this customer", HttpStatus.BAD_REQUEST, "Asset sudah diberikan kepada customer ini"),
    ASSET_HAS_ASSIGNED_AT_OTHER_ADVOCATE(408, "Asset has assigned at other customer", HttpStatus.BAD_REQUEST, "Asset sudah diberikan kepada customer lain"),
    ASSET_NOT_ATTACHED(405, "Asset hasn't attached", HttpStatus.BAD_REQUEST, "Asset belum terpasang"),
    ASSET_HAS_ATTACHED(406, "Asset has attached", HttpStatus.BAD_REQUEST, "Asset sudah terpasang"),
    INVALID_TIME_RANGE(410, "Invalid time range", HttpStatus.BAD_REQUEST, "Time range isn't allowed"),
    UNABLE_INACTIVATE_DATA(411, "Unable inactivate data", HttpStatus.BAD_REQUEST, "Unable inactivate data"),

    // 43x => User related
    USER_NOT_FOUND (430, "User not found", HttpStatus.NOT_FOUND, "User is not found"),
    ADVOCATE_NOT_FOUND (493, "Advocate Not Found", HttpStatus.NOT_FOUND, "Advocate is not found"),
    SALES_NOT_FOUND (431, "Sales not found", HttpStatus.NOT_FOUND, "Sales is not found"),
    STORE_NOT_FOUND (432, "Store not found", HttpStatus.NOT_FOUND, "Store is not found"),
    PRODUCT_NOT_FOUND (433, "Product not found", HttpStatus.NOT_FOUND, "Product is not found"),
    ADDRESS_NOT_FOUND(434, "Address Not Found", HttpStatus.NOT_FOUND, "Address is not found"),
    CLIENT_NOT_FOUND (434, "Client not found", HttpStatus.NOT_FOUND, "Client is not found"),
    CUSTOMER_NOT_FOUND (435, "Customer not found", HttpStatus.NOT_FOUND, "Customer is not found"),
    SCHEDULE_NOT_FOUND (436, "Schedule not found", HttpStatus.NOT_FOUND, "Schedule is not found"),
    ACTUAL_TARGET_NOT_FOUND (436, "Actual target not found", HttpStatus.NOT_FOUND, "Actual target is not found"),
    COMPANY_NOT_FOUND (437, "Company not found", HttpStatus.NOT_FOUND, "Company is not found"),
    CONTENT_NOT_FOUND (438, "Content not found", HttpStatus.NOT_FOUND, "Content is not found"),
    TARGET_NOT_FOUND (439, "Target not found", HttpStatus.NOT_FOUND, "Target is not found"),
    PERFORMANCE_ACHIEVEMENT_NOT_FOUND (444, "Performance Achivement not found", HttpStatus.NOT_FOUND, "Performance Achivement is not found"),
    PROJECT_EVENT_NOT_FOUND (445, "Project Event not found", HttpStatus.NOT_FOUND, "Project event is not found"),
    INVALID_PROJECT_STATUS (446, "Invalid project status", HttpStatus.NOT_FOUND, "Status for project is invalid"),
    PROJECT_NOT_FOUND (447, "Project not found", HttpStatus.NOT_FOUND, "Project is not found"),
    CLIENT_REF_ID_EXIST (448, "This ID is already exist. Enter a new one or use suggestion", HttpStatus.CONFLICT, "This ID is already exist. Enter a new one or use suggestion"),
    SALES_ID_NOT_FOUND (431, "Sales ID not found", HttpStatus.NOT_FOUND, "Sales ID is not found"),
    ZONE_NOT_FOUND (431, "Distribution zone not found", HttpStatus.NOT_FOUND, "Distribution zone is not found"),
    USERNAME_VALIDATION_ERROR (432, "Invalid Username", HttpStatus.BAD_REQUEST, "Username exist, choose another username"),
    GROUPING_VALUE_ERROR(434, "Invalid Grouping Value", HttpStatus.BAD_REQUEST, "Grouping value is not valid"),
    GROUPING_TYPE_ERROR(433, "Invalid Grouping Type", HttpStatus.BAD_REQUEST, "Grouping type is not valid"),
    INVALID_PASSWORD_FORMAT (434, "Invalid password format", HttpStatus.BAD_REQUEST, "Password should be at least 6 characters"),
    EMAIL_VALIDATION_ERROR (437, "Email has been registered", HttpStatus.BAD_REQUEST, "Email has already been registered"),
    PHONE_NUMBER_VALIDATION_ERROR (436, "Phone Number has been registered", HttpStatus.BAD_REQUEST, "Phone Number has already been registered"),
    CLIENT_REF_ID_VALIDATION_ERROR (436, "Client Ref Id has been registered", HttpStatus.BAD_REQUEST, "Client Ref Id has already been registered"),
    USER_UPDATE_FAILED (493, "User Update Failed", HttpStatus.INTERNAL_SERVER_ERROR, "Failed to update user"),
    CLIENT_ADVOCATE_STATUS_NOT_FOUND (492, "Client Advocate Status Not Found", HttpStatus.NOT_FOUND, "Client advocate status is not found"),
    ADVOCATE_TYPE_NOT_FOUND (490, "Advocate Type Not Found", HttpStatus.NOT_FOUND, "Advocate type is not found"),
    USER_CREATION_FAILED (493, "User Creation Failed", HttpStatus.INTERNAL_SERVER_ERROR, "Failed to create user"),
    SALT_NOT_FOUND (497, "Salt Not Found", HttpStatus.NOT_FOUND, "Salt is not found"),
    INVALID_INVITATION_LINK (498, "Invalid Invitation Link", HttpStatus.UNAUTHORIZED, "Invalid invitation link"),
    INVITATION_LINK_EXPIRED (499, "Invitation Link Expired", HttpStatus.UNAUTHORIZED, "Invitation link is expired"),
    INVITATION_LINK_NOT_FOUND(498, "Invitation link not found", HttpStatus.NOT_FOUND, "Invitation link not found"),
    ROLE_LEVEL_HAS_ACTIVE_USER (444, "Role level has active user", HttpStatus.BAD_REQUEST, "Role level has active user"),
    INVALID_SALES_REGION_FORMAT (434, "Invalid sales region format", HttpStatus.BAD_REQUEST, "Sales Region should have 1 digit only"),



    MEMBER_CLUB_ID_NOT_FOUND(432, "Member Club Id not found" , HttpStatus.NOT_FOUND, "Member Club Id is not found"),
    ACCOUNT_NOT_FOUND(433, "Account not found", HttpStatus.NOT_FOUND, "Account is not found"),
    TASK_NOT_FOUND(434, "Task not found", HttpStatus.NOT_FOUND, "Task is not found"),

    // 4300xx Integration related
    POWER_BAD_REQUEST(43001, "Bad Request", HttpStatus.BAD_REQUEST,"Bad Request"),
    POWER_SERVER_UNREACHABLE(43002, "Third Party Server Unreachable", HttpStatus.SERVICE_UNAVAILABLE,"Third Party Server Unreachable"),

    // 44x => Visit and Check-in related
    INVALID_CHECKIN_DISTANCE (440, "Invalid check-in distance", HttpStatus.BAD_REQUEST, "Tidak bisa melanjutkan check-in karena Anda terlalu jauh dari lokasi"),
    INVALID_CHECKIN_ATTEMPT (441, "Invalid check-in attemp", HttpStatus.BAD_REQUEST, "Invalid check-in attemp"),
    INVALID_CHECKOUT_ATTEMPT (442, "Invalid check-out attemp", HttpStatus.BAD_REQUEST, "Invalid check-out attemp"),
    VISIT_NOT_FOUND (443, "Visit not found", HttpStatus.BAD_REQUEST, "The given visit id is not found"),
    INVALID_PARAMETER (480, "Invalid Parameter", HttpStatus.BAD_REQUEST, "Invalid parameter"),
    INVALID_VISITEE (444, "Store not allowed", HttpStatus.BAD_REQUEST, "Store is not allowed"),

    // 45x => Item related
    NO_SERIAL_NUMBER_EVENT_FOUND(446, "No serial number event found", HttpStatus.NOT_FOUND, "No serial number event found"),
    INVALID_FULFILLMENT_QUANTITY (450, "Invalid fulfillement amount", HttpStatus.BAD_REQUEST, "Fulfilment quantity can not be positive or greater than ordered quantity"),
    SALES_ORDER_NOT_FOUND (451, "Sales order not found", HttpStatus.BAD_REQUEST, "The given sales order number is not found"),
    INVALID_SALES_ORDER_STATUS (452, "Invalid sales order status", HttpStatus.BAD_REQUEST, "Status for sales order is invalid to do this action"),
    INVALID_SALES_RETURN_STATUS (452, "Invalid sales return status", HttpStatus.BAD_REQUEST, "Status for sales return" +
            " is invalid to do this action"),
    SALES_ORDER_ITEM_NOT_FOUND (453, "Sales order item not found", HttpStatus.BAD_REQUEST, "There is not any sales order item found"),
    ITEM_NOT_FOUND (454, "Item not found", HttpStatus.BAD_REQUEST, "The requested item is not found"),
    INVALID_ITEM_QUANTITY (455, "Invalid Item Quantity", HttpStatus.BAD_REQUEST, "Carton and unit quantity can not be 0"),
    LOAN_NOT_FOUND (456, "Loan not found", HttpStatus.NOT_FOUND, "Loan is not found"),
    INVOICE_NOT_FOUND (456, "Tagihan tidak ditemukan", HttpStatus.NOT_FOUND, "Tagihan tidak ditemukan"),
    MARKET_INFO_NOT_FOUND (457, "Data market info tidak ditemukan", HttpStatus.NOT_FOUND, "Data market info tidak ditemukan"),
    INVALID_BRAND_NAME_ERROR (458, "Brand Name already exist", HttpStatus.BAD_REQUEST, "Brand Name already exist"),
    INVALID_PRODUCT_GROUP_NAME_ERROR (459, "Product Group Name already exist", HttpStatus.BAD_REQUEST, "Product Group Name already exist"),

    // 4500xx => Invoice Related
    INVOICE_NUMBER_ALREADY_TAKEN (450000, "Invoice number already taken", HttpStatus.BAD_REQUEST, "Invoice number already taken"),
    INVOICE_DOESNT_EXIST (450001, "Invoice doesn't exist", HttpStatus.BAD_REQUEST, "Invoice doesn't exist"),
    INVOICE_ALREADY_PAID (450002, "Invoice already paid", HttpStatus.BAD_REQUEST, "Invoice number already paid"),
    INVOICE_PAYMENT_CANT_APPROVE(450003, "Invoice payment can't approve", HttpStatus.BAD_REQUEST, "Invoice payment can't approve"),
    INVOICE_ALREADY_ON_PROCESS (450004, "Invoice already on process", HttpStatus.BAD_REQUEST, "Invoice already on process"),

    // 4501xx => Shelf Placement Related
    SHELF_PLACEMENT_DUPLICATE_PRODUCT_IDENTIFICATION(450100, "Duplicate product identification", HttpStatus.BAD_REQUEST, "Duplicate product identification"),
    SHELF_PLACEMENT_INVALID_PRODUCT_IDENTIFICATION_TYPE(450101, "Invalid product identification type", HttpStatus.BAD_REQUEST, "Invalid product identification type"),
    SHELF_PLACEMENT_MISSING_MANDATORY_PRODUCT(450102, "Missing Mandatory Product", HttpStatus.BAD_REQUEST, "Missing Mandatory Product in submission"),

    // 4502xx => Sales Order Related
    SALES_ORDER_INVALID_DISCOUNT_ID (450200, "Invalid Discount ID", HttpStatus.BAD_REQUEST, "Invalid Discount ID"),
    SALES_ORDER_INVALID_SALES_CHANNEL_REF_ID(40201, "Invalid Sales Channel Ref Id", HttpStatus.BAD_REQUEST, "Invalid Sales Channel Ref Id"),
    SALES_ORDER_INVALID_ORDER_NUMBER (40202, "Invalid Generate Order Number", HttpStatus.BAD_REQUEST, "Invalid Generate Order Number"),
    FAILED_TO_GENERATE_DELIVERY_ORDER (450203, "Failed Generate Delivery Order", HttpStatus.BAD_REQUEST, "Failed Generate Delivery Order"),
    DELIVERY_ORDER_NOT_DELIVERED (450204, "Delivery Order Not Yet Delivered", HttpStatus.FAILED_DEPENDENCY, "Delivery Order Not Yet Delivered"),
    PROMOTION_USAGE_INVALID(450205, "Promotion Usage Exceeds the Limit", HttpStatus.PRECONDITION_FAILED, "Promotion Usage Exceeds the Limit"),

    // 4503xx => Inventory Related
    INVENTORY_LOCATION_ALREADY_EXISTS (450300, "Location Already Exists", HttpStatus.BAD_REQUEST, "Location Already Exists"),
    INVENTORY_INVALID_DISTRIBUTION_ZONE_ID (450301, "Invalid Distribution Zone Id", HttpStatus.BAD_REQUEST, "Invalid Distribution Zone Id"),
    INVENTORY_LOCATION_REFERENCE_ALREADY_EXISTS (450300, "Location Reference ID Already Exists", HttpStatus.BAD_REQUEST, "Location Reference ID Already Exists"),

    // 46x => authentication/authorization related
    INVALID_IMEI (460, "Invalid IMEI", HttpStatus.UNAUTHORIZED, "Invalid IMEI"),
    INVALID_USERNAME_PASSWORD (461, "Maaf, login gagal. Kata sandi tidak sesuai. Silakan coba lagi.", HttpStatus.UNAUTHORIZED, "Sorry, login failed. Incorrect password. Please try again."),
    INVALID_COMPANY (462, "Invalid Company", HttpStatus.UNAUTHORIZED, "Invalid company"),
    INVALID_JWT_CLAIM (463, "Invalid Token", HttpStatus.UNAUTHORIZED, "Invalid token, please re-login"),

    INACTIVE_USER_LOGIN (464, "Maaf, login gagal. Akun sudah tidak aktif. Silakan hubungi customer support.", HttpStatus.UNAUTHORIZED, "Sorry, login failed. Account is no longer active. Please contact customer support."),
    INVALID_LOGIN_EVENT (465, "Invalid Login Event", HttpStatus.UNAUTHORIZED, "Invalid login event"),
    INVALID_VERIFICATION_CODE (466, "Invalid Verification Code", HttpStatus.UNAUTHORIZED, "Invalid verification code"),
    USER_ALREADY_LOGIN	(467, "User already login", HttpStatus.BAD_REQUEST, "User already login"),
    INVALID_USER (468, "Invalid User", HttpStatus.NOT_FOUND, "Invalid user"),
    LOGIN_FAILED(469, "Maaf, login gagal. Silahkan hubungi customer support. (Error code : %s)", HttpStatus.BAD_REQUEST, "Sorry, login failed. Please contact customer support. (Error code : %s)"),

    ADDRESS_CANNOT_BE_EMPTY (471, "Address Cannot Be Empty", HttpStatus.BAD_REQUEST, "Address cannot be empty"),

    INVENTORY_OWNER_NOT_FOUND(472, "Inventory Owner Not Found", HttpStatus.BAD_REQUEST, "Inventory Owner Not Found"),
    DUPLICATE_MOB_TEMP_ID (473, "Mob Temp Id Duplicate", HttpStatus.BAD_REQUEST, "Mob Temp Id Duplicate"),

    SURVEY_NOT_FOUND (481, "Survey not found", HttpStatus.NOT_FOUND, "Survey not found"),
    MULTIPLE_SURVEY_SUBMIT_ATTEMPT (482, "Cannot submit survey more than one time",HttpStatus.BAD_REQUEST, "Cannot submit survey more than one time"),
    SURVEY_RESPONSE_NOT_FOUND (483, "Survey response not found", HttpStatus.NOT_FOUND, "Survey response not found"),

    INVALID_ZONE_LEVEL (484, "Invalid zone level", HttpStatus.NOT_FOUND, "Invalid zone level"),
    INVALID_ZONE_ITEM_TYPE (484, "Invalid zone item type", HttpStatus.NOT_FOUND, "Invalid zone item type"),
    INVALID_TERRITORY_CODE (484, "Territory Code already exist", HttpStatus.BAD_REQUEST, "Territory Code already exist"),

    ROUTE_NOT_FOUND (491, "Route not found", HttpStatus.NOT_FOUND, "Route not found"),
    PROJECT_EVENT_TYPE_NOT_FOUND (492, "Project event type not found", HttpStatus.NOT_FOUND, "Project event type not found"),
    PROJECT_CATEGORY_NOT_FOUND (493, "Project category not found", HttpStatus.NOT_FOUND, "Project category not found"),
    PROJECT_STATUS_NOT_FOUND (494, "Project status not found", HttpStatus.NOT_FOUND, "Project status not found"),
    INVALID_PHONE_NUMBER (495, "Invalid Phone Number", HttpStatus.UNAUTHORIZED, "Invalid phone number"),
    USER_LOGIN_FOUND (495, "User Login Found", HttpStatus.BAD_REQUEST, "User login is found"),

    REGION_NOT_FOUND (495, "Region Not Found", HttpStatus.NOT_FOUND, "Region is not found"),
    SALES_GROUP_NOT_FOUND (495, "Sales Group Not Found", HttpStatus.NOT_FOUND, "Sales Group is not found"),
    ROLE_NOT_FOUND (495, "Role Not Found", HttpStatus.NOT_FOUND, "Role is not found"),
    INVALID_PREFIX_PHONE_NUMBER (496, "Invalid Prefix Phone Number", HttpStatus.UNAUTHORIZED, "Invalid prefix phone number"),
    EMAIL_NOT_FOUND (497, "Email not found", HttpStatus.UNAUTHORIZED, "Email is not found"),
    DATE_NOT_FOUND (497, "Date Not Found", HttpStatus.NOT_FOUND, "Date Not Found"),

    INVALID_TERRITORY_COVERAGE (491, "Invalid User Login's Territory Coverage", HttpStatus.BAD_REQUEST, "Invalid User Login's Territory Coverage"),
    INVALID_CHANNEL_AND_ZONE_ID	(492, "Invalid Channel and Zone ID", HttpStatus.BAD_REQUEST, "Chosen Channel and Territory is not correct"),

    // 47x => Content related error
    AD_CAMPAIGN_NOT_FOUND(473, "Ad Campaign not found", HttpStatus.NOT_FOUND, "Ad Campaign not found"),
    EXCEEDING_ALLOCATED_LENGTH (474, "Exceeding Allocated Length", HttpStatus.BAD_REQUEST, "Exceeding allocated length"),
    INVALID_ARTICLE_TYPE(498, "Invalid article type", HttpStatus.BAD_REQUEST, "Invalid article type"),

    FAILED_TO_ACTIVATE_CUSTOMER (405, "Lead Customer Activation Failed", HttpStatus.INTERNAL_SERVER_ERROR, "Lead Customer Activation Failed"),

    WARRANTY_NOT_FOUND (495, "Warranty Not Found", HttpStatus.NOT_FOUND, "Warranty is not found"),

    // 5xx => Server related error
    API_CALL_ERROR (500, "Internal server error", HttpStatus.INTERNAL_SERVER_ERROR, "Unknown internal server error"),
    UNKNOWN_INTERNAL_ERROR (530, "Unknown Error", HttpStatus.INTERNAL_SERVER_ERROR, "Unknown internal server error"),
    EXTRACT_REQUEST_PAYLOAD_ERROR (531, "Payload Extraction Error", HttpStatus.INTERNAL_SERVER_ERROR, "Can not extract payload from request"),
    QUEUE_REACHED_TIMEOUT(504,"Queue has reached Timeout", HttpStatus.REQUEST_TIMEOUT, "Queue telah melewati batas timeout"),
    LOCATION_NOT_FOUND (532, "Location not found", HttpStatus.NOT_FOUND, "Location is not found"),
    LOCATION_ALREADY_EXIST (400, "Location already exists", HttpStatus.CONFLICT, "Location already exist"),
    PROCESS_ERROR (532, "Process Error", HttpStatus.INTERNAL_SERVER_ERROR, "Can not process request"),


    PRODUCT_INVENTORY_BATCH_PRICE_ALREADY_EXIST (200, "Product inventory batch price already exists", HttpStatus.CONFLICT, "Product inventory batch price already exists"),

    //Campaign Item Configuration
    DUPLICATE_CAMPAIGN_ITEM_CONFIGURATION (411, "Duplicate Campaign Item Configuration", HttpStatus.BAD_REQUEST, "You've created the campaign item that has the same activity list as another campaign item."),
    EXIST_ACTIVE_CAMPAIGN (412, "Token Type Used in Active Campaign", HttpStatus.BAD_REQUEST, "You have active campaign that using configuration."),
    NOT_FOUND_CAMPAIGN_ITEM_CONFIGURATION (413, "Not Found CampaignItem Configuration", HttpStatus.BAD_REQUEST, "Not Found CampaignItem Configuration"),

    UNVAILABLE_STOCK						(422, "Unavailable Stock", HttpStatus.BAD_REQUEST, "Unavailable Stock"),
    NO_TRADE_PROMO_FOUND					(423, "No Trade Promo Found", HttpStatus.NOT_FOUND, "No Trade Peomo Found"),

    UPDATE_TRADE_PROMO_PROHIBITED			(424, "Update Trade Promo Prohibited", HttpStatus.BAD_REQUEST, "Update Trade Promo Prohibited"),
    INVALID_PHONE_NUMBER_FORMAT 			(411, "Invalid Phone Number Format", HttpStatus.BAD_REQUEST, "Invalid Phone Number Format"),
    PHONE_NUMBER_ALREADY_EXIST              (533, "Phone Number already Exist", HttpStatus.CONFLICT, "Phone Number already Exist"),
    MARKET_INFO_ALREADY_CREATED_TODAY       (534, "Market Info already Created Today", HttpStatus.CONFLICT, "Market Info already Created Today"),

    INVALID_TRADE_CLAIM_NUMBER					(601, "Invalid Trade Claim Number", HttpStatus.BAD_REQUEST, "Invalid Trade Claim Number"),
    INVALID_TRADE_BUDGET						(602, "Invalid Trade Budget", HttpStatus.BAD_REQUEST, "Invalid Trade Budget"),
    INVALID_REQUESTED_CLAIM_AMOUNT 				(603, "Invalid Requested Claim Amount", HttpStatus.BAD_REQUEST, "Invalid Requested Claim Amount"),
    INVALID_TRADE_CLAIM_CONTROL_ID 				(604, "Invalid Trade Claim Control ID", HttpStatus.BAD_REQUEST, "Invalid Trade Claim Control ID"),
    INCOMPLETE_TRADE_CLAIM_SUPPORTING_DOCUMENT	(605, "Incomplete Trade Claim Supporting Document", HttpStatus.BAD_REQUEST, "Incomplete Trade Claim Supporting Document"),
    FAILED_TO_DELETE_FILE						(606, "Failed To Delete Trade Claim Document File", HttpStatus.INTERNAL_SERVER_ERROR, "Failed To Delete Trade Claim Document File"),
    FAILED_TO_UPLOAD_FILE						(607, "Failed To Upload Trade Claim Document File", HttpStatus.INTERNAL_SERVER_ERROR, "Failed To Upload Trade Claim Document File"),
    TRADE_CLAIM_SHOULD_NOT_BE_CHANGED			(608, "Trade Claim should not be Changed", HttpStatus.BAD_REQUEST, "Trade Claim should not be Changed"),
    TRADE_CLAIM_NOT_FOUND						(609, "Trade Claim Not Found", HttpStatus.BAD_REQUEST, "Trade Claim Not Found"),
    INVALID_TRADE_CLAIM_ACTION					(610, "Invalid Trade Claim Action", HttpStatus.BAD_REQUEST, "Action can't be done, business violated"),
    INVALID_TAX_INVOICE_NUMBER					(611, "Invalid Tax Invoice Number", HttpStatus.BAD_REQUEST, "Invalid Tax Invoice Number"),
    FAILED_TO_CREATE_APPROVAL_TASK				(612, "System failed to create approval task", HttpStatus.INTERNAL_SERVER_ERROR, "System failed to create approval task"),
    INVALID_TRADE_CLAIM_CONTROL_ID_LENGTH		(613, "Invalid Trade Claim Control ID Length", HttpStatus.BAD_REQUEST, "Invalid Trade Claim Control ID can't be more than 25 characters"),
    INVALID_TAX_INVOICE_NUMBER_NOT_UNIQUE		(614, "Tax Invoice Number must be unique", HttpStatus.BAD_REQUEST, "Tax Invoice Number must be unique"),
    INVALID_TAX_INVOICE_DATE					(614, "Invalid Invoice Tax Date", HttpStatus.BAD_REQUEST, "Invalid Invoice Tax Date"),

    FAILED_TO_UPLOAD_FILE_PROOF_OF_DELIVERY		(615, "Failed To Upload Proof of Delivery Document File", HttpStatus.INTERNAL_SERVER_ERROR, "Failed To Upload Proof of Delivery Document File"),
    FAILED_TO_UPLOAD_FILE_SALES_RETURN			(616, "Failed To Upload Sales Return File", HttpStatus.INTERNAL_SERVER_ERROR, "Failed To Upload Sales Return File"),

    TRADE_CLAIM_CONTENT_HISTORIES_NOT_FOUND     (617, "Trade Claim Content Histories Not Found", HttpStatus.BAD_REQUEST, "Trade Claim Content Histories Not Found"),
    TOKEN_GENERATION_FAILED (487, "Token Generation Failed", HttpStatus.INTERNAL_SERVER_ERROR, "Failed to generate token"),
    ACTIVITY_APPROVAL_FAILED (492, "Activity Approval Failed", HttpStatus.INTERNAL_SERVER_ERROR, "Failed to approve activity"),
    CLIENT_TYPE_NOT_FOUND (488, "Client Type Not Found", HttpStatus.NOT_FOUND, "Client type is not found"),
    WORK_ENTITY_NOT_FOUND (489, "Work Entity Not Found", HttpStatus.NOT_FOUND, "Work Entity is not found"),

    INVALID_DATE					(617, "Invalid Date", HttpStatus.BAD_REQUEST, "Invalid Date"),


    // 48x => Other validation related messages
    APPROVE_REJECTED_SALES_ORDER(479, "Approve Rejected Approval Sales Order", HttpStatus.BAD_REQUEST, "Gagal untuk approve sales order yang sudah di reject approval sebelumnya"),
    INVALID_AMOUNT (480, "Invalid Amount", HttpStatus.BAD_REQUEST, "Invalid amount"),
    INVALID_ITEM (481, "Invalid Item", HttpStatus.BAD_REQUEST, "Invalid item"),
    TOTAL_LIMIT_IS_REACHED (482, "Total limit is reached", HttpStatus.BAD_REQUEST, "Campaign item has reached its total limit"),
    LIMIT_PER_ADVOCATE_IS_REACHED (483, "Limit per advocate is reached", HttpStatus.BAD_REQUEST, "Campaign item has reached its limit per advocate"),
    ACTIVITY_CREATION_FAILED (485, "Activity Creation Failed", HttpStatus.INTERNAL_SERVER_ERROR, "Failed to create activity"),
    SERIAL_NUMBER_TOKEN_CLAIM_ATTEMPT_CREATION_FAILED (486, "Serial Number Token Claim Attempt Creation Failed", HttpStatus.INTERNAL_SERVER_ERROR, "Failed to create serial number token claim attempt"),
    INVALID_NUMBER_OF_PIC_LOCKING_ROLE (401,"Invalid Number of PIC Locking Role", HttpStatus.BAD_REQUEST, "The number of PIC Locking candidates with a specific role exceeds the limit"),
    COMPANY_NAME_CANNOT_BE_EMPTY (771, "Company Name can not be empty!", HttpStatus.BAD_REQUEST, "Company Name can not be empty"),

    VENDOR_CODE_NOT_FOUND (484, "Vendor code not found", HttpStatus.NOT_FOUND, "Vendor code not found"),
    STORE_REF_ID_NOT_FOUND (485, "Store ref id not found", HttpStatus.NOT_FOUND, "Store ref id not found"),
    REDEMPTION_NOT_FOUND (487, "Redemption not found", HttpStatus.NOT_FOUND, "Redemption not found"),
    INVALID_STRIKER_REF_ID (488, "Invalid Striker Ref Id", HttpStatus.UNAUTHORIZED, "Invalid striker ref id"),
    INVALID_STORE_REF_ID (489, "Invalid Store Ref Id", HttpStatus.UNAUTHORIZED, "Invalid store ref id"),
    INVALID_STORE_NAME (490, "Invalid Store Name", HttpStatus.UNAUTHORIZED, "Invalid store name"),
    INVALID_CLIENT_REF_ID (491, "Invalid Client Ref Id", HttpStatus.UNAUTHORIZED, "Invalid client ref id"),
    BATCH_ID_NOT_FOUND (492, "Batch Id Not Found", HttpStatus.NOT_FOUND, "Batch Id Not Found"),
    INVALID_MAXIMUM_AMOUNT (4801, "Invalid Amount", HttpStatus.BAD_REQUEST, "Jumlah yang akan ditukar melebihi total poin anda"),
    INVALID_MULTIPLE_OF_AMOUNT (4802, "Invalid Multiple of Amount", HttpStatus.BAD_REQUEST, "Poin yang harus ditukar harus kelipatan 500"),
    INVALID_ADVOCATE_TYPE_TO_REDEEM_VOUCHER (4803, "Invalid advocate type to redeem voucher", HttpStatus.BAD_REQUEST, "Maaf, Anda tidak berhak untuk menukarkan voucher ini. Terima kasih"),
    INVALID_VARIANT_ID (489, "Invalid Variant Id", HttpStatus.BAD_REQUEST, "Invalid Variant Id"),
    INVALID_VOUCHER_CODE (4901, "Invalid Voucher Code", HttpStatus.BAD_REQUEST, "Voucher code tidak ditemukan. Periksa kembali kode yang anda masukkan."),
    VOUCHER_CODE_IS_EXPIRED (4902, "Voucher code already expired", HttpStatus.BAD_REQUEST, "Voucher sudah kadaluarsa."),
    VOUCHER_CODE_IS_CLAIMED (4903, "Voucher code already claimed", HttpStatus.BAD_REQUEST, "Voucher sudah ditukar"),

    // 42x => Incentive related
    //Incentive Stuff
    FAILED_TO_CLAIM_INCENTIVE_BY_FITER_REGENCY				(4200, "Failed to claim incentive by campaign filter regency", HttpStatus.BAD_REQUEST, "Failed to claim incentive by campaign filter regency"),
    FAILED_TO_CLAIM_INCENTIVE_BY_FITER_PROVINCE				(4201, "Failed to claim incentive by campaign filter province", HttpStatus.BAD_REQUEST, "Failed to claim incentive by campaign filter province"),
    FAILED_TO_CLAIM_INCENTIVE_BY_FITER_ADVOCATE_TYPE		(4210, "Failed to claim incentive by campaign filter advocate type", HttpStatus.BAD_REQUEST, "Failed to claim incentive by filter advocate type"),
    FAILED_TO_CLAIM_INCENTIVE_BY_FITER_CHANNEL_TYPE			(4212, "Failed to claim incentive by campaign filter channel type", HttpStatus.BAD_REQUEST, "Failed to claim incentive by filter channel type"),
    FAILED_TO_CLAIM_INCENTIVE_BY_FITER_CHANNEL_PRODUCT_CODE	(4211, "Failed to claim incentive by campaign filter product code", HttpStatus.BAD_REQUEST, "Failed to claim incentive by filter product code"),
    FAILED_TO_CLAIM_INCENTIVE_BY_FITER						(4299, "Failed to claim incentive by campaign filter", HttpStatus.BAD_REQUEST, "Failed to claim incentive by campaign filter"),
    FAILED_TO_CLAIM_INCENTIVE_BY_LIMIT_HASBEEN_EXCEEDED		(4221, "Failed to claim incentive by limit has beed exceeded", HttpStatus.BAD_REQUEST, "Failed to claim incentive by limit has been exceeded"),
    FAILED_TO_CLAIM_INCENTIVE_BY_LIMIT_PER_ADVOCATE_HASBEEN_EXCEEDED		(4220, "Failed to claim incentive by limit per advocate has beed exceeded", HttpStatus.BAD_REQUEST, "Failed to claim incentive by limit per advocate has been exceeded"),
    FAILED_TO_CLAIM_INCENTIVE_BY_NOT_FOUND_CAMPAIGN			(4230, "Failed to claim incentive by not found client campaign", HttpStatus.BAD_REQUEST, "Failed to claim incentive by not found client campaign"),
    FAILED_TO_CLAIM_INCENTIVE_BY_NOT_FOUND_TOKEN			(428, "Failed to claim incentive by not found token", HttpStatus.BAD_REQUEST, "Failed to claim incentive by not found token"),
    FAILED_TO_CLAIM_INCENTIVE_BY_NOT_VALID_TOKEN			(429, "Failed to claim incentive by not valid token", HttpStatus.BAD_REQUEST, "Failed to claim incentive by not valid token"),
    FAILED_TO_CLAIM_INCENTIVE_BY_PRODUCT_ALREADY_CLAIMED	(4250, "Failed to claim incentive by product already claimed", HttpStatus.BAD_REQUEST, "Failed to claim incentive by product already claimed"),
    FAILED_TO_CLAIM_INCENTIVE_BY_PRODUCT_NOT_IDENTIFIED		(4240, "Failed to claim incentive by not identified serial number", HttpStatus.BAD_REQUEST, "Failed to claim incentive by not identified serial number"),
    PARTIALLY_FAILED_TO_CLAIM_INCENTIVE						(4231, "Partially failed to claim incentive", HttpStatus.BAD_REQUEST, "Failed to claim incentive by not identified serial number"),
    UNACCEPTED_VERSION (4232, "Unaccepted App Version", HttpStatus.PRECONDITION_REQUIRED, "Aplikasi versi baru telah tersedia. Silakan perbarui aplikasi Anda ke versi terbaru dari playstore"),
    FAILED_TO_CLAIM_INCENTIVE_BY_NOT_GOOD_ISSUE				(4260, "Failed to claim incentive by not good issue serial number", HttpStatus.BAD_REQUEST, "Failed to claim incentive by not good issue serial number");

    private int internalStatusCode;
    private String description;
    private HttpStatus httpStatus;
    private String prettyMessage;

    ResponseStatus(int statusCode, String description, HttpStatus httpStatus, String prettyMessage) {
        this.internalStatusCode = statusCode;
        this.description = description;
        this.httpStatus = httpStatus;
        this.prettyMessage = prettyMessage;
    }

    public int getStatusCode() {
        return internalStatusCode;
    }

    public String getDescription() {
        return description;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public int getHttpStatusCode() {
        return httpStatus.value();
    }

    public String getPrettyMessage() {
        return prettyMessage;
    }

    public static ResponseStatus fromString(int statusCode) {

        for (ResponseStatus rs : ResponseStatus.values()) {
            if (rs.getStatusCode() == statusCode) {
                return rs;
            }
        }

        return null;
    }
}