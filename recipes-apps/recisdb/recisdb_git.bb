inherit cargo

SRC_URI = "git://github.com/kazuki0824/recisdb-rs.git;protocol=https"
SRCREV="b285c9506c25846c7ac2c05d87cde3f9935fcf64"
LIC_FILES_CHKSUM="file://LICENSE;md5=1ebbd3e34237af26da5dc08a4e440464"


SUMMARY = "Recisdb is a CLI tools to control ISDB-S/T tuners"
HOMEPAGE = "https://github.com/kazuki0824/meta-recisdb.git"
LICENSE = "MIT | Apache-2.0"

S = "${WORKDIR}/git"

BBCLASSEXTEND = "native"
