SUMMARY = "Open implementation of the AACS specification"
SECTION = "libs/multimedia"
LICENSE = "LGPLv2.1+"
LIC_FILES_CHKSUM = "file://COPYING;md5=4b54a1fd55a448865a0b32d41598759d"
DEPENDS = "libgcrypt"
PV = "0.9.0+git${SRCPV}"
PR = "r1"

SRC_URI = "git://github.com/OpenVisionE2/libaacs.git"

S = "${WORKDIR}/git"

inherit autotools lib_package pkgconfig
