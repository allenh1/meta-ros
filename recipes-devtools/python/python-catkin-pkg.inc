DESCRIPTION = "catkin package library"
SECTION = "devel/python"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://PKG-INFO;beginline=8;endline=8;md5=e910b35b0ef4e1f665b9a75d6afb7709"
SRCNAME = "catkin_pkg"

SRC_URI = "http://download.ros.org/downloads/catkin_pkg/catkin_pkg-${PV}.tar.gz"

DEPENDS = "python-setuptools"

S = "${WORKDIR}/${SRCNAME}-${PV}"

BBCLASSEXTEND = "native"
