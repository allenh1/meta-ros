# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Traceback fiddling library. Allows you to pickle tracebacks."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native catkin-pip"
SRC_URI = "https://github.com/asmodehn/${PN}-rosrelease/archive/release/kinetic/${PN}/1.2.0-2.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "42120214b014e1183bb87a763e454fc5"
SRC_URI[sha256sum] = "0e67c67bba4e7339bda61ef3f8ada290a0374da8b8e46670215bc41080f179c1"
S = "${WORKDIR}/${PN}-rosrelease-release-kinetic-${PN}-1.2.0-2"

inherit catkin
