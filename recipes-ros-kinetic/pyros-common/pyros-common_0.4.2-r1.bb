# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Common interfaces packages for Pyros framework"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native catkin-pip pyros-config pyzmp"
SRC_URI = "https://github.com/asmodehn/${PN}-rosrelease/archive/release/kinetic/pyros_common/0.4.2-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "fdac6379934b27123a13bacf85c52e57"
SRC_URI[sha256sum] = "4289c79d5af084680cb4c89f8b247e376355ecd543d273d081229ab1ec5ba601"
S = "${WORKDIR}/${PN}-rosrelease-release-kinetic-pyros_common-0.4.2-1"

inherit catkin
