# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Template based exceptions - these are simple and practical      and avoid the pr"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native ecl-config ecl-errors ecl-license"
SRC_URI = "https://github.com/yujinrobot-release/ecl_core-release/archive/release/kinetic/ecl_exceptions/0.61.17-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "53c26c1b0ec1f20e3ec6913cea8d2057"
SRC_URI[sha256sum] = "b48b6e9d1ca0d048d451551b971d15faa21c373e0fab3107925384bf6387f7de"
S = "${WORKDIR}/ecl_core-release-release-kinetic-ecl_exceptions-0.61.17-0"

inherit catkin
