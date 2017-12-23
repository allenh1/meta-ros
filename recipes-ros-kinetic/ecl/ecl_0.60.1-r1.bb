# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Metapackage bringing all of ecl together."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native ecl-core ecl-lite ecl-manipulation ecl-navigation ecl-tools"
SRC_URI = "https://github.com/yujinrobot-release/${PN}_manipulation-release/archive/release/kinetic/${PN}/0.60.1-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "8ee491152b4ad8d1711b0502cb2d58cd"
SRC_URI[sha256sum] = "3748f5fae84d99969a4ca2a3004dbf4b5b1408f5c79f9a18f4bc4febba68639e"
S = "${WORKDIR}/${PN}_manipulation-release-release-kinetic-${PN}-0.60.1-1"

inherit catkin
