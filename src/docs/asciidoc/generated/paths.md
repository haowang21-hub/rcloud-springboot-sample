
<a name="paths"></a>
## Paths

<a name="uploadusingpost"></a>
### 单文件上传
```
POST /base/file/upload
```


#### Description
单个文件上传


#### Parameters

|Type|Name|Description|Schema|
|---|---|---|---|
|**FormData**|**file**  <br>*required*|file|file|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[ResponseMessage«object»](#4e3465260d0b339c0ae101c8a6821732)|
|**201**|Created|No Content|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Consumes

* `multipart/form-data`


#### Produces

* `*/*`


#### Tags

* file-controller


<a name="batchuploadusingpost"></a>
### 多文件上传
```
POST /base/file/upload/batch
```


#### Description
文件批量上传


#### Parameters

|Type|Name|Description|Schema|
|---|---|---|---|
|**FormData**|**file**  <br>*required*|file|< file > array(multi)|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[ResponseMessage«object»](#4e3465260d0b339c0ae101c8a6821732)|
|**201**|Created|No Content|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Consumes

* `application/json`


#### Produces

* `*/*`


#### Tags

* file-controller


<a name="addusingpost"></a>
### 新增
```
POST /dict
```


#### Parameters

|Type|Name|Description|Schema|
|---|---|---|---|
|**Body**|**data**  <br>*required*|data|[词典信息](#e56f22700c5363524be3f11fbc4b11fc)|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**201**|Created|[ResponseMessage«Dict»](#f301dd7c835a0fb0891c0f3149eed477)|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Consumes

* `application/json`


#### Produces

* `*/*`


#### Tags

* dict-controller


<a name="listusingget"></a>
### 根据字段条件分页查询
```
GET /dict
```


#### Parameters

|Type|Name|Description|Schema|
|---|---|---|---|
|**Query**|**ascs**  <br>*optional*||< string > array(multi)|
|**Query**|**current**  <br>*optional*||integer (int32)|
|**Query**|**descs**  <br>*optional*||< string > array(multi)|
|**Query**|**dictIdentify**  <br>*optional*|词典标识|string|
|**Query**|**dictName**  <br>*optional*|词典名称|string|
|**Query**|**dictType**  <br>*optional*|词典类型|integer (int32)|
|**Query**|**limit**  <br>*optional*||integer (int32)|
|**Query**|**offset**  <br>*optional*||integer (int32)|
|**Query**|**openSort**  <br>*optional*||boolean|
|**Query**|**optimizeCountSql**  <br>*optional*||boolean|
|**Query**|**orderByField**  <br>*optional*||string|
|**Query**|**pages**  <br>*optional*||integer (int32)|
|**Query**|**searchCount**  <br>*optional*||boolean|
|**Query**|**size**  <br>*optional*||integer (int32)|
|**Query**|**total**  <br>*optional*||integer (int32)|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[ResponseMessage«PagerResult«Dict»»](#a992ef7e80eb996e6b77fee4ff546595)|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Produces

* `*/*`


#### Tags

* dict-controller


<a name="getbyprimarykeyusingget"></a>
### 根据主键查询多条记录
```
GET /dict/ids
```


#### Parameters

|Type|Name|Description|Schema|
|---|---|---|---|
|**Query**|**ids**  <br>*required*|ids|< integer (int32) > array(multi)|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[ResponseMessage«List«Dict»»](#d3a4c6bda9cd52e645d4274854174394)|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Produces

* `*/*`


#### Tags

* dict-controller


<a name="listnopagingusingget"></a>
### 不分页动态查询
```
GET /dict/list
```


#### Parameters

|Type|Name|Description|Schema|
|---|---|---|---|
|**Query**|**dictIdentify**  <br>*optional*|词典标识|string|
|**Query**|**dictName**  <br>*optional*|词典名称|string|
|**Query**|**dictType**  <br>*optional*|词典类型|integer (int32)|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[ResponseMessage«List«Dict»»](#d3a4c6bda9cd52e645d4274854174394)|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Produces

* `*/*`


#### Tags

* dict-controller


<a name="getbyprimarykeyusingget_1"></a>
### 根据主键查询
```
GET /dict/{id}
```


#### Parameters

|Type|Name|Description|Schema|
|---|---|---|---|
|**Path**|**id**  <br>*required*|id|integer (int32)|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[ResponseMessage«Dict»](#f301dd7c835a0fb0891c0f3149eed477)|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Produces

* `*/*`


#### Tags

* dict-controller


<a name="updatebyprimarykeyusingput"></a>
### 修改数据
```
PUT /dict/{id}
```


#### Parameters

|Type|Name|Description|Schema|
|---|---|---|---|
|**Path**|**id**  <br>*required*|id|integer (int32)|
|**Body**|**data**  <br>*required*|data|[Dict](#dict)|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[ResponseMessage«int»](#d53a2c1e07a660f2c3f1b54e6a7c98bb)|
|**201**|Created|No Content|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Consumes

* `application/json`


#### Produces

* `*/*`


#### Tags

* dict-controller


<a name="deletebyprimarykeyusingdelete"></a>
### 删除数据
```
DELETE /dict/{id}
```


#### Parameters

|Type|Name|Description|Schema|
|---|---|---|---|
|**Path**|**id**  <br>*required*|id|integer (int32)|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[ResponseMessage«object»](#4e3465260d0b339c0ae101c8a6821732)|
|**204**|No Content|No Content|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|


#### Produces

* `*/*`


#### Tags

* dict-controller



